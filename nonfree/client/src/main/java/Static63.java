import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "Lclient!fc;")
	public static Class25 aClass25_636 = Static78.method1313("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_637 = Static78.method1313("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "Lclient!fc;")
	public static Class25 aClass25_638 = Static78.method1313("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!ke", name = "A", descriptor = "Lclient!fc;")
	private static Class25 aClass25_639 = Static78.method1313("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!ke", name = "B", descriptor = "Lclient!fc;")
	public static Class25 aClass25_640 = aClass25_639;

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "Lclient!fc;")
	public static Class25 aClass25_641 = Static78.method1313("lila:");

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "Z")
	public static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "Lclient!fc;")
	public static Class25 aClass25_642 = aClass25_639;

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "Lclient!fc;")
	public static Class25 aClass25_643 = Static78.method1313("(U1");

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "Lclient!fc;")
	public static Class25 aClass25_644 = Static78.method1313("auf der Hautpseite)3");

	@OriginalMember(owner = "client!ke", name = "M", descriptor = "[I")
	public static int[] anIntArray273 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
	public static int anInt1414 = 0;

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "Lclient!fc;")
	public static Class25 aClass25_645 = Static78.method1313("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
	public static void method1107() {
		aClass25_637 = null;
		aClass25_639 = null;
		aClass25_636 = null;
		aClass25_640 = null;
		aClass25_638 = null;
		aClass25_642 = null;
		anIntArray273 = null;
		aClass25_645 = null;
		aClass25_641 = null;
		aClass25_643 = null;
		aClass25_644 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZILclient!oc;)Lclient!td;")
	public static Class1_Sub17 method1108(@OriginalArg(1) int arg0, @OriginalArg(2) Class56 arg1) {
		@Pc(8) byte[] local8 = arg1.method1280(arg0);
		return local8 == null ? null : new Class1_Sub17(local8);
	}
}
