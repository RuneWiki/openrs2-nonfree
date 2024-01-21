import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_154 = Static177.method3050("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_155 = Static177.method3050("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!h;")
	public static final Class4_Sub11 aClass4_Sub11_1 = new Class4_Sub11(8);

	@OriginalMember(owner = "client!be", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[112];

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Lclient!bg;")
	public static Class11 aClass11_2 = new Class11();

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_156 = Static177.method3050("mod_icons");

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_157 = Static177.method3050("AUS");

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!nh;I)V")
	public static void method265(@OriginalArg(0) Class62 arg0) {
		Static68.aClass62_18 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public static void method267() {
		try {
			if (Static71.anInt1861 == 1) {
				@Pc(10) int local10 = Static175.aClass4_Sub2_Sub4_2.method2786();
				if (local10 > 0 && Static175.aClass4_Sub2_Sub4_2.method2803()) {
					local10 -= Static30.anInt765;
					if (local10 < 0) {
						local10 = 0;
					}
					Static175.aClass4_Sub2_Sub4_2.method2787(local10);
					return;
				}
				Static175.aClass4_Sub2_Sub4_2.method2806();
				Static175.aClass4_Sub2_Sub4_2.method2776();
				if (Static140.aClass62_35 == null) {
					Static71.anInt1861 = 0;
				} else {
					Static71.anInt1861 = 2;
				}
				Static184.aClass77_106 = null;
				Static122.aClass4_Sub15_1 = null;
			}
		} catch (@Pc(54) Exception local54) {
			local54.printStackTrace();
			Static175.aClass4_Sub2_Sub4_2.method2806();
			Static140.aClass62_35 = null;
			Static71.anInt1861 = 0;
			Static184.aClass77_106 = null;
			Static122.aClass4_Sub15_1 = null;
		}
	}
}
