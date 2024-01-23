import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
	public static int anInt815;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Lclient!wc;")
	public static Class110 aClass110_7 = new Class110(64);

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Lclient!qe;")
	public static Class78 aClass78_152 = Static199.method3560("Mitglieder)2Welt");

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	public static int anInt813 = 0;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "Lclient!qe;")
	public static Class78 aClass78_153 = Static199.method3560("::errortest");

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Lclient!qe;")
	public static Class78 aClass78_154 = Static199.method3560("Fertigkeit)2");

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!qe;")
	public static Class78 aClass78_155 = Static199.method3560("::rect_debug");

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "Lclient!qe;")
	private static Class78 aClass78_158 = Static199.method3560("shake:");

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "Lclient!qe;")
	public static Class78 aClass78_156 = aClass78_158;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array7 = new Class78[100];

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "Lclient!qe;")
	public static Class78 aClass78_157 = aClass78_158;

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "[Lclient!ea;")
	public static Class29[] aClass29Array1 = new Class29[6];

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I")
	public static int method592(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZZ)I")
	public static int method593() {
		return Static74.anInt1595 + Static187.anInt4366;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)V")
	public static void method594(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class64 local8 = Static3.method79(arg2, arg1);
		if (local8 != null && local8.anObjectArray22 != null) {
			@Pc(17) Class2_Sub1 local17 = new Class2_Sub1();
			local17.anObjectArray1 = local8.anObjectArray22;
			local17.aClass64_1 = local8;
			Static50.method649(local17);
		}
		Static170.anInt3942 = arg2;
		Static125.aBoolean60 = true;
		Static43.anInt794 = arg1;
		Static29.anInt530 = arg0;
		Static70.method2259(local8);
	}
}
