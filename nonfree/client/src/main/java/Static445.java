import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!pba", name = "t", descriptor = "F")
	public static float aFloat147;

	@OriginalMember(owner = "client!pba", name = "w", descriptor = "I")
	public static int anInt6142;

	@OriginalMember(owner = "client!pba", name = "u", descriptor = "I")
	public static int anInt6140 = 104;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IZLclient!rca;)Z")
	public static boolean method5102(@OriginalArg(0) int arg0, @OriginalArg(2) Class296 arg1) {
		Static153.aClass26_2.method6461(arg1.anIntArray658[arg0], arg1.anIntArray657[arg0], arg1.anIntArray659[arg0], Static366.anIntArray490);
		@Pc(27) int local27 = Static366.anIntArray490[2];
		if (local27 < 50) {
			return false;
		} else {
			arg1.aShortArray134[arg0] = (short) (Static104.anInt2176 + Static366.anIntArray490[0] * Static651.anInt10890 / local27);
			arg1.aShortArray133[arg0] = (short) (Static366.anIntArray490[1] * Static493.anInt8807 / local27 + Static283.anInt4862);
			arg1.aShortArray135[arg0] = (short) local27;
			return true;
		}
	}

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "(B)V")
	public static void method5103() {
		Static243.aClient1.method1459();
		Static5.method6557();
		Static96.aClass44_46 = null;
		Static192.anInt3587 = 0;
		Static481.aClass14_Sub29_Sub1_2.anInt7264 = 0;
		Static349.aClass44_113 = null;
		Static264.aClass44_88 = null;
		Static487.anInt9463 = 0;
		Static65.method1317();
		Static432.aClass229_2 = null;
		Static678.aClass111Array1 = null;
		Static491.anInt8761 = 0;
		Static521.aString86 = null;
		Static3.anInt23 = 0;
		Static128.aClass229_1 = null;
		Static592.anInt1870 = 0;
	}
}
