import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!pe", name = "Ib", descriptor = "I")
	public static int anInt3016;

	@OriginalMember(owner = "client!pe", name = "kb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1769 = Static107.method1838("null");

	@OriginalMember(owner = "client!pe", name = "mb", descriptor = "[Lclient!gg;")
	public static Class28[] aClass28Array42 = new Class28[100];

	@OriginalMember(owner = "client!pe", name = "qb", descriptor = "I")
	public static int anInt3003 = 1;

	@OriginalMember(owner = "client!pe", name = "vb", descriptor = "Lclient!ch;")
	public static Class14 aClass14_154 = new Class14(5);

	@OriginalMember(owner = "client!pe", name = "zb", descriptor = "I")
	public static int anInt3011 = 0;

	@OriginalMember(owner = "client!pe", name = "Gb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1770 = Static107.method1838("Nehmen");

	@OriginalMember(owner = "client!pe", name = "Hb", descriptor = "[Lclient!gg;")
	public static Class28[] aClass28Array43 = new Class28[200];

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)Lclient!cg;")
	public static Class2_Sub4_Sub4 method2066(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub4_Sub4 local12 = (Class2_Sub4_Sub4) Static169.aClass14_190.method603((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static16.aClass40_7.method1771(9, arg0);
		local12 = new Class2_Sub4_Sub4();
		local12.anInt869 = arg0;
		if (local22 != null) {
			local12.method585(new Class2_Sub2(local22));
		}
		local12.method584();
		Static169.aClass14_190.method607((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
	public static void method2067() {
		aClass28_1770 = null;
		aClass28Array42 = null;
		aClass28Array43 = null;
		aClass28_1769 = null;
		aClass14_154 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BZ)V")
	public static void method2068(@OriginalArg(1) boolean arg0) {
		if (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 >> 7 == Static98.anInt2452 && Static109.anInt2643 == Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 >> 7) {
			Static98.anInt2452 = 0;
		}
		@Pc(35) int local35 = Static35.anInt973;
		if (arg0) {
			local35 = 1;
		}
		for (@Pc(41) int local41 = 0; local41 < local35; local41++) {
			@Pc(47) Class2_Sub4_Sub1_Sub1_Sub2 local47;
			@Pc(49) long local49;
			if (arg0) {
				local47 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2;
				local49 = 8791798054912L;
			} else {
				local49 = (long) Static160.anIntArray327[local41] << 32;
				local47 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[Static160.anIntArray327[local41]];
			}
			if (local47 != null && local47.method1093()) {
				@Pc(75) int local75 = local47.anInt1635 >> 7;
				@Pc(80) int local80 = local47.anInt1633 >> 7;
				local47.aBoolean83 = false;
				if ((Static177.aBoolean170 && Static35.anInt973 > 50 || Static35.anInt973 > 200) && !arg0 && local47.anInt1608 == local47.anInt1606) {
					local47.aBoolean83 = true;
				}
				if (local80 >= 0 && local80 < 104 && local75 >= 0 && local75 < 104) {
					if (local47.aClass2_Sub4_Sub1_Sub3_1 == null || local47.anInt1662 > Static156.anInt3491 || local47.anInt1656 <= Static156.anInt3491) {
						if ((local47.anInt1633 & 0x7F) == 64 && (local47.anInt1635 & 0x7F) == 64) {
							if (Static122.anIntArrayArray26[local80][local75] == Static87.anInt2197) {
								continue;
							}
							Static122.anIntArrayArray26[local80][local75] = Static87.anInt2197;
						}
						local47.anInt1634 = Static103.method1808(Static103.anInt2568, local47.anInt1633, local47.anInt1635);
						Static122.method2002(Static103.anInt2568, local47.anInt1633, local47.anInt1635, local47.anInt1634, 60, local47, local47.anInt1603, local49, local47.aBoolean82);
					} else {
						local47.aBoolean83 = false;
						local47.anInt1634 = Static103.method1808(Static103.anInt2568, local47.anInt1633, local47.anInt1635);
						Static63.method1169(Static103.anInt2568, local47.anInt1633, local47.anInt1635, local47.anInt1634, local47, local47.anInt1603, local49, local47.anInt1664, local47.anInt1675, local47.anInt1661, local47.anInt1672);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!ab;I)V")
	public static void method2070(@OriginalArg(0) Class2_Sub2 arg0) {
		if (Static162.aClass5_5 != null) {
			try {
				Static162.aClass5_5.method391(0L);
				Static162.aClass5_5.method387(arg0.anInt2385, 24, arg0.aByteArray35);
			} catch (@Pc(17) Exception local17) {
			}
		}
		arg0.anInt2385 += 24;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V")
	public static void method2071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].anInt2268 = arg3;
		}
	}
}
