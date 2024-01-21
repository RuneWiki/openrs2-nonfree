import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "Lclient!mf;")
	public static Class4_Sub2_Sub3_Sub3 aClass4_Sub2_Sub3_Sub3_3;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "Lclient!ea;")
	public static Class20_Sub1 aClass20_Sub1_10;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	public static int anInt1628 = 0;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Lclient!ja;")
	private static Class39 aClass39_860 = Static28.method504("green:");

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!ja;")
	public static Class39 aClass39_858 = aClass39_860;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!ja;")
	public static Class39 aClass39_859 = aClass39_860;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_861 = Static28.method504("logo");

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "Lclient!ja;")
	private static Class39 aClass39_863 = Static28.method504("Cancel");

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "Lclient!ja;")
	public static Class39 aClass39_862 = aClass39_863;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Z")
	public static boolean aBoolean92 = false;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Lclient!rb;")
	public static Class66 aClass66_1 = new Class66();

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	public static int anInt1635 = 500;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	public static int anInt1637 = 0;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Lclient!o;")
	public static Class4_Sub16_Sub1 aClass4_Sub16_Sub1_2 = new Class4_Sub16_Sub1(5000);

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "Lclient!ja;")
	public static Class39 aClass39_864 = Static28.method504("::fpsoff");

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	public static int anInt1638 = 1;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	public static int anInt1639 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([Lclient!ja;I)Lclient!ja;")
	public static Class39 method1123(@OriginalArg(0) Class39[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static42.method706(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZII)V")
	public static void method1124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub5 local8 = Static59.method1051(arg1, arg2);
		if (local8 != null && local8.anObjectArray18 != null) {
			@Pc(17) Class4_Sub17 local17 = new Class4_Sub17();
			local17.aClass4_Sub5_51 = local8;
			local17.anObjectArray27 = local8.anObjectArray18;
			Static104.method1857(local17);
		}
		Static65.anInt1667 = arg2;
		Static78.aBoolean101 = true;
		Static44.anInt1130 = arg0;
		Static101.anInt2518 = arg1;
		Static19.method344(local8);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method1125() {
		aClass39_863 = null;
		aClass39_864 = null;
		aClass66_1 = null;
		aClass39_859 = null;
		aClass39_858 = null;
		aClass39_862 = null;
		aClass4_Sub16_Sub1_2 = null;
		aClass4_Sub2_Sub3_Sub3_3 = null;
		aClass39_860 = null;
		aClass39_861 = null;
		aClass20_Sub1_10 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method1127() {
		@Pc(5) Object local5 = Static36.anObject3;
		synchronized (Static36.anObject3) {
			if (Static108.anInt2702 != 0) {
				Static108.anInt2702 = 1;
				try {
					Static36.anObject3.wait();
				} catch (@Pc(23) InterruptedException local23) {
				}
			}
		}
	}
}
