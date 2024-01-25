import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!tf", name = "U", descriptor = "[I")
	public static int[] anIntArray544;

	@OriginalMember(owner = "client!tf", name = "W", descriptor = "I")
	public static int anInt6735;

	@OriginalMember(owner = "client!tf", name = "Q", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_164 = new Class25(105, 12);

	@OriginalMember(owner = "client!tf", name = "T", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_165 = new Class25(0, 11);

	@OriginalMember(owner = "client!tf", name = "V", descriptor = "Lclient!tq;")
	public static final Class2_Sub17_Sub1 aClass2_Sub17_Sub1_2 = new Class2_Sub17_Sub1(5000);

	@OriginalMember(owner = "client!tf", name = "X", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!gi;BZ)V")
	public static void method5409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) int local8 = arg2.anInt2436;
		@Pc(11) int local11 = arg2.anInt2495;
		if (arg2.aByte42 == 0) {
			arg2.anInt2436 = arg2.anInt2481;
		} else if (arg2.aByte42 == 1) {
			arg2.anInt2436 = arg0 - arg2.anInt2481;
		} else if (arg2.aByte42 == 2) {
			arg2.anInt2436 = arg0 * arg2.anInt2481 >> 14;
		}
		if (arg2.aByte41 == 0) {
			arg2.anInt2495 = arg2.anInt2504;
		} else if (arg2.aByte41 == 1) {
			arg2.anInt2495 = arg1 - arg2.anInt2504;
		} else if (arg2.aByte41 == 2) {
			arg2.anInt2495 = arg2.anInt2504 * arg1 >> 14;
		}
		if (arg2.aByte42 == 4) {
			arg2.anInt2436 = arg2.anInt2495 * arg2.anInt2471 / arg2.anInt2478;
		}
		if (arg2.aByte41 == 4) {
			arg2.anInt2495 = arg2.anInt2436 * arg2.anInt2478 / arg2.anInt2471;
		}
		if (Static464.aBoolean176 && (Static53.method860(arg2).anInt7337 != 0 || arg2.anInt2494 == 0)) {
			if (arg2.anInt2495 < 5 && arg2.anInt2436 < 5) {
				arg2.anInt2436 = 5;
				arg2.anInt2495 = 5;
			} else {
				if (arg2.anInt2436 <= 0) {
					arg2.anInt2436 = 5;
				}
				if (arg2.anInt2495 <= 0) {
					arg2.anInt2495 = 5;
				}
			}
		}
		if (Static414.anInt7109 == arg2.anInt2469) {
			Static35.aClass93_3 = arg2;
		}
		if (arg3 && arg2.anObjectArray18 != null && (arg2.anInt2436 != local8 || arg2.anInt2495 != local11)) {
			@Pc(180) Class2_Sub18 local180 = new Class2_Sub18();
			local180.anObjectArray33 = arg2.anObjectArray18;
			local180.aClass93_10 = arg2;
			Static406.aClass181_46.method3973(local180);
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public static void method5410() {
		for (@Pc(3) int local3 = 0; local3 < Static326.aByteArrayArrayArray15.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static326.aByteArrayArrayArray15[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static326.aByteArrayArrayArray15[0][0].length; local11++) {
					Static326.aByteArrayArrayArray15[local3][local7][local11] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5412(@OriginalArg(1) String arg0) {
		return Static27.method464(10, arg0);
	}
}
