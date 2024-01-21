import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!jd;")
	public static Class36 aClass36_36;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	public static int anInt1505;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Lclient!ke;")
	public static Class39 aClass39_662 = Static2.method66("@yel@*V");

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Lclient!ke;")
	public static Class39 aClass39_663 = Static2.method66("huffman");

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!ke;")
	private static Class39 aClass39_664 = Static2.method66(" has logged out)3");

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Z")
	public static boolean aBoolean81 = false;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "Lclient!ke;")
	public static Class39 aClass39_665 = Static2.method66("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_666 = Static2.method66("gelb:");

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "Lclient!ke;")
	public static Class39 aClass39_667 = Static2.method66("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!ke;")
	public static Class39 aClass39_668 = Static2.method66("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "[I")
	public static int[] anIntArray210 = new int[50];

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "Lclient!ke;")
	public static Class39 aClass39_669 = Static2.method66("scrollen:");

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "Lclient!ke;")
	public static Class39 aClass39_670 = Static2.method66("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "Lclient!ke;")
	public static Class39 aClass39_671 = Static2.method66("Classic");

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "Lclient!ke;")
	public static Class39 aClass39_672 = aClass39_664;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!td;")
	public static RuntimeException_Sub1 method1053(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString8 = local12.aString8 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lclient!be;")
	public static Class2_Sub1_Sub3 method1054(@OriginalArg(0) int arg0) {
		@Pc(18) Class2_Sub1_Sub3 local18 = (Class2_Sub1_Sub3) Static63.aClass54_19.method1634((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static53.aClass36_34.method1761(3, arg0);
		local18 = new Class2_Sub1_Sub3();
		if (local28 != null) {
			local18.method164(new Class2_Sub5(local28));
		}
		Static63.aClass54_19.method1637((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method1055() {
		aClass39_668 = null;
		aClass39_662 = null;
		aClass39_671 = null;
		aClass39_664 = null;
		aClass39_669 = null;
		aClass39_672 = null;
		aClass39_670 = null;
		aClass39_667 = null;
		aClass36_36 = null;
		anIntArrayArray15 = null;
		aClass39_665 = null;
		anIntArray210 = null;
		aClass39_666 = null;
		aClass39_663 = null;
	}
}
