import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "Lclient!ya;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	public static int anInt696 = 0;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_12 = new Class253(91, -1);

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "[I")
	public static final int[] anIntArray67 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method586() {
		Static253.aClass51_7.method5282(Static80.aFloat46, Static220.aFloat109, Static203.aFloat103);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method588() {
		for (@Pc(11) Class7_Sub42 local11 = (Class7_Sub42) Static320.aClass85_35.method2010(); local11 != null; local11 = (Class7_Sub42) Static320.aClass85_35.method2000()) {
			if (Static19.aClass223ArrayArrayArray1 == null) {
				local11.method5802();
			} else {
				@Pc(37) int local37;
				@Pc(47) Class26_Sub3 local47;
				@Pc(83) Class26_Sub3_Sub3 local83;
				@Pc(105) Class26_Sub1 local105;
				@Pc(171) Class26_Sub2 local171;
				@Pc(274) Class26_Sub4 local274;
				@Pc(141) Class26_Sub1_Sub3 local141;
				@Pc(293) Class26_Sub4_Sub2 local293;
				if (Static274.anInt4617 >= local11.anInt6165) {
					local37 = Static150.anIntArray251[local11.anInt6168];
					if (local37 == 0) {
						local47 = Static184.method2673(local11.anInt6161, local11.anInt6163, local11.anInt6167);
						if (local47 instanceof Class26_Sub3_Sub3) {
							Static354.method4562(local11.anInt6161, local11.anInt6163, local11.anInt6167);
							local83 = (Class26_Sub3_Sub3) local47;
							if (local83.aClass26_Sub3_3 != null) {
								Static361.method4639(local11.anInt6161, local11.anInt6163, local11.anInt6167, local83.aClass26_Sub3_3, null);
							}
						}
					} else if (local37 == 1) {
						local105 = Static178.method2592(local11.anInt6161, local11.anInt6163, local11.anInt6167);
						if (local105 instanceof Class26_Sub1_Sub3) {
							Static115.method1948(local11.anInt6161, local11.anInt6163, local11.anInt6167);
							local141 = (Class26_Sub1_Sub3) local105;
							if (local141.aClass26_Sub1_3 != null) {
								Static315.method4095(local11.anInt6161, local11.anInt6163, local11.anInt6167, local141.aClass26_Sub1_3, null);
							}
						}
					} else if (local37 == 2) {
						local171 = Static14.method152(local11.anInt6161, local11.anInt6163, local11.anInt6167, gf.class);
						if (local171 instanceof Class26_Sub2_Sub5) {
							Static276.method3689(local11.anInt6161, local11.anInt6163, local11.anInt6167, gf.class);
							@Pc(432) Class26_Sub2_Sub5 local432 = (Class26_Sub2_Sub5) local171;
							if (local432.aClass26_Sub2_1 != null) {
								Static37.method529(local432.aClass26_Sub2_1, false);
							}
						}
					} else if (local37 == 3) {
						local274 = Static339.method4422(local11.anInt6161, local11.anInt6163, local11.anInt6167);
						if (local274 instanceof Class26_Sub4_Sub2) {
							Static118.method1990(local11.anInt6161, local11.anInt6163, local11.anInt6167);
							local293 = (Class26_Sub4_Sub2) local274;
							if (local293.aClass26_Sub4_1 != null) {
								Static384.method5648(local11.anInt6161, local11.anInt6163, local11.anInt6167, local293.aClass26_Sub4_1);
							}
						}
					}
					local11.method5802();
				} else if (Static274.anInt4617 == local11.anInt6171) {
					local37 = Static150.anIntArray251[local11.anInt6168];
					if (local37 == 0) {
						local47 = Static184.method2673(local11.anInt6161, local11.anInt6163, local11.anInt6167);
						if (local47 instanceof Class26_Sub3_Sub3) {
							local11.method5802();
						} else if (Static214.method2092(local11.anInt6161, local11.anInt6163, local11.anInt6167) == null) {
							local83 = new Class26_Sub3_Sub3(local11.anInt6168, local11.anInt6162, local11.anInt6164, local11.anInt6169, local11.anInt6176, local47);
							Static361.method4639(local11.anInt6161, local11.anInt6163, local11.anInt6167, local83, null);
						} else {
							local11.method5802();
						}
					} else if (local37 == 1) {
						local105 = Static178.method2592(local11.anInt6161, local11.anInt6163, local11.anInt6167);
						if (local105 instanceof Class26_Sub1_Sub3) {
							local11.method5802();
						} else if (Static47.method611(local11.anInt6161, local11.anInt6163, local11.anInt6167) == null) {
							local141 = new Class26_Sub1_Sub3(local11.anInt6168, local11.anInt6162, local11.anInt6164, local11.anInt6169, local11.anInt6176, local105);
							Static315.method4095(local11.anInt6161, local11.anInt6163, local11.anInt6167, local141, null);
						} else {
							local11.method5802();
						}
					} else if (local37 == 2) {
						local171 = Static14.method152(local11.anInt6161, local11.anInt6163, local11.anInt6167, gf.class);
						if (local171 instanceof Class26_Sub2_Sub5) {
							local11.method5802();
						} else {
							Static276.method3689(local11.anInt6161, local11.anInt6163, local11.anInt6167, gf.class);
							@Pc(200) Class189 local200 = Static411.aClass142_4.method3148(local11.anInt6173);
							@Pc(213) int local213;
							@Pc(216) int local216;
							if (local11.anInt6162 == 1 || local11.anInt6162 == 3) {
								local213 = local200.anInt5110;
								local216 = local200.anInt5073;
							} else {
								local216 = local200.anInt5110;
								local213 = local200.anInt5073;
							}
							@Pc(257) Class26_Sub2_Sub5 local257 = new Class26_Sub2_Sub5(local11.anInt6168, local11.anInt6162, local11.anInt6161, local11.anInt6164, local11.anInt6169, local11.anInt6176, local11.anInt6163, local213 + local11.anInt6163 - 1, local11.anInt6167, local216 + local11.anInt6167 - 1, local171);
							Static37.method529(local257, false);
						}
					} else if (local37 == 3) {
						local274 = Static339.method4422(local11.anInt6161, local11.anInt6163, local11.anInt6167);
						if (local274 instanceof Class26_Sub4_Sub2) {
							local11.method5802();
						} else {
							local293 = new Class26_Sub4_Sub2(local11.anInt6164, local11.anInt6169, local11.anInt6176, local274);
							Static384.method5648(local11.anInt6161, local11.anInt6163, local11.anInt6167, local293);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!gf;II)J")
	public static long method591(@OriginalArg(1) Interface5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(18) long local18 = Long.MIN_VALUE;
		@Pc(25) Class189 local25 = Static411.aClass142_4.method3148(arg0.method5731());
		@Pc(46) long local46 = (long) (arg1 | arg2 << 7 | arg0.method5732() << 14 | arg0.method5729() << 20 | 0x40000000);
		if (local25.anInt5106 == 0) {
			local46 |= local18;
		}
		if (local25.anInt5054 == 1) {
			local46 |= local5;
		}
		if (local25.aBoolean324) {
			local46 |= local7;
		}
		return local46 | (long) arg0.method5731() << 32;
	}
}
