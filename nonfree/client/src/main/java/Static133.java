import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static133 {

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "Lclient!wh;")
	public static Class247 aClass247_1;

	@OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
	public static int anInt2471;

	@OriginalMember(owner = "client!hd", name = "eb", descriptor = "Ljava/lang/String;")
	public static String aString24;

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_59 = new Class211(96, -2);

	@OriginalMember(owner = "client!hd", name = "bb", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_80 = new Class48(36, 11);

	@OriginalMember(owner = "client!hd", name = "fb", descriptor = "I")
	public static int anInt2478 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)I")
	public static int method1957(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIBLclient!sk;)V")
	public static void method1958(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class25_Sub1_Sub1 arg3) {
		Static382.method5421(arg3.anInt6080, arg0, arg3.aByte70, arg2, 0, arg3.anInt6077, arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZIZ)V")
	public static void method1962(@OriginalArg(2) boolean arg0) {
		Static386.anInt6287++;
		Static228.method3176();
		if (arg0) {
			Static310.anInt5274++;
			Static392.method5565();
		}
	}
}
