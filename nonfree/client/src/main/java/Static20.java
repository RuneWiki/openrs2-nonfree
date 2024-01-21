import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	public static int anInt612;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!nb;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!de", name = "q", descriptor = "I")
	public static int anInt619;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "Lclient!sf;")
	public static Class5 aClass5_21;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "[I")
	public static int[] anIntArray85;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Lclient!sc;")
	public static Class66 aClass66_370 = Static106.method1849("Null");

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Lclient!rb;")
	public static Class60 aClass60_27 = new Class60(128);

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Lclient!rc;")
	public static Class61 aClass61_5 = new Class61();

	@OriginalMember(owner = "client!de", name = "m", descriptor = "I")
	public static int anInt616 = 0;

	@OriginalMember(owner = "client!de", name = "o", descriptor = "I")
	public static int anInt618 = 0;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "Lclient!sc;")
	private static Class66 aClass66_372 = Static106.method1849("Loading )2 please wait)3");

	@OriginalMember(owner = "client!de", name = "p", descriptor = "Lclient!sc;")
	public static Class66 aClass66_371 = aClass66_372;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "I")
	public static int anInt621 = 1;

	@OriginalMember(owner = "client!de", name = "t", descriptor = "I")
	public static int anInt622 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)Lclient!jb;")
	public static Class1_Sub1_Sub6 method496(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub6 local10 = (Class1_Sub1_Sub6) Static108.aClass60_13.method1745((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static111.aClass5_82.method107(arg0, 10);
		local10 = new Class1_Sub1_Sub6();
		local10.anInt1576 = arg0;
		if (local20 != null) {
			local10.method1082(new Class1_Sub12(local20));
		}
		local10.method1078();
		if (local10.anInt1536 != -1) {
			local10.method1079(method496(local10.anInt1557), method496(local10.anInt1536));
		}
		if (!Static48.aBoolean63 && local10.aBoolean64) {
			local10.aClass66Array8 = null;
			local10.aClass66_847 = Static34.aClass66_109;
			local10.aClass66Array9 = null;
			local10.anInt1552 = 0;
		}
		Static108.aClass60_13.method1741((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method497() {
		aClass66_370 = null;
		aClass5_21 = null;
		anIntArray85 = null;
		aClass66_371 = null;
		aClass61_5 = null;
		aClass60_27 = null;
		aClass24_1 = null;
		aClass66_372 = null;
	}
}
