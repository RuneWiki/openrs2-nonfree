import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
	public static int anInt724;

	@OriginalMember(owner = "client!ea", name = "X", descriptor = "Lclient!kb;")
	public static Class9 aClass9_12;

	@OriginalMember(owner = "client!ea", name = "ab", descriptor = "[Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1[] aClass3_Sub1_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!ea", name = "R", descriptor = "Lclient!v;")
	public static Class62 aClass62_303 = Static45.method753(" Millionen");

	@OriginalMember(owner = "client!ea", name = "T", descriptor = "Lclient!v;")
	public static Class62 aClass62_304 = Static45.method753("Freunde");

	@OriginalMember(owner = "client!ea", name = "bb", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
	public static int anInt731 = 1;

	@OriginalMember(owner = "client!ea", name = "db", descriptor = "Lclient!v;")
	public static Class62 aClass62_305 = Static45.method753("@cr2@");

	@OriginalMember(owner = "client!ea", name = "fb", descriptor = "Lclient!jb;")
	public static Class34 aClass34_9 = new Class34(100);

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V")
	public static void method485() {
		aClass3_Sub1_Sub1_Sub1Array1 = null;
		aClass62_303 = null;
		anIntArrayArray5 = null;
		aClass9_12 = null;
		aClass62_305 = null;
		aClass34_9 = null;
		aClass62_304 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)Z")
	public static boolean method487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg2 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static76.aClass1_1.method22(Static27.anInt818, arg1, arg0, arg2);
		if (local18 == -1) {
			return false;
		}
		@Pc(29) int local29 = local18 >> 6 & 0x3;
		@Pc(33) int local33 = local18 & 0x1F;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(74) Class3_Sub1_Sub9 local74 = Static10.method1322(local11);
			@Pc(88) int local88;
			@Pc(85) int local85;
			if (local29 == 0 || local29 == 2) {
				local88 = local74.anInt1068;
				local85 = local74.anInt1061;
			} else {
				local85 = local74.anInt1068;
				local88 = local74.anInt1061;
			}
			@Pc(99) int local99 = local74.anInt1057;
			if (local29 != 0) {
				local99 = (local99 << local29 & 0xF) + (local99 >> 4 - local29);
			}
			Static81.method1319(local99, true, 0, local88, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, arg1, local85, arg0, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
		} else {
			Static81.method1319(0, true, local33 + 1, 0, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], local29, arg1, 0, arg0, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
		}
		Static14.anInt554 = 2;
		Static46.anInt1370 = Static27.anInt825;
		Static38.anInt1137 = 0;
		Static33.anInt1048 = Static104.anInt2769;
		return true;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
	public static void method488() {
		@Pc(5) Class18 local5 = Static104.aClass18_1;
		synchronized (Static104.aClass18_1) {
			Static3.anInt158 = Static62.anInt1701;
			Static6.anInt208 = Static3.anInt157;
			Static61.anInt1672 = Static91.anInt2433;
			Static79.anInt2109 = Static10.anInt2190;
			Static104.anInt2769 = Static49.anInt1379;
			Static27.anInt825 = Static33.anInt1087;
			Static15.aLong19 = Static26.aLong27;
			Static10.anInt2190 = 0;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIBI)V")
	public static void method489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = arg2 * (arg2 - 32) / arg0;
		if (local16 < 8) {
			local16 = 8;
		}
		@Pc(36) int local36 = (arg2 - local16 - 32) * arg4 / (arg0 - arg2);
		Static80.aClass3_Sub1_Sub1_Sub1Array4[0].method145(arg3, arg1);
		Static80.aClass3_Sub1_Sub1_Sub1Array4[1].method145(arg3, arg2 + arg1 - 16);
		Static97.method1733(arg3, arg1 + 16, 16, arg2 - 32, Static69.anInt1898);
		Static97.method1733(arg3, arg1 + local36 + 16, 16, local16, Static33.anInt1053);
		Static97.method1727(arg3, local36 + arg1 + 16, local16, Static26.anInt804);
		Static97.method1727(arg3 + 1, arg1 + 16 + local36, local16, Static26.anInt804);
		Static97.method1739(arg3, arg1 + local36 + 16, 16, Static26.anInt804);
		Static97.method1739(arg3, arg1 + local36 + 17, 16, Static26.anInt804);
		Static97.method1727(arg3 + 15, arg1 + 16 + local36, local16, Static9.anInt1883);
		Static97.method1727(arg3 + 14, local36 + 17 + arg1, local16 - 1, Static9.anInt1883);
		Static97.method1739(arg3, local16 + local36 + arg1 + 15, 16, Static9.anInt1883);
		Static97.method1739(arg3 + 1, local16 + 14 + arg1 + local36, 15, Static9.anInt1883);
	}
}
