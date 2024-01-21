import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!ph;")
	public static Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_625 = Static161.method2971("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
	public static int anInt1837 = 0;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	public static int anInt1838 = 0;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!dd;")
	public static Class13 aClass13_626 = Static161.method2971("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Lclient!dd;")
	public static Class13 method1373(@OriginalArg(1) int arg0) {
		@Pc(9) Class13 local9 = Static3.method75(arg0);
		for (@Pc(20) int local20 = local9.method904() - 3; local20 > 0; local20 -= 3) {
			local9 = Static57.method1349(new Class13[] { local9.method883(0, local20), Static122.aClass13_1066, local9.method901(local20) });
		}
		if (local9.method904() > 9) {
			return Static57.method1349(new Class13[] { Static142.aClass13_1208, local9.method883(0, local9.method904() - 8), Static32.aClass13_1427, Static178.aClass13_1383, local9, Static31.aClass13_382 });
		} else if (local9.method904() > 6) {
			return Static57.method1349(new Class13[] { Static155.aClass13_1446, local9.method883(0, local9.method904() - 4), Static50.aClass13_553, Static178.aClass13_1383, local9, Static31.aClass13_382 });
		} else {
			return Static57.method1349(new Class13[] { Static156.aClass13_1265, local9, Static56.aClass13_606 });
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
	public static void method1374() {
		anInterface3_2 = null;
		aClass13_626 = null;
		aClass13_625 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
	public static void method1375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt1544; local12++) {
			@Pc(18) Class59 local18 = local7.aClass59Array4[local12];
			if ((local18.aLong106 >> 29 & 0x3L) == 2L && local18.anInt3133 == arg1 && local18.anInt3130 == arg2) {
				Static73.method1540(local18);
				return;
			}
		}
	}
}
