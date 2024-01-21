import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "Z")
	public static boolean aBoolean124;

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "Lclient!ke;")
	public static Class52 aClass52_29;

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "Lclient!vc;")
	public static Class94 aClass94_5;

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1182 = Static193.method3027(" x ");

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1183 = Static193.method3027("http:)4)4");

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1186 = Static193.method3027("World");

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1184 = aClass70_1186;

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1185 = Static193.method3027("settings");

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
	public static int anInt2475 = -1;

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1187 = aClass70_1186;

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1188 = Static193.method3027("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
	public static int anInt2476 = -1;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
	public static void method1755() {
		if (Static50.aBoolean66 && Static182.anInt3727 != Static137.anInt2795) {
			Static136.method1945(Static191.anInt3881, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0], Static137.anInt2795, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], Static37.anInt3233);
		} else if (Static137.anInt2795 != Static191.anInt3886) {
			Static191.anInt3886 = Static137.anInt2795;
			Static10.method249(Static137.anInt2795);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ej;")
	public static RuntimeException_Sub1 method1757(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
