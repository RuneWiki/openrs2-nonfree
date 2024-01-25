import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "[[Lclient!tp;")
	public static Class331[][] aClass331ArrayArray1;

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "Lclient!hu;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "[I")
	public static final int[] anIntArray25 = new int[50];

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "[F")
	public static final float[] aFloatArray20 = new float[4];

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIIII)V")
	public static void method899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static43.anInt1550 = arg1;
		Static325.anInt6514 = arg3;
		Static627.anInt10492 = arg2;
		Static368.anInt6984 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	public static void method901() {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(15, 0);
		local8.method3512();
	}
}
