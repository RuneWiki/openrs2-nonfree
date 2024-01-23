import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Lclient!ch;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "[I")
	public static int[] anIntArray98;

	@OriginalMember(owner = "client!gd", name = "I", descriptor = "Lclient!mb;")
	public static Class70 aClass70_18;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "Lclient!ia;")
	public static Class51 aClass51_472 = Static64.method1101(")3");

	@OriginalMember(owner = "client!gd", name = "F", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIILclient!me;)V")
	public static void method1114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class71 arg3) {
		if (Static141.anInt3047 < 3) {
			((Class1_Sub2_Sub1_Sub1) Static189.aClass1_Sub2_Sub1_5).method2077(arg1, arg0, arg3.anInt2802, arg3.anInt2835, Static189.aClass1_Sub2_Sub1_5.anInt2634 / 2, Static189.aClass1_Sub2_Sub1_5.anInt2641 / 2, Static16.anInt379, arg3.anIntArray186, arg3.anIntArray182);
		} else {
			Static96.method1618(arg1, arg0, arg3.anIntArray186, arg3.anIntArray182);
		}
		Static22.aBooleanArray8[arg2] = true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZILclient!mb;III)V")
	public static void method1115(@OriginalArg(1) int arg0, @OriginalArg(2) Class70 arg1, @OriginalArg(3) int arg2) {
		Static4.anInt78 = 0;
		Static3.aClass70_1 = arg1;
		Static93.anInt2065 = 10000;
		Static124.anInt4550 = arg2;
		Static21.aBoolean23 = false;
		Static191.anInt4125 = arg0;
		Static198.anInt4222 = 1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!ad;)V")
	public static void method1116(@OriginalArg(1) Class5_Sub1 arg0) {
		arg0.anInt3620 = arg0.anInt3618;
		if (arg0.anInt3603 == 0) {
			arg0.anInt3589 = 0;
			return;
		}
		if (arg0.anInt3585 != -1 && arg0.anInt3599 == 0) {
			@Pc(31) Class40 local31 = Static32.method546(arg0.anInt3585);
			if (arg0.anInt3619 > 0 && local31.anInt1254 == 0) {
				arg0.anInt3589++;
				return;
			}
			if (arg0.anInt3619 <= 0 && local31.anInt1258 == 0) {
				arg0.anInt3589++;
				return;
			}
		}
		@Pc(69) int local69 = arg0.anInt3624;
		@Pc(72) int local72 = arg0.anInt3598;
		@Pc(87) int local87 = arg0.anInt3584 * 64 + arg0.anIntArray238[arg0.anInt3603 - 1] * 128;
		@Pc(102) int local102 = arg0.anInt3584 * 64 + arg0.anIntArray233[arg0.anInt3603 - 1] * 128;
		if (local87 - local69 > 256 || local87 - local69 < -256 || local102 - local72 > 256 || local102 - local72 < -256) {
			arg0.anInt3598 = local102;
			arg0.anInt3624 = local87;
			return;
		}
		if (local87 <= local69) {
			if (local87 >= local69) {
				if (local72 < local102) {
					arg0.anInt3581 = 1024;
				} else if (local72 > local102) {
					arg0.anInt3581 = 0;
				}
			} else if (local102 > local72) {
				arg0.anInt3581 = 768;
			} else if (local72 <= local102) {
				arg0.anInt3581 = 512;
			} else {
				arg0.anInt3581 = 256;
			}
		} else if (local102 > local72) {
			arg0.anInt3581 = 1280;
		} else if (local72 <= local102) {
			arg0.anInt3581 = 1536;
		} else {
			arg0.anInt3581 = 1792;
		}
		@Pc(227) int local227 = arg0.anInt3581 - arg0.anInt3575 & 0x7FF;
		if (local227 > 1024) {
			local227 -= 2048;
		}
		@Pc(236) int local236 = arg0.anInt3604;
		@Pc(238) int local238 = 4;
		if (local227 >= -256 && local227 <= 256) {
			local236 = arg0.anInt3600;
		} else if (local227 >= 256 && local227 < 768) {
			local236 = arg0.anInt3623;
		} else if (local227 >= -768 && local227 <= -256) {
			local236 = arg0.anInt3629;
		}
		if (local236 == -1) {
			local236 = arg0.anInt3600;
		}
		arg0.anInt3620 = local236;
		@Pc(285) boolean local285 = true;
		if (arg0 instanceof Class5_Sub1_Sub2) {
			local285 = ((Class5_Sub1_Sub2) arg0).aClass27_1.aBoolean40;
		}
		if (local285) {
			if (arg0.anInt3581 != arg0.anInt3575 && arg0.anInt3621 == -1 && arg0.anInt3601 != 0) {
				local238 = 2;
			}
			if (arg0.anInt3603 > 2) {
				local238 = 6;
			}
			if (arg0.anInt3603 > 3) {
				local238 = 8;
			}
			if (arg0.anInt3589 > 0 && arg0.anInt3603 > 1) {
				arg0.anInt3589--;
				local238 = 8;
			}
		} else {
			if (arg0.anInt3603 > 1) {
				local238 = 6;
			}
			if (arg0.anInt3603 > 2) {
				local238 = 8;
			}
			if (arg0.anInt3589 > 0 && arg0.anInt3603 > 1) {
				local238 = 8;
				arg0.anInt3589--;
			}
		}
		if (arg0.aBooleanArray21[arg0.anInt3603 - 1]) {
			local238 <<= 0x1;
		}
		if (local102 > local72) {
			arg0.anInt3598 += local238;
			if (local102 < arg0.anInt3598) {
				arg0.anInt3598 = local102;
			}
		} else if (local102 < local72) {
			arg0.anInt3598 -= local238;
			if (local102 > arg0.anInt3598) {
				arg0.anInt3598 = local102;
			}
		}
		if (local238 >= 8 && arg0.anInt3620 == arg0.anInt3600 && arg0.anInt3591 != -1) {
			arg0.anInt3620 = arg0.anInt3591;
		}
		if (local69 < local87) {
			arg0.anInt3624 += local238;
			if (local87 < arg0.anInt3624) {
				arg0.anInt3624 = local87;
			}
		} else if (local87 < local69) {
			arg0.anInt3624 -= local238;
			if (arg0.anInt3624 < local87) {
				arg0.anInt3624 = local87;
			}
		}
		if (arg0.anInt3624 == local87 && arg0.anInt3598 == local102) {
			if (arg0.anInt3619 > 0) {
				arg0.anInt3619--;
			}
			arg0.anInt3603--;
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
	public static void method1117() {
		Static127.aClass53_20.method1496(5);
		Static208.aClass53_28.method1496(5);
		Static118.aClass53_19.method1496(5);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!o;I)V")
	public static void method1119(@OriginalArg(0) Class1_Sub21 arg0) {
		Static71.method1260(arg0, 200000);
	}
}
