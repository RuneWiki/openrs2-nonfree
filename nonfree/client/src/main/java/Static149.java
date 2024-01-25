import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "F")
	public static float aFloat94;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "Z")
	public static boolean aBoolean442 = false;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_198 = new Class107(77, 6);

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	public static int anInt6409 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!uq;IIZI)V")
	public static void method5326(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(6) int local6 = arg0.anInt6687;
		@Pc(9) int local9 = arg0.anInt6677;
		if (arg0.aByte94 == 0) {
			arg0.anInt6687 = arg0.anInt6686;
		} else if (arg0.aByte94 == 1) {
			arg0.anInt6687 = arg2 - arg0.anInt6686;
		} else if (arg0.aByte94 == 2) {
			arg0.anInt6687 = arg0.anInt6686 * arg2 >> 14;
		}
		if (arg0.aByte96 == 0) {
			arg0.anInt6677 = arg0.anInt6688;
		} else if (arg0.aByte96 == 1) {
			arg0.anInt6677 = arg1 - arg0.anInt6688;
		} else if (arg0.aByte96 == 2) {
			arg0.anInt6677 = arg1 * arg0.anInt6688 >> 14;
		}
		if (arg0.aByte94 == 4) {
			arg0.anInt6687 = arg0.anInt6663 * arg0.anInt6677 / arg0.lb;
		}
		if (arg0.aByte96 == 4) {
			arg0.anInt6677 = arg0.anInt6687 * arg0.lb / arg0.anInt6663;
		}
		if (Static313.aBoolean387 && (Static57.method1248(arg0).anInt2012 != 0 || arg0.anInt6654 == 0)) {
			if (arg0.anInt6677 < 5 && arg0.anInt6687 < 5) {
				arg0.anInt6687 = 5;
				arg0.anInt6677 = 5;
			} else {
				if (arg0.anInt6677 <= 0) {
					arg0.anInt6677 = 5;
				}
				if (arg0.anInt6687 <= 0) {
					arg0.anInt6687 = 5;
				}
			}
		}
		if (arg0.anInt6660 == Static406.anInt6511) {
			Static400.aClass251_11 = arg0;
		}
		if (arg3 && arg0.anObjectArray7 != null && (arg0.anInt6687 != local6 || arg0.anInt6677 != local9)) {
			@Pc(182) Class1_Sub24 local182 = new Class1_Sub24();
			local182.aClass251_5 = arg0;
			local182.anObjectArray3 = arg0.anObjectArray7;
			Static249.aClass181_43.method4102(local182);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Lclient!h;")
	public static Class99 method5327() {
		try {
			return (Class99) Class.forName("Class99_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!cl;II)V")
	public static void method5328(@OriginalArg(1) Class31_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt7365 == arg2 && arg2 != -1) {
			@Pc(83) Class223 local83 = Static293.aClass127_1.method2975(arg2);
			@Pc(86) int local86 = local83.anInt6050;
			if (local86 == 1) {
				arg0.anInt7320 = 0;
				arg0.anInt7317 = 1;
				arg0.anInt7323 = arg1;
				arg0.anInt7350 = 0;
				arg0.anInt7354 = 0;
				Static172.method2762(local83, arg0.anInt7300, Static452.aClass31_Sub2_Sub1_Sub1_2 == arg0, arg0.anInt7350, arg0.aByte100, arg0.anInt7298);
			}
			if (local86 == 2) {
				arg0.anInt7354 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt7365 == -1 || Static293.aClass127_1.method2975(arg2).anInt6039 >= Static293.aClass127_1.method2975(arg0.anInt7365).anInt6039) {
			arg0.anInt7354 = 0;
			arg0.anInt7320 = 0;
			arg0.anInt7317 = 1;
			arg0.anInt7379 = arg0.anInt7378;
			arg0.anInt7350 = 0;
			arg0.anInt7323 = arg1;
			arg0.anInt7365 = arg2;
			if (arg0.anInt7365 != -1) {
				Static172.method2762(Static293.aClass127_1.method2975(arg0.anInt7365), arg0.anInt7300, Static452.aClass31_Sub2_Sub1_Sub1_2 == arg0, arg0.anInt7350, arg0.aByte100, arg0.anInt7298);
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)V")
	public static void method5330(@OriginalArg(1) int arg0) {
		if (Static152.anIntArray262 == null || Static152.anIntArray262.length < arg0) {
			Static152.anIntArray262 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)Z")
	public static boolean method5332(@OriginalArg(0) int arg0) {
		return arg0 == 22 || arg0 == 51 || arg0 == 1007 || arg0 == 3 || arg0 == 2;
	}
}
