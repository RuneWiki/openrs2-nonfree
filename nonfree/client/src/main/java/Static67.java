import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	public static int anInt1245;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	public static int anInt1247;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "[Lclient!kv;")
	public static final Class139[] aClass139Array1 = new Class139[16];

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	public static void method1088() {
		try {
			if (Static255.anInt1147 == 1) {
				@Pc(14) int local14 = Static420.aClass1_Sub6_Sub2_3.method4475();
				if (local14 > 0 && Static420.aClass1_Sub6_Sub2_3.method4461()) {
					local14 -= Static31.anInt497;
					if (local14 < 0) {
						local14 = 0;
					}
					Static420.aClass1_Sub6_Sub2_3.method4479(local14);
					return;
				}
				Static420.aClass1_Sub6_Sub2_3.method4478();
				Static420.aClass1_Sub6_Sub2_3.method4481();
				Static83.aClass36_1 = null;
				if (Static2.aClass82_1 == null) {
					Static255.anInt1147 = 0;
				} else {
					Static255.anInt1147 = 2;
				}
				Static34.aClass1_Sub31_1 = null;
			}
		} catch (@Pc(53) Exception local53) {
			local53.printStackTrace();
			Static420.aClass1_Sub6_Sub2_3.method4478();
			Static2.aClass82_1 = null;
			Static255.anInt1147 = 0;
			Static83.aClass36_1 = null;
			Static34.aClass1_Sub31_1 = null;
		}
	}
}
