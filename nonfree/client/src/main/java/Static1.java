import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "[I")
	public static int[] anIntArray3;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "[I")
	public static int[] anIntArray5;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "Lclient!ga;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "J")
	public static long aLong1 = 0L;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1 = Static146.method2172("Hier wechseln");

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Lclient!sg;")
	public static Class77 aClass77_2 = Static146.method2172("Lade Texturen )2 ");

	@OriginalMember(owner = "client!a", name = "w", descriptor = "Lclient!sg;")
	public static Class77 aClass77_3 = Static146.method2172(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!a", name = "z", descriptor = "Lclient!sg;")
	public static Class77 aClass77_4 = Static146.method2172("headicons_pk");

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
	public static void method4() {
		aClass77_1 = null;
		aClass77_3 = null;
		aClass77_4 = null;
		anIntArray5 = null;
		anIntArray3 = null;
		aClass77_2 = null;
		aCanvas1 = null;
		aClass29_1 = null;
		anIntArray1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IJ)V")
	public static void method8(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static181.anInt4605 >= 100) {
			Static174.method2943(Static41.aClass77_468, Static122.aClass77_219, 0);
			return;
		}
		@Pc(25) Class77 local25 = Static107.method1884(arg0).method2525();
		for (@Pc(27) int local27 = 0; local27 < Static181.anInt4605; local27++) {
			if (Static72.aLongArray4[local27] == arg0) {
				Static174.method2943(Static41.aClass77_468, Static146.method2168(new Class77[] { local25, Static98.aClass77_966 }), 0);
				return;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static51.anInt1395; local66++) {
			if (Static125.aLongArray6[local66] == arg0) {
				Static174.method2943(Static41.aClass77_468, Static146.method2168(new Class77[] { Static99.aClass77_967, local25, Static103.aClass77_981 }), 0);
				return;
			}
		}
		if (local25.method2519(Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.aClass77_1482)) {
			Static174.method2943(Static41.aClass77_468, Static165.aClass77_1377, 0);
			return;
		}
		Static72.aLongArray4[Static181.anInt4605] = arg0;
		Static173.aClass77Array26[Static181.anInt4605++] = Static107.method1884(arg0);
		Static8.anInt229 = Static52.anInt1417;
		Static124.aClass2_Sub18_Sub1_3.method2398(216);
		Static124.aClass2_Sub18_Sub1_3.method2384(arg0);
	}
}
