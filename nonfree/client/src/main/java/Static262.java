import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "[I")
	public static final int[] anIntArray175 = new int[100];

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray19 = new String[100];

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
	public static void method1690() {
		@Pc(1) Class37 local1 = Static109.aClass37_38;
		synchronized (Static109.aClass37_38) {
			Static109.aClass37_38.method914();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLclient!ii;)V")
	public static void method1691(@OriginalArg(1) Class105 arg0) {
		arg0.method4268(0, 0, Static26.anInt476, 350);
		arg0.method4249(0, 0, Static26.anInt476, 350, Static121.anInt4228 << 24 | 0x332277, 1);
		@Pc(39) int local39;
		@Pc(43) int local43;
		for (@Pc(33) int local33 = 0; local33 < 100; local33++) {
			local39 = Static238.anIntArray454[local33];
			local43 = Static184.anIntArray361[local33];
			arg0.method4249(local39, local43, 2, 2, Static221.anIntArray435[local33] << 24 | 0xFFFFFF, 1);
		}
		local39 = 350 / Static48.anInt1214;
		if (Static208.anInt4355 > 0) {
			local43 = 342 - Static48.anInt1214;
			@Pc(83) int local83 = local39 * local43 / (local39 + Static208.anInt4355 - 1);
			@Pc(85) int local85 = 4;
			if (Static208.anInt4355 > 1) {
				local85 = (local43 - local83) * (Static208.anInt4355 - (Static229.anInt4788 + 1)) / (Static208.anInt4355 - 1) + 4;
			}
			arg0.method4249(Static26.anInt476 - 16, local85, 12, local83, Static121.anInt4228 << 24 | 0x332277, 2);
			for (@Pc(123) int local123 = Static229.anInt4788; local39 + Static229.anInt4788 > local123 && local123 < Static208.anInt4355; local123++) {
				@Pc(132) String[] local132 = Static183.method3233(Static167.aStringArray28[local123], '\b');
				@Pc(141) int local141 = (Static26.anInt476 - 8 - 16) / local132.length;
				for (@Pc(143) int local143 = 0; local143 < local132.length; local143++) {
					@Pc(151) int local151 = local141 * local143 + 8;
					arg0.method4268(local151, 0, local151 + local141 - 8, 350);
					Static233.aClass29_2.method3742(350 - Static307.anInt6148 - Static20.aClass34_1.anInt1017 - (local123 + -Static229.anInt4788) * Static48.anInt1214 - 2, -16777216, -1, local132[local143], local151);
				}
			}
		}
		arg0.method4268(0, 0, Static26.anInt476, 350);
		arg0.method4248(0, -1, 350 - Static307.anInt6148, Static26.anInt476);
		Static286.aClass29_3.method3742(350 - Static81.aClass34_4.anInt1017 - 1, -16777216, -1, "--> " + Static206.aString164, 10);
		local43 = -1;
		if (Static282.anInt3516 % 30 > 15) {
			local43 = 16777215;
		}
		arg0.method4255(local43, 12, 350 - Static81.aClass34_4.anInt1017 - 11, Static81.aClass34_4.method796("--> " + Static206.aString164.substring(0, Static355.anInt6792)) + 10);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIZII)V")
	public static void method1692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static54.method1088(Static41.anInt1131, arg5, Static165.anInt3409);
		@Pc(17) int local17 = Static54.method1088(Static41.anInt1131, arg3, Static165.anInt3409);
		@Pc(23) int local23 = Static54.method1088(Static60.anInt1399, arg2, Static138.anInt6334);
		@Pc(34) int local34 = Static54.method1088(Static60.anInt1399, arg0, Static138.anInt6334);
		@Pc(42) int local42 = Static54.method1088(Static41.anInt1131, arg4 + arg5, Static165.anInt3409);
		@Pc(51) int local51 = Static54.method1088(Static41.anInt1131, arg3 - arg4, Static165.anInt3409);
		for (@Pc(53) int local53 = local11; local53 < local42; local53++) {
			Static244.method5351(local23, local34, Static319.anIntArrayArray31[local53], arg1);
		}
		for (@Pc(69) int local69 = local17; local69 > local51; local69--) {
			Static244.method5351(local23, local34, Static319.anIntArrayArray31[local69], arg1);
		}
		@Pc(92) int local92 = Static54.method1088(Static60.anInt1399, arg2 + arg4, Static138.anInt6334);
		@Pc(101) int local101 = Static54.method1088(Static60.anInt1399, arg0 - arg4, Static138.anInt6334);
		for (@Pc(103) int local103 = local42; local103 <= local51; local103++) {
			@Pc(109) int[] local109 = Static319.anIntArrayArray31[local103];
			Static244.method5351(local23, local92, local109, arg1);
			Static244.method5351(local101, local34, local109, arg1);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)Lclient!tl;")
	public static Class1_Sub2_Sub19 method1693(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub2_Sub19 local15 = (Class1_Sub2_Sub19) Static61.aClass88_4.method1652((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static347.aClass134_150.method3009(arg0, 11);
		local15 = new Class1_Sub2_Sub19();
		if (local25 != null) {
			local15.method5212(new Class1_Sub21(local25));
		}
		Static61.aClass88_4.method1651((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ii;Lclient!nc;III)V")
	public static void method1694(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class83 local12;
		if (arg3 < Static97.anInt1852) {
			local12 = Static347.aClass83ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass10_Sub3_1 != null && local12.aClass10_Sub3_1.method5824()) {
				arg1.method5825(arg0, 0, 0, 128, local12.aClass10_Sub3_1, true);
			}
		}
		if (arg4 < Static97.anInt1852) {
			local12 = Static347.aClass83ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass10_Sub3_1 != null && local12.aClass10_Sub3_1.method5824()) {
				arg1.method5825(arg0, 128, 0, 0, local12.aClass10_Sub3_1, true);
			}
		}
		if (arg3 < Static97.anInt1852 && arg4 < Static3.anInt38) {
			local12 = Static347.aClass83ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass10_Sub3_1 != null && local12.aClass10_Sub3_1.method5824()) {
				arg1.method5825(arg0, 128, 0, 128, local12.aClass10_Sub3_1, true);
			}
		}
		if (arg3 < Static97.anInt1852 && arg4 > 0) {
			local12 = Static347.aClass83ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass10_Sub3_1 != null && local12.aClass10_Sub3_1.method5824()) {
				arg1.method5825(arg0, -128, 0, 128, local12.aClass10_Sub3_1, true);
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method1695(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString59 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local10 + "| " + local61;
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
			local10 = local10 + local86;
			if (local70 != -1 && local77 != -1) {
				@Pc(130) int local130 = local64.indexOf(".java:", local70);
				if (local130 >= 0) {
					local10 = local10 + local64.substring(local130 + 5, local77);
				}
			}
			local10 = local10 + ' ';
		}
	}
}
