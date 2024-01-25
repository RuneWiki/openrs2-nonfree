import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Lclient!fia;")
	public static final Class117 aClass117_12 = new Class117(6, 0, 4, 2);

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_185 = new Class200(109, 3);

	@OriginalMember(owner = "client!re", name = "p", descriptor = "[I")
	public static final int[] anIntArray564 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!re", name = "C", descriptor = "I")
	public static int anInt7871 = -1;

	@OriginalMember(owner = "client!re", name = "D", descriptor = "I")
	public static int anInt7872 = 0;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(III)V")
	public static void method6903(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static613.aClass13_82 == null) {
			return;
		}
		@Pc(12) int local12 = Static294.anInt5311;
		@Pc(14) int local14 = Static259.anInt4870;
		Static352.method5273(arg0, arg1);
		if (Static518.anInt8368 == 0) {
			Static178.anInterface18_12 = null;
			Static178.anInterface18_12 = Static613.aClass13_82.method8107(Static613.aClass13_82.method8151(Static137.anInt2915, Static431.anInt7666), Static613.aClass13_82.method8120(Static137.anInt2915, Static431.anInt7666));
		} else if (Static518.anInt8368 == 1 && (Static65.anInterface18Array1 == null || local12 != Static294.anInt5311 || local14 != Static259.anInt4870)) {
			Static65.anInterface18Array1 = new Interface18[Static294.anInt5311 * Static259.anInt4870];
			for (@Pc(48) int local48 = 0; local48 < Static65.anInterface18Array1.length; local48++) {
				Static65.anInterface18Array1[local48] = Static613.aClass13_82.method8107(Static613.aClass13_82.method8151(Static456.anInt7437, Static5.anInt108), Static613.aClass13_82.method8120(Static456.anInt7437, Static5.anInt108));
			}
			Static18.anIntArray38 = new int[Static259.anInt4870 * Static294.anInt5311];
			Static498.anInt7911 = 1;
		}
		Static578.aBoolean673 = true;
	}
}
