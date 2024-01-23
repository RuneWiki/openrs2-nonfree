import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	public static int anInt3051;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "Lclient!dh;")
	public static Class33 aClass33_26 = new Class33(50);

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "J")
	public static long aLong108 = 0L;

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "[I")
	public static int[] anIntArray280 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
	public static void method2417() {
		anIntArray280 = null;
		aClass33_26 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
	public static int method2418() {
		return 2;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)Lclient!fj;")
	public static Class4_Sub2_Sub6 method2419(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub2_Sub6 local10 = (Class4_Sub2_Sub6) Static216.aClass69_10.method1930((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28;
		if (arg0 >= 32768) {
			local28 = Static49.aClass98_31.method2396(arg0 & 0x7FFF, 0);
		} else {
			local28 = Static53.aClass98_33.method2396(arg0, 0);
		}
		local10 = new Class4_Sub2_Sub6();
		if (local28 != null) {
			local10.method1248(new Class4_Sub17(local28));
		}
		if (arg0 >= 32768) {
			local10.method1246();
		}
		Static216.aClass69_10.method1933((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method2420(@OriginalArg(0) long arg0) {
		return Static141.method2286(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
	public static void method2421() {
		Static36.aClass33_4.method838(5);
		aClass33_26.method838(5);
		Static160.aClass33_28.method838(5);
	}
}
