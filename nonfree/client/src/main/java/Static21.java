import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!c", name = "Gb", descriptor = "I")
	public static int anInt726;

	@OriginalMember(owner = "client!c", name = "Kb", descriptor = "Lclient!jc;")
	public static Class40 aClass40_9;

	@OriginalMember(owner = "client!c", name = "Lb", descriptor = "[I")
	public static int[] anIntArray50;

	@OriginalMember(owner = "client!c", name = "Yb", descriptor = "I")
	public static int anInt736;

	@OriginalMember(owner = "client!c", name = "Hb", descriptor = "I")
	public static int anInt727 = 0;

	@OriginalMember(owner = "client!c", name = "Nb", descriptor = "[I")
	public static int[] anIntArray51 = new int[50];

	@OriginalMember(owner = "client!c", name = "Qb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_483 = Static107.method1838("mapscene");

	@OriginalMember(owner = "client!c", name = "Wb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_485 = Static107.method1838("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!c", name = "Vb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_484 = aClass28_485;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)J")
	public static long method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass19_1 == null ? 0L : local7.aClass19_1.aLong36;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!gg;)Z")
	public static boolean method471(@OriginalArg(1) Class28 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static38.anInt1022; local16++) {
			if (arg0.method1140(Static127.aClass28Array43[local16])) {
				return true;
			}
		}
		return arg0.method1140(Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass28_953);
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
	public static void method472() {
		aClass28_484 = null;
		anIntArray51 = null;
		aClass28_483 = null;
		aClass40_9 = null;
		aClass28_485 = null;
		anIntArray50 = null;
	}
}
