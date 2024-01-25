import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIZZI)V")
	public static void method2586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static254.aClass368ArrayArrayArray2 == null) {
			Static119.aClass95_4.method8054(arg0, arg1, arg4, arg2, -16777216);
		} else if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614 >= 0 && Static98.anInt361 * 512 > Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614 && Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619 >= 0 && Static438.anInt7120 * 512 > Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619) {
			Static494.anInt7829++;
			if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 != null && Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614 - (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.method7866() - 1) * 256 >> 9 == Static622.anInt10293 && Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619 - (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.method7866() - 1) * 256 >> 9 == Static643.anInt10566) {
				Static622.anInt10293 = -1;
				Static643.anInt10566 = -1;
				Static113.method1728();
			}
			Static523.method6804();
			if (!arg3) {
				Static41.method774();
			}
			Static640.method8765();
			Static279.method4070(arg1, true, arg0, arg2, arg4);
			@Pc(116) int local116 = Static397.anInt9628;
			Static501.anInt7929 = Static501.anInt7936;
			@Pc(120) int local120 = Static274.anInt4695;
			@Pc(122) int local122 = Static270.anInt4660;
			@Pc(124) int local124 = Static635.anInt10497;
			@Pc(130) int local130;
			@Pc(168) int local168;
			if (Static451.anInt7263 == 1) {
				local130 = (int) Static376.aFloat104;
				if (Static604.anInt10087 >> 8 > local130) {
					local130 = Static604.anInt10087 >> 8;
				}
				if (Static185.aBooleanArray13[4] && Static122.anIntArray131[4] + 128 > local130) {
					local130 = Static122.anIntArray131[4] + 128;
				}
				local168 = (int) Static318.aFloat81 + Static307.anInt5275 & 0x3FFF;
				Static325.method4641((local130 >> 3) * 3 + 600 << 2, local130, local168, Static434.anInt7081, Static365.anInt6231, local124, Static662.method8831(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614, Static570.anInt9192) - 200);
			} else if (Static451.anInt7263 == 4) {
				local130 = (int) Static376.aFloat104;
				if (Static604.anInt10087 >> 8 > local130) {
					local130 = Static604.anInt10087 >> 8;
				}
				if (Static185.aBooleanArray13[4] && Static122.anIntArray131[4] + 128 > local130) {
					local130 = Static122.anIntArray131[4] + 128;
				}
				local168 = (int) Static318.aFloat81 & 0x3FFF;
				Static325.method4641((local130 >> 3) * 3 + 600 << 2, local130, local168, Static434.anInt7081, Static365.anInt6231, local124, Static662.method8831(Static8.anInt108, Static82.anInt1511, Static570.anInt9192) - 200);
			} else if (Static451.anInt7263 == 5) {
				Static30.method1349(local124);
			}
			local130 = Static370.anInt6266;
			local168 = Static166.anInt3034;
			@Pc(274) int local274 = Static564.anInt9117;
			@Pc(276) int local276 = Static655.anInt10676;
			@Pc(278) int local278 = Static40.anInt856;
			@Pc(322) int local322;
			for (@Pc(280) int local280 = 0; local280 < 5; local280++) {
				if (Static185.aBooleanArray13[local280]) {
					local322 = (int) ((double) -Static488.anIntArray419[local280] + Math.random() * (double) (Static488.anIntArray419[local280] * 2 + 1) + Math.sin((double) Static69.anIntArray518[local280] / 100.0D * (double) Static522.anIntArray441[local280]) * (double) Static122.anIntArray131[local280]);
					if (local280 == 1) {
						Static166.anInt3034 += local322 << 2;
					}
					if (local280 == 2) {
						Static564.anInt9117 += local322 << 2;
					}
					if (local280 == 3) {
						Static40.anInt856 = Static40.anInt856 + local322 & 0x3FFF;
					}
					if (local280 == 4) {
						Static655.anInt10676 += local322;
						if (Static655.anInt10676 < 1024) {
							Static655.anInt10676 = 1024;
						} else if (Static655.anInt10676 > 3072) {
							Static655.anInt10676 = 3072;
						}
					}
					if (local280 == 0) {
						Static370.anInt6266 += local322 << 2;
					}
				}
			}
			if (Static370.anInt6266 < 0) {
				Static370.anInt6266 = 0;
			}
			if ((Static133.anInt2551 << 9) - 1 < Static370.anInt6266) {
				Static370.anInt6266 = (Static133.anInt2551 << 9) - 1;
			}
			if (Static564.anInt9117 < 0) {
				Static564.anInt9117 = 0;
			}
			if ((Static155.anInt2874 << 9) - 1 < Static564.anInt9117) {
				Static564.anInt9117 = (Static155.anInt2874 << 9) - 1;
			}
			Static251.method3803();
			Static181.method2862();
			Static119.aClass95_4.KA(local122, local120, local122 + local116, local124 + local120);
			Static498.method9017(true);
			if (Static498.aBoolean757) {
				Static402.method5591(Static148.anInt2713);
				if (Static501.anInt7929 != Static131.anInt2533) {
					Static182.aBoolean246 = true;
				}
				Static131.anInt2533 = Static501.anInt7929;
			} else {
				Static119.aClass95_4.ya();
				local322 = Static148.anInt2713;
				if (Static481.aClass118_2 == null) {
					Static119.aClass95_4.GA(local322);
				} else {
					Static481.aClass118_2.method2801(local120, Static119.aClass95_4, local322, Static655.anInt10676, Static305.anInt5136 << 3, local116, local124, Static40.anInt856, local122);
				}
			}
			Static333.method4737();
			Static360.aClass17_3.method6240(Static370.anInt6266, Static166.anInt3034, Static564.anInt9117, -Static655.anInt10676 & 0x3FFF, -Static40.anInt856 & 0x3FFF, -Static325.anInt5414 & 0x3FFF);
			Static119.aClass95_4.method8037(Static360.aClass17_3);
			Static119.aClass95_4.DA(local122 + local116 / 2, local120 - -(local124 / 2), Static502.anInt7942 << 1, Static502.anInt7942 << 1);
			Static307.method4534(local122 + local116 / 2, Static502.anInt7942 << 1, Static502.anInt7942 << 1, local124 / 2 + local120);
			Static133.method2247(-Static40.anInt856 & 0x3FFF, Static370.anInt6266, Static166.anInt3034, Static564.anInt9117, -Static655.anInt10676 & 0x3FFF, -Static325.anInt5414 & 0x3FFF);
			@Pc(582) byte local582 = Static336.aClass3_Sub41_18.aClass14_Sub19_2.method5938() == 2 ? (byte) Static494.anInt7829 : 1;
			if (Static498.aBoolean757) {
				Static283.method4114(-Static325.anInt5414 & 0x3FFF, -Static40.anInt856 & 0x3FFF, -Static655.anInt10676 & 0x3FFF);
				Static384.method5384(Static336.aClass3_Sub41_18.aClass14_Sub11_1.method3289() == 0, Static501.anInt7929, Static652.anIntArray579, Static58.anIntArray511, Static370.anInt6266, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619 >> 9, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614 >> 9, Static492.anIntArray42, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132 + 1, Static419.anIntArray363, Static122.anInt2190, local582, Static464.anIntArray403, Static564.anInt9117, Static366.aByteArrayArrayArray14, Static166.anInt3034);
			} else {
				Static642.method8648(Static122.anInt2190, Static370.anInt6266, Static166.anInt3034, Static564.anInt9117, Static366.aByteArrayArrayArray14, Static419.anIntArray363, Static652.anIntArray579, Static464.anIntArray403, Static492.anIntArray42, Static58.anIntArray511, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132 + 1, local582, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614 >> 9, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619 >> 9, Static336.aClass3_Sub41_18.aClass14_Sub11_1.method3289() == 0, Static375.aBoolean532 ? Static501.anInt7929 : -1, 0, false);
			}
			Static333.method4737();
			if (Static221.anInt3831 == 10) {
				Static524.method6822(local120, local116, local122, local124);
				Static444.method5565(local116, local120, local124, local122);
				Static10.method327(local124, local120, local122, local116);
				Static341.method4983(local120, local124, local116, local122);
			}
			Static289.method4163();
			Static40.anInt856 = local278;
			Static564.anInt9117 = local274;
			Static655.anInt10676 = local276;
			Static370.anInt6266 = local130;
			Static166.anInt3034 = local168;
			if (Static45.aBoolean58 && Static512.aClass113_3.method2595() == 0) {
				Static45.aBoolean58 = false;
			}
			if (Static45.aBoolean58) {
				Static119.aClass95_4.method8054(local124, local120, local116, local122, -16777216);
				Static651.method8742(false, Static114.aClass84_12.method1729(Static654.anInt10668), Static119.aClass95_4, Static513.aClass91_12, Static184.aClass67_3);
			}
			Static498.method9017(false);
		} else {
			Static119.aClass95_4.method8054(arg0, arg1, arg4, arg2, -16777216);
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Ljava/lang/String;[BIB)I")
	public static int method2587(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(20) int local20 = Static416.method5660(arg0.charAt(local12));
			@Pc(35) int local35 = local10 <= local12 + 1 ? -1 : Static416.method5660(arg0.charAt(local12 + 1));
			@Pc(56) int local56 = local12 + 2 < local10 ? Static416.method5660(arg0.charAt(local12 + 2)) : -1;
			@Pc(75) int local75 = local12 + 3 < local10 ? Static416.method5660(arg0.charAt(local12 + 3)) : -1;
			arg1[arg2++] = (byte) (local20 << 2 | local35 >>> 4);
			if (local56 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((local35 & 0xF) << 4 | local56 >>> 2);
			if (local75 == -1) {
				break;
			}
			arg1[arg2++] = (byte) (local75 | (local56 & 0x3) << 6);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Ljava/lang/String;BLjava/io/File;)V")
	public static void method2588(@OriginalArg(0) String arg0, @OriginalArg(2) File arg1) {
		Static128.aHashtable4.put(arg0, arg1);
	}
}
