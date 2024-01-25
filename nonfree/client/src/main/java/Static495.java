import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "[I")
	public static int[] anIntArray581;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "[Lclient!kr;")
	public static Class20[] aClass20Array11;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_48 = new Class233(10);

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "J")
	public static long aLong231 = 0L;

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
	public static int anInt8417 = 0;

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "Lclient!jg;")
	public static final Class174 aClass174_13 = new Class174();

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIBI)V")
	public static void method7076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = Static225.anInt4615;
		if (local10 == 0) {
			return;
		}
		if (local10 == 1) {
			Static22.anInt10183 = arg3;
			Static78.anInt1693 = arg2;
			Static225.anInt4615 = 2;
			Static238.anInt4740 = arg0;
			Static106.anInt9893 = arg1;
		} else if (local10 == 2) {
			if (Static78.anInt1693 > arg2) {
				Static78.anInt1693 = arg2;
			}
			if (Static106.anInt9893 > arg1) {
				Static106.anInt9893 = arg1;
			}
			if (arg3 > Static22.anInt10183) {
				Static22.anInt10183 = arg3;
			}
			if (Static238.anInt4740 < arg0) {
				Static238.anInt4740 = arg0;
			}
		}
	}
}
