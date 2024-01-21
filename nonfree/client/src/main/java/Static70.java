import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
	public static int anInt710;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "[S")
	public static short[] aShortArray21;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Lclient!mc;")
	public static Class1_Sub12 aClass1_Sub12_5 = new Class1_Sub12(new byte[5000]);

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!sc;")
	private static Class66 aClass66_442 = Static106.method1849("Service unavailable)3");

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "Lclient!sc;")
	public static Class66 aClass66_441 = aClass66_442;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
	public static int anInt708 = 0;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "Lclient!sc;")
	public static Class66 aClass66_443 = Static106.method1849("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "Lclient!sc;")
	public static Class66 aClass66_444 = Static106.method1849("mapmarker");

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
	public static int anInt712 = 0;

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
	public static int anInt714 = 0;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!sf;ZI)[Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1[] method536(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		return Static80.method1490(arg1, arg2, arg0) ? Static44.method963() : null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!he;I)V")
	public static void method537(@OriginalArg(0) Class1_Sub10 arg0) {
		if (arg0.anInt1352 == Static87.anInt2308) {
			Static128.aBooleanArray18[arg0.anInt1387] = true;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!sf;I)V")
	public static void method538(@OriginalArg(0) Class5 arg0) {
		Static74.aClass5_62 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BIII)V")
	public static void method540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) Class1_Sub10 local4 = Static127.method2030(arg1, arg0);
		if (local4 != null && local4.anObjectArray26 != null) {
			@Pc(17) Class1_Sub5 local17 = new Class1_Sub5();
			local17.anObjectArray3 = local4.anObjectArray26;
			local17.aClass1_Sub10_1 = local4;
			Static38.method2005(local17);
		}
		Static90.anInt1844 = arg1;
		Static128.anInt2909 = arg2;
		Static51.aBoolean65 = true;
		Static24.anInt688 = arg0;
		method537(local4);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)V")
	public static void method541() {
		aClass66_442 = null;
		aClass66_443 = null;
		aClass66_441 = null;
		aClass66_444 = null;
		aShortArray21 = null;
		aClass1_Sub12_5 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)I")
	public static int method542(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 - 1 & arg0;
		@Pc(15) int local15 = arg1 - 1 & arg2;
		@Pc(19) int local19 = arg2 / arg1;
		@Pc(23) int local23 = arg0 / arg1;
		@Pc(28) int local28 = Static26.method535(local19, local23);
		@Pc(35) int local35 = Static26.method535(local19, local23 + 1);
		@Pc(42) int local42 = Static26.method535(local19 + 1, local23);
		@Pc(51) int local51 = Static26.method535(local19 + 1, local23 + 1);
		@Pc(58) int local58 = Static104.method1798(local35, arg1, local28, local9);
		@Pc(65) int local65 = Static104.method1798(local51, arg1, local42, local9);
		return Static104.method1798(local65, arg1, local58, local15);
	}
}
