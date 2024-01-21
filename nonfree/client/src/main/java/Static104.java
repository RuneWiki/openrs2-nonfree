import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static104 {

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "Lclient!dd;")
	public static Class16 aClass16_13;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "Lclient!ea;")
	public static Class18 aClass18_773 = Static8.method128("(U0a )2 in: ");

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	public static int anInt3065 = 0;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
	public static int anInt3067 = 0;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Lclient!rc;")
	public static Class66 aClass66_11 = new Class66(64);

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "Lclient!ea;")
	public static Class18 aClass18_774 = Static8.method128("Abbrechen");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public static void method2155() {
		aClass16_13 = null;
		aClass66_11 = null;
		aClass18_774 = null;
		aClass18_773 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIILclient!dd;)Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1 method2156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class16 arg2) {
		return Static65.method1300(arg0, arg2, arg1) ? Static123.method2420() : null;
	}
}
