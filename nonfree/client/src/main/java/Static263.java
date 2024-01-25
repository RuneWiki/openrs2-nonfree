import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static263 {

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Lclient!jn;")
	public static Class176 aClass176_70;

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_108 = new Class362(13, 1);

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "Z")
	public static boolean aBoolean365 = false;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;ZBLjava/lang/String;)V")
	public static void method4439(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		Static135.aBoolean216 = arg1;
		Static278.aString57 = arg2;
		Static174.aString32 = arg0;
		if (!Static135.aBoolean216 && Static313.anInt4728 != 3 && (Static278.aString57.equals("") || Static174.aString32.equals(""))) {
			Static6.method139(3);
			return;
		}
		if (Static313.anInt4728 != 1) {
			Static496.anInt9027 = -1;
			Static15.anInt244 = 0;
		}
		Static152.aBoolean276 = false;
		Static6.method139(-3);
		Static587.anInt10158 = 1;
		Static167.anInt3453 = 0;
		Static505.anInt9071 = 0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Component;Z)Lclient!le;")
	public static Class154 method4440(@OriginalArg(0) Component arg0) {
		return new Class154_Sub1(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;B)V")
	public static void method4441(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		Static147.method2808(true, arg3, arg0, arg1, arg2, -1);
	}
}
