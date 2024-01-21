import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!od", name = "Ub", descriptor = "I")
	public static int anInt1538;

	@OriginalMember(owner = "client!od", name = "bc", descriptor = "Lclient!a;")
	public static Class1 aClass1_3;

	@OriginalMember(owner = "client!od", name = "zc", descriptor = "[B")
	public static byte[] aByteArray44;

	@OriginalMember(owner = "client!od", name = "Pc", descriptor = "Lclient!wb;")
	private static Class65 aClass65_714 = Static24.method441("Enter object name");

	@OriginalMember(owner = "client!od", name = "Eb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_708 = aClass65_714;

	@OriginalMember(owner = "client!od", name = "Hb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_709 = Static24.method441("scroll:");

	@OriginalMember(owner = "client!od", name = "Hc", descriptor = "Lclient!wb;")
	private static Class65 aClass65_713 = Static24.method441("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!od", name = "Vb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_710 = aClass65_713;

	@OriginalMember(owner = "client!od", name = "dc", descriptor = "Z")
	public static volatile boolean aBoolean85 = false;

	@OriginalMember(owner = "client!od", name = "uc", descriptor = "Lclient!wb;")
	public static Class65 aClass65_711 = Static24.method441("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!od", name = "Ec", descriptor = "Lclient!wb;")
	public static Class65 aClass65_712 = Static24.method441("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!od", name = "Qc", descriptor = "Lclient!wb;")
	public static Class65 aClass65_715 = aClass65_709;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(B)V")
	public static void method923() {
		aClass65_711 = null;
		aClass65_714 = null;
		aClass65_710 = null;
		aClass65_712 = null;
		aByteArray44 = null;
		aClass1_3 = null;
		aClass65_709 = null;
		aClass65_708 = null;
		aClass65_715 = null;
		aClass65_713 = null;
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	public static void method924() {
		for (@Pc(8) int local8 = -1; local8 < Static54.anInt1640; local8++) {
			@Pc(18) int local18;
			if (local8 == -1) {
				local18 = 2047;
			} else {
				local18 = Static24.anIntArray99[local8];
			}
			@Pc(26) Class2_Sub1_Sub1_Sub2_Sub2 local26 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local18];
			if (local26 != null) {
				Static110.method1846(1, local26);
			}
		}
	}
}
