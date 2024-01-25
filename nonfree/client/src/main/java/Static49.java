import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "[I")
	public static int[] anIntArray492;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!tk;")
	public static Class194 aClass194_3;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public static int anInt5279 = 0;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString203 = null;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
	public static final int[] anIntArray493 = new int[3];

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Z")
	public static boolean aBoolean438 = false;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	public static int anInt5286 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
	public static void method4590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static9.aClass37_1 = new Class37(arg1);
		Static302.aClass37_99 = new Class37(arg0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBI)I")
	public static int method4595(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class1_Sub1 local18 = (Class1_Sub1) Static158.aClass207_24.method5555((long) arg1);
		if (local18 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local18.anIntArray4.length) {
			return local18.anIntArray4[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZILclient!wm;)V")
	public static void method4615(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class10_Sub1_Sub2 arg1) {
		@Pc(9) Class118 local9 = arg1.method3408();
		if (arg1.anInt4088 == 0) {
			Static294.anInt5915 = -1;
			arg1.anInt4081 = 0;
			Static189.anInt6106 = 0;
			return;
		}
		if (arg1.anInt4026 != -1 && arg1.anInt4062 == 0) {
			@Pc(38) Class177 local38 = Static354.method5863(arg1.anInt4026);
			if (arg1.anInt4085 > 0 && local38.anInt5410 == 0) {
				Static294.anInt5915 = -1;
				Static189.anInt6106 = 0;
				arg1.anInt4081++;
				return;
			}
			if (arg1.anInt4085 <= 0 && local38.anInt5413 == 0) {
				Static189.anInt6106 = 0;
				Static294.anInt5915 = -1;
				arg1.anInt4081++;
				return;
			}
		}
		if (arg1.anInt4058 != -1 && arg1.anInt4076 <= Static282.anInt3516) {
			@Pc(95) Class162 local95 = Static264.method4763(arg1.anInt4058);
			if (local95.aBoolean394 && local95.anInt4910 != -1) {
				@Pc(108) Class177 local108 = Static354.method5863(local95.anInt4910);
				if (arg1.anInt4085 > 0 && local108.anInt5410 == 0) {
					Static189.anInt6106 = 0;
					arg1.anInt4081++;
					Static294.anInt5915 = -1;
					return;
				}
				if (arg1.anInt4085 <= 0 && local108.anInt5413 == 0) {
					Static189.anInt6106 = 0;
					Static294.anInt5915 = -1;
					arg1.anInt4081++;
					return;
				}
			}
		}
		@Pc(151) int local151 = arg1.anInt6728;
		@Pc(154) int local154 = arg1.anInt6726;
		@Pc(171) int local171 = arg1.anIntArray387[arg1.anInt4088 - 1] * 128 + arg1.method3402() * 64;
		@Pc(187) int local187 = arg1.anIntArray388[arg1.anInt4088 - 1] * 128 + arg1.method3402() * 64;
		if (!arg0 && (local171 - local151 > 256 || local171 - local151 < -256 || local187 - local154 > 256 || local187 - local154 < -256)) {
			arg1.anInt6728 = local171;
			arg1.anInt6726 = local187;
			Static189.anInt6106 = 0;
			Static294.anInt5915 = -1;
			return;
		}
		if (local151 < local171) {
			if (local154 < local187) {
				arg1.method3409(10240);
			} else if (local187 < local154) {
				arg1.method3409(14336);
			} else {
				arg1.method3409(12288);
			}
		} else if (local151 > local171) {
			if (local187 > local154) {
				arg1.method3409(6144);
			} else if (local154 <= local187) {
				arg1.method3409(4096);
			} else {
				arg1.method3409(2048);
			}
		} else if (local187 > local154) {
			arg1.method3409(8192);
		} else if (local187 < local154) {
			arg1.method3409(0);
		}
		@Pc(320) int local320 = 4;
		@Pc(322) boolean local322 = true;
		if (arg1 instanceof Class10_Sub1_Sub2_Sub1) {
			local322 = ((Class10_Sub1_Sub2_Sub1) arg1).aClass60_1.aBoolean106;
		}
		if (local322) {
			@Pc(340) int local340 = arg1.anInt4056 - arg1.aClass212_7.anInt6528;
			if (local340 != 0 && arg1.anInt4061 == -1 && arg1.anInt4011 != 0) {
				local320 = 2;
			}
			if (!arg0 && arg1.anInt4088 > 2) {
				local320 = 6;
			}
			if (!arg0 && arg1.anInt4088 > 3) {
				local320 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt4088 > 1) {
				local320 = 6;
			}
			if (!arg0 && arg1.anInt4088 > 2) {
				local320 = 8;
			}
		}
		if (arg1.anInt4081 > 0 && arg1.anInt4088 > 1) {
			local320 = 8;
			arg1.anInt4081--;
		}
		@Pc(414) byte local414 = arg1.aByteArray46[arg1.anInt4088 - 1];
		if (local414 == 2) {
			local320 <<= 0x1;
		} else if (local414 == 0) {
			local320 >>= 0x1;
		}
		if (local9.anInt2954 != -1) {
			local320 <<= 0x7;
			if (arg1.anInt4088 == 1) {
				@Pc(452) int local452 = arg1.anInt4089 * arg1.anInt4089;
				@Pc(468) int local468 = (arg1.anInt6728 <= local171 ? local171 - arg1.anInt6728 : arg1.anInt6728 - local171) << 7;
				@Pc(490) int local490 = (arg1.anInt6726 <= local187 ? local187 - arg1.anInt6726 : -local187 + arg1.anInt6726) << 7;
				@Pc(497) int local497 = local490 >= local468 ? local490 : local468;
				@Pc(504) int local504 = local9.anInt2954 * 2 * local497;
				if (local504 < local452) {
					arg1.anInt4089 /= 2;
				} else if (local497 < local452 / 2) {
					arg1.anInt4089 -= local9.anInt2954;
					if (arg1.anInt4089 < 0) {
						arg1.anInt4089 = 0;
					}
				} else if (arg1.anInt4089 < local320) {
					arg1.anInt4089 += local9.anInt2954;
					if (local320 < arg1.anInt4089) {
						arg1.anInt4089 = local320;
					}
				}
			} else if (arg1.anInt4089 < local320) {
				arg1.anInt4089 += local9.anInt2954;
				if (local320 < arg1.anInt4089) {
					arg1.anInt4089 = local320;
				}
			} else if (arg1.anInt4089 > 0) {
				arg1.anInt4089 -= local9.anInt2954;
				if (arg1.anInt4089 < 0) {
					arg1.anInt4089 = 0;
				}
			}
			local320 = arg1.anInt4089 >> 7;
			if (local320 < 1) {
				local320 = 1;
			}
		}
		Static189.anInt6106 = 0;
		if (local151 < local171) {
			arg1.anInt6728 += local320;
			Static189.anInt6106 |= 0x4;
			if (arg1.anInt6728 > local171) {
				arg1.anInt6728 = local171;
			}
		} else if (local151 > local171) {
			Static189.anInt6106 |= 0x8;
			arg1.anInt6728 -= local320;
			if (arg1.anInt6728 < local171) {
				arg1.anInt6728 = local171;
			}
		}
		if (local154 < local187) {
			arg1.anInt6726 += local320;
			Static189.anInt6106 |= 0x1;
			if (arg1.anInt6726 > local187) {
				arg1.anInt6726 = local187;
			}
		} else if (local154 > local187) {
			arg1.anInt6726 -= local320;
			Static189.anInt6106 |= 0x2;
			if (arg1.anInt6726 < local187) {
				arg1.anInt6726 = local187;
			}
		}
		if (arg1.anInt6728 == local171 && local187 == arg1.anInt6726) {
			arg1.anInt4088--;
			if (arg1.anInt4085 > 0) {
				arg1.anInt4085--;
			}
		}
		if (local320 < 8) {
			Static294.anInt5915 = local414;
		} else {
			Static294.anInt5915 = 2;
		}
	}
}
