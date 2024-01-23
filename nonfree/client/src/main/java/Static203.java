import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!on", name = "n", descriptor = "[Lclient!gd;")
	public static Class60[] aClass60Array4;

	@OriginalMember(owner = "client!on", name = "f", descriptor = "[I")
	public static int[] anIntArray329 = new int[50];

	@OriginalMember(owner = "client!on", name = "p", descriptor = "I")
	public static int anInt4053 = 0;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "[I")
	public static int[] anIntArray330 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V")
	public static void method3250() {
		Static199.aClass169_111.method4020(5);
		Static215.aClass169_118.method4020(5);
		Static62.aClass169_45.method4020(5);
		Static146.aClass169_83.method4020(5);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIBLclient!qm;)V")
	public static void method3251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class22_Sub3_Sub2 arg2) {
		if (arg1 == arg2.anInt4642 && arg1 != -1) {
			@Pc(22) Class167 local22 = Static313.method4648(arg1);
			@Pc(25) int local25 = local22.anInt5131;
			if (local25 == 1) {
				arg2.anInt4597 = 0;
				arg2.anInt4632 = arg0;
				arg2.anInt4645 = 0;
				arg2.anInt4567 = 0;
				arg2.anInt4609 = 1;
				Static212.method3338(arg2.anInt4601, arg2 == Static229.aClass22_Sub3_Sub2_2, arg2.anInt4597, local22, arg2.anInt4623);
			}
			if (local25 == 2) {
				arg2.anInt4567 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt4642 == -1 || Static313.method4648(arg1).anInt5114 >= Static313.method4648(arg2.anInt4642).anInt5114) {
			arg2.anInt4632 = arg0;
			arg2.anInt4642 = arg1;
			arg2.anInt4589 = arg2.anInt4580;
			arg2.anInt4645 = 0;
			arg2.anInt4597 = 0;
			arg2.anInt4567 = 0;
			arg2.anInt4609 = 1;
			if (arg2.anInt4642 != -1) {
				Static212.method3338(arg2.anInt4601, Static229.aClass22_Sub3_Sub2_2 == arg2, arg2.anInt4597, Static313.method4648(arg2.anInt4642), arg2.anInt4623);
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[[I)V")
	public static void method3252(@OriginalArg(1) int[][] arg0) {
		Static51.anIntArrayArray1 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(II)I")
	public static int method3254(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(27) int local27 = local12 | local12 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZII)V")
	public static void method3256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static140.anInt2753 = Static58.anInt2559 + Static58.anInt2563 - arg0 - 1;
		Static280.anInt5336 = arg1 - Static58.anInt2560;
	}
}
