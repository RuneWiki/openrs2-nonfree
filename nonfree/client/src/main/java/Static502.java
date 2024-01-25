import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
	public static int anInt8747;

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Lclient!bd;")
	public static final Class32 aClass32_58 = new Class32();

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "Lclient!vq;")
	public static final Class382 aClass382_18 = new Class382(10, 2, 2, 0);

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
	public static void method7567() {
		@Pc(9) int local9 = Static24.anInt330 * 512 + 256;
		@Pc(15) int local15 = Static470.anInt8102 * 512 + 256;
		@Pc(24) int local24 = Static388.method5919(local15, local9, Static391.anInt6811) - Static5.anInt65;
		if (Static116.anInt1895 < 100) {
			if (Static70.anInt1085 < local9) {
				Static70.anInt1085 += Static116.anInt1895 * (local9 - Static70.anInt1085) / 1000 + Static307.anInt5461;
				if (Static70.anInt1085 > local9) {
					Static70.anInt1085 = local9;
				}
			}
			if (local24 > Static153.anInt2372) {
				Static153.anInt2372 += (local24 - Static153.anInt2372) * Static116.anInt1895 / 1000 + Static307.anInt5461;
				if (local24 < Static153.anInt2372) {
					Static153.anInt2372 = local24;
				}
			}
			if (Static70.anInt1085 > local9) {
				Static70.anInt1085 -= (Static70.anInt1085 - local9) * Static116.anInt1895 / 1000 + Static307.anInt5461;
				if (local9 > Static70.anInt1085) {
					Static70.anInt1085 = local9;
				}
			}
			if (Static153.anInt2372 > local24) {
				Static153.anInt2372 -= Static307.anInt5461 + Static116.anInt1895 * (Static153.anInt2372 - local24) / 1000;
				if (local24 > Static153.anInt2372) {
					Static153.anInt2372 = local24;
				}
			}
			if (Static229.anInt4393 < local15) {
				Static229.anInt4393 += Static307.anInt5461 + (local15 - Static229.anInt4393) * Static116.anInt1895 / 1000;
				if (local15 < Static229.anInt4393) {
					Static229.anInt4393 = local15;
				}
			}
			if (Static229.anInt4393 > local15) {
				Static229.anInt4393 -= Static116.anInt1895 * (Static229.anInt4393 - local15) / 1000 + Static307.anInt5461;
				if (Static229.anInt4393 < local15) {
					Static229.anInt4393 = local15;
				}
			}
		} else {
			Static229.anInt4393 = Static470.anInt8102 * 512 + 256;
			Static70.anInt1085 = Static24.anInt330 * 512 + 256;
			Static153.anInt2372 = Static388.method5919(Static229.anInt4393, Static70.anInt1085, Static391.anInt6811) - Static5.anInt65;
		}
		local15 = Static119.anInt1918 * 512 + 256;
		local9 = Static81.anInt1406 * 512 + 256;
		local24 = Static388.method5919(local15, local9, Static391.anInt6811) - Static546.anInt10354;
		@Pc(256) int local256 = local9 - Static70.anInt1085;
		@Pc(261) int local261 = local24 - Static153.anInt2372;
		@Pc(266) int local266 = local15 - Static229.anInt4393;
		@Pc(278) int local278 = (int) Math.sqrt((double) (local256 * local256 + local266 * local266));
		@Pc(289) int local289 = (int) (Math.atan2((double) local261, (double) local278) * 2607.5945876176133D) & 0x3FFF;
		if (local289 < 1024) {
			local289 = 1024;
		}
		@Pc(307) int local307 = (int) (-2607.5945876176133D * Math.atan2((double) local256, (double) local266)) & 0x3FFF;
		if (local289 > 3072) {
			local289 = 3072;
		}
		if (Static126.anInt9524 < local289) {
			Static126.anInt9524 += Static680.anInt11080 + Static188.anInt3131 * (local289 - Static126.anInt9524 >> 3) / 1000 << 3;
			if (local289 < Static126.anInt9524) {
				Static126.anInt9524 = local289;
			}
		}
		if (Static126.anInt9524 > local289) {
			Static126.anInt9524 -= Static680.anInt11080 + (Static126.anInt9524 - local289 >> 3) * Static188.anInt3131 / 1000 << 3;
			if (Static126.anInt9524 < local289) {
				Static126.anInt9524 = local289;
			}
		}
		@Pc(379) int local379 = local307 - Static669.anInt10940;
		if (local379 > 8192) {
			local379 -= 16384;
		}
		if (local379 < -8192) {
			local379 += 16384;
		}
		local379 >>= 0x3;
		if (local379 > 0) {
			Static669.anInt10940 += local379 * Static188.anInt3131 / 1000 + Static680.anInt11080 << 3;
			Static669.anInt10940 &= 0x3FFF;
		}
		if (local379 < 0) {
			Static669.anInt10940 -= -local379 * Static188.anInt3131 / 1000 + Static680.anInt11080 << 3;
			Static669.anInt10940 &= 0x3FFF;
		}
		@Pc(445) int local445 = local307 - Static669.anInt10940;
		if (local445 > 8192) {
			local445 -= 16384;
		}
		if (local445 < -8192) {
			local445 += 16384;
		}
		if (local445 < 0 && local379 > 0 || local445 > 0 && local379 < 0) {
			Static669.anInt10940 = local307;
		}
		Static470.anInt8100 = 0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)V")
	public static void method7569(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static224.aFloat10 < Static224.aFloat11) {
			Static224.aFloat10 = (float) ((double) Static224.aFloat10 + (double) Static224.aFloat10 / 30.0D);
			if (Static224.aFloat10 > Static224.aFloat11) {
				Static224.aFloat10 = Static224.aFloat11;
			}
			Static23.method331();
			Static224.anInt1285 = (int) Static224.aFloat10 >> 1;
			Static224.aByteArrayArrayArray8 = Static636.method8905(Static224.anInt1285);
		} else if (Static224.aFloat10 > Static224.aFloat11) {
			Static224.aFloat10 = (float) ((double) Static224.aFloat10 - (double) Static224.aFloat10 / 30.0D);
			if (Static224.aFloat10 < Static224.aFloat11) {
				Static224.aFloat10 = Static224.aFloat11;
			}
			Static23.method331();
			Static224.anInt1285 = (int) Static224.aFloat10 >> 1;
			Static224.aByteArrayArrayArray8 = Static636.method8905(Static224.anInt1285);
		}
		if (Static644.anInt10590 != -1 && Static19.anInt249 != -1) {
			@Pc(90) int local90 = Static644.anInt10590 - Static97.anInt1683;
			if (local90 < 2 || local90 > 2) {
				local90 /= 8;
			}
			@Pc(107) int local107 = Static19.anInt249 - Static381.anInt6704;
			Static97.anInt1683 += local90;
			if (local107 < 2 || local107 > 2) {
				local107 /= 8;
			}
			Static381.anInt6704 += local107;
			if (local90 == 0 && local107 == 0) {
				Static644.anInt10590 = -1;
				Static19.anInt249 = -1;
			}
			Static23.method331();
		}
		if (Static70.anInt1087 <= 0) {
			Static474.anInt8161 = -1;
			Static417.anInt7161 = -1;
		} else {
			Static349.anInt5983--;
			if (Static349.anInt5983 == 0) {
				Static349.anInt5983 = 100;
				Static70.anInt1087--;
			}
		}
		if (!Static12.aBoolean14 || Static216.aClass32_31 == null) {
			return;
		}
		for (@Pc(191) Class14_Sub55 local191 = (Class14_Sub55) Static216.aClass32_31.method584(); local191 != null; local191 = (Class14_Sub55) Static216.aClass32_31.method577()) {
			@Pc(200) Class152 local200 = Static224.aClass274_2.method6614(local191.aClass14_Sub39_1.anInt8785);
			if (local191.method9234(arg1, arg0)) {
				if (local200.aStringArray21 != null) {
					if (local200.aStringArray21[4] != null) {
						Static258.method4326(local200.aString44, local200.aStringArray21[4], false, -1, (long) local191.aClass14_Sub39_1.anInt8785, local200.anInt4296, false, true, 1002, -1, 0, (long) local191.aClass14_Sub39_1.anInt8785);
					}
					if (local200.aStringArray21[3] != null) {
						Static258.method4326(local200.aString44, local200.aStringArray21[3], false, -1, (long) local191.aClass14_Sub39_1.anInt8785, local200.anInt4296, false, true, 1006, -1, 0, (long) local191.aClass14_Sub39_1.anInt8785);
					}
					if (local200.aStringArray21[2] != null) {
						Static258.method4326(local200.aString44, local200.aStringArray21[2], false, -1, (long) local191.aClass14_Sub39_1.anInt8785, local200.anInt4296, false, true, 1009, -1, 0, (long) local191.aClass14_Sub39_1.anInt8785);
					}
					if (local200.aStringArray21[1] != null) {
						Static258.method4326(local200.aString44, local200.aStringArray21[1], false, -1, (long) local191.aClass14_Sub39_1.anInt8785, local200.anInt4296, false, true, 1007, -1, 0, (long) local191.aClass14_Sub39_1.anInt8785);
					}
					if (local200.aStringArray21[0] != null) {
						Static258.method4326(local200.aString44, local200.aStringArray21[0], false, -1, (long) local191.aClass14_Sub39_1.anInt8785, local200.anInt4296, false, true, 1001, -1, 0, (long) local191.aClass14_Sub39_1.anInt8785);
					}
				}
				if (!local191.aClass14_Sub39_1.aBoolean620) {
					local191.aClass14_Sub39_1.aBoolean620 = true;
					Static672.method9299(Static635.aClass162_15, local191.aClass14_Sub39_1.anInt8785, local200.anInt4296);
				}
				if (local191.aClass14_Sub39_1.aBoolean620) {
					Static672.method9299(Static485.aClass162_10, local191.aClass14_Sub39_1.anInt8785, local200.anInt4296);
				}
			} else if (local191.aClass14_Sub39_1.aBoolean620) {
				local191.aClass14_Sub39_1.aBoolean620 = false;
				Static672.method9299(Static533.aClass162_11, local191.aClass14_Sub39_1.anInt8785, local200.anInt4296);
			}
		}
	}
}
