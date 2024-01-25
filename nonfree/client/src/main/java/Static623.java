import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!wba", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray57 = new boolean[100];

	@OriginalMember(owner = "client!wba", name = "m", descriptor = "I")
	public static int anInt10264 = 0;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZILclient!ns;)V")
	public static void method8674(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class20_Sub2_Sub2_Sub1 arg1) {
		@Pc(11) Class201 local11 = arg1.method4911();
		if (arg1.anInt5574 == 0) {
			Static8.anInt148 = -1;
			arg1.anInt5575 = 0;
			Static611.anInt10086 = 0;
			return;
		}
		if (arg1.anInt5549 != -1 && arg1.anInt5516 == 0) {
			@Pc(38) Class21 local38 = Static294.aClass373_2.method8738(arg1.anInt5549);
			if (arg1.anInt5576 > 0 && local38.anInt347 == 0) {
				Static611.anInt10086 = 0;
				arg1.anInt5575++;
				Static8.anInt148 = -1;
				return;
			}
			if (arg1.anInt5576 <= 0 && local38.anInt361 == 0) {
				arg1.anInt5575++;
				Static611.anInt10086 = 0;
				Static8.anInt148 = -1;
				return;
			}
		}
		@Pc(105) Class21 local105;
		@Pc(92) Class93 local92;
		if (arg1.anInt5519 != -1 && Static113.anInt2243 >= arg1.anInt5555) {
			local92 = Static436.aClass292_2.method7401(arg1.anInt5519);
			if (local92.aBoolean189 && local92.anInt2750 != -1) {
				local105 = Static294.aClass373_2.method8738(local92.anInt2750);
				if (arg1.anInt5576 > 0 && local105.anInt347 == 0) {
					arg1.anInt5575++;
					Static611.anInt10086 = 0;
					Static8.anInt148 = -1;
					return;
				}
				if (arg1.anInt5576 <= 0 && local105.anInt361 == 0) {
					arg1.anInt5575++;
					Static611.anInt10086 = 0;
					Static8.anInt148 = -1;
					return;
				}
			}
		}
		if (arg1.anInt5519 != -1 && Static113.anInt2243 >= arg1.anInt5555) {
			local92 = Static436.aClass292_2.method7401(arg1.anInt5519);
			if (local92.aBoolean189 && local92.anInt2750 != -1) {
				local105 = Static294.aClass373_2.method8738(local92.anInt2750);
				if (arg1.anInt5576 > 0 && local105.anInt347 == 0) {
					arg1.anInt5575++;
					Static611.anInt10086 = 0;
					Static8.anInt148 = -1;
					return;
				}
				if (arg1.anInt5576 <= 0 && local105.anInt361 == 0) {
					Static8.anInt148 = -1;
					Static611.anInt10086 = 0;
					arg1.anInt5575++;
					return;
				}
			}
		}
		@Pc(230) int local230 = arg1.anInt10725;
		@Pc(233) int local233 = arg1.anInt10729;
		@Pc(249) int local249 = arg1.anIntArray335[arg1.anInt5574 - 1] * 512 + arg1.method4913() * 256;
		@Pc(265) int local265 = arg1.anIntArray336[arg1.anInt5574 - 1] * 512 + arg1.method4913() * 256;
		if (local249 > local230) {
			if (local233 < local265) {
				arg1.method4919(10240);
			} else if (local265 >= local233) {
				arg1.method4919(12288);
			} else {
				arg1.method4919(14336);
			}
		} else if (local230 <= local249) {
			if (local265 > local233) {
				arg1.method4919(8192);
			} else if (local233 > local265) {
				arg1.method4919(0);
			}
		} else if (local265 > local233) {
			arg1.method4919(6144);
		} else if (local233 <= local265) {
			arg1.method4919(4096);
		} else {
			arg1.method4919(2048);
		}
		@Pc(351) byte local351 = arg1.aByteArray60[arg1.anInt5574 - 1];
		if (!arg0 && (local249 - local230 > 1024 || local249 - local230 < -1024 || local265 - local233 > 1024 || local265 - local233 < -1024)) {
			arg1.anInt10729 = local265;
			arg1.anInt10725 = local249;
			arg1.method4920(false, arg1.anInt5541);
			arg1.anInt5574--;
			Static8.anInt148 = -1;
			if (arg1.anInt5576 > 0) {
				arg1.anInt5576--;
			}
			Static611.anInt10086 = 0;
			return;
		}
		@Pc(415) int local415 = 16;
		@Pc(417) boolean local417 = true;
		if (arg1 instanceof Class20_Sub2_Sub2_Sub1_Sub2) {
			local417 = ((Class20_Sub2_Sub2_Sub1_Sub2) arg1).aClass247_1.aBoolean509;
		}
		@Pc(435) int local435;
		if (local417) {
			local435 = arg1.anInt5541 - arg1.aClass278_7.anInt8287;
			if (local435 != 0 && arg1.anInt5572 == -1 && arg1.anInt5544 != 0) {
				local415 = 8;
			}
			if (!arg0 && arg1.anInt5574 > 2) {
				local415 = 24;
			}
			if (!arg0 && arg1.anInt5574 > 3) {
				local415 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt5574 > 1) {
				local415 = 24;
			}
			if (!arg0 && arg1.anInt5574 > 2) {
				local415 = 32;
			}
		}
		if (arg1.anInt5575 > 0 && arg1.anInt5574 > 1) {
			local415 = 32;
			arg1.anInt5575--;
		}
		if (local351 == 2) {
			local415 <<= 0x1;
		} else if (local351 == 0) {
			local415 >>= 0x1;
		}
		Static611.anInt10086 = 0;
		if (local11.anInt6333 != -1) {
			local415 <<= 0x9;
			if (arg1.anInt5574 == 1) {
				local435 = arg1.anInt5577 * arg1.anInt5577;
				@Pc(559) int local559 = (local249 < arg1.anInt10725 ? arg1.anInt10725 - local249 : -arg1.anInt10725 + local249) << 9;
				@Pc(575) int local575 = (arg1.anInt10729 <= local265 ? local265 - arg1.anInt10729 : arg1.anInt10729 - local265) << 9;
				@Pc(586) int local586 = local575 < local559 ? local559 : local575;
				@Pc(593) int local593 = local586 * 2 * local11.anInt6333;
				if (local435 > local593) {
					arg1.anInt5577 /= 2;
				} else if (local586 < local435 / 2) {
					arg1.anInt5577 -= local11.anInt6333;
					if (arg1.anInt5577 < 0) {
						arg1.anInt5577 = 0;
					}
				} else if (arg1.anInt5577 < local415) {
					arg1.anInt5577 += local11.anInt6333;
					if (local415 < arg1.anInt5577) {
						arg1.anInt5577 = local415;
					}
				}
			} else if (local415 > arg1.anInt5577) {
				arg1.anInt5577 += local11.anInt6333;
				if (local415 < arg1.anInt5577) {
					arg1.anInt5577 = local415;
				}
			} else if (arg1.anInt5577 > 0) {
				arg1.anInt5577 -= local11.anInt6333;
				if (arg1.anInt5577 < 0) {
					arg1.anInt5577 = 0;
				}
			}
			local415 = arg1.anInt5577 >> 9;
			if (local415 < 1) {
				local415 = 1;
			}
		}
		if (local230 == local249 && local233 == local265) {
			Static8.anInt148 = -1;
		} else {
			if (local230 < local249) {
				Static611.anInt10086 |= 0x4;
				arg1.anInt10725 += local415;
				if (arg1.anInt10725 > local249) {
					arg1.anInt10725 = local249;
				}
			} else if (local230 > local249) {
				arg1.anInt10725 -= local415;
				Static611.anInt10086 |= 0x8;
				if (local249 > arg1.anInt10725) {
					arg1.anInt10725 = local249;
				}
			}
			if (local265 > local233) {
				Static611.anInt10086 |= 0x1;
				arg1.anInt10729 += local415;
				if (local265 < arg1.anInt10729) {
					arg1.anInt10729 = local265;
				}
			} else if (local265 < local233) {
				arg1.anInt10729 -= local415;
				Static611.anInt10086 |= 0x2;
				if (local265 > arg1.anInt10729) {
					arg1.anInt10729 = local265;
				}
			}
			if (local415 >= 32) {
				Static8.anInt148 = 2;
			} else {
				Static8.anInt148 = local351;
			}
		}
		if (local249 == arg1.anInt10725 && local265 == arg1.anInt10729) {
			if (arg1.anInt5576 > 0) {
				arg1.anInt5576--;
			}
			arg1.anInt5574--;
		}
	}

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "(B)Z")
	public static boolean method8675() {
		try {
			if (Static602.anInt10026 == 2) {
				if (Static97.aClass6_Sub5_1 == null) {
					Static97.aClass6_Sub5_1 = Static650.method869(Static479.aClass353_88, Static592.anInt9875, Static182.anInt3750);
					if (Static97.aClass6_Sub5_1 == null) {
						return false;
					}
				}
				if (Static594.aClass253_1 == null) {
					Static594.aClass253_1 = new Class253(Static61.aClass353_10, Static557.aClass353_115);
				}
				@Pc(34) Class6_Sub3_Sub4 local34 = Static224.aClass6_Sub3_Sub4_1;
				if (Static498.aClass6_Sub3_Sub4_3 != null) {
					local34 = Static498.aClass6_Sub3_Sub4_3;
				}
				if (local34.method4730(Static152.aClass353_47, Static97.aClass6_Sub5_1, Static594.aClass253_1)) {
					Static224.aClass6_Sub3_Sub4_1 = local34;
					Static224.aClass6_Sub3_Sub4_1.method4708();
					@Pc(64) int local64;
					if (Static476.anInt10356 <= 0) {
						Static602.anInt10026 = 0;
						Static224.aClass6_Sub3_Sub4_1.method4715(Static142.anInt2680);
						for (local64 = 0; local64 < Static236.anIntArray269.length; local64++) {
							Static224.aClass6_Sub3_Sub4_1.method4712(local64, Static236.anIntArray269[local64]);
							Static236.anIntArray269[local64] = 255;
						}
					} else {
						Static602.anInt10026 = 3;
						Static224.aClass6_Sub3_Sub4_1.method4715(Static142.anInt2680 >= Static476.anInt10356 ? Static476.anInt10356 : Static142.anInt2680);
						for (local64 = 0; local64 < Static236.anIntArray269.length; local64++) {
							Static224.aClass6_Sub3_Sub4_1.method4712(local64, Static236.anIntArray269[local64]);
							Static236.anIntArray269[local64] = 255;
						}
					}
					if (Static498.aClass6_Sub3_Sub4_3 == null) {
						if (Static552.aLong245 > 0L) {
							Static224.aClass6_Sub3_Sub4_1.method4720(Static97.aClass6_Sub5_1, Static552.aLong245, Static95.aBoolean128);
						} else {
							Static224.aClass6_Sub3_Sub4_1.method4735(Static97.aClass6_Sub5_1, Static95.aBoolean128);
						}
					}
					if (Static373.aClass190_2 != null) {
						Static373.aClass190_2.method7490(Static224.aClass6_Sub3_Sub4_1);
					}
					Static594.aClass253_1 = null;
					Static552.aLong245 = 0L;
					Static479.aClass353_88 = null;
					Static498.aClass6_Sub3_Sub4_3 = null;
					Static97.aClass6_Sub5_1 = null;
					return true;
				}
			}
		} catch (@Pc(158) Exception local158) {
			local158.printStackTrace();
			Static224.aClass6_Sub3_Sub4_1.method4738();
			Static479.aClass353_88 = null;
			Static602.anInt10026 = 0;
			Static498.aClass6_Sub3_Sub4_3 = null;
			Static594.aClass253_1 = null;
			Static97.aClass6_Sub5_1 = null;
		}
		return false;
	}
}
