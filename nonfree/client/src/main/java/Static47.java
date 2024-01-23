import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!dh", name = "Q", descriptor = "[I")
	public static int[] anIntArray141;

	@OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
	public static int anInt1141 = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!th;Lclient!of;ILclient!th;Lclient!th;)Z")
	public static boolean method947(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class1_Sub10_Sub3 arg1, @OriginalArg(3) Class168 arg2, @OriginalArg(4) Class168 arg3) {
		Static176.aClass168_129 = arg3;
		Static2.aClass1_Sub10_Sub3_1 = arg1;
		Static188.aClass168_140 = arg2;
		Static157.aClass168_116 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method948(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(29) String local29;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(16) RuntimeException_Sub1 local16 = (RuntimeException_Sub1) arg0;
			arg0 = local16.aThrowable1;
			local29 = local16.aString7 + " | ";
		} else {
			local29 = "";
		}
		@Pc(37) StringWriter local37 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local37);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local37.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local29 + "| " + local61;
			}
			@Pc(71) int local71 = local64.indexOf(40);
			@Pc(78) int local78 = local64.indexOf(41, local71 + 1);
			@Pc(84) String local84;
			if (local71 == -1) {
				local84 = local64;
			} else {
				local84 = local64.substring(0, local71);
			}
			local84 = local84.trim();
			local84 = local84.substring(local84.lastIndexOf(32) + 1);
			local84 = local84.substring(local84.lastIndexOf(9) + 1);
			local29 = local29 + local84;
			if (local71 != -1 && local78 != -1) {
				@Pc(132) int local132 = local64.indexOf(".java:", local71);
				if (local132 >= 0) {
					local29 = local29 + local64.substring(local132 + 5, local78);
				}
			}
			local29 = local29 + ' ';
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIILclient!hd;Lclient!hd;IIIIJ)V")
	public static void method951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) Class2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class106 local6 = new Class106();
		local6.aLong131 = arg10;
		local6.anInt3756 = arg1 * 128 + 64;
		local6.anInt3753 = arg2 * 128 + 64;
		local6.anInt3752 = arg3;
		local6.aClass2_5 = arg4;
		local6.aClass2_6 = arg5;
		local6.anInt3764 = arg6;
		local6.anInt3755 = arg7;
		local6.anInt3751 = arg8;
		local6.anInt3757 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static7.aClass1_Sub2ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static7.aClass1_Sub2ArrayArrayArray1[local46][arg1][arg2] = new Class1_Sub2(local46, arg1, arg2);
			}
		}
		Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2].aClass106_1 = local6;
	}

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(II)V")
	public static void method953(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub7 local14 = (Class1_Sub7) Static111.aClass186_7.method4570((long) arg0);
		if (local14 != null) {
			for (@Pc(21) int local21 = 0; local21 < local14.anIntArray164.length; local21++) {
				local14.anIntArray164[local21] = -1;
				local14.anIntArray165[local21] = 0;
			}
		}
	}
}
