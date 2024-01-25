import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "Lclient!sq;")
	public static final Class273 aClass273_4 = new Class273();

	@OriginalMember(owner = "client!laa", name = "k", descriptor = "Z")
	public static final boolean aBoolean372 = false;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIZIZ)V")
	public static void method4490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (Static17.anInt459 == 0) {
			Static515.method2859(false);
		} else {
			Static367.anInt6859 = Static17.anInt459;
			Static77.method4915(0);
		}
		Static523.aBoolean643 = arg2;
		Static211.anInt3979 = arg0;
		Static252.anInt5080 = arg1;
		Static245.method5955(arg3);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!r;IIBI)Lclient!km;")
	public static Class175 method4491(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return arg0 == null ? null : new Class175(arg1, arg3, arg2, arg0.e(), arg0.wa(), arg0.va(), arg0.TA(), arg0.n(), arg0.Q(), arg0.U());
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
	public static void method4492() {
		Static257.anInt5147 = 0;
		Static521.aClass99_78.method2524();
		Static218.aBoolean250 = false;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)V")
	public static void method4493() {
		for (@Pc(10) Class30_Sub4 local10 = (Class30_Sub4) Static547.aClass77_14.method2163(); local10 != null; local10 = (Class30_Sub4) Static547.aClass77_14.method2163()) {
			Static447.method6324(local10);
		}
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (Static300.aClass5_Sub28_Sub1_1.method4118(Static17.anInt459)) {
			local40 = 0;
			local42 = 3;
		} else {
			local42 = Static283.anInt5784;
			local40 = Static283.anInt5784;
		}
		Static68.method1283();
		for (@Pc(51) int local51 = local40; local51 <= local42; local51++) {
			Static68.method1295();
			Static68.method1284(local51);
			Static68.method1282(local51);
		}
		Static68.method1292();
		Static68.method1285();
	}
}
