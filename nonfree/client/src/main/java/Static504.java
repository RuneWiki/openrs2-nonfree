import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!pla", name = "D", descriptor = "I")
	public static int anInt8040;

	@OriginalMember(owner = "client!pla", name = "A", descriptor = "D")
	public static double aDouble18;

	@OriginalMember(owner = "client!pla", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!pla", name = "F", descriptor = "Z")
	public static boolean aBoolean540 = false;

	@OriginalMember(owner = "client!pla", name = "g", descriptor = "(B)V")
	public static void method6879() {
		if (Static631.aClass22_13 != null) {
			Static631.aClass22_13.method9397();
			Static184.aClass57_3 = null;
			Static631.aClass22_13 = null;
		}
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(Lclient!nt;IIZLclient!ha;)V")
	public static void method6880(@OriginalArg(0) Class270 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class22 arg3) {
		for (@Pc(18) int local18 = 63; local18 >= 0; local18--) {
			Static633.method8323(true, false);
			@Pc(42) int local42 = (local18 & 0x3F) << 10 | 0x3F | 0x380;
			@Pc(46) int local46 = Static537.anIntArray601[local42];
			Static134.method2374(false, true);
			arg3.aa(arg1, arg2 + (arg0.anInt7045 * (63 - local18) >> 6), arg0.anInt7015, (arg0.anInt7045 >> 6) + 1, local46, 0);
		}
	}
}
