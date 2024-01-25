import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static484 {

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "Lclient!sk;")
	public static Class4_Sub42 aClass4_Sub42_2;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "Lclient!td;")
	public static Class313 aClass313_2;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Lclient!vg;")
	public static final Class340 aClass340_7 = new Class340();

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!op;")
	public static final Class250 aClass250_11 = new Class250();

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
	public static final int anInt8860 = Static244.method3930(1600);

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V")
	public static void method7227() {
		if (Static529.anInt9422 < 0) {
			Static529.anInt9422 = 0;
			Static189.anInt3714 = -1;
			Class1_Sub4_Sub4_Sub2.lb = -1;
		}
		if (Static455.anInt3445 < Static529.anInt9422) {
			Class1_Sub4_Sub4_Sub2.lb = -1;
			Static189.anInt3714 = -1;
			Static529.anInt9422 = Static455.anInt3445;
		}
		if (Static480.anInt10076 < 0) {
			Static189.anInt3714 = -1;
			Class1_Sub4_Sub4_Sub2.lb = -1;
			Static480.anInt10076 = 0;
		}
		if (Static480.anInt10076 > Static455.anInt3442) {
			Class1_Sub4_Sub4_Sub2.lb = -1;
			Static189.anInt3714 = -1;
			Static480.anInt10076 = Static455.anInt3442;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method7228(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static157.method2911(arg0);
	}
}
