import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ed", name = "qb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!ed", name = "R", descriptor = "[I")
	public static final int[] anIntArray131 = new int[2000];

	@OriginalMember(owner = "client!ed", name = "V", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_332 = Static120.method1824("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
	public static int anInt905 = 0;

	@OriginalMember(owner = "client!ed", name = "Y", descriptor = "I")
	public static int anInt906 = 0;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Lclient!rd;")
	public static Class80 method625(@OriginalArg(0) int arg0) {
		@Pc(9) Class80 local9 = Static83.method1219(arg0);
		for (@Pc(20) int local20 = local9.method2462() - 3; local20 > 0; local20 -= 3) {
			local9 = Static154.method2467(new Class80[] { local9.method2464(0, local20), Static73.aClass80_621, local9.method2449(local20) });
		}
		if (local9.method2462() > 9) {
			return Static154.method2467(new Class80[] { Static33.aClass80_255, local9.method2464(0, local9.method2462() - 8), Static163.aClass80_1409, Static71.aClass80_612, local9, Static107.aClass80_944 });
		} else if (local9.method2462() > 6) {
			return Static154.method2467(new Class80[] { Static193.aClass80_1706, local9.method2464(0, local9.method2462() - 4), Static150.aClass80_1322, Static71.aClass80_612, local9, Static107.aClass80_944 });
		} else {
			return Static154.method2467(new Class80[] { Static10.aClass80_62, local9, Static132.aClass80_1122 });
		}
	}
}
