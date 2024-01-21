import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "Lclient!lf;")
	public static Class49 aClass49_14 = Static32.method683(":duelstake:");

	@OriginalMember(owner = "client!ab", name = "G", descriptor = "Lclient!lf;")
	public static Class49 aClass49_15 = Static32.method683(": ");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method20() {
		Static170.aClass74_91.method2347();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
	public static int method21(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0xB3333333) + (local13 & 0x33333333);
		@Pc(31) int local31 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(42) int local42 = local31 + (local31 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)V")
	public static void method22() {
		for (@Pc(18) Class2_Sub11 local18 = (Class2_Sub11) Static43.aClass81_3.method2682(); local18 != null; local18 = (Class2_Sub11) Static43.aClass81_3.method2686()) {
			if (local18.anInt1549 == -1) {
				local18.anInt1553 = 0;
				Static148.method2439(local18);
			} else {
				local18.method3007();
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!uc;B)V")
	public static void method23(@OriginalArg(0) Class2_Sub2_Sub3_Sub7 arg0) {
		arg0.anInt3554 = arg0.anInt3525;
		if (arg0.anInt3543 == 0) {
			arg0.anInt3530 = 0;
			return;
		}
		if (arg0.anInt3568 != -1 && arg0.anInt3548 == 0) {
			@Pc(36) Class2_Sub2_Sub4 local36 = Static29.method543(arg0.anInt3568);
			if (arg0.anInt3540 > 0 && local36.anInt401 == 0) {
				arg0.anInt3530++;
				return;
			}
			if (arg0.anInt3540 <= 0 && local36.anInt416 == 0) {
				arg0.anInt3530++;
				return;
			}
		}
		@Pc(74) int local74 = arg0.anInt3529;
		@Pc(77) int local77 = arg0.anInt3578;
		@Pc(93) int local93 = arg0.anIntArray316[arg0.anInt3543 - 1] * 128 + arg0.anInt3581 * 64;
		@Pc(108) int local108 = arg0.anIntArray318[arg0.anInt3543 - 1] * 128 + arg0.anInt3581 * 64;
		if (local93 - local74 > 256 || local93 - local74 < -256 || local108 - local77 > 256 || local108 - local77 < -256) {
			arg0.anInt3578 = local108;
			arg0.anInt3529 = local93;
			return;
		}
		@Pc(144) int local144 = arg0.anInt3539;
		if (local74 < local93) {
			if (local108 > local77) {
				arg0.anInt3571 = 1280;
			} else if (local108 >= local77) {
				arg0.anInt3571 = 1536;
			} else {
				arg0.anInt3571 = 1792;
			}
		} else if (local93 >= local74) {
			if (local77 < local108) {
				arg0.anInt3571 = 1024;
			} else if (local77 > local108) {
				arg0.anInt3571 = 0;
			}
		} else if (local108 > local77) {
			arg0.anInt3571 = 768;
		} else if (local77 <= local108) {
			arg0.anInt3571 = 512;
		} else {
			arg0.anInt3571 = 256;
		}
		@Pc(239) int local239 = arg0.anInt3571 - arg0.anInt3536 & 0x7FF;
		if (local239 > 1024) {
			local239 -= 2048;
		}
		if (local239 >= -256 && local239 <= 256) {
			local144 = arg0.anInt3585;
		} else if (local239 >= 256 && local239 < 768) {
			local144 = arg0.anInt3573;
		} else if (local239 >= -768 && local239 <= -256) {
			local144 = arg0.anInt3547;
		}
		if (local144 == -1) {
			local144 = arg0.anInt3585;
		}
		arg0.anInt3554 = local144;
		@Pc(300) int local300 = 4;
		@Pc(302) boolean local302 = true;
		if (arg0 instanceof Class2_Sub2_Sub3_Sub7_Sub1) {
			local302 = ((Class2_Sub2_Sub3_Sub7_Sub1) arg0).aClass2_Sub2_Sub15_1.aBoolean136;
		}
		if (local302) {
			if (arg0.anInt3536 != arg0.anInt3571 && arg0.anInt3556 == -1 && arg0.anInt3545 != 0) {
				local300 = 2;
			}
			if (arg0.anInt3543 > 2) {
				local300 = 6;
			}
			if (arg0.anInt3543 > 3) {
				local300 = 8;
			}
			if (arg0.anInt3530 > 0 && arg0.anInt3543 > 1) {
				arg0.anInt3530--;
				local300 = 8;
			}
		} else {
			if (arg0.anInt3543 > 1) {
				local300 = 6;
			}
			if (arg0.anInt3543 > 2) {
				local300 = 8;
			}
			if (arg0.anInt3530 > 0 && arg0.anInt3543 > 1) {
				arg0.anInt3530--;
				local300 = 8;
			}
		}
		if (arg0.aBooleanArray16[arg0.anInt3543 - 1]) {
			local300 <<= 0x1;
		}
		if (local300 >= 8 && arg0.anInt3554 == arg0.anInt3585 && arg0.anInt3560 != -1) {
			arg0.anInt3554 = arg0.anInt3560;
		}
		if (local108 > local77) {
			arg0.anInt3578 += local300;
			if (arg0.anInt3578 > local108) {
				arg0.anInt3578 = local108;
			}
		} else if (local77 > local108) {
			arg0.anInt3578 -= local300;
			if (local108 > arg0.anInt3578) {
				arg0.anInt3578 = local108;
			}
		}
		if (local74 < local93) {
			arg0.anInt3529 += local300;
			if (local93 < arg0.anInt3529) {
				arg0.anInt3529 = local93;
			}
		} else if (local93 < local74) {
			arg0.anInt3529 -= local300;
			if (local93 > arg0.anInt3529) {
				arg0.anInt3529 = local93;
			}
		}
		if (local93 != arg0.anInt3529 || arg0.anInt3578 != local108) {
			return;
		}
		arg0.anInt3543--;
		if (arg0.anInt3540 > 0) {
			arg0.anInt3540--;
			return;
		}
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V")
	public static void method24() {
		aClass49_14 = null;
		aClass49_15 = null;
	}
}
