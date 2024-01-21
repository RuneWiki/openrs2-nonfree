import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static58 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
	public static int anInt1413 = 0;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	public static int anInt1415 = 0;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_26 = new Class66(100);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!a;IIB)V")
	public static void method1101(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static6.aClass1_2 != null || Static64.aBoolean76 || (arg0 == null || Static148.method2491(arg0) == null)) {
			return;
		}
		Static6.aClass1_2 = arg0;
		Static27.aClass1_10 = Static148.method2491(arg0);
		Static32.aBoolean41 = false;
		Static141.anInt3281 = arg2;
		Static174.anInt3906 = 0;
		Static128.anInt3049 = arg1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!nh;Lclient!nh;I)Lclient!ei;")
	public static Class4_Sub1_Sub7_Sub1_Sub1 method1102(@OriginalArg(1) int arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3) {
		return Static141.method2417(arg2, arg3, arg0) ? Static46.method921(arg1.method2878(arg0, arg3)) : null;
	}
}
