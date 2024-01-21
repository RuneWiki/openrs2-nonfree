import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "[I")
	public static int[] anIntArray111 = new int[100];

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "Lclient!lf;")
	public static Class49 aClass49_604 = Static32.method683(":clanreq:");

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "Lclient!lf;")
	public static Class49 aClass49_605 = Static32.method683("<col=ffffff>");

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "Lclient!lf;")
	public static Class49 aClass49_606 = Static32.method683("cross");

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "Lclient!lf;")
	private static Class49 aClass49_608 = Static32.method683("Type");

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "Lclient!lf;")
	public static Class49 aClass49_607 = aClass49_608;

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
	public static int anInt1205 = 0;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)Lclient!ba;")
	public static Class7 method949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass7_1;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!vg;IB)V")
	public static void method950(@OriginalArg(0) int arg0, @OriginalArg(1) Class85 arg1, @OriginalArg(2) int arg2) {
		if (Static36.anInt924 != 0 && Static36.anInt924 != 3) {
			return;
		}
		@Pc(18) int local18 = arg2 - arg1.anInt3858 / 2;
		@Pc(25) int local25 = arg0 - arg1.anInt3867 / 2;
		@Pc(32) int local32 = Static63.anInt1356 + Static43.anInt1034 & 0x7FF;
		@Pc(36) int local36 = Class2_Sub2_Sub2_Sub4.anIntArray217[local32];
		@Pc(44) int local44 = (Static128.anInt2774 + 256) * local36 >> 8;
		@Pc(48) int local48 = Class2_Sub2_Sub2_Sub4.anIntArray218[local32];
		@Pc(56) int local56 = (Static128.anInt2774 + 256) * local48 >> 8;
		@Pc(67) int local67 = local25 * local56 - local44 * local18 >> 11;
		@Pc(75) int local75 = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 - local67 >> 7;
		@Pc(90) int local90 = local56 * local18 + local44 * local25 >> 11;
		@Pc(97) int local97 = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 + local90 >> 7;
		@Pc(117) boolean local117 = Static51.method905(0, 0, local97, 0, 1, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], true, local75, 0, 0);
		if (!local117) {
			return;
		}
		Static176.aClass2_Sub13_Sub1_14.method2932(local18);
		Static176.aClass2_Sub13_Sub1_14.method2932(local25);
		Static176.aClass2_Sub13_Sub1_14.method2921(Static63.anInt1356);
		Static176.aClass2_Sub13_Sub1_14.method2932(57);
		Static176.aClass2_Sub13_Sub1_14.method2932(Static43.anInt1034);
		Static176.aClass2_Sub13_Sub1_14.method2932(Static128.anInt2774);
		Static176.aClass2_Sub13_Sub1_14.method2932(89);
		Static176.aClass2_Sub13_Sub1_14.method2921(Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529);
		Static176.aClass2_Sub13_Sub1_14.method2921(Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578);
		Static176.aClass2_Sub13_Sub1_14.method2932(Static76.anInt1563);
		Static176.aClass2_Sub13_Sub1_14.method2932(63);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	public static void method951() {
		aClass49_608 = null;
		aClass49_605 = null;
		anIntArray111 = null;
		aClass49_604 = null;
		aClass49_607 = null;
		aClass49_606 = null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
	public static void method952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class2_Sub1 local28 = Static72.aClass2_Sub1ArrayArrayArray1[local9][arg0][arg1] = Static72.aClass2_Sub1ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt18--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt15; local38++) {
					@Pc(44) Class22 local44 = local28.aClass22Array1[local38];
					if ((local44.aLong41 >> 29 & 0x3L) == 2L && local44.anInt1000 == arg0 && local44.anInt988 == arg1) {
						local44.anInt994--;
					}
				}
			}
		}
		if (Static72.aClass2_Sub1ArrayArrayArray1[0][arg0][arg1] == null) {
			Static72.aClass2_Sub1ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub1(0, arg0, arg1);
		}
		Static72.aClass2_Sub1ArrayArrayArray1[0][arg0][arg1].aClass2_Sub1_1 = local7;
		Static72.aClass2_Sub1ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) Class2_Sub11 local13 = null;
		for (@Pc(18) Class2_Sub11 local18 = (Class2_Sub11) Static43.aClass81_3.method2682(); local18 != null; local18 = (Class2_Sub11) Static43.aClass81_3.method2686()) {
			if (arg3 == local18.anInt1541 && arg0 == local18.anInt1544 && local18.anInt1540 == arg1 && local18.anInt1554 == arg2) {
				local13 = local18;
				break;
			}
		}
		if (local13 == null) {
			local13 = new Class2_Sub11();
			local13.anInt1540 = arg1;
			local13.anInt1544 = arg0;
			local13.anInt1554 = arg2;
			local13.anInt1541 = arg3;
			Static148.method2439(local13);
			Static43.aClass81_3.method2683(local13);
		}
		local13.anInt1550 = arg5;
		local13.anInt1551 = arg7;
		local13.anInt1549 = arg8;
		local13.anInt1547 = arg6;
		local13.anInt1553 = arg4;
	}
}
