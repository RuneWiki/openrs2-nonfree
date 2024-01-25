import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!o", name = "j", descriptor = "Lclient!dp;")
	public static Class51 aClass51_11;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Lclient!j;")
	public static final Class113 aClass113_11 = new Class113(2, 4);

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	public static int anInt4143 = 0;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Lclient!o;")
	public static final Class169 aClass169_222 = new Class169("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!o", name = "k", descriptor = "Z")
	public static boolean aBoolean423 = true;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Z")
	public static boolean method3678() {
		return Static271.anInt4720 == 0 ? Static197.aClass1_Sub7_Sub1_3.method1055() : true;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIB)B")
	public static byte method3681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
	public static void method3682() {
		for (@Pc(10) Class41_Sub6 local10 = (Class41_Sub6) Static245.aClass208_5.method4656(); local10 != null; local10 = (Class41_Sub6) Static245.aClass208_5.method4656()) {
			Static181.method4751(local10);
		}
		@Pc(36) int local36;
		@Pc(34) int local34;
		if (Static188.aClass135_Sub1_1.method2747(Static25.anInt394)) {
			local34 = 3;
			local36 = 0;
		} else {
			local34 = Static35.anInt678;
			local36 = Static35.anInt678;
		}
		Static50.method806();
		for (@Pc(45) int local45 = local36; local45 <= local34; local45++) {
			Static50.method808();
			Static50.method811(local45);
			Static50.method815(local45);
		}
		Static50.method817();
		Static50.method821();
	}
}
