import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
	public static int anInt862;

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_34 = new Class107(25, -1);

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
	public static final int anInt861 = 1407;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIII)V")
	public static void method758(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(6) Class4_Sub6 local6 = (Class4_Sub6) Static54.aClass141_3.method3357(); local6 != null; local6 = (Class4_Sub6) Static54.aClass141_3.method3360()) {
			if (Static378.anInt4244 >= local6.anInt3840) {
				local6.method5737();
			} else {
				Static417.method5559((local6.anInt3838 << 7) + 64, (local6.anInt3847 << 7) + 64, local6.anInt3845 * 2, local6.anInt3839, arg1 >> 1, arg2 >> 1);
				Static178.aClass71_5.method5446(Static262.anIntArray406[1] + arg0, local6.aString29, 0, local6.anInt3844 | 0xFF000000, Static262.anIntArray406[0] + arg3);
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
	public static void method759() {
		if (Static282.aString46.toLowerCase().indexOf("microsoft") != -1) {
			Static393.anIntArray583[186] = 57;
			Static393.anIntArray583[190] = 72;
			Static393.anIntArray583[219] = 42;
			Static393.anIntArray583[187] = 27;
			Static393.anIntArray583[189] = 26;
			Static393.anIntArray583[222] = 59;
			Static393.anIntArray583[223] = 28;
			Static393.anIntArray583[188] = 71;
			Static393.anIntArray583[192] = 58;
			Static393.anIntArray583[221] = 43;
			Static393.anIntArray583[191] = 73;
			Static393.anIntArray583[220] = 74;
			return;
		}
		Static393.anIntArray583[47] = 73;
		Static393.anIntArray583[93] = 43;
		Static393.anIntArray583[44] = 71;
		Static393.anIntArray583[92] = 74;
		if (Static282.aMethod2 == null) {
			Static393.anIntArray583[192] = 58;
			Static393.anIntArray583[222] = 59;
		} else {
			Static393.anIntArray583[222] = 58;
			Static393.anIntArray583[520] = 59;
			Static393.anIntArray583[192] = 28;
		}
		Static393.anIntArray583[59] = 57;
		Static393.anIntArray583[91] = 42;
		Static393.anIntArray583[61] = 27;
		Static393.anIntArray583[45] = 26;
		Static393.anIntArray583[46] = 72;
	}
}
