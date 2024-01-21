import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	public static int anInt1038 = 0;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	public static int anInt1039 = 0;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_339 = Static181.method2795("Lade Texturen )2 ");

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method807() {
		Static210.aFontMetrics1 = null;
		Static93.anImage3 = null;
		Static159.aFont1 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!eh;ILclient!eh;)V")
	public static void method808(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Class28 arg1) {
		Static25.aClass28_187 = arg0;
		Static181.aClass28_170 = arg1;
		Static156.anInt4254 = Static181.aClass28_170.method846(3);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!eh;)V")
	public static void method810(@OriginalArg(1) Class28 arg0) {
		Static113.aClass28_121 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	public static void method811() {
		if (Static206.aClass100_1 != null) {
			@Pc(8) Class100 local8 = Static206.aClass100_1;
			synchronized (Static206.aClass100_1) {
				Static206.aClass100_1 = null;
			}
		}
	}
}
