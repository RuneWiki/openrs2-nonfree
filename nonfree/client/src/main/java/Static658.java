import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static658 {

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray47;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
	public static int anInt10759 = 0;

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_266 = new Class251(3, 1);

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_267 = new Class251(83, 3);

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_268 = new Class251(19, 7);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z")
	public static boolean method9178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static109.method1773(arg0, arg1) || Static190.method2832(-1, arg0, arg1);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	public static void method9180() {
		if (Static663.anInt10804 <= 0) {
			Static434.aString85 = "";
			return;
		}
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < aStringArray47.length; local19++) {
			if (aStringArray47[local19].indexOf("--> ") != -1) {
				local17++;
				if (Static663.anInt10804 == local17) {
					Static434.aString85 = aStringArray47[local19].substring(aStringArray47[local19].indexOf(">") + 2);
					return;
				}
			}
		}
	}
}
