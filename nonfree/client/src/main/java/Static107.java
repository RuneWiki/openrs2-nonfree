import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Lclient!ke;")
	public static Class52 aClass52_35;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1577 = Static193.method3027("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1578 = Static193.method3027("weiss:");

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1579 = aClass70_1577;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BIII)I")
	public static int method2399(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local3 < 0 || local11 < 0 || local3 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(28) int local28 = arg2;
		@Pc(32) int local32 = arg1 & 0x7F;
		if (arg2 < 3 && (Static17.aByteArrayArrayArray2[1][local3][local11] & 0x2) == 2) {
			local28 = arg2 + 1;
		}
		@Pc(55) int local55 = arg0 & 0x7F;
		@Pc(95) int local95 = Static23.anIntArrayArrayArray4[local28][local3 + 1][local11 + 1] * local32 + (128 - local32) * Static23.anIntArrayArrayArray4[local28][local3][local11 - -1] >> 7;
		@Pc(121) int local121 = Static23.anIntArrayArrayArray4[local28][local3][local11] * (128 - local32) + Static23.anIntArrayArrayArray4[local28][local3 + 1][local11] * local32 >> 7;
		return local121 * (128 - local55) + local95 * local55 >> 7;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ke;ILclient!ke;II)Lclient!v;")
	public static Class3_Sub3_Sub2_Sub4_Sub1 method2401(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class52 arg2, @OriginalArg(4) int arg3) {
		return Static141.method2009(arg2, arg3, arg1) ? Static187.method2951(arg0.method1581(arg1, arg3)) : null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILclient!b;)V")
	public static void method2402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2) {
		if (Static154.aClass6_83 != null || Static134.aBoolean131 || (arg2 == null || Static83.method1196(arg2) == null)) {
			return;
		}
		Static154.aClass6_83 = arg2;
		Static87.aClass6_119 = Static83.method1196(arg2);
		Static208.anInt2643 = arg1;
		Static97.aBoolean104 = false;
		Static23.anInt464 = 0;
		Static108.anInt2196 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lclient!oc;")
	public static Class70 method2404(@OriginalArg(1) int arg0) {
		return Static144.method2089(false, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!we;B)V")
	public static void method2407(@OriginalArg(0) Class26_Sub2 arg0) {
		arg0.anInt2596 = arg0.anInt2594;
		if (arg0.anInt2635 == 0) {
			arg0.anInt2586 = 0;
			return;
		}
		if (arg0.anInt2599 != -1 && arg0.anInt2610 == 0) {
			@Pc(35) Class3_Sub3_Sub17 local35 = Static11.method254(arg0.anInt2599);
			if (arg0.anInt2642 > 0 && local35.anInt2739 == 0) {
				arg0.anInt2586++;
				return;
			}
			if (arg0.anInt2642 <= 0 && local35.anInt2741 == 0) {
				arg0.anInt2586++;
				return;
			}
		}
		@Pc(70) int local70 = arg0.anInt2593;
		@Pc(73) int local73 = arg0.anInt2611;
		@Pc(88) int local88 = arg0.anIntArray182[arg0.anInt2635 - 1] * 128 + arg0.anInt2604 * 64;
		@Pc(103) int local103 = arg0.anIntArray185[arg0.anInt2635 - 1] * 128 + arg0.anInt2604 * 64;
		if (local88 - local70 > 256 || local88 - local70 < -256 || local103 - local73 > 256 || local103 - local73 < -256) {
			arg0.anInt2611 = local103;
			arg0.anInt2593 = local88;
			return;
		}
		if (local70 < local88) {
			if (local73 < local103) {
				arg0.anInt2644 = 1280;
			} else if (local103 < local73) {
				arg0.anInt2644 = 1792;
			} else {
				arg0.anInt2644 = 1536;
			}
		} else if (local70 > local88) {
			if (local103 > local73) {
				arg0.anInt2644 = 768;
			} else if (local103 >= local73) {
				arg0.anInt2644 = 512;
			} else {
				arg0.anInt2644 = 256;
			}
		} else if (local103 > local73) {
			arg0.anInt2644 = 1024;
		} else if (local73 > local103) {
			arg0.anInt2644 = 0;
		}
		@Pc(220) int local220 = arg0.anInt2644 - arg0.anInt2605 & 0x7FF;
		if (local220 > 1024) {
			local220 -= 2048;
		}
		@Pc(227) int local227 = arg0.anInt2625;
		@Pc(229) int local229 = 4;
		if (local220 >= -256 && local220 <= 256) {
			local227 = arg0.anInt2603;
		} else if (local220 >= 256 && local220 < 768) {
			local227 = arg0.anInt2590;
		} else if (local220 >= -768 && local220 <= -256) {
			local227 = arg0.anInt2617;
		}
		@Pc(264) boolean local264 = true;
		if (local227 == -1) {
			local227 = arg0.anInt2603;
		}
		arg0.anInt2596 = local227;
		if (arg0 instanceof Class26_Sub2_Sub2) {
			local264 = ((Class26_Sub2_Sub2) arg0).aClass3_Sub3_Sub24_1.aBoolean179;
		}
		if (local264) {
			if (arg0.anInt2605 != arg0.anInt2644 && arg0.anInt2620 == -1 && arg0.anInt2616 != 0) {
				local229 = 2;
			}
			if (arg0.anInt2635 > 2) {
				local229 = 6;
			}
			if (arg0.anInt2635 > 3) {
				local229 = 8;
			}
			if (arg0.anInt2586 > 0 && arg0.anInt2635 > 1) {
				local229 = 8;
				arg0.anInt2586--;
			}
		} else {
			if (arg0.anInt2635 > 1) {
				local229 = 6;
			}
			if (arg0.anInt2635 > 2) {
				local229 = 8;
			}
			if (arg0.anInt2586 > 0 && arg0.anInt2635 > 1) {
				local229 = 8;
				arg0.anInt2586--;
			}
		}
		if (arg0.aBooleanArray12[arg0.anInt2635 - 1]) {
			local229 <<= 0x1;
		}
		if (local229 >= 8 && arg0.anInt2596 == arg0.anInt2603 && arg0.anInt2628 != -1) {
			arg0.anInt2596 = arg0.anInt2628;
		}
		if (local103 > local73) {
			arg0.anInt2611 += local229;
			if (arg0.anInt2611 > local103) {
				arg0.anInt2611 = local103;
			}
		} else if (local103 < local73) {
			arg0.anInt2611 -= local229;
			if (local103 > arg0.anInt2611) {
				arg0.anInt2611 = local103;
			}
		}
		if (local88 > local70) {
			arg0.anInt2593 += local229;
			if (arg0.anInt2593 > local88) {
				arg0.anInt2593 = local88;
			}
		} else if (local88 < local70) {
			arg0.anInt2593 -= local229;
			if (local88 > arg0.anInt2593) {
				arg0.anInt2593 = local88;
			}
		}
		if (local88 == arg0.anInt2593 && arg0.anInt2611 == local103) {
			if (arg0.anInt2642 > 0) {
				arg0.anInt2642--;
			}
			arg0.anInt2635--;
		}
	}
}
