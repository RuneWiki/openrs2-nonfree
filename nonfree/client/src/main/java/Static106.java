import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!du", name = "m", descriptor = "I")
	public static int anInt2655;

	@OriginalMember(owner = "client!du", name = "x", descriptor = "I")
	public static int anInt2666;

	@OriginalMember(owner = "client!du", name = "r", descriptor = "I")
	public static int anInt2660 = 0;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIII)V")
	public static void method2585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg0; local7++) {
			Static580.method8027(Static104.anIntArrayArray24[local7], arg1, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
	public static void method2586() {
		for (@Pc(7) int local7 = 0; local7 < Static244.anInt5486; local7++) {
			Static206.aClass92Array9[local7] = null;
		}
		Static244.anInt5486 = 0;
		@Pc(25) int local25;
		@Pc(29) int local29;
		for (@Pc(21) int local21 = 0; local21 < Static626.anInt10336; local21++) {
			for (local25 = 0; local25 < Static642.anInt10523; local25++) {
				for (local29 = 0; local29 < Static158.anInt3845; local29++) {
					@Pc(39) Class106 local39 = Static170.aClass106ArrayArrayArray1[local21][local29][local25];
					if (local39 != null) {
						if (local39.aShort34 > 0) {
							local39.aShort34 = (short) (local39.aShort34 * -1);
						}
						if (local39.aShort37 > 0) {
							local39.aShort37 = (short) (local39.aShort37 * -1);
						}
					}
				}
			}
		}
		for (local25 = 0; local25 < Static626.anInt10336; local25++) {
			for (local29 = 0; local29 < Static642.anInt10523; local29++) {
				for (@Pc(94) int local94 = 0; local94 < Static158.anInt3845; local94++) {
					@Pc(104) Class106 local104 = Static170.aClass106ArrayArrayArray1[local25][local94][local29];
					if (local104 != null) {
						@Pc(127) boolean local127 = Static170.aClass106ArrayArrayArray1[0][local94][local29] != null && Static170.aClass106ArrayArrayArray1[0][local94][local29].aClass106_1 != null;
						@Pc(132) int local132;
						@Pc(134) int local134;
						@Pc(148) Class106 local148;
						@Pc(158) int local158;
						@Pc(331) int local331;
						@Pc(345) int local345;
						@Pc(352) int local352;
						@Pc(368) int local368;
						@Pc(376) int local376;
						@Pc(380) int local380;
						@Pc(384) int local384;
						@Pc(391) int local391;
						@Pc(431) int local431;
						@Pc(435) int local435;
						if (local104.aShort34 < 0) {
							local132 = local29;
							local134 = local29;
							local148 = Static170.aClass106ArrayArrayArray1[local25][local94][local29 - 1];
							local158 = Static445.aClass274Array1[local25].method8041(local94, local29);
							while (local132 > 0 && local148 != null && local148.aShort34 < 0 && local104.aShort34 == local148.aShort34 && local104.aShort36 == local148.aShort36 && Static445.aClass274Array1[local25].method8041(local94, local132 - 1) == local158 && (local132 - 1 <= 0 || local158 == Static445.aClass274Array1[local25].method8041(local94, local132 - 2))) {
								local132--;
								local148 = Static170.aClass106ArrayArrayArray1[local25][local94][local132 - 1];
							}
							for (local148 = Static170.aClass106ArrayArrayArray1[local25][local94][local29 + 1]; local134 < Static158.anInt3845 && local148 != null && local148.aShort34 < 0 && local104.aShort34 == local148.aShort34 && local148.aShort36 == local104.aShort36 && Static445.aClass274Array1[local25].method8041(local94, local134 + 1) == local158 && (Static158.anInt3845 <= local134 + 1 || Static445.aClass274Array1[local25].method8041(local94, local134 + 2) == local158); local148 = Static170.aClass106ArrayArrayArray1[local25][local94][local134 + 1]) {
								local134++;
							}
							local331 = local25 + 1 - local25;
							local345 = Static445.aClass274Array1[local127 ? local25 + 1 : local25].method8041(local94, local132);
							local352 = local331 * local104.aShort34 + local345;
							local368 = Static445.aClass274Array1[local127 ? local25 + 1 : local25].method8041(local94, local134 + 1);
							local376 = local368 + local331 * local104.aShort34;
							local380 = local94 << Static276.anInt5846;
							local384 = local132 << Static276.anInt5846;
							local391 = (local134 << Static276.anInt5846) + Static325.anInt6512;
							Static206.aClass92Array9[Static244.anInt5486++] = new Class92(1, local25, local380 + local104.aShort36, local104.aShort36 + local380, local380 + local104.aShort36, local380 - -local104.aShort36, local345, local368, local376, local352, local384, local391, local391, local384);
							for (local431 = local25; local431 <= local25; local431++) {
								for (local435 = local132; local435 <= local134; local435++) {
									Static170.aClass106ArrayArrayArray1[local431][local94][local435].aShort34 = (short) (Static170.aClass106ArrayArrayArray1[local431][local94][local435].aShort34 * -1);
								}
							}
						}
						if (local104.aShort37 < 0) {
							local132 = local94;
							local134 = local94;
							local148 = Static170.aClass106ArrayArrayArray1[local25][local94 - 1][local29];
							local158 = Static445.aClass274Array1[local25].method8041(local94, local29);
							while (local132 > 0 && local148 != null && local148.aShort37 < 0 && local104.aShort37 == local148.aShort37 && local104.aShort35 == local148.aShort35 && Static445.aClass274Array1[local25].method8041(local132 - 1, local29) == local158 && (local132 - 1 <= 0 || local158 == Static445.aClass274Array1[local25].method8041(local132 - 2, local29))) {
								local132--;
								local148 = Static170.aClass106ArrayArrayArray1[local25][local132 - 1][local29];
							}
							for (local148 = Static170.aClass106ArrayArrayArray1[local25][local94 + 1][local29]; Static642.anInt10523 > local134 && local148 != null && local148.aShort37 < 0 && local148.aShort37 == local104.aShort37 && local104.aShort35 == local148.aShort35 && local158 == Static445.aClass274Array1[local25].method8041(local134 + 1, local29) && (Static642.anInt10523 <= local134 + 1 || local158 == Static445.aClass274Array1[local25].method8041(local134 + 2, local29)); local148 = Static170.aClass106ArrayArrayArray1[local25][local134 + 1][local29]) {
								local134++;
							}
							local331 = local25 + 1 - local25;
							local345 = Static445.aClass274Array1[local127 ? local25 + 1 : local25].method8041(local132, local29);
							local352 = local104.aShort37 * local331 + local345;
							local368 = Static445.aClass274Array1[local127 ? local25 + 1 : local25].method8041(local134 + 1, local29);
							local376 = local368 + local104.aShort37 * local331;
							local380 = local132 << Static276.anInt5846;
							local384 = (local134 << Static276.anInt5846) + Static325.anInt6512;
							local391 = local29 << Static276.anInt5846;
							Static206.aClass92Array9[Static244.anInt5486++] = new Class92(2, local25, local380, local384, local384, local380, local345, local368, local376, local352, local104.aShort35 + local391, local391 - -local104.aShort35, local104.aShort35 + local391, local391 - -local104.aShort35);
							for (local431 = local25; local431 <= local25; local431++) {
								for (local435 = local132; local435 <= local134; local435++) {
									Static170.aClass106ArrayArrayArray1[local431][local435][local29].aShort37 = (short) (Static170.aClass106ArrayArrayArray1[local431][local435][local29].aShort37 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static301.aBoolean519 = true;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I[[[Lclient!fu;)V")
	public static void method2587(@OriginalArg(1) Class106[][][] arg0) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) Class106[][] local14 = arg0[local8];
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				for (@Pc(20) int local20 = 0; local20 < local14[local16].length; local20++) {
					@Pc(28) Class106 local28 = local14[local16][local20];
					if (local28 != null) {
						if (local28.aClass2_Sub3_Sub5_1 instanceof Interface18) {
							((Interface18) local28.aClass2_Sub3_Sub5_1).method8582();
						}
						if (local28.aClass2_Sub3_Sub3_1 instanceof Interface18) {
							((Interface18) local28.aClass2_Sub3_Sub3_1).method8582();
						}
						if (local28.aClass2_Sub3_Sub3_2 instanceof Interface18) {
							((Interface18) local28.aClass2_Sub3_Sub3_2).method8582();
						}
						if (local28.aClass2_Sub3_Sub2_2 instanceof Interface18) {
							((Interface18) local28.aClass2_Sub3_Sub2_2).method8582();
						}
						if (local28.aClass2_Sub3_Sub2_1 instanceof Interface18) {
							((Interface18) local28.aClass2_Sub3_Sub2_1).method8582();
						}
						for (@Pc(78) Class243 local78 = local28.aClass243_1; local78 != null; local78 = local78.aClass243_3) {
							@Pc(83) Class2_Sub3_Sub1 local83 = local78.aClass2_Sub3_Sub1_1;
							if (local83 instanceof Interface18) {
								((Interface18) local83).method8582();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZIILjava/lang/Object;)[B")
	public static byte[] method2588(@OriginalArg(1) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return Static344.method5656(arg0, local18);
		} else if (arg1 instanceof Class143) {
			@Pc(30) Class143 local30 = (Class143) arg1;
			return local30.method4423(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BLjava/util/Random;I)I")
	public static int method2589(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static474.method7016(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(45) int local45 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(48) int local48;
			do {
				local48 = arg0.nextInt();
			} while (local48 >= local45);
			return Static133.method3090(arg1, local48);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!kl;B)V")
	public static void method2590(@OriginalArg(0) Class2_Sub7 arg0) {
		arg0.aClass2_Sub3_Sub1_Sub2_1 = null;
		if (Static452.anInt8206 < 20) {
			Static339.aClass375_6.method8639(arg0);
			Static452.anInt8206++;
		}
	}
}
