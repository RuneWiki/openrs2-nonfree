import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Lclient!kc;")
	public static Class37 aClass37_3 = new Class37(64);

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!mc;")
	public static Class42 aClass42_87 = Static23.method501("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	public static int anInt124 = 0;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Lclient!mc;")
	private static Class42 aClass42_91 = Static23.method501("Unable to connect)3");

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Lclient!mc;")
	public static Class42 aClass42_88 = aClass42_91;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Lclient!mc;")
	public static Class42 aClass42_89 = aClass42_91;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!mc;")
	public static Class42 aClass42_90 = Static23.method501("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	public static int anInt125 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method102() {
		aClass42_88 = null;
		aClass42_90 = null;
		aClass42_91 = null;
		aClass37_3 = null;
		aClass42_89 = null;
		aClass42_87 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Lclient!mc;")
	public static Class42 method103() {
		@Pc(3) Class42 local3 = new Class42();
		local3.aByteArray17 = new byte[100];
		local3.anInt1468 = 0;
		return local3;
	}
}
