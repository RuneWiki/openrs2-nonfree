import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "Lclient!sg;")
	public static Class77 aClass77_745 = Static146.method2172("Benutzername: ");

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!sg;")
	public static Class77 aClass77_746 = Static146.method2172("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!sg;")
	public static Class77 aClass77_747 = Static146.method2172("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	public static int anInt1871 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!ig;)V")
	public static void method1345(@OriginalArg(1) Class2_Sub9 arg0) {
		arg0.aBoolean182 = false;
		if (arg0.aClass2_Sub5_5 != null) {
			arg0.aClass2_Sub5_5.anInt1942 = 0;
		}
		for (@Pc(20) Class2_Sub9 local20 = arg0.method2925(); local20 != null; local20 = arg0.method2926()) {
			method1345(local20);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method1346() {
		aClass77_747 = null;
		aClass77_746 = null;
		aClass77_745 = null;
	}
}
