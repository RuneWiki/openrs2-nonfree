import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
	public static int anInt2345;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "[Lclient!bf;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array6;

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
	public static int anInt2349 = 0;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[8];

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	public static int anInt2350 = -1;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	public static int anInt2351 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V")
	public static void method1900(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static240.aBoolean369) {
			Static50.method867(arg0, arg3, arg0 + arg1, arg2 + arg3);
			Static50.method866(arg0, arg3, arg1, arg2, 0);
		} else {
			Static213.method3369(arg0, arg3, arg0 + arg1, arg3 + arg2);
			Static213.method3362(arg0, arg3, arg1, arg2, 0);
		}
		if (Static91.anInt1713 < 100) {
			return;
		}
		if (Static40.aClass1_Sub2_Sub2_4 == null || arg1 != Static40.aClass1_Sub2_Sub2_4.anInt5119 || Static40.aClass1_Sub2_Sub2_4.anInt5112 != arg2) {
			@Pc(68) Class1_Sub2_Sub2_Sub1 local68 = new Class1_Sub2_Sub2_Sub1(arg1, arg2);
			Static213.method3381(local68.anIntArray598, arg1, arg2);
			Static16.method312(0, 0, 0, 0, Static93.anInt1769, arg1, arg2, Static77.anInt1559);
			if (Static240.aBoolean369) {
				Static40.aClass1_Sub2_Sub2_4 = new Class1_Sub2_Sub2_Sub2(local68);
			} else {
				Static40.aClass1_Sub2_Sub2_4 = local68;
			}
			if (Static240.aBoolean369) {
				Static213.anIntArray495 = null;
			} else {
				Static282.aClass23_33.method1012();
			}
		}
		Static40.aClass1_Sub2_Sub2_4.method3925(arg0, arg3);
		@Pc(119) int local119 = arg2 * Static204.anInt4015 / Static77.anInt1559;
		@Pc(121) int local121 = 16711680;
		if (Static107.anInt1994 == 1) {
			local121 = 16777215;
		}
		@Pc(132) int local132 = arg1 * Static108.anInt2036 / Static93.anInt1769;
		@Pc(140) int local140 = arg1 * Static216.anInt4441 / Static93.anInt1769 + arg0;
		@Pc(149) int local149 = arg3 + Static199.anInt3856 * arg2 / Static77.anInt1559;
		if (Static240.aBoolean369) {
			Static50.method871(local140, local149, local132, local119, local121, 128);
			Static50.method868(local140, local149, local132, local119, local121);
		} else {
			Static213.method3374(local140, local149, local132, local119, local121, 128);
			Static213.method3370(local140, local149, local132, local119, local121);
		}
		if (Static35.anInt735 <= 0) {
			return;
		}
		@Pc(193) int local193;
		if (Static254.anInt5884 > 10) {
			local193 = (20 - Static254.anInt5884) * 25;
		} else {
			local193 = Static254.anInt5884 * 25;
		}
		for (@Pc(204) Class1_Sub5 local204 = (Class1_Sub5) Static152.aClass69_12.method1636(); local204 != null; local204 = (Class1_Sub5) Static152.aClass69_12.method1631()) {
			if (local204.anInt1013 == Static79.anInt2909) {
				@Pc(223) int local223 = local204.anInt1015 * arg1 / Static93.anInt1769 + arg0;
				@Pc(232) int local232 = local204.anInt1011 * arg2 / Static77.anInt1559 + arg3;
				if (Static240.aBoolean369) {
					Static50.method871(local223 - 2, local232 - 2, 4, 4, 16776960, local193);
				} else {
					Static213.method3374(local223 - 2, local232 + -2, 4, 4, 16776960, local193);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Lclient!in;")
	public static Class1_Sub2_Sub11 method1901() {
		@Pc(15) Class1_Sub2_Sub11 local15 = (Class1_Sub2_Sub11) Static51.aClass17_3.method469();
		if (local15 != null) {
			local15.method4534();
			local15.method4509();
			return local15;
		}
		do {
			local15 = (Class1_Sub2_Sub11) Static12.aClass17_1.method469();
			if (local15 == null) {
				return null;
			}
			if (local15.method1860() > Static252.method3964()) {
				return null;
			}
			local15.method4534();
			local15.method4509();
		} while ((Long.MIN_VALUE & local15.aLong197) == 0L);
		return local15;
	}
}
