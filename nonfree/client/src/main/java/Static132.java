import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!nf", name = "U", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!nf", name = "Y", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_15 = new Class53(16);

	@OriginalMember(owner = "client!nf", name = "Z", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[8];

	@OriginalMember(owner = "client!nf", name = "ab", descriptor = "I")
	public static int anInt2866 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)I")
	public static int method2032(@OriginalArg(1) int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V")
	public static void method2033() {
		Static39.anInt4460 = 0;
		Static196.anInt4032 = 0;
		Static169.method2459();
		Static33.method572();
		Static136.method3185();
		Static16.method302();
		@Pc(30) int local30;
		for (@Pc(24) int local24 = 0; local24 < Static39.anInt4460; local24++) {
			local30 = Static111.anIntArray226[local24];
			if (Static62.aClass7_Sub2_Sub2Array1[local30].anInt3043 != Static25.anInt581) {
				Static62.aClass7_Sub2_Sub2Array1[local30] = null;
			}
		}
		if (Static35.anInt838 != Static108.aClass2_Sub11_Sub1_3.anInt2235) {
			throw new RuntimeException("gpp1 pos:" + Static108.aClass2_Sub11_Sub1_3.anInt2235 + " psize:" + Static35.anInt838);
		}
		for (local30 = 0; local30 < Static145.anInt3126; local30++) {
			if (Static62.aClass7_Sub2_Sub2Array1[Static28.anIntArray60[local30]] == null) {
				throw new RuntimeException("gpp2 pos:" + local30 + " size:" + Static145.anInt3126);
			}
		}
	}
}
