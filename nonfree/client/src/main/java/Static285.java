import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
	public static int anInt4940;

	@OriginalMember(owner = "client!qp", name = "F", descriptor = "Z")
	public static boolean aBoolean377;

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "Lclient!eo;")
	public static final Class62 aClass62_14 = new Class62(4, 4);

	@OriginalMember(owner = "client!qp", name = "C", descriptor = "I")
	public static int anInt4943 = 0;

	@OriginalMember(owner = "client!qp", name = "G", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_109 = new Class205(47, 2);

	@OriginalMember(owner = "client!qp", name = "H", descriptor = "I")
	public static int anInt4946 = 0;

	@OriginalMember(owner = "client!qp", name = "I", descriptor = "Z")
	public static boolean aBoolean378 = true;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public static void method4328() {
		if (Static263.anInt4604 <= 0) {
			Static250.aString52 = "";
			return;
		}
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static79.aStringArray120.length; local17++) {
			if (Static79.aStringArray120[local17].startsWith("--> ")) {
				local15++;
				if (Static263.anInt4604 == local15) {
					Static250.aString52 = Static79.aStringArray120[local17].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	public static void method4333() {
		for (@Pc(11) int local11 = 0; local11 < Static171.anInt3311; local11++) {
			@Pc(17) int local17 = Static143.anIntArray583[local11];
			@Pc(21) Class1_Sub5_Sub1_Sub2 local21 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local17];
			if (local21 != null) {
				Static158.method2855(local21.aClass133_1.anInt3332, local21);
			}
		}
	}
}
