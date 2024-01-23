import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "U", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!a", name = "eb", descriptor = "[[I")
	public static int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!a", name = "kb", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_4;

	@OriginalMember(owner = "client!a", name = "db", descriptor = "Lclient!sc;")
	public static Class107 aClass107_20 = Static231.method3737("mapdots");

	@OriginalMember(owner = "client!a", name = "gb", descriptor = "I")
	public static int anInt69 = 0;

	@OriginalMember(owner = "client!a", name = "mb", descriptor = "I")
	public static int anInt74 = 0;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZLclient!o;BI)V")
	public static void method51(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg2.anInt3280;
		if (arg2.aByte13 == 0) {
			arg2.anInt3280 = arg2.anInt3288;
		} else if (arg2.aByte13 == 1) {
			arg2.anInt3280 = arg0 - arg2.anInt3288;
		} else if (arg2.aByte13 == 2) {
			arg2.anInt3280 = arg2.anInt3288 * arg0 >> 14;
		} else if (arg2.aByte13 == 3) {
			if (arg2.anInt3286 == 2) {
				arg2.anInt3280 = arg2.anInt3288 * 32 + (arg2.anInt3288 - 1) * arg2.anInt3247;
			} else if (arg2.anInt3286 == 7) {
				arg2.anInt3280 = arg2.anInt3288 * 115 + arg2.anInt3247 * (arg2.anInt3288 - 1);
			}
		}
		@Pc(104) int local104 = arg2.anInt3270;
		if (arg2.aByte14 == 0) {
			arg2.anInt3270 = arg2.anInt3244;
		} else if (arg2.aByte14 == 1) {
			arg2.anInt3270 = arg3 - arg2.anInt3244;
		} else if (arg2.aByte14 == 2) {
			arg2.anInt3270 = arg2.anInt3244 * arg3 >> 14;
		} else if (arg2.aByte14 == 3) {
			if (arg2.anInt3286 == 2) {
				arg2.anInt3270 = (arg2.anInt3244 - 1) * arg2.anInt3238 + arg2.anInt3244 * 32;
			} else if (arg2.anInt3286 == 7) {
				arg2.anInt3270 = arg2.anInt3244 * 12 + arg2.anInt3238 * (arg2.anInt3244 - 1);
			}
		}
		if (arg2.aByte13 == 4) {
			arg2.anInt3280 = arg2.anInt3270 * arg2.anInt3281 / arg2.anInt3213;
		}
		if (arg2.aByte14 == 4) {
			arg2.anInt3270 = arg2.anInt3280 * arg2.anInt3213 / arg2.anInt3281;
		}
		if (Static219.aBoolean426 && (Static34.method676(arg2) != 0 || arg2.anInt3286 == 0)) {
			if (arg2.anInt3270 < 5 && arg2.anInt3280 < 5) {
				arg2.anInt3270 = 5;
				arg2.anInt3280 = 5;
			} else {
				if (arg2.anInt3270 <= 0) {
					arg2.anInt3270 = 5;
				}
				if (arg2.anInt3280 <= 0) {
					arg2.anInt3280 = 5;
				}
			}
		}
		if (arg2.anInt3285 == 1337) {
			Static158.aClass86_11 = arg2;
		}
		if (arg1 && arg2.anObjectArray27 != null && (local8 != arg2.anInt3280 || arg2.anInt3270 != local104)) {
			@Pc(290) Class1_Sub22 local290 = new Class1_Sub22();
			local290.aClass86_10 = arg2;
			local290.anObjectArray33 = arg2.anObjectArray27;
			Static146.aClass120_17.method3567(local290);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!vf;I)Lclient!ik;")
	public static Class3_Sub2 method53(@OriginalArg(0) Class1_Sub26 arg0) {
		return new Class3_Sub2(arg0.method2944(), arg0.method2944(), arg0.method2944(), arg0.method2944(), arg0.method2937(), arg0.method2937(), arg0.method2945());
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(III)V")
	public static void method54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static203.anIntArray12[arg1] = arg0;
		@Pc(18) Class1_Sub12 local18 = (Class1_Sub12) Static158.aClass50_19.method1364((long) arg1);
		if (local18 == null) {
			local18 = new Class1_Sub12(4611686018427387905L);
			Static158.aClass50_19.method1362((long) arg1, local18);
		} else if (local18.aLong53 != 4611686018427387905L) {
			local18.aLong53 = Static209.method3309() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(IB)I")
	public static int method55(@OriginalArg(0) int arg0) {
		if (Static141.anInt3124 == 1) {
			return 7;
		} else if (Static141.anInt3124 == 2) {
			return 20;
		} else if (arg0 == 15) {
			return 13;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 22) {
			return 8;
		} else if (arg0 == 31) {
			return 14;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 43) {
			return 15;
		} else if (arg0 == 48) {
			return 17;
		} else if (arg0 == 58) {
			return 11;
		} else if (arg0 == 69) {
			return 6;
		} else if (arg0 == 74) {
			return 20;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 101) {
			return 12;
		} else if (arg0 == 103) {
			return 19;
		} else if (arg0 == 152) {
			return 16;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 162) {
			return 9;
		} else if (arg0 == 166) {
			return 10;
		} else if (arg0 == 179) {
			return 18;
		} else if (arg0 == 191) {
			return 5;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V")
	public static void method56() {
		Static117.method2015();
		Static197.method3178();
		Static231.method3738();
		Static35.method694();
		Static141.method2353();
		Static231.method3740();
		Static227.method3693();
		Static124.method2093();
		Static86.method1493();
		Static40.method771();
		Static24.method424();
		Static121.method2074();
		Static188.method3056();
		Static64.method1205();
		Static179.aClass61_69.method1695(5);
	}

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(I)V")
	public static void method58() {
		@Pc(6) int local6 = Static194.aClass1_Sub26_Sub1_3.method3007(8);
		@Pc(15) int local15;
		if (local6 < Static10.anInt285) {
			for (local15 = local6; local15 < Static10.anInt285; local15++) {
				Static179.anIntArray340[Static8.anInt258++] = Static16.anIntArray38[local15];
			}
		}
		if (local6 > Static10.anInt285) {
			throw new RuntimeException("gppov1");
		}
		Static10.anInt285 = 0;
		for (local15 = 0; local15 < local6; local15++) {
			@Pc(53) int local53 = Static16.anIntArray38[local15];
			@Pc(57) Class5_Sub5_Sub1 local57 = Static198.aClass5_Sub5_Sub1Array1[local53];
			@Pc(62) int local62 = Static194.aClass1_Sub26_Sub1_3.method3007(1);
			if (local62 == 0) {
				Static16.anIntArray38[Static10.anInt285++] = local53;
				local57.anInt3009 = Static128.anInt2802;
			} else {
				@Pc(85) int local85 = Static194.aClass1_Sub26_Sub1_3.method3007(2);
				if (local85 == 0) {
					Static16.anIntArray38[Static10.anInt285++] = local53;
					local57.anInt3009 = Static128.anInt2802;
					Static12.anIntArray35[Static189.anInt4167++] = local53;
				} else {
					@Pc(132) int local132;
					@Pc(142) int local142;
					if (local85 == 1) {
						Static16.anIntArray38[Static10.anInt285++] = local53;
						local57.anInt3009 = Static128.anInt2802;
						local132 = Static194.aClass1_Sub26_Sub1_3.method3007(3);
						local57.method2306(false, local132);
						local142 = Static194.aClass1_Sub26_Sub1_3.method3007(1);
						if (local142 == 1) {
							Static12.anIntArray35[Static189.anInt4167++] = local53;
						}
					} else if (local85 == 2) {
						Static16.anIntArray38[Static10.anInt285++] = local53;
						local57.anInt3009 = Static128.anInt2802;
						local132 = Static194.aClass1_Sub26_Sub1_3.method3007(3);
						local57.method2306(true, local132);
						local142 = Static194.aClass1_Sub26_Sub1_3.method3007(3);
						local57.method2306(true, local142);
						@Pc(198) int local198 = Static194.aClass1_Sub26_Sub1_3.method3007(1);
						if (local198 == 1) {
							Static12.anIntArray35[Static189.anInt4167++] = local53;
						}
					} else if (local85 == 3) {
						Static179.anIntArray340[Static8.anInt258++] = local53;
					}
				}
			}
		}
	}
}
