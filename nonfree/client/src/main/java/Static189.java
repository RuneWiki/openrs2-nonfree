import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString34 = null;

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_70 = new Class217(47, 0);

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "[S")
	public static final short[] aShortArray68 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILclient!mq;ILclient!ea;IJI)V")
	public static void method3471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class156 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class58 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg3 * arg3 + arg7 * arg7;
		if ((long) local11 > arg6) {
			return;
		}
		@Pc(34) int local34 = Math.min(arg2.anInt4853 / 2, arg2.anInt4823 / 2);
		if (local11 <= local34 * local34) {
			Static290.method4095(arg1, arg4, arg2, arg7, arg0, Static4.aClass8Array3[arg5], arg3);
			return;
		}
		local34 -= 10;
		@Pc(62) int local62;
		if (Static161.anInt3316 == 4) {
			local62 = (int) Static252.aFloat47 & 0x3FFF;
		} else {
			local62 = (int) Static252.aFloat47 + Static20.anInt696 & 0x3FFF;
		}
		@Pc(73) int local73 = Class3_Sub2_Sub17.anIntArray289[local62];
		@Pc(77) int local77 = Class3_Sub2_Sub17.anIntArray290[local62];
		if (Static161.anInt3316 != 4) {
			local77 = local77 * 256 / (Static341.anInt5790 + 256);
			local73 = local73 * 256 / (Static341.anInt5790 + 256);
		}
		@Pc(106) int local106 = local73 * arg3 + local77 * arg7 >> 15;
		@Pc(116) int local116 = arg3 * local77 - local73 * arg7 >> 15;
		@Pc(122) double local122 = Math.atan2((double) local106, (double) local116);
		@Pc(129) int local129 = (int) ((double) local34 * Math.sin(local122));
		@Pc(136) int local136 = (int) (Math.cos(local122) * (double) local34);
		Static151.aClass8Array83[arg5].method6004((float) arg2.anInt4853 / 2.0F + (float) arg1 + (float) local129, (float) arg2.anInt4823 / 2.0F + (float) arg0 - (float) local136, 4096, (int) (-local122 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZII)V")
	public static void method3472(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class163 local13 = Static77.aClass163ArrayArray1[arg1][arg0];
		if (local13 != null) {
			Static453.anInt7635 = local13.anInt5011;
			Static103.anInt2330 = local13.anInt5017;
			Static149.anInt3020 = local13.anInt5014;
		}
		Static428.method5582();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIZ)V")
	public static void method3477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static144.aFloat59 < Static144.aFloat58) {
			Static144.aFloat59 = (float) ((double) Static144.aFloat59 + (double) Static144.aFloat59 / 30.0D);
			if (Static144.aFloat59 > Static144.aFloat58) {
				Static144.aFloat59 = Static144.aFloat58;
			}
			Static197.method3120();
			Static144.anInt5407 = (int) Static144.aFloat59 >> 1;
			Static144.aByteArrayArrayArray17 = Static181.method2885(Static144.anInt5407);
		} else if (Static144.aFloat59 > Static144.aFloat58) {
			Static144.aFloat59 = (float) ((double) Static144.aFloat59 - (double) Static144.aFloat59 / 30.0D);
			if (Static144.aFloat59 < Static144.aFloat58) {
				Static144.aFloat59 = Static144.aFloat58;
			}
			Static197.method3120();
			Static144.anInt5407 = (int) Static144.aFloat59 >> 1;
			Static144.aByteArrayArrayArray17 = Static181.method2885(Static144.anInt5407);
		}
		if (Static405.anInt6683 != -1 && Static339.anInt5767 != -1) {
			@Pc(80) int local80 = Static405.anInt6683 - Static411.anInt6760;
			if (local80 < 2 || local80 > 2) {
				local80 /= 8;
			}
			@Pc(94) int local94 = Static339.anInt5767 - Static76.anInt1937;
			if (local94 < 2 || local94 > 2) {
				local94 /= 8;
			}
			Static411.anInt6760 -= -local80;
			Static76.anInt1937 -= -local94;
			if (local80 == 0 && local94 == 0) {
				Static339.anInt5767 = -1;
				Static405.anInt6683 = -1;
			}
			Static197.method3120();
		}
		if (Static374.anInt6289 > 0) {
			Static238.anInt4569--;
			if (Static238.anInt4569 == 0) {
				Static374.anInt6289--;
				Static238.anInt4569 = 100;
			}
		} else {
			Static128.anInt2675 = -1;
			Static233.anInt4469 = -1;
		}
		if (!Static133.aBoolean243 || Static132.aClass243_17 == null) {
			return;
		}
		for (@Pc(164) Class3_Sub16 local164 = (Class3_Sub16) Static132.aClass243_17.method5208(); local164 != null; local164 = (Class3_Sub16) Static132.aClass243_17.method5203()) {
			@Pc(173) Class90 local173 = Static144.aClass171_4.method3940(local164.aClass3_Sub26_1.anInt3892);
			if (local164.method1911(arg1, arg0)) {
				if (local173.aStringArray25 != null) {
					if (local173.aStringArray25[4] != null) {
						Static102.method1792(local173.aString19, (long) local164.aClass3_Sub26_1.anInt3892, -1, 0, true, local173.aStringArray25[4], false, local173.anInt2698, -1, 1009);
					}
					if (local173.aStringArray25[3] != null) {
						Static102.method1792(local173.aString19, (long) local164.aClass3_Sub26_1.anInt3892, -1, 0, true, local173.aStringArray25[3], false, local173.anInt2698, -1, 1003);
					}
					if (local173.aStringArray25[2] != null) {
						Static102.method1792(local173.aString19, (long) local164.aClass3_Sub26_1.anInt3892, -1, 0, true, local173.aStringArray25[2], false, local173.anInt2698, -1, 1012);
					}
					if (local173.aStringArray25[1] != null) {
						Static102.method1792(local173.aString19, (long) local164.aClass3_Sub26_1.anInt3892, -1, 0, true, local173.aStringArray25[1], false, local173.anInt2698, -1, 1008);
					}
					if (local173.aStringArray25[0] != null) {
						Static102.method1792(local173.aString19, (long) local164.aClass3_Sub26_1.anInt3892, -1, 0, true, local173.aStringArray25[0], false, local173.anInt2698, -1, 1007);
					}
				}
				if (!local164.aClass3_Sub26_1.aBoolean335) {
					local164.aClass3_Sub26_1.aBoolean335 = true;
					Static285.method4054(Static236.aClass167_6, local164.aClass3_Sub26_1.anInt3892, local173.anInt2698);
				}
				if (local164.aClass3_Sub26_1.aBoolean335) {
					Static285.method4054(Static217.aClass167_5, local164.aClass3_Sub26_1.anInt3892, local173.anInt2698);
				}
			} else if (local164.aClass3_Sub26_1.aBoolean335) {
				local164.aClass3_Sub26_1.aBoolean335 = false;
				Static285.method4054(Static237.aClass167_7, local164.aClass3_Sub26_1.anInt3892, local173.anInt2698);
			}
		}
	}
}
