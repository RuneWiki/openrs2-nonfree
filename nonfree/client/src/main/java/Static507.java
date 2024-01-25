import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!r", name = "z", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_162 = new Class180(132, 6);

	@OriginalMember(owner = "client!r", name = "A", descriptor = "Lclient!tja;")
	public static final Class336 aClass336_17 = new Class336(2, 7);

	@OriginalMember(owner = "client!r", name = "B", descriptor = "Z")
	public static boolean aBoolean593 = false;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "[I")
	public static final int[] anIntArray666 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(III)Z")
	public static boolean method6858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static70.method5710(arg1, arg0) || Static581.method7252(arg0, arg1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public static void method6859() {
		if (!Static43.aBoolean74) {
			Static439.aBoolean510 = Static105.anInt2127 != -1 && Static450.anInt7444 >= Static105.anInt2127 || Static450.anInt7444 * 16 + (Static609.aBoolean752 ? 26 : 22) > Static222.anInt4196;
		}
		Static469.aClass338_187.method8175();
		Static267.aClass338_120.method8175();
		@Pc(55) int local55;
		for (@Pc(50) Class3_Sub11_Sub14 local50 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8177(); local50 != null; local50 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8168()) {
			local55 = local50.anInt6738;
			if (local55 < 1000) {
				local50.method9380();
				if (local55 == 2 || local55 == 22 || local55 == 5 || local55 == 10 || local55 == 49 || local55 == 60 || local55 == 8) {
					Static267.aClass338_120.method8171(local50);
				} else {
					Static469.aClass338_187.method8171(local50);
				}
			}
		}
		Static469.aClass338_187.method8172(Static78.aClass338_99);
		Static267.aClass338_120.method8172(Static78.aClass338_99);
		if (Static450.anInt7444 <= 1) {
			Static150.aClass3_Sub11_Sub14_2 = null;
			Static343.aClass3_Sub11_Sub14_3 = null;
		} else {
			if (Static332.aBoolean403 && Static440.aClass19_1.method2352(81) && Static450.anInt7444 > 2) {
				Static150.aClass3_Sub11_Sub14_2 = (Class3_Sub11_Sub14) Static78.aClass338_99.aClass3_302.aClass3_338.aClass3_338;
			} else {
				Static150.aClass3_Sub11_Sub14_2 = (Class3_Sub11_Sub14) Static78.aClass338_99.aClass3_302.aClass3_338;
			}
			Static343.aClass3_Sub11_Sub14_3 = (Class3_Sub11_Sub14) Static78.aClass338_99.aClass3_302.aClass3_338;
		}
		local55 = -1;
		@Pc(171) Class3_Sub43 local171 = (Class3_Sub43) Static655.aClass338_233.method8177();
		if (local171 != null) {
			local55 = local171.method7778();
		}
		if (!Static43.aBoolean74) {
			if (local55 == 0 && (Static229.anInt4277 == 1 && Static450.anInt7444 > 2 || Static645.method8970())) {
				local55 = 2;
			}
			if (local55 == 2 && Static450.anInt7444 > 0 && local171 != null) {
				if (Static678.aClass260_21 == null && Static231.anInt4294 == 0) {
					Static281.method4519(local171.method7777(), local171.method7774());
				} else {
					Static261.anInt4675 = 2;
				}
			}
			if (local55 == 0) {
				if (Static150.aClass3_Sub11_Sub14_2 != null) {
					Static51.method1157();
				} else if (Static624.aBoolean698) {
					Static632.method8816();
				}
			}
			if (Static678.aClass260_21 != null || Static231.anInt4294 != 0) {
				return;
			}
			Static261.anInt4675 = 0;
			Static569.aClass3_Sub11_Sub14_5 = null;
			return;
		}
		@Pc(186) int local186;
		@Pc(190) int local190;
		@Pc(281) int local281;
		@Pc(283) int local283;
		if (local55 == -1) {
			local186 = Static22.aClass16_2.method5885();
			local190 = Static22.aClass16_2.method5887();
			@Pc(192) boolean local192 = false;
			if (Static142.aClass3_Sub11_Sub8_1 != null) {
				if (local186 >= Static451.anInt7467 - 10 && local186 <= Static159.anInt3122 + Static451.anInt7467 + 10 && Static544.anInt8963 - 10 <= local190 && Static673.anInt10857 + Static544.anInt8963 + 10 >= local190) {
					local192 = true;
				} else {
					Static167.method3038();
				}
			}
			if (!local192) {
				if (Static600.anInt9624 - 10 > local186 || local186 > Static600.anInt9624 + Static368.anInt5940 + 10 || local190 < Static436.anInt6913 - 10 || Static436.anInt6913 + Static627.anInt10020 + 10 < local190) {
					Static286.method4531();
				} else if (Static439.aBoolean510) {
					local281 = -1;
					local283 = -1;
					@Pc(298) int local298;
					for (@Pc(285) int local285 = 0; local285 < Static71.anInt1334; local285++) {
						if (Static609.aBoolean752) {
							local298 = Static436.anInt6913 + local285 * 16 + 33;
							if (local298 - 13 < local190 && local298 + 4 > local190) {
								local281 = local285;
								local283 = local298 - 13;
								break;
							}
						} else {
							local298 = local285 * 16 + Static436.anInt6913 + 31;
							if (local190 > local298 - 13 && local190 < local298 + 3) {
								local281 = local285;
								local283 = local298 - 13;
								break;
							}
						}
					}
					if (local281 != -1) {
						local298 = 0;
						@Pc(364) Class31 local364 = new Class31(Static111.aClass74_3);
						for (@Pc(369) Class3_Sub11_Sub8 local369 = (Class3_Sub11_Sub8) local364.method936(); local369 != null; local369 = (Class3_Sub11_Sub8) local364.method938()) {
							if (local298 == local281) {
								if (local369.anInt3796 > 1) {
									Static530.method7667(local283, local369, local190);
								}
								break;
							}
							local298++;
						}
					}
				}
			}
		}
		if (local55 != 0) {
			return;
		}
		local186 = local171.method7774();
		local190 = local171.method7777();
		@Pc(438) int local438;
		@Pc(507) Class31 local507;
		@Pc(512) Class3_Sub11_Sub14 local512;
		if (Static142.aClass3_Sub11_Sub8_1 != null && local186 >= Static451.anInt7467 && Static159.anInt3122 + Static451.anInt7467 >= local186 && local190 >= Static544.anInt8963 && Static544.anInt8963 + Static673.anInt10857 >= local190) {
			local438 = -1;
			for (local281 = 0; local281 < Static142.aClass3_Sub11_Sub8_1.anInt3796; local281++) {
				if (Static609.aBoolean752) {
					local283 = Static544.anInt8963 + local281 * 16 + 33;
					if (local283 - 13 < local190 && local283 + 4 > local190) {
						local438 = local281;
					}
				} else {
					local283 = Static544.anInt8963 + local281 * 16 + 31;
					if (local190 > local283 - 13 && local190 < local283 + 3) {
						local438 = local281;
					}
				}
			}
			if (local438 != -1) {
				local283 = 0;
				local507 = new Class31(Static142.aClass3_Sub11_Sub8_1.aClass74_4);
				for (local512 = (Class3_Sub11_Sub14) local507.method936(); local512 != null; local512 = (Class3_Sub11_Sub14) local507.method938()) {
					if (local283 == local438) {
						Static242.method6995(local512, local190, local186);
						break;
					}
					local283++;
				}
			}
			Static286.method4531();
			return;
		}
		if (Static600.anInt9624 > local186 || Static600.anInt9624 + Static368.anInt5940 < local186 || local190 < Static436.anInt6913 || Static436.anInt6913 + Static627.anInt10020 < local190) {
			return;
		}
		if (!Static439.aBoolean510) {
			local438 = -1;
			for (local281 = 0; local281 < Static450.anInt7444; local281++) {
				if (Static609.aBoolean752) {
					local283 = Static436.anInt6913 + (-local281 + -1 + Static450.anInt7444) * 16 + 33;
					if (local190 > local283 - 13 && local190 < local283 + 4) {
						local438 = local281;
					}
				} else {
					local283 = (Static450.anInt7444 - local281 - 1) * 16 + Static436.anInt6913 + 31;
					if (local283 - 13 < local190 && local283 + 3 > local190) {
						local438 = local281;
					}
				}
			}
			if (local438 != -1) {
				local283 = 0;
				@Pc(644) Class167 local644 = new Class167(Static78.aClass338_99);
				for (local512 = (Class3_Sub11_Sub14) local644.method4435(); local512 != null; local512 = (Class3_Sub11_Sub14) local644.method4437()) {
					if (local283 == local438) {
						Static242.method6995(local512, local190, local186);
						break;
					}
					local283++;
				}
			}
			Static286.method4531();
			return;
		}
		local438 = -1;
		for (local281 = 0; local281 < Static71.anInt1334; local281++) {
			if (Static609.aBoolean752) {
				local283 = local281 * 16 + Static436.anInt6913 + 33;
				if (local283 - 13 < local190 && local283 + 4 > local190) {
					local438 = local281;
					break;
				}
			} else {
				local283 = local281 * 16 + Static436.anInt6913 + 31;
				if (local283 - 13 < local190 && local190 < local283 + 3) {
					local438 = local281;
					break;
				}
			}
		}
		if (local438 == -1) {
			return;
		}
		local283 = 0;
		local507 = new Class31(Static111.aClass74_3);
		for (@Pc(755) Class3_Sub11_Sub8 local755 = (Class3_Sub11_Sub8) local507.method936(); local755 != null; local755 = (Class3_Sub11_Sub8) local507.method938()) {
			if (local438 == local283) {
				Static242.method6995((Class3_Sub11_Sub14) local755.aClass74_4.aClass3_Sub11_16.aClass3_Sub11_67, local190, local186);
				Static286.method4531();
				return;
			}
			local283++;
		}
		return;
	}
}
