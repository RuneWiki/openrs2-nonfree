import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static437 {

	@OriginalMember(owner = "client!se", name = "L", descriptor = "I")
	public static int anInt7563;

	@OriginalMember(owner = "client!se", name = "I", descriptor = "[I")
	public static final int[] anIntArray717 = new int[14];

	@OriginalMember(owner = "client!se", name = "O", descriptor = "Lclient!im;")
	public static final Class140 aClass140_119 = new Class140(110, 6);

	@OriginalMember(owner = "client!se", name = "P", descriptor = "I")
	public static int anInt7566 = 0;

	@OriginalMember(owner = "client!se", name = "Q", descriptor = "Lclient!jn;")
	public static final Class155 aClass155_7 = new Class155();

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6310(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static144.method2331(Static147.aClass296_133);
			Static455.aClass1_Sub6_Sub2_2.method3937(Static282.method6464(arg0));
			Static455.aClass1_Sub6_Sub2_2.method3917(arg0);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)Lclient!hd;")
	public static Class1_Sub1_Sub5 method6313() {
		return Static118.aClass1_Sub1_Sub5_2;
	}
}
