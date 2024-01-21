import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!v", name = "N", descriptor = "I")
	public static int anInt4146;

	@OriginalMember(owner = "client!v", name = "U", descriptor = "[I")
	public static int[] anIntArray497;

	@OriginalMember(owner = "client!v", name = "K", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1628 = Static120.method1824("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!v", name = "O", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1630 = Static120.method1824("Started 3d library");

	@OriginalMember(owner = "client!v", name = "M", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1629 = aClass80_1630;

	@OriginalMember(owner = "client!v", name = "P", descriptor = "[I")
	public static final int[] anIntArray496 = new int[200];

	@OriginalMember(owner = "client!v", name = "R", descriptor = "I")
	public static int anInt4148 = -1;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBI)I")
	public static int method2969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub7 local15 = (Class3_Sub7) Static6.aClass54_2.method1496((long) arg0);
		if (local15 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local15.anIntArray103.length) {
			return local15.anIntArray103[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!rd;IBI)V")
	public static void method2970(@OriginalArg(0) int arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class77 local8 = Static26.method425(arg3, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray20 != null) {
			@Pc(22) Class3_Sub16 local22 = new Class3_Sub16();
			local22.aClass80_888 = arg1;
			local22.anInt2191 = arg0;
			local22.anObjectArray3 = local8.anObjectArray20;
			local22.aClass77_10 = local8;
			Static168.method2710(local22);
		}
		@Pc(40) boolean local40 = true;
		if (local8.anInt3256 > 0) {
			local40 = Static182.method2911(local8);
		}
		if (!local40 || !Static158.method2506(Static71.method1062(local8), arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static146.aClass3_Sub17_Sub1_3.method2146(79);
			Static146.aClass3_Sub17_Sub1_3.method2131(arg3);
			Static146.aClass3_Sub17_Sub1_3.method2092(arg2);
		}
		if (arg0 == 2) {
			Static146.aClass3_Sub17_Sub1_3.method2146(50);
			Static146.aClass3_Sub17_Sub1_3.method2131(arg3);
			Static146.aClass3_Sub17_Sub1_3.method2092(arg2);
		}
		if (arg0 == 3) {
			Static146.aClass3_Sub17_Sub1_3.method2146(43);
			Static146.aClass3_Sub17_Sub1_3.method2131(arg3);
			Static146.aClass3_Sub17_Sub1_3.method2092(arg2);
		}
		if (arg0 == 4) {
			Static146.aClass3_Sub17_Sub1_3.method2146(188);
			Static146.aClass3_Sub17_Sub1_3.method2131(arg3);
			Static146.aClass3_Sub17_Sub1_3.method2092(arg2);
		}
		if (arg0 == 5) {
			Static146.aClass3_Sub17_Sub1_3.method2146(32);
			Static146.aClass3_Sub17_Sub1_3.method2131(arg3);
			Static146.aClass3_Sub17_Sub1_3.method2092(arg2);
		}
		if (arg0 == 6) {
			Static146.aClass3_Sub17_Sub1_3.method2146(89);
			Static146.aClass3_Sub17_Sub1_3.method2131(arg3);
			Static146.aClass3_Sub17_Sub1_3.method2092(arg2);
		}
		if (arg0 == 7) {
			Static146.aClass3_Sub17_Sub1_3.method2146(27);
			Static146.aClass3_Sub17_Sub1_3.method2131(arg3);
			Static146.aClass3_Sub17_Sub1_3.method2092(arg2);
		}
		if (arg0 == 8) {
			Static146.aClass3_Sub17_Sub1_3.method2146(140);
			Static146.aClass3_Sub17_Sub1_3.method2131(arg3);
			Static146.aClass3_Sub17_Sub1_3.method2092(arg2);
		}
		if (arg0 == 9) {
			Static146.aClass3_Sub17_Sub1_3.method2146(166);
			Static146.aClass3_Sub17_Sub1_3.method2131(arg3);
			Static146.aClass3_Sub17_Sub1_3.method2092(arg2);
		}
		if (arg0 == 10) {
			Static146.aClass3_Sub17_Sub1_3.method2146(195);
			Static146.aClass3_Sub17_Sub1_3.method2131(arg3);
			Static146.aClass3_Sub17_Sub1_3.method2092(arg2);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)Lclient!rd;")
	public static Class80 method2972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - arg0;
		if (local4 < -9) {
			return Static186.aClass80_1648;
		} else if (local4 < -6) {
			return Static18.aClass80_141;
		} else if (local4 < -3) {
			return Static19.aClass80_143;
		} else if (local4 < 0) {
			return Static66.aClass80_564;
		} else if (local4 > 9) {
			return Static129.aClass80_1102;
		} else if (local4 > 6) {
			return Static159.aClass80_1371;
		} else if (local4 > 3) {
			return Static42.aClass80_354;
		} else if (local4 > 0) {
			return Static118.aClass80_1029;
		} else {
			return Static14.aClass80_101;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!ve;I)V")
	public static void method2975(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub5_Sub4_Sub2 arg1, @OriginalArg(3) int arg2) {
		if ((arg2 & 0x2) != 0) {
			arg1.aClass80_1687 = Static63.aClass3_Sub17_Sub1_2.method2102();
			if (arg1.aClass80_1687.method2456(0) == 126) {
				arg1.aClass80_1687 = arg1.aClass80_1687.method2449(1);
				Static147.method2354(arg1.aClass80_1689, 2, arg1.aClass80_1687);
			} else if (Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1 == arg1) {
				Static147.method2354(arg1.aClass80_1689, 2, arg1.aClass80_1687);
			}
			arg1.anInt4327 = 150;
			arg1.anInt4273 = 0;
			arg1.anInt4298 = 0;
		}
		@Pc(69) int local69;
		if ((arg2 & 0x8) != 0) {
			local69 = Static63.aClass3_Sub17_Sub1_2.method2135();
			@Pc(72) byte[] local72 = new byte[local69];
			@Pc(77) Class3_Sub17 local77 = new Class3_Sub17(local72);
			Static63.aClass3_Sub17_Sub1_2.method2139(local69, local72);
			Static69.aClass3_Sub17Array1[arg0] = local77;
			arg1.method3071(local77);
		}
		@Pc(106) int local106;
		if ((arg2 & 0x4) != 0) {
			local69 = Static63.aClass3_Sub17_Sub1_2.method2114();
			local106 = Static63.aClass3_Sub17_Sub1_2.method2109();
			@Pc(110) int local110 = Static63.aClass3_Sub17_Sub1_2.method2135();
			@Pc(113) int local113 = Static63.aClass3_Sub17_Sub1_2.anInt2923;
			if (arg1.aClass80_1689 != null && arg1.aClass55_2 != null) {
				@Pc(121) boolean local121 = false;
				@Pc(128) long local128 = arg1.aClass80_1689.method2441();
				if (local106 <= 1) {
					for (@Pc(135) int local135 = 0; local135 < Static133.anInt2865; local135++) {
						if (local128 == Static47.aLongArray4[local135]) {
							local121 = true;
							break;
						}
					}
				}
				if (!local121 && Static173.anInt3889 == 0) {
					Static53.aClass3_Sub17_1.anInt2923 = 0;
					Static63.aClass3_Sub17_Sub1_2.method2101(local110, Static53.aClass3_Sub17_1.aByteArray40);
					Static53.aClass3_Sub17_1.anInt2923 = 0;
					@Pc(179) Class80 local179 = Static76.method2250(Static175.method2824(Static53.aClass3_Sub17_1).method2455());
					arg1.aClass80_1687 = local179.method2431();
					arg1.anInt4298 = local69 >> 8;
					arg1.anInt4327 = 150;
					arg1.anInt4273 = local69 & 0xFF;
					if (local106 == 2 || local106 == 3) {
						Static147.method2354(Static154.method2467(new Class80[] { Static149.aClass80_1312, arg1.aClass80_1689 }), 1, local179);
					} else if (local106 == 1) {
						Static147.method2354(Static154.method2467(new Class80[] { Static72.aClass80_1616, arg1.aClass80_1689 }), 1, local179);
					} else {
						Static147.method2354(arg1.aClass80_1689, 2, local179);
					}
				}
			}
			Static63.aClass3_Sub17_Sub1_2.anInt2923 = local113 + local110;
		}
		if ((arg2 & 0x10) != 0) {
			arg1.anInt4328 = Static63.aClass3_Sub17_Sub1_2.method2098();
			if (arg1.anInt4328 == 65535) {
				arg1.anInt4328 = -1;
			}
		}
		if ((arg2 & 0x20) != 0) {
			local69 = Static63.aClass3_Sub17_Sub1_2.method2091();
			local106 = Static63.aClass3_Sub17_Sub1_2.method2107();
			arg1.method3063(local106, local69, Static193.anInt4411);
			arg1.anInt4322 = Static193.anInt4411 + 300;
			arg1.anInt4300 = Static63.aClass3_Sub17_Sub1_2.method2135();
		}
		if ((arg2 & 0x80) != 0) {
			arg1.anInt4279 = Static63.aClass3_Sub17_Sub1_2.method2111();
			arg1.anInt4290 = Static63.aClass3_Sub17_Sub1_2.method2098();
		}
		if ((arg2 & 0x400) != 0) {
			arg1.anInt4319 = Static63.aClass3_Sub17_Sub1_2.method2109();
			arg1.anInt4316 = Static63.aClass3_Sub17_Sub1_2.method2109();
			arg1.anInt4294 = Static63.aClass3_Sub17_Sub1_2.method2109();
			arg1.anInt4284 = Static63.aClass3_Sub17_Sub1_2.method2135();
			arg1.anInt4325 = Static63.aClass3_Sub17_Sub1_2.method2114() + Static193.anInt4411;
			arg1.anInt4282 = Static63.aClass3_Sub17_Sub1_2.method2111() + Static193.anInt4411;
			arg1.anInt4274 = Static63.aClass3_Sub17_Sub1_2.method2135();
			arg1.anInt4297 = 1;
			arg1.anInt4291 = 0;
		}
		if ((arg2 & 0x200) != 0) {
			local69 = Static63.aClass3_Sub17_Sub1_2.method2091();
			local106 = Static63.aClass3_Sub17_Sub1_2.method2135();
			arg1.method3063(local106, local69, Static193.anInt4411);
		}
		if ((arg2 & 0x100) != 0) {
			arg1.anInt4296 = Static63.aClass3_Sub17_Sub1_2.method2111();
			local69 = Static63.aClass3_Sub17_Sub1_2.method2132();
			arg1.anInt4313 = 0;
			arg1.anInt4317 = local69 >> 16;
			arg1.anInt4276 = (local69 & 0xFFFF) + Static193.anInt4411;
			if (arg1.anInt4296 == 65535) {
				arg1.anInt4296 = -1;
			}
			arg1.anInt4295 = 0;
			if (arg1.anInt4276 > Static193.anInt4411) {
				arg1.anInt4313 = -1;
			}
		}
		if ((arg2 & 0x40) == 0) {
			return;
		}
		local69 = Static63.aClass3_Sub17_Sub1_2.method2141();
		local106 = Static63.aClass3_Sub17_Sub1_2.method2109();
		if (local69 == 65535) {
			local69 = -1;
		}
		Static131.method3062(local106, local69, arg1);
	}
}
