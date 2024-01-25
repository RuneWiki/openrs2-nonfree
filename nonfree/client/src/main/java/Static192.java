import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static192 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[8];

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_80 = new Class25(78, -1);

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
	public static int anInt3359 = -1;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)V")
	public static void method2760(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static205.aString31 = arg1;
		Static448.aString72 = arg0;
		if (Static25.anInt7276 != 3 && (Static448.aString72.equals("") || Static205.aString31.equals(""))) {
			Static108.method1796(3);
			return;
		}
		if (Static25.anInt7276 != 1) {
			Static353.anInt6219 = -1;
			Static461.anInt7749 = 0;
		}
		Static149.aBoolean502 = false;
		Static108.method1796(-3);
		Static220.anInt3723 = 0;
		Static457.anInt7605 = 0;
		Static129.anInt2192 = 1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!hv;")
	public static Class115 method2762(@OriginalArg(1) Component arg0) {
		return new Class115_Sub1(arg0);
	}
}
