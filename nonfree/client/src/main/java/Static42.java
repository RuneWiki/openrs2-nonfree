import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!id", name = "C", descriptor = "I")
	public static int anInt2377;

	@OriginalMember(owner = "client!id", name = "s", descriptor = "I")
	public static int anInt2370 = 0;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "Lclient!pa;")
	public static Class10_Sub10_Sub1 aClass10_Sub10_Sub1_5 = new Class10_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!id", name = "y", descriptor = "I")
	public static int anInt2375 = -1;

	@OriginalMember(owner = "client!id", name = "A", descriptor = "Lclient!va;")
	private static Class61 aClass61_941 = Static88.method1421("Error connecting to server)3");

	@OriginalMember(owner = "client!id", name = "z", descriptor = "Lclient!va;")
	public static Class61 aClass61_940 = aClass61_941;

	@OriginalMember(owner = "client!id", name = "B", descriptor = "I")
	public static int anInt2376 = 10;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)Lclient!va;")
	public static Class61 method1468(@OriginalArg(1) int arg0) {
		@Pc(9) Class61 local9 = Static29.method529(arg0);
		for (@Pc(20) int local20 = local9.method1596() - 3; local20 > 0; local20 -= 3) {
			local9 = Static93.method1156(new Class61[] { local9.method1611(local20, 0), Static39.aClass61_77, local9.method1619(local20) });
		}
		if (local9.method1596() > 8) {
			local9 = Static93.method1156(new Class61[] { Static20.aClass61_1075, local9.method1611(local9.method1596() - 8, 0), Static18.aClass61_201, Static80.aClass61_864, local9, Static54.aClass61_614 });
		} else if (local9.method1596() > 4) {
			local9 = Static93.method1156(new Class61[] { Static35.aClass61_410, local9.method1611(local9.method1596() - 4, 0), Static52.aClass61_600, Static80.aClass61_864, local9, Static54.aClass61_614 });
		}
		return Static93.method1156(new Class61[] { Static24.aClass61_925, local9 });
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIII)I")
	public static int method1470(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg0 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(22) int local22 = arg5;
			arg5 = arg4;
			arg4 = local22;
		}
		if (local15 == 0) {
			return arg1;
		} else if (local15 == 1) {
			return 7 + 1 - arg3 - arg5;
		} else if (local15 == 2) {
			return 1 + 7 - arg4 - arg1;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
	public static void method1471() {
		aClass61_941 = null;
		aClass61_940 = null;
		aClass10_Sub10_Sub1_5 = null;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
	public static void method1472() {
		Static50.aClass10_Sub10_Sub1_3.method1167(101);
		if (Static57.anInt1518 != -1) {
			Static103.method595(Static57.anInt1518);
			Static104.aBoolean120 = false;
			Static80.aBoolean94 = true;
			Static57.anInt1518 = -1;
			Static22.aBoolean35 = true;
		}
		if (Static74.anInt1871 != -1) {
			Static103.method595(Static74.anInt1871);
			Static104.aBoolean120 = false;
			Static7.aBoolean1 = true;
			Static74.anInt1871 = -1;
		}
		if (Static53.anInt1448 != -1) {
			Static103.method595(Static53.anInt1448);
			Static53.anInt1448 = -1;
			Static50.method780(30);
		}
		if (Static4.anInt18 != -1) {
			Static103.method595(Static4.anInt18);
			Static4.anInt18 = -1;
		}
		if (Static23.anInt752 != -1) {
			Static103.method595(Static23.anInt752);
			Static23.anInt752 = -1;
		}
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)I")
	public static int method1473(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static50.anIntArray152[arg0];
		@Pc(11) int local11 = (local3 * Static11.anInt315 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}
}
