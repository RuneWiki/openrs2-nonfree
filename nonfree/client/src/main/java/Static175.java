import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static175 {

	@OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
	public static int anInt3770 = 0;

	@OriginalMember(owner = "client!sa", name = "ab", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1287 = Static200.method3116("sl_back");

	@OriginalMember(owner = "client!sa", name = "cb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1288 = Static200.method3116("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!sa", name = "fb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1289 = Static200.method3116("<)4col>");

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ah;III)V")
	public static void method2827(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static60.aClass6_9 != null || Static162.aBoolean261 || (arg0 == null || Static157.method2654(arg0) == null)) {
			return;
		}
		Static60.aClass6_9 = arg0;
		Static84.aClass6_8 = Static157.method2654(arg0);
		Static184.anInt3955 = arg1;
		Static37.aBoolean55 = false;
		Static29.anInt707 = arg2;
		Static56.anInt1481 = 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!nc;)Lclient!hi;")
	public static Class45_Sub1 method2828(@OriginalArg(1) Class1_Sub9 arg0) {
		return new Class45_Sub1(arg0.method932(), arg0.method932(), arg0.method932(), arg0.method932(), arg0.method920(), arg0.method895());
	}
}
