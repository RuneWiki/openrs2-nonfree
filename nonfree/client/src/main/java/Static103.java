import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BI)Lclient!ss;")
	public static Class219 method1572(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static448.aClass219ArrayArray2[local12] == null || Static448.aClass219ArrayArray2[local12][local16] == null) {
			@Pc(30) boolean local30 = Static130.method1891(local12);
			if (!local30) {
				return null;
			}
		}
		return Static448.aClass219ArrayArray2[local12][local16];
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V")
	public static void method1573() {
		Static296.anInt2704 = 1;
		Static363.anInt6169 = -1;
		Static37.aBoolean24 = false;
		Static122.anInt2164 = 0;
		Static430.anInt7428 = -3;
		Static431.anInt7436 = 0;
		Static269.anInt4844 = 0;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIBIII)V")
	public static void method1577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(6) Class39_Sub1 local6 = (Class39_Sub1) Static129.aClass188_2.method4534(); local6 != null; local6 = (Class39_Sub1) Static129.aClass188_2.method4530()) {
			if (Static403.anInt6978 >= local6.anInt858) {
				local6.method5616();
			} else {
				Static235.method3487((local6.anInt862 << 7) + 64, arg1 >> 1, arg2 >> 1, (local6.anInt863 << 7) + 64, local6.anInt864 * 2, local6.anInt861);
				Static139.aClass129_1.method5828(arg3 + Static343.anIntArray470[1], Static343.anIntArray470[0] + arg0, local6.anInt859 | 0xFF000000, 0, local6.aString5);
			}
		}
	}
}
