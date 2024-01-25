import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!tl", name = "bb", descriptor = "[F")
	public static final float[] aFloatArray59 = new float[4];

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public static void method7454() {
		Static587.anIntArray548 = null;
		Static537.aBoolean647 = false;
		Static137.anIntArray138 = null;
		Static291.anIntArray290 = null;
		Static236.anIntArray213 = null;
		Static265.anIntArray251 = null;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "()V")
	public static void method7456() {
		for (@Pc(1) int local1 = 0; local1 < Static339.aClass127Array1.length; local1++) {
			Static339.aClass127Array1[local1].method3178();
		}
		Static339.aClass127Array1 = null;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIILclient!lw;)V")
	public static void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub4_Sub3 arg4) {
		@Pc(4) Class53 local4 = Static351.method7422(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt9934 = (arg1 << Static145.anInt3093) + Static96.anInt8036;
		arg4.anInt9932 = arg3;
		arg4.anInt9935 = (arg2 << Static145.anInt3093) + Static96.anInt8036;
		if (local4.aClass1_Sub4_Sub4_1 != null) {
			arg4.anInt9932 -= local4.aClass1_Sub4_Sub4_1.aShort83;
		}
		local4.aClass1_Sub4_Sub3_1 = arg4;
		@Pc(44) int local44 = Static499.aClass83Array3 == Static183.aClass83Array6 ? 1 : 0;
		if (arg4.method8118()) {
			if (arg4.method8128()) {
				Static343.aClass1_Sub4ArrayArray3[local44][Static291.anIntArray291[local44]++] = arg4;
				return;
			}
			Static124.aClass1_Sub4ArrayArray4[local44][Static156.anIntArray148[local44]++] = arg4;
			return;
		}
		Static27.aClass1_Sub4ArrayArray1[local44][Static2.anIntArray3[local44]++] = arg4;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public static void method7460() {
		Static458.aClass44_13.ra(((float) Static214.aClass4_Sub19_Sub1_1.anInt3073 * 0.1F + 0.7F) * Static170.aFloat122);
		Static458.aClass44_13.VA(Static226.anInt4164, Static565.aFloat227, Static143.aFloat108, (float) (Static242.anInt4373 << 2), (float) (Static401.anInt7654 << 2), (float) (Static52.anInt767 << 2));
		Static458.aClass44_13.method4982(Static231.aClass36_4);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method7464(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static267.anInt5132; local9++) {
			if (arg0.equalsIgnoreCase(Static535.aStringArray66[local9])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static502.aStringArray63[local9])) {
				return true;
			}
		}
		return false;
	}
}
