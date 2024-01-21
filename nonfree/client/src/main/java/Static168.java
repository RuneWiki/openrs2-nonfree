import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ve", name = "fb", descriptor = "Lclient!oe;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!ve", name = "Z", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1179 = Static8.method128("as it was used to break our rules)3");

	@OriginalMember(owner = "client!ve", name = "ab", descriptor = "[I")
	public static int[] anIntArray416 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ve", name = "bb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1180 = Static8.method128("You have only just left another world)3");

	@OriginalMember(owner = "client!ve", name = "cb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1181 = aClass18_1179;

	@OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
	public static int anInt4561 = -1;

	@OriginalMember(owner = "client!ve", name = "gb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1182 = Static8.method128(" weitere Optionen");

	@OriginalMember(owner = "client!ve", name = "hb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1183 = aClass18_1180;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)Lclient!ef;")
	public static Class20 method3089(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class20 local15 = Static84.method1826(arg0);
		if (arg1 == -1) {
			return local15;
		} else if (local15 == null || local15.aClass20Array1 == null || local15.aClass20Array1.length <= arg1) {
			return null;
		} else {
			return local15.aClass20Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "(I)V")
	public static void method3090() {
		aClass18_1181 = null;
		aClass50_1 = null;
		anIntArray416 = null;
		aClass18_1179 = null;
		aClass18_1180 = null;
		aClass18_1182 = null;
		aClass18_1183 = null;
	}
}
