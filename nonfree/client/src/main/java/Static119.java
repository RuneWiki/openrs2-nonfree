import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!va", name = "t", descriptor = "[Lclient!oa;")
	public static Class56[] aClass56Array20;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "Lclient!ca;")
	public static Class10 aClass10_1 = new Class10();

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1625 = Static33.method650("");

	@OriginalMember(owner = "client!va", name = "o", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1626 = Static33.method650("bevor Sie die (WRegelversto-8 melden(W Option benutzen");

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1627 = Static33.method650("@or1@");

	@OriginalMember(owner = "client!va", name = "q", descriptor = "I")
	public static int anInt2986 = 0;

	@OriginalMember(owner = "client!va", name = "s", descriptor = "[Lclient!oa;")
	public static Class56[] aClass56Array19 = new Class56[100];

	@OriginalMember(owner = "client!va", name = "w", descriptor = "Z")
	public static boolean aBoolean162 = false;

	@OriginalMember(owner = "client!va", name = "x", descriptor = "[I")
	public static int[] anIntArray309 = new int[2000];

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!tb;ILclient!tb;Lclient!tb;)V")
	public static void method1922(@OriginalArg(0) Class44 arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) Class44 arg2) {
		Static109.aClass44_40 = arg2;
		Static19.aClass44_10 = arg1;
		Static1.aClass44_1 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)V")
	public static void method1923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class3_Sub16 local6 = (Class3_Sub16) Static98.aClass37_12.method989(); local6 != null; local6 = (Class3_Sub16) Static98.aClass37_12.method990()) {
			if (local6.anInt2616 != -1 || local6.anIntArray224 != null) {
				@Pc(18) int local18 = 0;
				if (arg3 > local6.anInt2623) {
					local18 = arg3 - local6.anInt2623;
				} else if (local6.anInt2611 > arg3) {
					local18 = local6.anInt2611 - arg3;
				}
				if (local6.anInt2624 < arg1) {
					local18 += arg1 - local6.anInt2624;
				} else if (arg1 < local6.anInt2620) {
					local18 += local6.anInt2620 - arg1;
				}
				if (local18 - 64 > local6.anInt2621 || Static126.anInt3091 == 0 || arg0 != local6.anInt2608) {
					if (local6.aClass3_Sub3_Sub3_2 != null) {
						Static68.aClass3_Sub3_Sub4_2.method2069(local6.aClass3_Sub3_Sub3_2);
						local6.aClass3_Sub3_Sub3_2 = null;
					}
					if (local6.aClass3_Sub3_Sub3_1 != null) {
						Static68.aClass3_Sub3_Sub4_2.method2069(local6.aClass3_Sub3_Sub3_1);
						local6.aClass3_Sub3_Sub3_1 = null;
					}
				} else {
					local18 -= 64;
					if (local18 < 0) {
						local18 = 0;
					}
					@Pc(137) int local137 = (local6.anInt2621 - local18) * Static126.anInt3091 / local6.anInt2621;
					if (local6.aClass3_Sub3_Sub3_2 != null) {
						local6.aClass3_Sub3_Sub3_2.method1562(local137);
					} else if (local6.anInt2616 >= 0) {
						@Pc(149) Class73 local149 = Static133.method1882(Static12.aClass44_Sub1_15, local6.anInt2616);
						if (local149 != null) {
							@Pc(156) Class3_Sub4_Sub1 local156 = local149.method1879().method1678(Static42.aClass13_1);
							@Pc(161) Class3_Sub3_Sub3 local161 = Static132.method1583(local156, local137);
							local161.method1564(-1);
							Static68.aClass3_Sub3_Sub4_2.method2068(local161);
							local6.aClass3_Sub3_Sub3_2 = local161;
						}
					}
					if (local6.aClass3_Sub3_Sub3_1 != null) {
						local6.aClass3_Sub3_Sub3_1.method1562(local137);
						if (!local6.aClass3_Sub3_Sub3_1.method2056()) {
							local6.aClass3_Sub3_Sub3_1 = null;
						}
					} else if (local6.anIntArray224 != null && (local6.anInt2618 -= arg2) <= 0) {
						@Pc(198) int local198 = (int) (Math.random() * (double) local6.anIntArray224.length);
						@Pc(206) Class73 local206 = Static133.method1882(Static12.aClass44_Sub1_15, local6.anIntArray224[local198]);
						if (local206 != null) {
							@Pc(213) Class3_Sub4_Sub1 local213 = local206.method1879().method1678(Static42.aClass13_1);
							@Pc(218) Class3_Sub3_Sub3 local218 = Static132.method1583(local213, local137);
							local218.method1564(0);
							Static68.aClass3_Sub3_Sub4_2.method2068(local218);
							local6.aClass3_Sub3_Sub3_1 = local218;
							local6.anInt2618 = (int) (Math.random() * (double) (local6.anInt2610 - local6.anInt2619)) + local6.anInt2619;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lclient!h;")
	public static Class3_Sub1_Sub6 method1924(@OriginalArg(1) int arg0) {
		@Pc(19) Class3_Sub1_Sub6 local19 = (Class3_Sub1_Sub6) Static28.aClass52_18.method1342((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static96.aClass44_55.method1146(16, arg0);
		local19 = new Class3_Sub1_Sub6();
		if (local31 != null) {
			local19.method787(new Class3_Sub2(local31));
		}
		Static28.aClass52_18.method1344(local19, (long) arg0);
		return local19;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method1925() {
		for (@Pc(7) int local7 = 0; local7 < Static60.anInt1776; local7++) {
			@Pc(13) int local13 = Static79.anIntArray186[local7];
			@Pc(17) Class3_Sub1_Sub2_Sub4_Sub2 local17 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local13];
			@Pc(21) int local21 = Static31.aClass3_Sub2_Sub1_3.method270();
			@Pc(31) int local31;
			@Pc(35) int local35;
			if ((local21 & 0x8) != 0) {
				local31 = Static31.aClass3_Sub2_Sub1_3.method294();
				local35 = Static31.aClass3_Sub2_Sub1_3.method294();
				local17.method2035(local31, Static98.anInt2566, local35);
				local17.anInt3167 = Static98.anInt2566 + 300;
				local17.anInt3169 = Static31.aClass3_Sub2_Sub1_3.method306();
				local17.anInt3148 = Static31.aClass3_Sub2_Sub1_3.method270();
			}
			if ((local21 & 0x2) != 0) {
				local17.anInt3197 = Static31.aClass3_Sub2_Sub1_3.method284();
				if (local17.anInt3197 == 65535) {
					local17.anInt3197 = -1;
				}
			}
			if ((local21 & 0x10) != 0) {
				local17.anInt3198 = Static31.aClass3_Sub2_Sub1_3.method312();
				local31 = Static31.aClass3_Sub2_Sub1_3.method298();
				local17.anInt3151 = (local31 & 0xFFFF) + Static98.anInt2566;
				local17.anInt3189 = 0;
				local17.anInt3163 = 0;
				local17.anInt3178 = local31 >> 16;
				if (local17.anInt3198 == 65535) {
					local17.anInt3198 = -1;
				}
				if (Static98.anInt2566 < local17.anInt3151) {
					local17.anInt3163 = -1;
				}
			}
			if ((local21 & 0x1) != 0) {
				local31 = Static31.aClass3_Sub2_Sub1_3.method284();
				local35 = Static31.aClass3_Sub2_Sub1_3.method294();
				if (local31 == 65535) {
					local31 = -1;
				}
				if (local17.anInt3149 == local31 && local31 != -1) {
					@Pc(204) int local204 = Static41.method770(local31).anInt864;
					if (local204 == 1) {
						local17.anInt3144 = local35;
						local17.anInt3175 = 0;
						local17.anInt3143 = 0;
						local17.anInt3168 = 0;
					}
					if (local204 == 2) {
						local17.anInt3168 = 0;
					}
				} else if (local31 == -1 || local17.anInt3149 == -1 || Static41.method770(local31).anInt878 >= Static41.method770(local17.anInt3149).anInt878) {
					local17.anInt3149 = local31;
					local17.anInt3143 = 0;
					local17.anInt3144 = local35;
					local17.anInt3168 = 0;
					local17.anInt3175 = 0;
					local17.anInt3191 = local17.anInt3146;
				}
			}
			if ((local21 & 0x20) != 0) {
				local17.aClass3_Sub1_Sub17_1 = Static9.method177(Static31.aClass3_Sub2_Sub1_3.method284());
				local17.anInt3190 = local17.aClass3_Sub1_Sub17_1.anInt2927;
				local17.anInt3188 = local17.aClass3_Sub1_Sub17_1.anInt2944;
				local17.anInt3162 = local17.aClass3_Sub1_Sub17_1.anInt2915;
				local17.anInt3153 = local17.aClass3_Sub1_Sub17_1.anInt2920;
				local17.anInt3154 = local17.aClass3_Sub1_Sub17_1.anInt2937;
				local17.anInt3164 = local17.aClass3_Sub1_Sub17_1.anInt2921;
				local17.anInt3176 = local17.aClass3_Sub1_Sub17_1.anInt2938;
				local17.anInt3174 = local17.aClass3_Sub1_Sub17_1.anInt2931;
				local17.anInt3160 = local17.aClass3_Sub1_Sub17_1.anInt2919;
			}
			if ((local21 & 0x40) != 0) {
				local17.aClass56_1729 = Static31.aClass3_Sub2_Sub1_3.method301();
				local17.anInt3150 = 100;
			}
			if ((local21 & 0x80) != 0) {
				local17.anInt3192 = Static31.aClass3_Sub2_Sub1_3.method276();
				local17.anInt3165 = Static31.aClass3_Sub2_Sub1_3.method284();
			}
			if ((local21 & 0x4) != 0) {
				local31 = Static31.aClass3_Sub2_Sub1_3.method294();
				local35 = Static31.aClass3_Sub2_Sub1_3.method270();
				local17.method2035(local31, Static98.anInt2566, local35);
				local17.anInt3167 = Static98.anInt2566 + 300;
				local17.anInt3169 = Static31.aClass3_Sub2_Sub1_3.method306();
				local17.anInt3148 = Static31.aClass3_Sub2_Sub1_3.method306();
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!oa;Lclient!tb;ILclient!oa;ZI)V")
	public static void method1926(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(3) Class56 arg2) {
		@Pc(8) int local8 = arg1.method1148(arg2);
		@Pc(14) int local14 = arg1.method1136(arg0, local8);
		Static81.method1430(local8, local14, 255, arg1);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BII)I")
	public static int method1929(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!hf;I)V")
	public static void method1930(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub2_Sub4_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		if ((arg2 & 0x100) != 0) {
			local9 = Static31.aClass3_Sub2_Sub1_3.method294();
			local13 = Static31.aClass3_Sub2_Sub1_3.method270();
			arg1.method2035(local9, Static98.anInt2566, local13);
			arg1.anInt3167 = Static98.anInt2566 + 300;
			arg1.anInt3169 = Static31.aClass3_Sub2_Sub1_3.method283();
			arg1.anInt3148 = Static31.aClass3_Sub2_Sub1_3.method306();
		}
		if ((arg2 & 0x8) != 0) {
			local9 = Static31.aClass3_Sub2_Sub1_3.method299();
			local13 = Static31.aClass3_Sub2_Sub1_3.method306();
			if (local9 == 65535) {
				local9 = -1;
			}
			Static7.method302(local9, local13, arg1);
		}
		if ((arg2 & 0x10) != 0) {
			arg1.aClass56_1729 = Static31.aClass3_Sub2_Sub1_3.method301();
			if (arg1.aClass56_1729.method1449(0) == 126) {
				arg1.aClass56_1729 = arg1.aClass56_1729.method1417(1);
				Static75.method1348(2, arg1.aClass56_1729, arg1.aClass56_764);
			} else if (arg1 == Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1) {
				Static75.method1348(2, arg1.aClass56_1729, arg1.aClass56_764);
			}
			arg1.anInt3155 = 0;
			arg1.anInt3150 = 150;
			arg1.anInt3177 = 0;
		}
		if ((arg2 & 0x200) != 0) {
			arg1.anInt3157 = Static31.aClass3_Sub2_Sub1_3.method306();
			arg1.anInt3159 = Static31.aClass3_Sub2_Sub1_3.method306();
			arg1.anInt3182 = Static31.aClass3_Sub2_Sub1_3.method283();
			arg1.anInt3180 = Static31.aClass3_Sub2_Sub1_3.method283();
			arg1.anInt3142 = Static31.aClass3_Sub2_Sub1_3.method299() + Static98.anInt2566;
			arg1.anInt3195 = Static31.aClass3_Sub2_Sub1_3.method312() + Static98.anInt2566;
			arg1.anInt3179 = Static31.aClass3_Sub2_Sub1_3.method306();
			arg1.anInt3146 = 1;
			arg1.anInt3191 = 0;
		}
		if ((arg2 & 0x1) != 0) {
			local9 = Static31.aClass3_Sub2_Sub1_3.method312();
			local13 = Static31.aClass3_Sub2_Sub1_3.method294();
			@Pc(185) int local185 = Static31.aClass3_Sub2_Sub1_3.method270();
			@Pc(188) int local188 = Static31.aClass3_Sub2_Sub1_3.anInt413;
			if (arg1.aClass56_764 != null && arg1.aClass42_1 != null) {
				@Pc(196) boolean local196 = false;
				@Pc(201) long local201 = arg1.aClass56_764.method1445();
				if (local13 <= 1) {
					for (@Pc(206) int local206 = 0; local206 < Static63.anInt1820; local206++) {
						if (local201 == Static84.aLongArray24[local206]) {
							local196 = true;
							break;
						}
					}
				}
				if (!local196 && Static4.anInt59 == 0) {
					Static54.aClass3_Sub2_3.anInt413 = 0;
					Static31.aClass3_Sub2_Sub1_3.method279(local185, Static54.aClass3_Sub2_3.aByteArray7);
					Static54.aClass3_Sub2_3.anInt413 = 0;
					@Pc(248) Class56 local248 = Static60.method1187(Static54.aClass3_Sub2_3).method1419();
					arg1.aClass56_1729 = local248.method1425();
					arg1.anInt3155 = local9 >> 8;
					arg1.anInt3177 = local9 & 0xFF;
					arg1.anInt3150 = 150;
					if (local13 == 2 || local13 == 3) {
						Static75.method1348(1, local248, Static84.method1524(new Class56[] { Static44.aClass56_694, arg1.aClass56_764 }));
					} else if (local13 == 1) {
						Static75.method1348(1, local248, Static84.method1524(new Class56[] { Static41.aClass56_654, arg1.aClass56_764 }));
					} else {
						Static75.method1348(2, local248, arg1.aClass56_764);
					}
				}
			}
			Static31.aClass3_Sub2_Sub1_3.anInt413 = local188 + local185;
		}
		if ((arg2 & 0x4) != 0) {
			arg1.anInt3192 = Static31.aClass3_Sub2_Sub1_3.method276();
			arg1.anInt3165 = Static31.aClass3_Sub2_Sub1_3.method284();
		}
		if ((arg2 & 0x80) != 0) {
			local9 = Static31.aClass3_Sub2_Sub1_3.method270();
			local13 = Static31.aClass3_Sub2_Sub1_3.method283();
			arg1.method2035(local9, Static98.anInt2566, local13);
			arg1.anInt3167 = Static98.anInt2566 + 300;
			arg1.anInt3169 = Static31.aClass3_Sub2_Sub1_3.method294();
			arg1.anInt3148 = Static31.aClass3_Sub2_Sub1_3.method270();
		}
		if ((arg2 & 0x2) != 0) {
			arg1.anInt3197 = Static31.aClass3_Sub2_Sub1_3.method276();
			if (arg1.anInt3197 == 65535) {
				arg1.anInt3197 = -1;
			}
		}
		if ((arg2 & 0x400) != 0) {
			arg1.anInt3198 = Static31.aClass3_Sub2_Sub1_3.method299();
			local9 = Static31.aClass3_Sub2_Sub1_3.method278();
			if (arg1.anInt3198 == 65535) {
				arg1.anInt3198 = -1;
			}
			arg1.anInt3163 = 0;
			arg1.anInt3151 = (local9 & 0xFFFF) + Static98.anInt2566;
			if (arg1.anInt3151 > Static98.anInt2566) {
				arg1.anInt3163 = -1;
			}
			arg1.anInt3189 = 0;
			arg1.anInt3178 = local9 >> 16;
		}
		if ((arg2 & 0x20) == 0) {
			return;
		}
		local9 = Static31.aClass3_Sub2_Sub1_3.method306();
		@Pc(456) byte[] local456 = new byte[local9];
		@Pc(461) Class3_Sub2 local461 = new Class3_Sub2(local456);
		Static31.aClass3_Sub2_Sub1_3.method288(local9, local456);
		Static94.aClass3_Sub2Array1[arg0] = local461;
		arg1.method877(local461);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public static void method1931() {
		aClass56_1626 = null;
		aClass56_1625 = null;
		aClass56Array19 = null;
		anIntArray309 = null;
		aClass56Array20 = null;
		aClass10_1 = null;
		aClass56_1627 = null;
	}
}
