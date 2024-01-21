import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!de", name = "ib", descriptor = "[I")
	public static int[] anIntArray62;

	@OriginalMember(owner = "client!de", name = "mb", descriptor = "Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1 aClass1_Sub1_Sub8_Sub1_1;

	@OriginalMember(owner = "client!de", name = "vb", descriptor = "Lclient!m;")
	public static Class1_Sub1_Sub8_Sub2_Sub1 aClass1_Sub1_Sub8_Sub2_Sub1_11;

	@OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
	public static int anInt975 = 0;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "(I)V")
	public static void method644() {
		aClass1_Sub1_Sub8_Sub2_Sub1_11 = null;
		aClass1_Sub1_Sub8_Sub1_1 = null;
		anIntArray62 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!c;)V")
	public static void method645(@OriginalArg(1) Class1_Sub1_Sub5_Sub1 arg0) {
		arg0.anInt3562 = arg0.anInt3607;
		if (arg0.anInt3561 == 0) {
			arg0.anInt3578 = 0;
			return;
		}
		if (arg0.anInt3568 != -1 && arg0.anInt3597 == 0) {
			@Pc(31) Class1_Sub1_Sub12 local31 = Static121.method2378(arg0.anInt3568);
			if (arg0.anInt3556 > 0 && local31.anInt3455 == 0) {
				arg0.anInt3578++;
				return;
			}
			if (arg0.anInt3556 <= 0 && local31.anInt3447 == 0) {
				arg0.anInt3578++;
				return;
			}
		}
		@Pc(63) int local63 = arg0.anInt3579;
		@Pc(78) int local78 = arg0.anIntArray314[arg0.anInt3561 - 1] * 128 + arg0.anInt3591 * 64;
		@Pc(81) int local81 = arg0.anInt3558;
		@Pc(96) int local96 = arg0.anInt3591 * 64 + arg0.anIntArray315[arg0.anInt3561 - 1] * 128;
		if (local78 - local63 > 256 || local78 - local63 < -256 || local96 - local81 > 256 || local96 - local81 < -256) {
			arg0.anInt3558 = local96;
			arg0.anInt3579 = local78;
			return;
		}
		if (local63 < local78) {
			if (local96 > local81) {
				arg0.anInt3590 = 1280;
			} else if (local81 > local96) {
				arg0.anInt3590 = 1792;
			} else {
				arg0.anInt3590 = 1536;
			}
		} else if (local78 < local63) {
			if (local96 > local81) {
				arg0.anInt3590 = 768;
			} else if (local96 < local81) {
				arg0.anInt3590 = 256;
			} else {
				arg0.anInt3590 = 512;
			}
		} else if (local81 < local96) {
			arg0.anInt3590 = 1024;
		} else if (local96 < local81) {
			arg0.anInt3590 = 0;
		}
		@Pc(211) int local211 = arg0.anInt3573;
		@Pc(213) int local213 = 4;
		@Pc(221) int local221 = arg0.anInt3590 - arg0.anInt3576 & 0x7FF;
		if (local221 > 1024) {
			local221 -= 2048;
		}
		@Pc(227) boolean local227 = true;
		if (local221 >= -256 && local221 <= 256) {
			local211 = arg0.anInt3570;
		} else if (local221 >= 256 && local221 < 768) {
			local211 = arg0.anInt3587;
		} else if (local221 >= -768 && local221 <= -256) {
			local211 = arg0.anInt3585;
		}
		if (local211 == -1) {
			local211 = arg0.anInt3570;
		}
		arg0.anInt3562 = local211;
		if (arg0 instanceof Class1_Sub1_Sub5_Sub1_Sub1) {
			local227 = ((Class1_Sub1_Sub5_Sub1_Sub1) arg0).aClass1_Sub1_Sub15_1.aBoolean165;
		}
		if (local227) {
			if (arg0.anInt3576 != arg0.anInt3590 && arg0.anInt3566 == -1 && arg0.anInt3581 != 0) {
				local213 = 2;
			}
			if (arg0.anInt3561 > 2) {
				local213 = 6;
			}
			if (arg0.anInt3561 > 3) {
				local213 = 8;
			}
			if (arg0.anInt3578 > 0 && arg0.anInt3561 > 1) {
				arg0.anInt3578--;
				local213 = 8;
			}
		} else {
			if (arg0.anInt3561 > 1) {
				local213 = 6;
			}
			if (arg0.anInt3561 > 2) {
				local213 = 8;
			}
			if (arg0.anInt3578 > 0 && arg0.anInt3561 > 1) {
				local213 = 8;
				arg0.anInt3578--;
			}
		}
		if (arg0.aBooleanArray13[arg0.anInt3561 - 1]) {
			local213 <<= 0x1;
		}
		if (local63 < local78) {
			arg0.anInt3579 += local213;
			if (arg0.anInt3579 > local78) {
				arg0.anInt3579 = local78;
			}
		} else if (local78 < local63) {
			arg0.anInt3579 -= local213;
			if (arg0.anInt3579 < local78) {
				arg0.anInt3579 = local78;
			}
		}
		if (local96 > local81) {
			arg0.anInt3558 += local213;
			if (arg0.anInt3558 > local96) {
				arg0.anInt3558 = local96;
			}
		} else if (local96 < local81) {
			arg0.anInt3558 -= local213;
			if (local96 > arg0.anInt3558) {
				arg0.anInt3558 = local96;
			}
		}
		if (arg0.anInt3579 == local78 && arg0.anInt3558 == local96) {
			if (arg0.anInt3556 > 0) {
				arg0.anInt3556--;
			}
			arg0.anInt3561--;
		}
		if (local213 >= 8 && arg0.anInt3562 == arg0.anInt3570 && arg0.anInt3605 != -1) {
			arg0.anInt3562 = arg0.anInt3605;
		}
	}
}
