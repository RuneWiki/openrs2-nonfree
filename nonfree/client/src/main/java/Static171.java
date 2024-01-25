import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
	public static int anInt3677;

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "Lclient!wo;")
	public static Class216 aClass216_60;

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
	public static int anInt3695;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!lf", name = "G", descriptor = "[I")
	public static final int[] anIntArray333 = new int[1024];

	@OriginalMember(owner = "client!lf", name = "S", descriptor = "[S")
	public static final short[] aShortArray83 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!ki;)V")
	public static void method3390(@OriginalArg(1) Class17_Sub1_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static5.anInt208 == arg0.anInt4868 || arg0.anInt4830 == -1 || arg0.anInt4856 != 0) {
			local5 = true;
		} else {
			@Pc(25) Class24 local25 = Static110.method5411(arg0.anInt4830);
			if (local25.aBoolean99 || local25.anIntArray89[arg0.anInt4863] < arg0.anInt4840 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(57) int local57 = arg0.anInt4868 - arg0.anInt4873;
			@Pc(63) int local63 = Static5.anInt208 - arg0.anInt4873;
			@Pc(74) int local74 = arg0.anInt4825 * 128 + arg0.method4318() * 64;
			@Pc(86) int local86 = arg0.anInt4862 * 128 + arg0.method4318() * 64;
			@Pc(97) int local97 = arg0.anInt4843 * 128 + arg0.method4318() * 64;
			@Pc(109) int local109 = arg0.anInt4846 * 128 + arg0.method4318() * 64;
			arg0.anInt5108 = (local109 * local63 + (local57 - local63) * local86) / local57;
			arg0.anInt5109 = (local74 * (local57 - local63) + local63 * local97) / local57;
		}
		arg0.anInt4887 = 0;
		if (arg0.anInt4826 == 0) {
			arg0.method4323(8192);
		}
		if (arg0.anInt4826 == 1) {
			arg0.method4323(12288);
		}
		if (arg0.anInt4826 == 2) {
			arg0.method4323(0);
		}
		if (arg0.anInt4826 == 3) {
			arg0.method4323(4096);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
	public static void method3396() {
		Static198.aClass87_10.method2473(5);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
	public static void method3398() {
		@Pc(5) Class87 local5 = Static304.aClass87_52;
		synchronized (Static304.aClass87_52) {
			Static304.aClass87_52.method2473(5);
		}
	}
}
