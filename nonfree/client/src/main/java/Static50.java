import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!caa", name = "j", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array2;

	@OriginalMember(owner = "client!caa", name = "o", descriptor = "I")
	public static int anInt929;

	@OriginalMember(owner = "client!caa", name = "s", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[4];

	@OriginalMember(owner = "client!caa", name = "t", descriptor = "I")
	public static int anInt933 = 0;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!mo;I)Lclient!nd;")
	public static Class233 method826(@OriginalArg(0) Class1_Sub35 arg0) {
		@Pc(12) int local12 = arg0.method5750();
		@Pc(19) Class335 local19 = Static119.method1872()[arg0.method5750()];
		@Pc(26) Class122 local26 = Static20.method239()[arg0.method5750()];
		@Pc(30) int local30 = arg0.method5738();
		@Pc(34) int local34 = arg0.method5738();
		@Pc(38) int local38 = arg0.method5771();
		@Pc(42) int local42 = arg0.method5771();
		@Pc(46) int local46 = arg0.method5804();
		@Pc(50) int local50 = arg0.method5804();
		@Pc(54) int local54 = arg0.method5804();
		@Pc(65) boolean local65 = arg0.method5750() == 1;
		return new Class233(local12, local19, local26, local30, local34, local38, local42, local46, local50, local54, local65);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
	public static void method827() {
		if (!Static573.aBoolean740) {
			return;
		}
		@Pc(11) Class341 local11 = Static49.method751(Static48.anInt840, Static84.anInt8888);
		if (local11 != null && local11.anObjectArray9 != null) {
			@Pc(20) Class1_Sub15 local20 = new Class1_Sub15();
			local20.anObjectArray1 = local11.anObjectArray9;
			local20.aClass341_10 = local11;
			Static80.method1451(local20);
		}
		Static447.anInt7729 = -1;
		Static78.anInt1494 = -1;
		Static573.aBoolean740 = false;
		if (local11 != null) {
			Static442.method6111(local11);
		}
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(IBI)Z")
	public static boolean method828(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static494.method6891(arg0, arg1) || Static113.method1787(arg1, arg0);
	}

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(III)Z")
	public static boolean method830(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}
}
