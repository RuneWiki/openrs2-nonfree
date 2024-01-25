import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static156 {

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
	public static int anInt2895;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "Lclient!kja;")
	public static final Class194 aClass194_2 = new Class194();

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "Lclient!ko;")
	public static final Class198 aClass198_4 = new Class198();

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
	public static int anInt2899 = 0;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V")
	public static void method2707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static379.method4946()) {
			return;
		}
		if (Static53.anInt1190 != arg0) {
			Static1.aString83 = "";
		}
		Static141.anInt2583 = arg1;
		Static53.anInt1190 = arg0;
		Static53.method1256(6);
	}
}
