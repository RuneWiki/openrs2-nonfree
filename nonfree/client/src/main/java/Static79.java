import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!q", name = "m", descriptor = "Lclient!rb;")
	public static Class55 aClass55_33;

	@OriginalMember(owner = "client!q", name = "s", descriptor = "I")
	public static int anInt2132;

	@OriginalMember(owner = "client!q", name = "y", descriptor = "I")
	public static int anInt2137;

	@OriginalMember(owner = "client!q", name = "B", descriptor = "Lclient!rb;")
	public static Class55 aClass55_34;

	@OriginalMember(owner = "client!q", name = "C", descriptor = "Lclient!oc;")
	public static Class34 aClass34_59;

	@OriginalMember(owner = "client!q", name = "j", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1224 = Static15.method178("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!q", name = "v", descriptor = "I")
	public static int anInt2135 = 0;

	@OriginalMember(owner = "client!q", name = "x", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1225 = Static15.method178("Loading config )2 ");

	@OriginalMember(owner = "client!q", name = "z", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1226 = Static15.method178("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!q", name = "A", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1227 = aClass23_1225;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public static void method1352() {
		aClass23_1227 = null;
		aClass23_1225 = null;
		aClass55_33 = null;
		aClass23_1224 = null;
		aClass34_59 = null;
		aClass55_34 = null;
		aClass23_1226 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIZZZ)Lclient!w;")
	public static Class55_Sub1 method1360(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) Class41 local6 = null;
		if (Static1.aClass46_1 != null) {
			local6 = new Class41(arg0, Static1.aClass46_1, Static80.aClass46Array1[arg0], 1000000);
		}
		return new Class55_Sub1(local6, Static55.aClass41_2, arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	public static void method1366() {
		if (Static8.aClass9_1 == null) {
			return;
		}
		@Pc(21) long local21 = Static82.method1454();
		if (local21 <= Static5.aLong5) {
			return;
		}
		Static8.aClass9_1.method1550(local21);
		@Pc(39) int local39 = (int) (local21 - Static5.aLong5);
		Static5.aLong5 = local21;
		@Pc(50) Class local50 = be.class;
		synchronized (be.class) {
			Static46.anInt1581 += local39 * Static109.anInt2826;
			@Pc(66) int local66 = (Static46.anInt1581 - Static109.anInt2826 * 2000) / 1000;
			if (local66 > 0) {
				if (Static49.aClass1_Sub4_3 != null) {
					Static49.aClass1_Sub4_3.method930(local66);
				}
				Static46.anInt1581 -= local66 * 1000;
			}
		}
	}
}
