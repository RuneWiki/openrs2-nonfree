import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!to", name = "C", descriptor = "F")
	public static float aFloat341;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_201 = new Class150(95, 8);

	@OriginalMember(owner = "client!to", name = "D", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_84 = new Class236(72, 3);

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLclient!hn;Z)V")
	public static void method6652(@OriginalArg(1) Class15_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class281 local9 = arg0.method4026();
		if (arg0.anInt4753 == 0) {
			Static514.anInt8747 = -1;
			arg0.anInt4755 = 0;
			Static448.anInt7815 = 0;
			return;
		}
		if (arg0.anInt4711 != -1 && arg0.anInt4714 == 0) {
			@Pc(33) Class31 local33 = Static155.aClass76_2.method2152(arg0.anInt4711);
			if (arg0.anInt4756 > 0 && local33.anInt934 == 0) {
				arg0.anInt4755++;
				Static448.anInt7815 = 0;
				Static514.anInt8747 = -1;
				return;
			}
			if (arg0.anInt4756 <= 0 && local33.anInt932 == 0) {
				Static514.anInt8747 = -1;
				Static448.anInt7815 = 0;
				arg0.anInt4755++;
				return;
			}
		}
		@Pc(104) Class31 local104;
		@Pc(91) Class48 local91;
		if (arg0.anInt4689 != -1 && arg0.anInt4685 <= Static481.anInt8318) {
			local91 = Static501.aClass41_2.method1068(arg0.anInt4689);
			if (local91.aBoolean68 && local91.anInt1218 != -1) {
				local104 = Static155.aClass76_2.method2152(local91.anInt1218);
				if (arg0.anInt4756 > 0 && local104.anInt934 == 0) {
					arg0.anInt4755++;
					Static448.anInt7815 = 0;
					Static514.anInt8747 = -1;
					return;
				}
				if (arg0.anInt4756 <= 0 && local104.anInt932 == 0) {
					Static448.anInt7815 = 0;
					Static514.anInt8747 = -1;
					arg0.anInt4755++;
					return;
				}
			}
		}
		if (arg0.anInt4689 != -1 && arg0.anInt4685 <= Static481.anInt8318) {
			local91 = Static501.aClass41_2.method1068(arg0.anInt4689);
			if (local91.aBoolean68 && local91.anInt1218 != -1) {
				local104 = Static155.aClass76_2.method2152(local91.anInt1218);
				if (arg0.anInt4756 > 0 && local104.anInt934 == 0) {
					Static448.anInt7815 = 0;
					Static514.anInt8747 = -1;
					arg0.anInt4755++;
					return;
				}
				if (arg0.anInt4756 <= 0 && local104.anInt932 == 0) {
					Static448.anInt7815 = 0;
					arg0.anInt4755++;
					Static514.anInt8747 = -1;
					return;
				}
			}
		}
		@Pc(227) int local227 = arg0.anInt8492;
		@Pc(230) int local230 = arg0.anInt8493;
		@Pc(246) int local246 = arg0.anIntArray306[arg0.anInt4753 - 1] * 128 + arg0.method4035() * 64;
		@Pc(263) int local263 = arg0.anIntArray307[arg0.anInt4753 - 1] * 128 + arg0.method4035() * 64;
		if (local227 < local246) {
			if (local230 < local263) {
				arg0.method4036(10240);
			} else if (local230 <= local263) {
				arg0.method4036(12288);
			} else {
				arg0.method4036(14336);
			}
		} else if (local246 < local227) {
			if (local263 > local230) {
				arg0.method4036(6144);
			} else if (local230 <= local263) {
				arg0.method4036(4096);
			} else {
				arg0.method4036(2048);
			}
		} else if (local230 < local263) {
			arg0.method4036(8192);
		} else if (local263 < local230) {
			arg0.method4036(0);
		}
		@Pc(365) byte local365 = arg0.aByteArray59[arg0.anInt4753 - 1];
		if (!arg1 && (local246 - local227 > 256 || local246 - local227 < -256 || local263 - local230 > 256 || local263 - local230 < -256)) {
			arg0.anInt8492 = local246;
			arg0.anInt8493 = local263;
			arg0.method4025(arg0.anInt4747, false);
			Static514.anInt8747 = -1;
			arg0.anInt4753--;
			if (arg0.anInt4756 > 0) {
				arg0.anInt4756--;
			}
			Static448.anInt7815 = 0;
			return;
		}
		@Pc(427) int local427 = 4;
		@Pc(429) boolean local429 = true;
		if (arg0 instanceof Class15_Sub2_Sub1_Sub2) {
			local429 = ((Class15_Sub2_Sub1_Sub2) arg0).aClass305_1.aBoolean640;
		}
		@Pc(447) int local447;
		if (local429) {
			local447 = arg0.anInt4747 - arg0.aClass257_7.anInt7554;
			if (local447 != 0 && arg0.anInt4720 == -1 && arg0.anInt4741 != 0) {
				local427 = 2;
			}
			if (!arg1 && arg0.anInt4753 > 2) {
				local427 = 6;
			}
			if (!arg1 && arg0.anInt4753 > 3) {
				local427 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt4753 > 1) {
				local427 = 6;
			}
			if (!arg1 && arg0.anInt4753 > 2) {
				local427 = 8;
			}
		}
		if (arg0.anInt4755 > 0 && arg0.anInt4753 > 1) {
			arg0.anInt4755--;
			local427 = 8;
		}
		if (local365 == 2) {
			local427 <<= 0x1;
		} else if (local365 == 0) {
			local427 >>= 0x1;
		}
		if (local9.anInt8130 != -1) {
			local427 <<= 0x7;
			if (arg0.anInt4753 == 1) {
				local447 = arg0.anInt4754 * arg0.anInt4754;
				@Pc(576) int local576 = (local246 < arg0.anInt8492 ? arg0.anInt8492 - local246 : -arg0.anInt8492 + local246) << 7;
				@Pc(592) int local592 = (local263 < arg0.anInt8493 ? arg0.anInt8493 - local263 : local263 - arg0.anInt8493) << 7;
				@Pc(599) int local599 = local576 <= local592 ? local592 : local576;
				@Pc(606) int local606 = local9.anInt8130 * 2 * local599;
				if (local606 < local447) {
					arg0.anInt4754 /= 2;
				} else if (local599 < local447 / 2) {
					arg0.anInt4754 -= local9.anInt8130;
					if (arg0.anInt4754 < 0) {
						arg0.anInt4754 = 0;
					}
				} else if (local427 > arg0.anInt4754) {
					arg0.anInt4754 += local9.anInt8130;
					if (arg0.anInt4754 > local427) {
						arg0.anInt4754 = local427;
					}
				}
			} else if (arg0.anInt4754 < local427) {
				arg0.anInt4754 += local9.anInt8130;
				if (arg0.anInt4754 > local427) {
					arg0.anInt4754 = local427;
				}
			} else if (arg0.anInt4754 > 0) {
				arg0.anInt4754 -= local9.anInt8130;
				if (arg0.anInt4754 < 0) {
					arg0.anInt4754 = 0;
				}
			}
			local427 = arg0.anInt4754 >> 7;
			if (local427 < 1) {
				local427 = 1;
			}
		}
		Static448.anInt7815 = 0;
		if (local246 == local227 && local263 == local230) {
			Static514.anInt8747 = -1;
		} else {
			if (local227 < local246) {
				arg0.anInt8492 += local427;
				Static448.anInt7815 |= 0x4;
				if (arg0.anInt8492 > local246) {
					arg0.anInt8492 = local246;
				}
			} else if (local227 > local246) {
				Static448.anInt7815 |= 0x8;
				arg0.anInt8492 -= local427;
				if (local246 > arg0.anInt8492) {
					arg0.anInt8492 = local246;
				}
			}
			if (local263 > local230) {
				arg0.anInt8493 += local427;
				Static448.anInt7815 |= 0x1;
				if (arg0.anInt8493 > local263) {
					arg0.anInt8493 = local263;
				}
			} else if (local263 < local230) {
				arg0.anInt8493 -= local427;
				Static448.anInt7815 |= 0x2;
				if (arg0.anInt8493 < local263) {
					arg0.anInt8493 = local263;
				}
			}
			if (local427 >= 8) {
				Static514.anInt8747 = 2;
			} else {
				Static514.anInt8747 = local365;
			}
		}
		if (local246 != arg0.anInt8492 || arg0.anInt8493 != local263) {
			return;
		}
		arg0.anInt4753--;
		if (arg0.anInt4756 > 0) {
			arg0.anInt4756--;
			return;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BII)Z")
	public static boolean method6653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static394.method5746(arg1, arg0) & Static256.method4336(arg0, arg1);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ui;)Ljava/lang/String;")
	public static String method6654(@OriginalArg(1) Class5_Sub47 arg0) {
		return arg0.aString77 == null || arg0.aString77.length() <= 0 ? arg0.aString76 : arg0.aString76 + Static539.aClass40_155.method1063(Static194.anInt3737) + arg0.aString77;
	}
}
