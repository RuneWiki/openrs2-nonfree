import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
	public static int anInt3864;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
	public static int anInt3868;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
	public static int anInt3872;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Z")
	public static boolean aBoolean329 = false;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Z")
	public static boolean aBoolean330 = true;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
	public static int anInt3865 = 0;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
	public static int anInt3867 = 0;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
	public static int anInt3870 = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Lclient!cn;")
	public static Class15_Sub3 method3613(@OriginalArg(1) int arg0) {
		@Pc(13) Class175[] local13 = Class123.aClass175Array1;
		synchronized (Class123.aClass175Array1) {
			@Pc(38) Class15_Sub3 local38;
			if (Class123.aClass175Array1.length <= arg0 || Class123.aClass175Array1[arg0].method4666()) {
				local38 = new Class15_Sub3();
				local38.aClass15_Sub2Array1 = new Class15_Sub2[arg0];
				for (@Pc(62) int local62 = 0; local62 < arg0; local62++) {
					local38.aClass15_Sub2Array1[local62] = new Class15_Sub2();
				}
			} else {
				local38 = (Class15_Sub3) Class123.aClass175Array1[arg0].method4674();
				local38.method5441();
				@Pc(47) int local47 = Static341.anIntArray281[arg0]--;
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Lclient!ab;")
	public static Class1_Sub1_Sub2 method3614() {
		@Pc(8) Class1_Sub1_Sub2 local8 = (Class1_Sub1_Sub2) Static165.aClass4_4.method177();
		if (local8 != null) {
			local8.method5710();
			local8.method5564();
			return local8;
		}
		do {
			local8 = (Class1_Sub1_Sub2) Static148.aClass4_8.method177();
			if (local8 == null) {
				return null;
			}
			if (local8.method164() > Static349.method5647()) {
				return null;
			}
			local8.method5710();
			local8.method5564();
		} while ((local8.aLong208 & Long.MIN_VALUE) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method3616(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static61.aClass79_1);
		arg0.removeFocusListener(Static61.aClass79_1);
		Static274.anInt5358 = -1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg0;
		@Pc(21) int local21 = arg6 - arg0;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + (1 - local57) * local25;
		@Pc(78) int local78 = local29 - (local57 - 1) * local45;
		@Pc(87) int local87 = local33 * (1 - local61) + local49;
		@Pc(95) int local95 = local37 - local53 * (local61 - 1);
		@Pc(99) int local99 = local25 << 2;
		@Pc(103) int local103 = local29 << 2;
		@Pc(107) int local107 = local33 << 2;
		@Pc(111) int local111 = local37 << 2;
		@Pc(115) int local115 = local41 * 3;
		@Pc(121) int local121 = (local57 - 3) * local45;
		@Pc(125) int local125 = local49 * 3;
		@Pc(131) int local131 = local53 * (local61 - 3);
		@Pc(133) int local133 = local103;
		@Pc(143) int local143 = local99 * (arg6 - 1);
		@Pc(145) int local145 = local111;
		@Pc(168) int local168;
		@Pc(176) int local176;
		@Pc(185) int local185;
		@Pc(193) int local193;
		if (Static49.anInt1124 <= arg1 && arg1 <= Static291.anInt5657) {
			@Pc(159) int[] local159 = Static327.anIntArrayArray63[arg1];
			local168 = Static216.method3969(Static251.anInt6512, arg5 - arg2, Static106.anInt2157);
			local176 = Static216.method3969(Static251.anInt6512, arg2 + arg5, Static106.anInt2157);
			local185 = Static216.method3969(Static251.anInt6512, arg5 - local16, Static106.anInt2157);
			local193 = Static216.method3969(Static251.anInt6512, arg5 + local16, Static106.anInt2157);
			Static97.method1784(local168, local159, arg3, local185);
			Static97.method1784(local185, local159, arg4, local193);
			Static97.method1784(local193, local159, arg3, local176);
		}
		@Pc(217) int local217 = (local21 - 1) * local107;
		while (local9 > 0) {
			@Pc(230) boolean local230 = local21 >= local9;
			if (local230) {
				if (local87 < 0) {
					while (local87 < 0) {
						local87 += local125;
						local95 += local145;
						local11++;
						local145 += local111;
						local125 += local111;
					}
				}
				if (local95 < 0) {
					local95 += local145;
					local87 += local125;
					local145 += local111;
					local11++;
					local125 += local111;
				}
				local95 += -local131;
				local87 += -local217;
				local217 -= local107;
				local131 -= local107;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local115;
					local78 += local133;
					local7++;
					local133 += local103;
					local115 += local103;
				}
			}
			if (local78 < 0) {
				local70 += local115;
				local78 += local133;
				local133 += local103;
				local115 += local103;
				local7++;
			}
			local70 += -local143;
			local78 += -local121;
			local121 -= local99;
			local9--;
			local143 -= local99;
			local168 = arg1 - local9;
			local176 = arg1 + local9;
			if (Static49.anInt1124 <= local176 && local168 <= Static291.anInt5657) {
				local185 = Static216.method3969(Static251.anInt6512, arg5 + local7, Static106.anInt2157);
				local193 = Static216.method3969(Static251.anInt6512, arg5 - local7, Static106.anInt2157);
				if (local230) {
					@Pc(432) int local432 = Static216.method3969(Static251.anInt6512, arg5 + local11, Static106.anInt2157);
					@Pc(441) int local441 = Static216.method3969(Static251.anInt6512, arg5 - local11, Static106.anInt2157);
					@Pc(448) int[] local448;
					if (Static49.anInt1124 <= local168) {
						local448 = Static327.anIntArrayArray63[local168];
						Static97.method1784(local193, local448, arg3, local441);
						Static97.method1784(local441, local448, arg4, local432);
						Static97.method1784(local432, local448, arg3, local185);
					}
					if (local176 <= Static291.anInt5657) {
						local448 = Static327.anIntArrayArray63[local176];
						Static97.method1784(local193, local448, arg3, local441);
						Static97.method1784(local441, local448, arg4, local432);
						Static97.method1784(local432, local448, arg3, local185);
					}
				} else {
					if (local168 >= Static49.anInt1124) {
						Static97.method1784(local193, Static327.anIntArrayArray63[local168], arg3, local185);
					}
					if (Static291.anInt5657 >= local176) {
						Static97.method1784(local193, Static327.anIntArrayArray63[local176], arg3, local185);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Z")
	public static boolean method3618() {
		return Static123.anInt2380 != 0 || Static180.anInt3759 >= 2;
	}
}
