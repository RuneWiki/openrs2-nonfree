import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "Lclient!pd;")
	public static Class20 aClass20_36;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
	public static int anInt1762;

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
	public static int anInt1764;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
	public static final int anInt1759 = 3353893;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
	public static int anInt1760 = 99;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "Lclient!ja;")
	private static Class39 aClass39_926 = Static28.method504("Login limit exceeded)3");

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "Lclient!ja;")
	public static Class39 aClass39_927 = aClass39_926;

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "Lclient!ja;")
	public static Class39 aClass39_928 = Static28.method504("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!mb", name = "I", descriptor = "Lclient!ja;")
	private static Class39 aClass39_929 = Static28.method504("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!mb", name = "J", descriptor = "Lclient!ja;")
	public static Class39 aClass39_930 = aClass39_929;

	@OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
	public static int anInt1765 = 0;

	@OriginalMember(owner = "client!mb", name = "O", descriptor = "Lclient!ja;")
	public static Class39 aClass39_931 = Static28.method504("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
	public static int anInt1768 = 0;

	@OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
	public static int anInt1769 = 0;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)Lclient!j;")
	public static Class4_Sub2_Sub10 method1207(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub2_Sub10 local10 = (Class4_Sub2_Sub10) Static23.aClass12_19.method235((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static70.aClass20_34.method474(6, arg0);
		local10 = new Class4_Sub2_Sub10();
		local10.anInt1415 = arg0;
		if (local20 != null) {
			local10.method919(new Class4_Sub16(local20));
		}
		local10.method920();
		if (local10.aBoolean76) {
			local10.aBoolean75 = false;
			local10.anInt1407 = 0;
		}
		Static23.aClass12_19.method234(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public static void method1208() {
		aClass39_929 = null;
		aClass20_36 = null;
		aClass39_927 = null;
		aClass39_930 = null;
		aClass39_926 = null;
		aClass39_931 = null;
		aClass39_928 = null;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)Z")
	public static boolean method1209(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}
}
