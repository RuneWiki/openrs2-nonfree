import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "Lclient!he;")
	public static Class34 aClass34_6;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "I")
	public static int anInt2921;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "I")
	public static int anInt2922 = 0;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1267 = Static51.method932("Standort");

	@OriginalMember(owner = "client!j", name = "f", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1268 = Static51.method932("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!j", name = "o", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1269 = Static51.method932("Lade Texturen )2 ");

	@OriginalMember(owner = "client!j", name = "p", descriptor = "I")
	public static int anInt2929 = 0;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1270 = Static51.method932("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public static void method2104() {
		aClass10_1268 = null;
		aClass10_1269 = null;
		aClass34_6 = null;
		aClass10_1270 = null;
		aClass10_1267 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BLclient!bb;)V")
	public static void method2108(@OriginalArg(1) Class2_Sub1_Sub3_Sub2 arg0) {
		arg0.anInt3479 = arg0.anInt3487;
		if (arg0.anInt3476 == 0) {
			arg0.anInt3506 = 0;
			return;
		}
		if (arg0.anInt3509 != -1 && arg0.anInt3481 == 0) {
			@Pc(34) Class2_Sub1_Sub9 local34 = Static19.method325(arg0.anInt3509);
			if (arg0.anInt3469 > 0 && local34.anInt1933 == 0) {
				arg0.anInt3506++;
				return;
			}
			if (arg0.anInt3469 <= 0 && local34.anInt1924 == 0) {
				arg0.anInt3506++;
				return;
			}
		}
		@Pc(69) int local69 = arg0.anInt3454;
		@Pc(72) int local72 = arg0.anInt3499;
		@Pc(87) int local87 = arg0.anIntArray365[arg0.anInt3476 - 1] * 128 + arg0.anInt3467 * 64;
		@Pc(102) int local102 = arg0.anInt3467 * 64 + arg0.anIntArray366[arg0.anInt3476 - 1] * 128;
		if (local87 - local69 > 256 || local87 - local69 < -256 || local102 - local72 > 256 || local102 - local72 < -256) {
			arg0.anInt3499 = local102;
			arg0.anInt3454 = local87;
			return;
		}
		@Pc(139) int local139 = 4;
		if (local69 >= local87) {
			if (local69 > local87) {
				if (local102 > local72) {
					arg0.anInt3465 = 768;
				} else if (local102 < local72) {
					arg0.anInt3465 = 256;
				} else {
					arg0.anInt3465 = 512;
				}
			} else if (local72 < local102) {
				arg0.anInt3465 = 1024;
			} else if (local102 < local72) {
				arg0.anInt3465 = 0;
			}
		} else if (local102 > local72) {
			arg0.anInt3465 = 1280;
		} else if (local72 > local102) {
			arg0.anInt3465 = 1792;
		} else {
			arg0.anInt3465 = 1536;
		}
		@Pc(222) int local222 = arg0.anInt3465 - arg0.anInt3489 & 0x7FF;
		@Pc(225) int local225 = arg0.anInt3455;
		@Pc(227) boolean local227 = true;
		if (local222 > 1024) {
			local222 -= 2048;
		}
		if (local222 >= -256 && local222 <= 256) {
			local225 = arg0.anInt3493;
		} else if (local222 >= 256 && local222 < 768) {
			local225 = arg0.anInt3466;
		} else if (local222 >= -768 && local222 <= -256) {
			local225 = arg0.anInt3482;
		}
		if (local225 == -1) {
			local225 = arg0.anInt3493;
		}
		arg0.anInt3479 = local225;
		if (arg0 instanceof Class2_Sub1_Sub3_Sub2_Sub2) {
			local227 = ((Class2_Sub1_Sub3_Sub2_Sub2) arg0).aClass2_Sub1_Sub2_1.aBoolean5;
		}
		if (local227) {
			if (arg0.anInt3489 != arg0.anInt3465 && arg0.anInt3457 == -1 && arg0.anInt3496 != 0) {
				local139 = 2;
			}
			if (arg0.anInt3476 > 2) {
				local139 = 6;
			}
			if (arg0.anInt3476 > 3) {
				local139 = 8;
			}
			if (arg0.anInt3506 > 0 && arg0.anInt3476 > 1) {
				local139 = 8;
				arg0.anInt3506--;
			}
		} else {
			if (arg0.anInt3476 > 1) {
				local139 = 6;
			}
			if (arg0.anInt3476 > 2) {
				local139 = 8;
			}
			if (arg0.anInt3506 > 0 && arg0.anInt3476 > 1) {
				local139 = 8;
				arg0.anInt3506--;
			}
		}
		if (arg0.aBooleanArray16[arg0.anInt3476 - 1]) {
			local139 <<= 0x1;
		}
		if (local87 > local69) {
			arg0.anInt3454 += local139;
			if (arg0.anInt3454 > local87) {
				arg0.anInt3454 = local87;
			}
		} else if (local87 < local69) {
			arg0.anInt3454 -= local139;
			if (arg0.anInt3454 < local87) {
				arg0.anInt3454 = local87;
			}
		}
		if (local102 > local72) {
			arg0.anInt3499 += local139;
			if (local102 < arg0.anInt3499) {
				arg0.anInt3499 = local102;
			}
		} else if (local102 < local72) {
			arg0.anInt3499 -= local139;
			if (local102 > arg0.anInt3499) {
				arg0.anInt3499 = local102;
			}
		}
		if (arg0.anInt3454 == local87 && arg0.anInt3499 == local102) {
			if (arg0.anInt3469 > 0) {
				arg0.anInt3469--;
			}
			arg0.anInt3476--;
		}
		if (local139 >= 8 && arg0.anInt3479 == arg0.anInt3493 && arg0.anInt3494 != -1) {
			arg0.anInt3479 = arg0.anInt3494;
		}
	}
}
