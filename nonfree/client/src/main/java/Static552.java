import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "Lclient!tf;")
	public static Class322 aClass322_150;

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!vea", name = "l", descriptor = "[I")
	public static int[] anIntArray575;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(III)Lclient!hfa;")
	public static Class41_Sub2_Sub3 method7304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class299 local7 = Static309.aClass299ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass41_Sub2_Sub3_2;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
	public static void method7305() {
		for (@Pc(3) int local3 = 0; local3 < Static5.anInt118; local3++) {
			@Pc(9) Class347 local9 = Static204.aClass347Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(225) int local225;
			if (local9.aClass3_Sub4_Sub1_4 == null) {
				local9.anInt8753--;
				if (local9.anInt8753 >= (local9.method7297() ? -1500 : -10)) {
					if (local9.aByte112 == 1 && local9.aClass43_1 == null) {
						local9.aClass43_1 = Static598.method996(Static166.aClass322_66, local9.anInt8757, 0);
						if (local9.aClass43_1 == null) {
							continue;
						}
						local9.anInt8753 += local9.aClass43_1.method995();
					} else if (local9.method7297() && (local9.aClass3_Sub50_3 == null || local9.aClass3_Sub48_Sub1_4 == null)) {
						if (local9.aClass3_Sub50_3 == null) {
							local9.aClass3_Sub50_3 = Static577.method7747(Static50.aClass322_19, local9.anInt8757);
						}
						if (local9.aClass3_Sub50_3 == null) {
							continue;
						}
						if (local9.aClass3_Sub48_Sub1_4 == null) {
							local9.aClass3_Sub48_Sub1_4 = local9.aClass3_Sub50_3.method7746(new int[] { 22050 });
							if (local9.aClass3_Sub48_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local9.anInt8753 < 0) {
						if (local9.anInt8755 == 0) {
							local225 = local9.anInt8758 * (local9.aByte112 == 3 ? Static405.aClass3_Sub3_Sub1_1.anInt7561 : Static405.aClass3_Sub3_Sub1_1.anInt7559) >> 8;
						} else {
							@Pc(129) int local129 = local9.anInt8755 >> 24 & 0x3;
							if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 == local129) {
								@Pc(144) int local144 = (local9.anInt8755 & 0xFF) << 9;
								@Pc(151) int local151 = local9.anInt8755 >> 16 & 0xFF;
								@Pc(160) int local160 = (local151 << 9) + 256 - Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444;
								if (local160 < 0) {
									local160 = -local160;
								}
								@Pc(172) int local172 = local9.anInt8755 >> 8 & 0xFF;
								@Pc(181) int local181 = (local172 << 9) + 256 - Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442;
								if (local181 < 0) {
									local181 = -local181;
								}
								@Pc(192) int local192 = local160 + local181 - 512;
								if (local192 > local144) {
									local9.anInt8753 = -99999;
									continue;
								}
								if (local192 < 0) {
									local192 = 0;
								}
								local225 = local9.anInt8758 * (local144 - local192) * Static405.aClass3_Sub3_Sub1_1.anInt7577 / local144 >> 8;
							} else {
								local225 = 0;
							}
						}
						if (local225 > 0) {
							@Pc(250) Class3_Sub48_Sub1 local250 = null;
							if (local9.aByte112 == 1) {
								local250 = local9.aClass43_1.method998().method7099(Static143.aClass166_1);
							} else if (local9.method7297()) {
								local250 = local9.aClass3_Sub48_Sub1_4;
							}
							@Pc(278) Class3_Sub4_Sub1 local278 = local9.aClass3_Sub4_Sub1_4 = Static597.method308(local250, local225);
							local278.method289(local9.anInt8752 - 1);
							Static353.aClass3_Sub4_Sub2_1.method645(local278);
						}
					}
				} else {
					local11 = true;
				}
			} else if (!local9.aClass3_Sub4_Sub1_4.method7828()) {
				local11 = true;
			}
			if (local11) {
				Static5.anInt118--;
				for (local225 = local3; local225 < Static5.anInt118; local225++) {
					Static204.aClass347Array1[local225] = Static204.aClass347Array1[local225 + 1];
				}
				local3--;
			}
		}
		if (Static6.aBoolean1 && !Static580.method7784()) {
			if (Static405.aClass3_Sub3_Sub1_1.anInt7553 != 0 && Static416.anInt7067 != -1) {
				Static434.method6090(Static416.anInt7067, Static287.aClass322_120, Static405.aClass3_Sub3_Sub1_1.anInt7553);
			}
			Static6.aBoolean1 = false;
		} else if (Static405.aClass3_Sub3_Sub1_1.anInt7553 != 0 && Static416.anInt7067 != -1 && !Static580.method7784()) {
			@Pc(354) Class3_Sub42 local354 = Static591.method7910(Static9.aClass199_3, Static95.aClass303_26);
			local354.aClass3_Sub11_Sub1_1.method5215(Static416.anInt7067);
			Static511.method6885(local354);
			Static416.anInt7067 = -1;
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "([Lclient!si;ILclient!mr;)Lclient!uj;")
	public static Class339 method7311(@OriginalArg(0) Class311[] arg0, @OriginalArg(2) Class45_Sub2_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong229 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg0.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg0[local31].aLong229);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static432.anIntArray448, 0);
		if (Static432.anIntArray448[0] == 0) {
			if (Static432.anIntArray448[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static432.anIntArray448, 1);
			if (Static432.anIntArray448[1] > 1) {
				@Pc(91) byte[] local91 = new byte[Static432.anIntArray448[1]];
				OpenGL.glGetInfoLogARB(local29, Static432.anIntArray448[1], Static432.anIntArray448, 0, local91, 0);
				System.out.println(new String(local91));
			}
			if (Static432.anIntArray448[0] == 0) {
				for (@Pc(112) int local112 = 0; local112 < arg0.length; local112++) {
					OpenGL.glDetachObjectARB(local29, arg0[local112].aLong229);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class339(arg1, local29, arg0);
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(B)V")
	public static void method7315() {
		@Pc(5) Class6 local5 = Static220.aClass6_22;
		synchronized (Static220.aClass6_22) {
			Static220.aClass6_22.method94();
		}
		local5 = Static272.aClass6_29;
		synchronized (Static272.aClass6_29) {
			Static272.aClass6_29.method94();
		}
	}
}
