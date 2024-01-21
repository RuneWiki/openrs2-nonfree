import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	public static int anInt1006;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
	public static int anInt1008;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
	public static int anInt1007 = 0;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Lclient!sd;")
	public static Class73 aClass73_584 = Static122.method531(":assist:");

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "[I")
	public static int[] anIntArray95 = new int[5];

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Lclient!sd;")
	private static Class73 aClass73_585 = Static122.method531("Click to switch");

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
	public static int anInt1010 = 0;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	public static int anInt1011 = 0;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "Lclient!sd;")
	public static Class73 aClass73_586 = aClass73_585;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BIII)Z")
	public static boolean method780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg2 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static119.aClass35_1.method1130(Static147.anInt3309, arg0, arg1, arg2);
		if (local18 == -1) {
			return false;
		}
		@Pc(27) int local27 = local18 & 0x1F;
		@Pc(33) int local33 = local18 >> 6 & 0x3;
		if (local27 == 10 || local27 == 11 || local27 == 22) {
			@Pc(74) Class3_Sub1_Sub15 local74 = Static151.method2466(local11);
			@Pc(77) int local77 = local74.anInt3029;
			@Pc(90) int local90;
			@Pc(87) int local87;
			if (local33 == 0 || local33 == 2) {
				local90 = local74.anInt3012;
				local87 = local74.anInt3014;
			} else {
				local87 = local74.anInt3012;
				local90 = local74.anInt3014;
			}
			if (local33 != 0) {
				local77 = (local77 << local33 & 0xF) + (local77 >> 4 - local33);
			}
			Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, local87, local90, arg1, true, arg0, local77, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
		} else {
			Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], local27 + 1, 0, 0, arg1, true, arg0, 0, 2, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], local33);
		}
		Static76.anInt1683 = 0;
		Static171.anInt3768 = Static61.anInt1463;
		Static171.anInt3765 = 2;
		Static163.anInt3185 = Static51.anInt1243;
		return true;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method781() {
		anIntArray95 = null;
		aClass73_585 = null;
		aClass73_586 = null;
		aClass73_584 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lclient!sd;")
	public static Class73 method782(@OriginalArg(1) int arg0) {
		return Static19.method372(new Class73[] { Static154.method2485(arg0 >> 24 & 0xFF), Static117.aClass73_1570, Static154.method2485(arg0 >> 16 & 0xFF), Static117.aClass73_1570, Static154.method2485(arg0 >> 8 & 0xFF), Static117.aClass73_1570, Static154.method2485(arg0 & 0xFF) });
	}
}
