import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_90 = new Class90(101, 28);

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IB)V")
	public static void method5014(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub6_Sub5 local13 = Static396.method6079(arg0, 9);
		local13.method2302();
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)I")
	public static int method5015() {
		if (Static117.aBoolean207) {
			return 6;
		} else if (Static367.aClass4_Sub36_4 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static367.aClass4_Sub36_4.anInt7137;
			if (Static210.method8155(local19)) {
				return 1;
			} else if (Static221.method956(local19)) {
				return 2;
			} else if (Static324.method5022(local19)) {
				return 3;
			} else if (Static208.method3402(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIB)Z")
	public static boolean method5017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) boolean local22 = (arg0 & 0x37) == 0 ? Static276.method4454(arg1, arg0) : Static371.method5564(arg1, arg0);
		return local22 | Static571.method8035(arg1, arg0) | (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!is;B)V")
	public static void method5018(@OriginalArg(0) Class155 arg0) {
		if (Static62.anInt10309 != arg0.anInt4825) {
			return;
		}
		if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aString87 == null) {
			arg0.anInt4814 = 0;
			arg0.anInt4802 = 0;
			return;
		}
		arg0.anInt4789 = 150;
		arg0.anInt4809 = (int) (Math.sin((double) Static306.anInt6122 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt4802 = Static1.anInt5011;
		arg0.anInt4764 = 5;
		arg0.anInt4814 = Static208.method3404(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aString87);
		arg0.anInt4747 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4198;
		arg0.anInt4805 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4254;
		arg0.anInt4775 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4243;
		arg0.anInt4773 = 0;
		@Pc(76) Class111 local76 = arg0.anInt4805 == -1 ? null : Static17.aClass254_1.method5936(arg0.anInt4805);
		if (local76 != null) {
			Static435.method6470(arg0.anInt4775, local76);
		}
	}
}
