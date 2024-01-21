import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!se", name = "N", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!se", name = "X", descriptor = "I")
	public static int anInt2830;

	@OriginalMember(owner = "client!se", name = "O", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[112];

	@OriginalMember(owner = "client!se", name = "U", descriptor = "Lclient!ie;")
	public static Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!se", name = "W", descriptor = "Lclient!r;")
	public static Class61 aClass61_857 = Static129.method2060("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "Lclient!r;")
	public static Class61 aClass61_858 = Static129.method2060(":tradereq:");

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
	public static void method1824() {
		aBooleanArray14 = null;
		aClass37_1 = null;
		aClass61_857 = null;
		aClass61_858 = null;
		anIntArray342 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)V")
	public static void method1825(@OriginalArg(1) int arg0) {
		if (!Static21.method461(arg0)) {
			return;
		}
		@Pc(14) Class5_Sub11[] local14 = Static56.aClass5_Sub11ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class5_Sub11 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt1617 = 0;
				local22.anInt1672 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IBII)I")
	public static int method1828(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}
}
