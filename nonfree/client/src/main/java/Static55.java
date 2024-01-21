import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	public static int anInt1525;

	@OriginalMember(owner = "client!id", name = "D", descriptor = "Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!id", name = "F", descriptor = "Lclient!ld;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!id", name = "M", descriptor = "I")
	public static int anInt1556;

	@OriginalMember(owner = "client!id", name = "fb", descriptor = "I")
	public static int anInt1571;

	@OriginalMember(owner = "client!id", name = "A", descriptor = "Lclient!id;")
	public static Class34 aClass34_738 = Static9.method266("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!id", name = "B", descriptor = "I")
	public static int anInt1547 = 0;

	@OriginalMember(owner = "client!id", name = "K", descriptor = "I")
	public static int anInt1554 = 0;

	@OriginalMember(owner = "client!id", name = "U", descriptor = "Lclient!id;")
	public static Class34 aClass34_739 = Static9.method266("<col=40ff00>");

	@OriginalMember(owner = "client!id", name = "X", descriptor = "Lclient!id;")
	public static Class34 aClass34_740 = Static9.method266("<br>(X");

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "Lclient!id;")
	public static Class34 aClass34_741 = Static9.method266("Titelbild geladen)3");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)Z")
	public static boolean method954(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lclient!v;")
	public static Class1_Sub1_Sub15 method955(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub15 local12 = (Class1_Sub1_Sub15) Static114.aClass63_23.method1663((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static81.aClass35_Sub1_19.method1573(arg0, 0);
		if (local27 == null) {
			return null;
		}
		local12 = new Class1_Sub1_Sub15();
		@Pc(37) int local37 = 0;
		@Pc(42) Class1_Sub19 local42 = new Class1_Sub19(local27);
		local42.anInt3111 = local42.aByteArray42.length - 12;
		@Pc(53) int local53 = local42.method2046();
		local12.anInt2923 = local42.method2051();
		local12.anInt2918 = local42.method2051();
		local12.anInt2922 = local42.method2051();
		local12.anInt2917 = local42.method2051();
		local42.anInt3111 = 0;
		local12.aClass34_1507 = local42.method2091();
		local12.aClass34Array22 = new Class34[local53];
		local12.anIntArray360 = new int[local53];
		local12.anIntArray359 = new int[local53];
		while (local42.aByteArray42.length - 12 > local42.anInt3111) {
			@Pc(99) int local99 = local42.method2051();
			if (local99 == 3) {
				local12.aClass34Array22[local37] = local42.method2084();
			} else if (local99 >= 100 || local99 == 21 || local99 == 38 || local99 == 39) {
				local12.anIntArray360[local37] = local42.method2072();
			} else {
				local12.anIntArray360[local37] = local42.method2046();
			}
			local12.anIntArray359[local37++] = local99;
		}
		Static114.aClass63_23.method1659(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(B)V")
	public static void method989() {
		aClass34_741 = null;
		aClass1_Sub1_Sub2_Sub1_3 = null;
		aClass34_740 = null;
		aClass46_1 = null;
		aClass34_739 = null;
		aClass34_738 = null;
	}
}
