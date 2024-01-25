import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!tda", name = "u", descriptor = "[Lclient!wfa;")
	public static Class383[] aClass383Array1;

	@OriginalMember(owner = "client!tda", name = "x", descriptor = "Lclient!oba;")
	public static Class3_Sub11_Sub14 aClass3_Sub11_Sub14_5;

	@OriginalMember(owner = "client!tda", name = "y", descriptor = "I")
	public static int anInt9199;

	@OriginalMember(owner = "client!tda", name = "D", descriptor = "[I")
	public static final int[] anIntArray791 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!tda", name = "H", descriptor = "S")
	public static short aShort97 = 1;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!or;B)V")
	public static void method8047(@OriginalArg(0) Class260 arg0) {
		if (Static559.anInt9085 != arg0.anInt6958) {
			return;
		}
		if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aString123 == null) {
			arg0.anInt7000 = 0;
			arg0.anInt6959 = 0;
			return;
		}
		arg0.anInt6974 = 150;
		arg0.anInt6973 = (int) (Math.sin((double) Static588.anInt9467 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt7000 = Static106.anInt2205;
		arg0.anInt6935 = 5;
		arg0.anInt6959 = Static624.method7815(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aString123);
		arg0.anInt6954 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10760;
		arg0.anInt6988 = 0;
		arg0.anInt6982 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10783;
		arg0.anInt6927 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10749;
		@Pc(84) Class372 local84 = arg0.anInt6927 == -1 ? null : Static243.aClass343_3.method8356(arg0.anInt6927);
		if (local84 != null) {
			Static639.method8891(arg0.anInt6954, local84);
		}
	}

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "(Z)V")
	public static void method8048() {
		Static300.aClass165_35.method4403();
		Static649.aClass165_78.method4403();
		Static45.aClass165_10.method4403();
		Static376.aClass165_41.method4403();
	}
}
