import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "[Lclient!vj;")
	public static Class58[] aClass58Array74;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
	public static int anInt3918;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "[I")
	public static final int[] anIntArray329 = new int[1000];

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "[I")
	public static final int[] anIntArray330 = new int[256];

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "[I")
	public static final int[] anIntArray331 = new int[4096];

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIILclient!p;Lclient!p;)V")
	public static void method3553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub4 arg3, @OriginalArg(4) Class8_Sub4 arg4) {
		if (Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2] == null) {
			Static269.method4620(arg0, arg1, arg2);
		}
		Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2].aClass8_Sub4_1 = arg3;
		Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2].aClass8_Sub4_2 = arg4;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!an;Lclient!tj;BLclient!tj;)V")
	public static void method3554(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(3) Class193 arg2) {
		Static325.aClass193_101 = arg2;
		Static75.aClass193_22 = arg1;
		Static321.anInterface2_5 = arg0;
		if (Static75.aClass193_22 != null) {
			Static334.anInt3923 = Static75.aClass193_22.method5055(1);
		}
		if (Static325.aClass193_101 != null) {
			Static205.anInt4298 = Static325.aClass193_101.method5055(1);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII)V")
	public static void method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) float local13 = (float) Static54.anInt4747 / (float) Static54.anInt4749;
		@Pc(15) int local15 = arg3;
		@Pc(17) int local17 = arg0;
		if (local13 < 1.0F) {
			local17 = (int) ((float) arg3 * local13);
		} else {
			local15 = (int) ((float) arg0 / local13);
		}
		@Pc(44) int local44 = arg2 - (arg0 - local17) / 2;
		@Pc(52) int local52 = arg1 - (arg3 - local15) / 2;
		Static60.anInt1574 = Static54.anInt4747 - Static54.anInt4747 * local44 / local17;
		Static8.anInt200 = Static54.anInt4749 * local52 / local15;
		Static285.anInt5603 = -1;
		Static116.anInt2756 = -1;
		Static95.method2223();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "()V")
	public static void method3557() {
		Static95.method2220(Static327.anInt6252);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!tj;Lclient!tj;ILclient!tj;Lclient!tj;)V")
	public static void method3558(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(3) Class193 arg2, @OriginalArg(4) Class193 arg3) {
		Static180.aClass193_65 = arg0;
		Static246.aClass193_86 = arg1;
		Static145.aClass193_55 = arg2;
		Static92.aClass193_10 = arg3;
		Static271.aClass21ArrayArray1 = new Class21[Static92.aClass193_10.method5037()][];
		Static51.aBooleanArray2 = new boolean[Static92.aClass193_10.method5037()];
	}
}
