import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!hba", name = "j", descriptor = "Lclient!fh;")
	public static Class8_Sub5_Sub7 aClass8_Sub5_Sub7_1;

	@OriginalMember(owner = "client!hba", name = "k", descriptor = "I")
	public static int anInt4515;

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_40 = new Class257(13, 16);

	@OriginalMember(owner = "client!hba", name = "n", descriptor = "[I")
	public static final int[] anIntArray247 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!hba", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString58 = null;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILclient!ei;)V")
	public static void method3637(@OriginalArg(1) Class8_Sub5_Sub6 arg0) {
		arg0.method8381();
		@Pc(15) boolean local15 = false;
		for (@Pc(20) Class8_Sub5_Sub6 local20 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7327(); local20 != null; local20 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7326()) {
			if (Static243.method4439(local20.method2819(), arg0.method2819())) {
				local15 = true;
				Static594.method8201(arg0, local20);
				break;
			}
		}
		if (!local15) {
			Static414.aClass302_11.method7328(arg0);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!bda;ZI)V")
	public static void method3638(@OriginalArg(0) Class15_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) Class102 local9 = arg0.method6686();
		if (arg0.anInt8137 == 0) {
			Static618.anInt10390 = 0;
			Static94.anInt6314 = -1;
			arg0.anInt8138 = 0;
			return;
		}
		if (arg0.anInt8105 != -1 && arg0.anInt8094 == 0) {
			@Pc(34) Class97 local34 = Static28.aClass220_1.method5670(arg0.anInt8105);
			if (arg0.anInt8140 > 0 && local34.anInt3612 == 0) {
				arg0.anInt8138++;
				Static618.anInt10390 = 0;
				Static94.anInt6314 = -1;
				return;
			}
			if (arg0.anInt8140 <= 0 && local34.anInt3607 == 0) {
				Static618.anInt10390 = 0;
				arg0.anInt8138++;
				Static94.anInt6314 = -1;
				return;
			}
		}
		@Pc(107) Class97 local107;
		@Pc(93) Class73 local93;
		if (arg0.anInt8058 != -1 && Static435.anInt8192 >= arg0.anInt8099) {
			local93 = Static202.aClass333_2.method7823(arg0.anInt8058);
			if (local93.aBoolean202 && local93.anInt2718 != -1) {
				local107 = Static28.aClass220_1.method5670(local93.anInt2718);
				if (arg0.anInt8140 > 0 && local107.anInt3612 == 0) {
					arg0.anInt8138++;
					Static618.anInt10390 = 0;
					Static94.anInt6314 = -1;
					return;
				}
				if (arg0.anInt8140 <= 0 && local107.anInt3607 == 0) {
					Static94.anInt6314 = -1;
					Static618.anInt10390 = 0;
					arg0.anInt8138++;
					return;
				}
			}
		}
		if (arg0.anInt8058 != -1 && Static435.anInt8192 >= arg0.anInt8099) {
			local93 = Static202.aClass333_2.method7823(arg0.anInt8058);
			if (local93.aBoolean202 && local93.anInt2718 != -1) {
				local107 = Static28.aClass220_1.method5670(local93.anInt2718);
				if (arg0.anInt8140 > 0 && local107.anInt3612 == 0) {
					Static94.anInt6314 = -1;
					Static618.anInt10390 = 0;
					arg0.anInt8138++;
					return;
				}
				if (arg0.anInt8140 <= 0 && local107.anInt3607 == 0) {
					Static94.anInt6314 = -1;
					Static618.anInt10390 = 0;
					arg0.anInt8138++;
					return;
				}
			}
		}
		@Pc(215) int local215 = arg0.anInt10301;
		@Pc(218) int local218 = arg0.anInt10298;
		@Pc(235) int local235 = arg0.anIntArray435[arg0.anInt8137 - 1] * 512 + arg0.method6692() * 256;
		@Pc(252) int local252 = arg0.anIntArray436[arg0.anInt8137 - 1] * 512 + arg0.method6692() * 256;
		if (local235 > local215) {
			if (local252 > local218) {
				arg0.method6700(10240);
			} else if (local252 < local218) {
				arg0.method6700(14336);
			} else {
				arg0.method6700(12288);
			}
		} else if (local215 <= local235) {
			if (local218 < local252) {
				arg0.method6700(8192);
			} else if (local218 > local252) {
				arg0.method6700(0);
			}
		} else if (local252 > local218) {
			arg0.method6700(6144);
		} else if (local252 >= local218) {
			arg0.method6700(4096);
		} else {
			arg0.method6700(2048);
		}
		@Pc(350) byte local350 = arg0.aByteArray69[arg0.anInt8137 - 1];
		if (!arg1 && (local235 - local215 > 1024 || local235 - local215 < -1024 || local252 - local218 > 1024 || local252 - local218 < -1024)) {
			arg0.anInt10301 = local235;
			arg0.anInt10298 = local252;
			arg0.method6683(arg0.anInt8133, false);
			Static94.anInt6314 = -1;
			Static618.anInt10390 = 0;
			arg0.anInt8137--;
			if (arg0.anInt8140 > 0) {
				arg0.anInt8140--;
			}
			return;
		}
		@Pc(428) int local428 = 16;
		@Pc(430) boolean local430 = true;
		if (arg0 instanceof Class15_Sub1_Sub2_Sub2_Sub2) {
			local430 = ((Class15_Sub1_Sub2_Sub2_Sub2) arg0).aClass300_1.aBoolean630;
		}
		@Pc(448) int local448;
		if (local430) {
			local448 = arg0.anInt8133 - arg0.aClass371_7.anInt10460;
			if (local448 != 0 && arg0.anInt8108 == -1 && arg0.anInt8097 != 0) {
				local428 = 8;
			}
			if (!arg1 && arg0.anInt8137 > 2) {
				local428 = 24;
			}
			if (!arg1 && arg0.anInt8137 > 3) {
				local428 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt8137 > 1) {
				local428 = 24;
			}
			if (!arg1 && arg0.anInt8137 > 2) {
				local428 = 32;
			}
		}
		if (arg0.anInt8138 > 0 && arg0.anInt8137 > 1) {
			local428 = 32;
			arg0.anInt8138--;
		}
		if (local350 == 2) {
			local428 <<= 0x1;
		} else if (local350 == 0) {
			local428 >>= 0x1;
		}
		if (local9.anInt3736 != -1) {
			local428 <<= 0x9;
			if (arg0.anInt8137 == 1) {
				local448 = arg0.anInt8139 * arg0.anInt8139;
				@Pc(618) int local618 = (local235 >= arg0.anInt10301 ? local235 - arg0.anInt10301 : -local235 + arg0.anInt10301) << 9;
				@Pc(640) int local640 = (local252 < arg0.anInt10298 ? arg0.anInt10298 - local252 : local252 + -arg0.anInt10298) << 9;
				@Pc(647) int local647 = local640 >= local618 ? local640 : local618;
				@Pc(654) int local654 = local9.anInt3736 * 2 * local647;
				if (local448 > local654) {
					arg0.anInt8139 /= 2;
				} else if (local647 < local448 / 2) {
					arg0.anInt8139 -= local9.anInt3736;
					if (arg0.anInt8139 < 0) {
						arg0.anInt8139 = 0;
					}
				} else if (local428 > arg0.anInt8139) {
					arg0.anInt8139 += local9.anInt3736;
					if (local428 < arg0.anInt8139) {
						arg0.anInt8139 = local428;
					}
				}
			} else if (local428 > arg0.anInt8139) {
				arg0.anInt8139 += local9.anInt3736;
				if (local428 < arg0.anInt8139) {
					arg0.anInt8139 = local428;
				}
			} else if (arg0.anInt8139 > 0) {
				arg0.anInt8139 -= local9.anInt3736;
				if (arg0.anInt8139 < 0) {
					arg0.anInt8139 = 0;
				}
			}
			local428 = arg0.anInt8139 >> 9;
			if (local428 < 1) {
				local428 = 1;
			}
		}
		Static618.anInt10390 = 0;
		if (local215 == local235 && local252 == local218) {
			Static94.anInt6314 = -1;
		} else {
			if (local235 > local215) {
				Static618.anInt10390 |= 0x4;
				arg0.anInt10301 += local428;
				if (local235 < arg0.anInt10301) {
					arg0.anInt10301 = local235;
				}
			} else if (local215 > local235) {
				Static618.anInt10390 |= 0x8;
				arg0.anInt10301 -= local428;
				if (local235 > arg0.anInt10301) {
					arg0.anInt10301 = local235;
				}
			}
			if (local252 > local218) {
				arg0.anInt10298 += local428;
				Static618.anInt10390 |= 0x1;
				if (local252 < arg0.anInt10298) {
					arg0.anInt10298 = local252;
				}
			} else if (local218 > local252) {
				Static618.anInt10390 |= 0x2;
				arg0.anInt10298 -= local428;
				if (arg0.anInt10298 < local252) {
					arg0.anInt10298 = local252;
				}
			}
			if (local428 < 32) {
				Static94.anInt6314 = local350;
			} else {
				Static94.anInt6314 = 2;
			}
		}
		if (local235 == arg0.anInt10301 && local252 == arg0.anInt10298) {
			if (arg0.anInt8140 > 0) {
				arg0.anInt8140--;
			}
			arg0.anInt8137--;
		}
	}
}
