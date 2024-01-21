import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Lclient!s;")
	public static final Class87 aClass87_24 = new Class87();

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1063 = Static81.method1507("(Y");

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1064 = Static81.method1507("(U1");

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
	public static int anInt3678 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
	public static void method2813(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		Static52.anInt1338 = arg1;
		Static13.anInt308 = 0;
		Static63.anInt1608 = 0;
		Static63.anInt1595 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)I")
	public static int method2814() {
		return Static129.anInt2833;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!ld;)V")
	public static void method2819(@OriginalArg(1) Class5_Sub2 arg0) {
		arg0.anInt2504 = arg0.anInt2449;
		if (arg0.anInt2447 == 0) {
			arg0.anInt2502 = 0;
			return;
		}
		if (arg0.anInt2485 != -1 && arg0.anInt2472 == 0) {
			@Pc(32) Class1_Sub2_Sub22 local32 = Static85.method2622(arg0.anInt2485);
			if (arg0.anInt2456 > 0 && local32.anInt4003 == 0) {
				arg0.anInt2502++;
				return;
			}
			if (arg0.anInt2456 <= 0 && local32.anInt4008 == 0) {
				arg0.anInt2502++;
				return;
			}
		}
		@Pc(69) int local69 = arg0.anInt2501;
		@Pc(72) int local72 = arg0.anInt2448;
		@Pc(87) int local87 = arg0.anInt2480 * 64 + arg0.anIntArray199[arg0.anInt2447 - 1] * 128;
		@Pc(102) int local102 = arg0.anIntArray196[arg0.anInt2447 - 1] * 128 + arg0.anInt2480 * 64;
		if (local87 - local69 > 256 || local87 - local69 < -256 || local102 - local72 > 256 || local102 - local72 < -256) {
			arg0.anInt2448 = local102;
			arg0.anInt2501 = local87;
			return;
		}
		@Pc(136) int local136 = arg0.anInt2484;
		if (local69 < local87) {
			if (local72 < local102) {
				arg0.anInt2463 = 1280;
			} else if (local102 < local72) {
				arg0.anInt2463 = 1792;
			} else {
				arg0.anInt2463 = 1536;
			}
		} else if (local87 < local69) {
			if (local102 > local72) {
				arg0.anInt2463 = 768;
			} else if (local72 > local102) {
				arg0.anInt2463 = 256;
			} else {
				arg0.anInt2463 = 512;
			}
		} else if (local72 < local102) {
			arg0.anInt2463 = 1024;
		} else if (local72 > local102) {
			arg0.anInt2463 = 0;
		}
		@Pc(219) int local219 = arg0.anInt2463 - arg0.anInt2474 & 0x7FF;
		@Pc(221) int local221 = 4;
		if (local219 > 1024) {
			local219 -= 2048;
		}
		@Pc(227) boolean local227 = true;
		if (local219 >= -256 && local219 <= 256) {
			local136 = arg0.anInt2450;
		} else if (local219 >= 256 && local219 < 768) {
			local136 = arg0.anInt2492;
		} else if (local219 >= -768 && local219 <= -256) {
			local136 = arg0.anInt2494;
		}
		if (local136 == -1) {
			local136 = arg0.anInt2450;
		}
		arg0.anInt2504 = local136;
		if (arg0 instanceof Class5_Sub2_Sub2) {
			local227 = ((Class5_Sub2_Sub2) arg0).aClass1_Sub2_Sub21_1.aBoolean181;
		}
		if (local227) {
			if (arg0.anInt2463 != arg0.anInt2474 && arg0.anInt2500 == -1 && arg0.anInt2454 != 0) {
				local221 = 2;
			}
			if (arg0.anInt2447 > 2) {
				local221 = 6;
			}
			if (arg0.anInt2447 > 3) {
				local221 = 8;
			}
			if (arg0.anInt2502 > 0 && arg0.anInt2447 > 1) {
				arg0.anInt2502--;
				local221 = 8;
			}
		} else {
			if (arg0.anInt2447 > 1) {
				local221 = 6;
			}
			if (arg0.anInt2447 > 2) {
				local221 = 8;
			}
			if (arg0.anInt2502 > 0 && arg0.anInt2447 > 1) {
				local221 = 8;
				arg0.anInt2502--;
			}
		}
		if (arg0.aBooleanArray10[arg0.anInt2447 - 1]) {
			local221 <<= 0x1;
		}
		if (local72 < local102) {
			arg0.anInt2448 += local221;
			if (arg0.anInt2448 > local102) {
				arg0.anInt2448 = local102;
			}
		} else if (local102 < local72) {
			arg0.anInt2448 -= local221;
			if (arg0.anInt2448 < local102) {
				arg0.anInt2448 = local102;
			}
		}
		if (local87 > local69) {
			arg0.anInt2501 += local221;
			if (arg0.anInt2501 > local87) {
				arg0.anInt2501 = local87;
			}
		} else if (local69 > local87) {
			arg0.anInt2501 -= local221;
			if (local87 > arg0.anInt2501) {
				arg0.anInt2501 = local87;
			}
		}
		if (local87 == arg0.anInt2501 && arg0.anInt2448 == local102) {
			if (arg0.anInt2456 > 0) {
				arg0.anInt2456--;
			}
			arg0.anInt2447--;
		}
		if (local221 >= 8 && arg0.anInt2504 == arg0.anInt2450 && arg0.anInt2498 != -1) {
			arg0.anInt2504 = arg0.anInt2498;
		}
	}
}
