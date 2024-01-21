import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!be", name = "A", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!be", name = "ub", descriptor = "I")
	public static int anInt1317;

	@OriginalMember(owner = "client!be", name = "F", descriptor = "Lclient!pe;")
	private static Class65 aClass65_567 = Static119.method1462("Connection lost");

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
	public static int anInt1293 = 0;

	@OriginalMember(owner = "client!be", name = "V", descriptor = "Lclient!pe;")
	public static Class65 aClass65_568 = Static119.method1462("<col=ff3000>");

	@OriginalMember(owner = "client!be", name = "Z", descriptor = "[I")
	public static int[] anIntArray163 = new int[200];

	@OriginalMember(owner = "client!be", name = "ab", descriptor = "Lclient!pe;")
	public static Class65 aClass65_569 = Static119.method1462("sl_flags");

	@OriginalMember(owner = "client!be", name = "kb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_570 = Static119.method1462("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!be", name = "mb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_571 = Static119.method1462(")4l");

	@OriginalMember(owner = "client!be", name = "nb", descriptor = "[I")
	public static int[] anIntArray164 = new int[1000];

	@OriginalMember(owner = "client!be", name = "wb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_572 = aClass65_567;

	@OriginalMember(owner = "client!be", name = "Ab", descriptor = "Lclient!pe;")
	private static Class65 aClass65_573 = Static119.method1462("Continue");

	@OriginalMember(owner = "client!be", name = "Eb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_574 = aClass65_573;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "(I)V")
	public static void method908() {
		aClass65_569 = null;
		anIntArray162 = null;
		aClass65_574 = null;
		aClass65_573 = null;
		aClass65_568 = null;
		aClass65_572 = null;
		aClass65_567 = null;
		anIntArray164 = null;
		anIntArray163 = null;
		aClass65_570 = null;
		aClass65_571 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)V")
	public static void method916(@OriginalArg(0) int arg0) {
		Static72.method1243();
		Static41.method727();
		@Pc(19) int local19 = Static115.method1840(arg0).anInt2273;
		if (local19 == 0) {
			return;
		}
		@Pc(26) int local26 = Static129.anIntArray363[arg0];
		if (local19 == 1) {
			if (local26 == 1) {
				Static87.method1432(0.9D);
				((Class1) Static87.anInterface1_1).method12(0.9D);
			}
			if (local26 == 2) {
				Static87.method1432(0.8D);
				((Class1) Static87.anInterface1_1).method12(0.8D);
			}
			if (local26 == 3) {
				Static87.method1432(0.7D);
				((Class1) Static87.anInterface1_1).method12(0.7D);
			}
			if (local26 == 4) {
				Static87.method1432(0.6D);
				((Class1) Static87.anInterface1_1).method12(0.6D);
			}
			Static102.method1660();
		}
		if (local19 == 3) {
			@Pc(80) short local80 = 0;
			if (local26 == 0) {
				local80 = 255;
			}
			if (local26 == 1) {
				local80 = 192;
			}
			if (local26 == 2) {
				local80 = 128;
			}
			if (local26 == 3) {
				local80 = 64;
			}
			if (local26 == 4) {
				local80 = 0;
			}
			if (local80 != Static39.anInt840) {
				if (Static39.anInt840 == 0 && Static105.anInt2364 != -1) {
					Static107.method1736(0, Static105.anInt2364, Static88.aClass56_Sub1_19, local80);
					Static100.aBoolean92 = false;
				} else if (local80 == 0) {
					Static36.method650();
					Static100.aBoolean92 = false;
				} else {
					Static105.method1707(local80);
				}
				Static39.anInt840 = local80;
			}
		}
		if (local19 == 6) {
			Static72.anInt1645 = local26;
		}
		if (local19 == 9) {
			Static101.anInt2290 = local26;
		}
		if (local19 == 4) {
			if (local26 == 0) {
				Static106.anInt2390 = 127;
			}
			if (local26 == 1) {
				Static106.anInt2390 = 96;
			}
			if (local26 == 2) {
				Static106.anInt2390 = 64;
			}
			if (local26 == 3) {
				Static106.anInt2390 = 32;
			}
			if (local26 == 4) {
				Static106.anInt2390 = 0;
			}
		}
		if (local19 == 10) {
			if (local26 == 0) {
				Static7.anInt221 = 127;
			}
			if (local26 == 1) {
				Static7.anInt221 = 96;
			}
			if (local26 == 2) {
				Static7.anInt221 = 64;
			}
			if (local26 == 3) {
				Static7.anInt221 = 32;
			}
			if (local26 == 4) {
				Static7.anInt221 = 0;
			}
		}
		if (local19 == 5) {
			Static107.anInt2410 = local26;
		}
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)V")
	public static void method921() {
		for (@Pc(14) Class2_Sub18 local14 = (Class2_Sub18) Static23.aClass13_12.method270(); local14 != null; local14 = (Class2_Sub18) Static23.aClass13_12.method273()) {
			if (local14.anInt2487 == -1) {
				local14.anInt2495 = 0;
				Static52.method880(local14);
			} else {
				local14.method2053();
			}
		}
	}
}
