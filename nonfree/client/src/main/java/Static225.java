import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "[Lclient!jw;")
	public static Class4_Sub1[] aClass4_Sub1Array3;

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "Lclient!la;")
	public static Class196 aClass196_102;

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "D")
	public static double aDouble30;

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[8];

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "([Lclient!jw;II)V")
	public static void method7338(@OriginalArg(0) Class4_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class4_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt8918;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt8918 > local27 + (local29 & 0x1)) {
				@Pc(44) Class4_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method7338(arg0, arg1, local10 - 1);
		method7338(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V")
	public static void method7340() {
		Static327.method5315(Static262.aClass3_Sub27_12.aClass21_Sub4_1.method1459());
		@Pc(19) int local19 = (Static299.anInt5307 >> 3) + (Static611.anInt9892 >> 12);
		@Pc(27) int local27 = (Static171.anInt3340 >> 3) + (Static20.anInt824 >> 12);
		Static549.anInt9262 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 = 0;
		Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.method5082(8, 8);
		Static156.aByteArrayArray17 = new byte[18][];
		Static593.anIntArray631 = new int[18];
		Static419.aByteArrayArray26 = new byte[18][];
		Static238.anIntArray235 = new int[18];
		Static363.anIntArray57 = new int[18];
		Static276.anIntArray264 = new int[18];
		Static145.aByteArrayArray5 = new byte[18][];
		Static349.aByteArrayArray19 = new byte[18][];
		Static29.aByteArrayArray1 = new byte[18][];
		Static559.anIntArrayArray59 = new int[18][4];
		Static351.anIntArray405 = new int[18];
		Static438.anIntArray481 = new int[18];
		@Pc(78) int local78 = 0;
		@Pc(98) int local98;
		for (@Pc(87) int local87 = (local19 - (Static634.anInt10129 >> 4)) / 8; local87 <= (local19 + (Static634.anInt10129 >> 4)) / 8; local87++) {
			for (local98 = (local27 - (Static638.anInt10172 >> 4)) / 8; local98 <= ((Static638.anInt10172 >> 4) + local27) / 8; local98++) {
				@Pc(106) int local106 = local98 + (local87 << 8);
				Static351.anIntArray405[local78] = local106;
				Static593.anIntArray631[local78] = Static395.aClass196_80.method5104("m" + local87 + "_" + local98);
				Static363.anIntArray57[local78] = Static395.aClass196_80.method5104("l" + local87 + "_" + local98);
				Static276.anIntArray264[local78] = Static395.aClass196_80.method5104("n" + local87 + "_" + local98);
				Static438.anIntArray481[local78] = Static395.aClass196_80.method5104("um" + local87 + "_" + local98);
				Static238.anIntArray235[local78] = Static395.aClass196_80.method5104("ul" + local87 + "_" + local98);
				if (Static276.anIntArray264[local78] == -1) {
					Static593.anIntArray631[local78] = -1;
					Static363.anIntArray57[local78] = -1;
					Static438.anIntArray481[local78] = -1;
					Static238.anIntArray235[local78] = -1;
				}
				local78++;
			}
		}
		for (local98 = local78; local98 < Static276.anIntArray264.length; local98++) {
			Static276.anIntArray264[local98] = -1;
			Static593.anIntArray631[local98] = -1;
			Static363.anIntArray57[local98] = -1;
			Static438.anIntArray481[local98] = -1;
			Static238.anIntArray235[local98] = -1;
		}
		@Pc(276) byte local276;
		if (Static485.anInt8420 == 3) {
			local276 = 4;
		} else {
			local276 = 8;
		}
		Static607.method8701(local27, local276, local19, false);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method7345(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString99 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local32);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local24 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(86) String local86;
			if (local70 == -1) {
				local86 = local64;
			} else {
				local86 = local64.substring(0, local70);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local24 = local24 + local86;
			if (local70 != -1 && local77 != -1) {
				@Pc(131) int local131 = local64.indexOf(".java:", local70);
				if (local131 >= 0) {
					local24 = local24 + local64.substring(local131 + 5, local77);
				}
			}
			local24 = local24 + ' ';
		}
	}
}
