import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!gu", name = "T", descriptor = "I")
	public static int anInt2856;

	@OriginalMember(owner = "client!gu", name = "B", descriptor = "[B")
	public static final byte[] aByteArray31 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!gu", name = "K", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_23 = new Class83(8);

	@OriginalMember(owner = "client!gu", name = "S", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_38 = new Class212(66, 8);

	@OriginalMember(owner = "client!gu", name = "X", descriptor = "Lclient!hl;")
	public static final Class96 aClass96_16 = new Class96(8);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZZ)V")
	public static void method2556(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static248.anInt4793 != -1) {
				Static106.method6188(Static248.anInt4793);
			}
			for (@Pc(20) Class4_Sub39 local20 = (Class4_Sub39) Static157.aClass96_22.method2798(); local20 != null; local20 = (Class4_Sub39) Static157.aClass96_22.method2796()) {
				if (!local20.method6325()) {
					local20 = (Class4_Sub39) Static157.aClass96_22.method2798();
					if (local20 == null) {
						break;
					}
				}
				Static298.method4546(local20, true, false);
			}
			Static248.anInt4793 = -1;
			Static157.aClass96_22 = new Class96(8);
			Static193.method3454();
			Static248.anInt4793 = Static208.anInt4252;
			Static393.method5536(false);
			Static208.method3674();
			Static64.method1472(Static248.anInt4793);
		}
		Static82.aBoolean141 = true;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V")
	public static void method2560() {
		Static142.aClass18_1 = null;
		Static403.aClass2Array28 = null;
		Static351.aClass2Array36 = null;
		Static416.aClass2Array44 = null;
		Static29.aClass2Array46 = null;
		Static168.aClass2Array23 = null;
		Static355.aClass2Array37 = null;
		Static307.aClass2Array45 = null;
		Static42.aClass2Array9 = null;
		Static197.aClass2_19 = null;
		Static220.aClass2Array31 = null;
		Static433.aClass2Array12 = null;
		Static330.aClass18_3 = null;
		Static46.aClass2Array10 = null;
		Static373.aClass2Array42 = null;
		Static151.aClass2_17 = null;
		Static366.aClass2Array40 = null;
		Static247.aClass18_2 = null;
	}
}
