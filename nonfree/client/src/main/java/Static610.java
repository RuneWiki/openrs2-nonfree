import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "Lclient!q;")
	public static Class283 aClass283_1;

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "Lclient!wm;")
	public static Class390 aClass390_118;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "[I")
	public static final int[] anIntArray550 = new int[32];

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
	public static void method8302(@OriginalArg(0) int arg0) {
		Static128.anInt2605 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static216.anInt4042; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static233.anInt4238; local6++) {
				if (Static635.aClass226ArrayArrayArray3[arg0][local3][local6] == null) {
					Static635.aClass226ArrayArrayArray3[arg0][local3][local6] = new Class226(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method8303(@OriginalArg(1) Class65 arg0) {
		for (@Pc(4) Class28_Sub5 local4 = (Class28_Sub5) Static288.aClass156_3.method3776(); local4 != null; local4 = (Class28_Sub5) Static288.aClass156_3.method3783()) {
			if (local4.aBoolean611) {
				local4.method5857(arg0);
			}
		}
	}
}
