import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!oc", name = "yb", descriptor = "I")
	public static int anInt3022;

	@OriginalMember(owner = "client!oc", name = "Bb", descriptor = "I")
	public static int anInt3023;

	@OriginalMember(owner = "client!oc", name = "Cb", descriptor = "[Lclient!vi;")
	public static Class2_Sub1_Sub2[] aClass2_Sub1_Sub2Array9;

	@OriginalMember(owner = "client!oc", name = "Db", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!oc", name = "db", descriptor = "[S")
	public static final short[] aShortArray108 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!oc", name = "wb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1053 = Static151.method2243("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!oc", name = "zb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1054 = Static151.method2243("Choose Option");

	@OriginalMember(owner = "client!oc", name = "Ab", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1055 = aClass62_1054;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ld;I)V")
	public static void method2145(@OriginalArg(0) Class2_Sub13 arg0) {
		Static74.method1041(200000, arg0);
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
	public static void method2149() {
		@Pc(5) Object local5 = Static118.anObject3;
		synchronized (Static118.anObject3) {
			if (Static214.anInt4479 == 0) {
				Static170.aClass41_3.method1044(new Class87(), 5);
			}
			Static214.anInt4479 = 600;
		}
	}
}
