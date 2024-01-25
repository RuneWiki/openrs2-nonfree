import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ck", name = "G", descriptor = "Lclient!ew;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "[[I")
	public static int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!ck", name = "D", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_9 = new Class27(16);

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "[I")
	public static final int[] anIntArray64 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ck", name = "J", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_14 = new Class84("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!ck", name = "L", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_34 = new Class131(45, 3);

	@OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
	public static int anInt963 = 0;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)V")
	public static void method861() {
		Static55.method989(Static89.aClass131_55);
		Static232.aClass1_Sub1_Sub1_2.method4115(0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method862(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static149.aStringArray30.length; local7++) {
			if (Static149.aStringArray30[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}
}
