import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "Lclient!gh;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
	public static int anInt1406;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString50 = "M";

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
	public static int anInt1404 = 0;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Lclient!de;")
	public static Class4_Sub2_Sub5 method1178(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub2_Sub5 local12 = (Class4_Sub2_Sub5) Static205.aClass111_16.method2890((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = Static243.aClass22_81.method665(1, arg0);
		} else {
			local27 = Static38.aClass22_16.method665(1, arg0 & 0x7FFF);
		}
		local12 = new Class4_Sub2_Sub5();
		if (local27 != null) {
			local12.method984(new Class4_Sub24(local27));
		}
		if (arg0 >= 32768) {
			local12.method977();
		}
		Static205.aClass111_16.method2886((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIIIIIII)V")
	public static void method1179(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = arg6 - arg0;
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg6 * arg6;
		@Pc(20) int local20 = arg3;
		@Pc(24) int local24 = arg3 * arg3;
		@Pc(28) int local28 = local12 * local12;
		@Pc(33) int local33 = arg3 - arg0;
		@Pc(37) int local37 = local18 << 1;
		@Pc(41) int local41 = local33 * local33;
		@Pc(45) int local45 = local24 << 1;
		@Pc(49) int local49 = local28 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local33 << 1;
		@Pc(65) int local65 = local28 * (1 - local57) + local53;
		@Pc(69) int local69 = arg3 << 1;
		@Pc(78) int local78 = (1 - local69) * local18 + local45;
		@Pc(87) int local87 = local41 - local49 * (local57 - 1);
		@Pc(102) int local102 = local24 - local37 * (local69 - 1);
		@Pc(106) int local106 = local18 << 2;
		@Pc(110) int local110 = local28 << 2;
		@Pc(114) int local114 = local24 << 2;
		@Pc(120) int local120 = local37 * (local69 - 3);
		@Pc(124) int local124 = local45 * 3;
		@Pc(126) int local126 = local114;
		@Pc(130) int local130 = local53 * 3;
		@Pc(136) int local136 = local49 * (local57 - 3);
		@Pc(140) int local140 = local41 << 2;
		@Pc(146) int local146 = (arg3 - 1) * local106;
		@Pc(148) int local148 = local140;
		@Pc(154) int local154 = (local33 - 1) * local110;
		@Pc(178) int local178;
		@Pc(186) int local186;
		@Pc(195) int local195;
		@Pc(203) int local203;
		if (arg5 >= Static293.anInt5688 && Static100.anInt1982 >= arg5) {
			@Pc(169) int[] local169 = Static253.anIntArrayArray34[arg5];
			local178 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg2 - arg6);
			local186 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg2 + arg6);
			local195 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg2 - local12);
			local203 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, local12 + arg2);
			Static190.method3151(local195, local169, arg1, local178);
			Static190.method3151(local203, local169, arg4, local195);
			Static190.method3151(local186, local169, arg1, local203);
		}
		while (local20 > 0) {
			if (local78 < 0) {
				while (local78 < 0) {
					local102 += local126;
					local7++;
					local126 += local114;
					local78 += local124;
					local124 += local114;
				}
			}
			@Pc(257) boolean local257 = local33 >= local20;
			if (local102 < 0) {
				local102 += local126;
				local126 += local114;
				local78 += local124;
				local124 += local114;
				local7++;
			}
			if (local257) {
				if (local65 < 0) {
					while (local65 < 0) {
						local14++;
						local65 += local130;
						local130 += local140;
						local87 += local148;
						local148 += local140;
					}
				}
				if (local87 < 0) {
					local14++;
					local65 += local130;
					local87 += local148;
					local148 += local140;
					local130 += local140;
				}
				local87 += -local136;
				local65 += -local154;
				local136 -= local110;
				local154 -= local110;
			}
			local20--;
			local102 += -local120;
			local178 = arg5 - local20;
			local78 += -local146;
			local186 = local20 + arg5;
			local146 -= local106;
			if (local186 >= Static293.anInt5688 && Static100.anInt1982 >= local178) {
				local195 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, local7 + arg2);
				local203 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg2 - local7);
				if (local257) {
					@Pc(407) int local407 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg2 + local14);
					@Pc(415) int local415 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg2 - local14);
					@Pc(427) int[] local427;
					if (Static293.anInt5688 <= local178) {
						local427 = Static253.anIntArrayArray34[local178];
						Static190.method3151(local415, local427, arg1, local203);
						Static190.method3151(local407, local427, arg4, local415);
						Static190.method3151(local195, local427, arg1, local407);
					}
					if (Static100.anInt1982 >= local186) {
						local427 = Static253.anIntArrayArray34[local186];
						Static190.method3151(local415, local427, arg1, local203);
						Static190.method3151(local407, local427, arg4, local415);
						Static190.method3151(local195, local427, arg1, local407);
					}
				} else {
					if (local178 >= Static293.anInt5688) {
						Static190.method3151(local195, Static253.anIntArrayArray34[local178], arg1, local203);
					}
					if (local186 <= Static100.anInt1982) {
						Static190.method3151(local195, Static253.anIntArrayArray34[local186], arg1, local203);
					}
				}
			}
			local120 -= local106;
		}
	}
}
