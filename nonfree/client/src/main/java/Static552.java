import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "Lclient!lga;")
	public static Class223 aClass223_106;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "Lclient!tb;")
	public static Class49 aClass49_35;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_166 = new Class322(34, -2);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!vo;II)I")
	public static int method7808(@OriginalArg(0) Class381 arg0, @OriginalArg(1) int arg1) {
		if (!Static78.method1061(arg0).method5210(arg1) && arg0.anObjectArray28 == null) {
			return -1;
		} else if (arg0.anIntArray666 == null || arg1 >= arg0.anIntArray666.length) {
			return -1;
		} else {
			return arg0.anIntArray666[arg1];
		}
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
	public static void method7810() {
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			Static153.aBooleanArray9[local12] = false;
		}
		Static309.anInt5362 = 0;
		Static16.anInt232 = -1;
		Static126.anInt2529 = -1;
		Static566.anInt8430 = 0;
		Static619.anInt9777 = -1;
		Static526.anInt8626 = 1;
		Static560.anInt9040 = -1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
	public static void method7811() {
		Static449.aClass6_Sub17_Sub4_3.method6095();
		Static145.aClass6_Sub17_Sub4_2 = null;
		Static432.anInt7414 = 1;
		Static672.aClass223_121 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public static void method7812() {
		@Pc(7) client local7 = Static635.aClient1;
		synchronized (Static635.aClient1) {
			if (Static221.aFrame1 == null) {
				@Pc(22) Container local22;
				if (Static637.aFrame3 != null) {
					local22 = Static637.aFrame3;
				} else if (Static371.anApplet1 == null) {
					local22 = Static34.anApplet_Sub1_1;
				} else {
					local22 = Static371.anApplet1;
				}
				Static238.anInt4606 = local22.getSize().width;
				Static542.anInt8800 = local22.getSize().height;
				@Pc(44) Insets local44;
				if (local22 == Static637.aFrame3) {
					local44 = Static637.aFrame3.getInsets();
					Static542.anInt8800 -= local44.bottom + local44.top;
					Static238.anInt4606 -= local44.left + local44.right;
				}
				if (Static368.method5566() == 1) {
					Static535.anInt4128 = Static339.anInt5789;
					Static494.anInt4031 = 0;
					Static274.anInt3226 = Static48.anInt6772;
					Static409.anInt7136 = (Static238.anInt4606 - Static339.anInt5789) / 2;
				} else {
					Static431.method6568();
				}
				if (Static41.aClass352_2 != Static520.aClass352_8) {
					@Pc(103) boolean local103;
					if (Static535.anInt4128 < 1024 && Static274.anInt3226 < 768) {
						local103 = true;
					} else {
						local103 = false;
					}
				}
				Static4.aCanvas1.setSize(Static535.anInt4128, Static274.anInt3226);
				if (Static202.aClass75_5 != null) {
					if (Static93.aBoolean113) {
						Static320.method5028(Static4.aCanvas1);
					} else {
						Static202.aClass75_5.method6668(Static4.aCanvas1, Static535.anInt4128, Static274.anInt3226);
					}
				}
				if (local22 == Static637.aFrame3) {
					local44 = Static637.aFrame3.getInsets();
					Static4.aCanvas1.setLocation(Static409.anInt7136 + local44.left, Static494.anInt4031 + local44.top);
				} else {
					Static4.aCanvas1.setLocation(Static409.anInt7136, Static494.anInt4031);
				}
				if (Static635.anInt9910 != -1) {
					Static623.method8541(true);
				}
				Static17.method220();
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BIIILclient!mca;I)V")
	public static void method7813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub35 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt6179 == -1 && arg3.anIntArray364 == null) {
			return;
		}
		@Pc(19) int local19 = 0;
		@Pc(29) int local29 = arg3.anInt6185 * Static687.aClass6_Sub44_33.aClass7_Sub13_1.method3338() >> 8;
		if (arg2 > arg3.anInt6188) {
			local19 = arg2 - arg3.anInt6188;
		} else if (arg2 < arg3.anInt6189) {
			local19 = arg3.anInt6189 - arg2;
		}
		if (arg3.anInt6178 < arg0) {
			local19 += arg0 - arg3.anInt6178;
		} else if (arg0 < arg3.anInt6190) {
			local19 += arg3.anInt6190 - arg0;
		}
		if (arg3.anInt6184 == 0 || arg3.anInt6184 < local19 - 256 || Static687.aClass6_Sub44_33.aClass7_Sub13_1.method3338() == 0 || arg3.anInt6192 != arg4) {
			if (arg3.aClass6_Sub17_Sub2_2 != null) {
				Static544.aClass6_Sub17_Sub3_2.method4663(arg3.aClass6_Sub17_Sub2_2);
				arg3.aClass6_Sub16_3 = null;
				arg3.aClass6_Sub17_Sub2_2 = null;
				arg3.aClass6_Sub54_Sub1_3 = null;
			}
			if (arg3.aClass6_Sub17_Sub2_3 != null) {
				Static544.aClass6_Sub17_Sub3_2.method4663(arg3.aClass6_Sub17_Sub2_3);
				arg3.aClass6_Sub16_2 = null;
				arg3.aClass6_Sub54_Sub1_2 = null;
				arg3.aClass6_Sub17_Sub2_3 = null;
			}
			return;
		}
		local19 -= 256;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(183) int local183 = arg3.anInt6184 - arg3.anInt6180;
		if (local183 < 0) {
			local183 = arg3.anInt6184;
		}
		@Pc(193) int local193 = local29;
		@Pc(198) int local198 = local19 - arg3.anInt6180;
		if (local198 > 0 && local183 > 0) {
			local193 = (local183 - local198) * local29 / local183;
		}
		Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.method4424((byte) -28);
		@Pc(222) int local222 = 8192;
		@Pc(233) int local233 = (arg3.anInt6188 + arg3.anInt6189) / 2 - arg2;
		@Pc(244) int local244 = (arg3.anInt6190 + arg3.anInt6178) / 2 - arg0;
		@Pc(272) int local272;
		@Pc(286) int local286;
		if (local233 != 0 || local244 != 0) {
			local272 = -Static21.anInt279 - (int) (Math.atan2((double) local233, (double) local244) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local272 > 8192) {
				local272 = 16384 - local272;
			}
			if (local19 <= 0) {
				local286 = 8192;
			} else if (local19 < 4096) {
				local286 = local19 * 8192 / 4096 + 8192;
			} else {
				local286 = 16384;
			}
			local222 = local286 * local272 / 8192 + (16384 - local286 >> 1);
		}
		@Pc(411) Class6_Sub17_Sub2 local411;
		if (arg3.aClass6_Sub17_Sub2_2 != null) {
			arg3.aClass6_Sub17_Sub2_2.method3923(local193);
			arg3.aClass6_Sub17_Sub2_2.method3931(local222);
		} else if (arg3.anInt6179 >= 0) {
			local272 = arg3.anInt6187 == 256 && arg3.anInt6199 == 256 ? 256 : Static319.method5021(arg3.anInt6199, arg3.anInt6187);
			if (arg3.aBoolean456) {
				if (arg3.aClass6_Sub16_3 == null) {
					arg3.aClass6_Sub16_3 = Static132.method2557(Static255.aClass223_58, arg3.anInt6179);
				}
				if (arg3.aClass6_Sub16_3 != null) {
					if (arg3.aClass6_Sub54_Sub1_3 == null) {
						arg3.aClass6_Sub54_Sub1_3 = arg3.aClass6_Sub16_3.method2555(new int[] { 22050 });
					}
					if (arg3.aClass6_Sub54_Sub1_3 != null) {
						local411 = Static693.method3920(arg3.aClass6_Sub54_Sub1_3, local272, local193 << 6, local222);
						local411.method3937(-1);
						Static544.aClass6_Sub17_Sub3_2.method4661(local411);
						arg3.aClass6_Sub17_Sub2_2 = local411;
					}
				}
			} else {
				@Pc(428) Class393 local428 = Static699.method8920(Static56.aClass223_9, arg3.anInt6179, 0);
				if (local428 != null) {
					@Pc(435) Class6_Sub54_Sub1 local435 = local428.method8922().method8673(Static39.aClass397_1);
					@Pc(443) Class6_Sub17_Sub2 local443 = Static693.method3920(local435, local272, local193 << 6, local222);
					local443.method3937(-1);
					Static544.aClass6_Sub17_Sub3_2.method4661(local443);
					arg3.aClass6_Sub17_Sub2_2 = local443;
				}
			}
		}
		if (arg3.aClass6_Sub17_Sub2_3 != null) {
			arg3.aClass6_Sub17_Sub2_3.method3923(local193);
			arg3.aClass6_Sub17_Sub2_3.method3931(local222);
			if (arg3.aClass6_Sub17_Sub2_3.method9050()) {
				return;
			}
			arg3.aClass6_Sub16_2 = null;
			arg3.aClass6_Sub54_Sub1_2 = null;
			arg3.aClass6_Sub17_Sub2_3 = null;
		} else if (arg3.anIntArray364 != null && (arg3.anInt6193 -= arg1) <= 0) {
			local272 = arg3.anInt6187 == 256 && arg3.anInt6199 == 256 ? 256 : (int) ((double) (arg3.anInt6187 - arg3.anInt6199) * Math.random()) + arg3.anInt6199;
			if (!arg3.aBoolean458) {
				local286 = (int) ((double) arg3.anIntArray364.length * Math.random());
				@Pc(534) Class393 local534 = Static699.method8920(Static56.aClass223_9, arg3.anIntArray364[local286], 0);
				if (local534 != null) {
					@Pc(541) Class6_Sub54_Sub1 local541 = local534.method8922().method8673(Static39.aClass397_1);
					@Pc(549) Class6_Sub17_Sub2 local549 = Static693.method3920(local541, local272, local193 << 6, local222);
					local549.method3937(0);
					Static544.aClass6_Sub17_Sub3_2.method4661(local549);
					arg3.anInt6193 = arg3.anInt6197 + (int) ((double) (arg3.anInt6191 - arg3.anInt6197) * Math.random());
					arg3.aClass6_Sub17_Sub2_3 = local549;
					return;
				}
				return;
			}
			if (arg3.aClass6_Sub16_2 == null) {
				local286 = (int) ((double) arg3.anIntArray364.length * Math.random());
				arg3.aClass6_Sub16_2 = Static132.method2557(Static255.aClass223_58, arg3.anIntArray364[local286]);
			}
			if (arg3.aClass6_Sub16_2 != null) {
				if (arg3.aClass6_Sub54_Sub1_2 == null) {
					arg3.aClass6_Sub54_Sub1_2 = arg3.aClass6_Sub16_2.method2555(new int[] { 22050 });
				}
				if (arg3.aClass6_Sub54_Sub1_2 != null) {
					local411 = Static693.method3920(arg3.aClass6_Sub54_Sub1_2, local272, local193 << 6, local222);
					local411.method3937(0);
					Static544.aClass6_Sub17_Sub3_2.method4661(local411);
					arg3.anInt6193 = (int) ((double) (arg3.anInt6191 - arg3.anInt6197) * Math.random()) + arg3.anInt6197;
					arg3.aClass6_Sub17_Sub2_3 = local411;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)Z")
	public static boolean method7814(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static399.aClass109_6.method4596(arg0, arg1, arg2, Static385.anIntArray383);
		@Pc(13) int local13 = Static385.anIntArray383[2];
		if (local13 < 50) {
			return false;
		} else {
			Static385.anIntArray383[2] = local13;
			Static385.anIntArray383[0] = Static385.anIntArray383[0] * Static591.anInt9401 / local13 + Static243.anInt4674;
			Static385.anIntArray383[1] = Static173.anInt3556 + Static547.anInt8867 * Static385.anIntArray383[1] / local13;
			return true;
		}
	}
}
