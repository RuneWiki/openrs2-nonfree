import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!oea", name = "Fd", descriptor = "Lclient!wc;")
	public static Class2_Sub5_Sub20 aClass2_Sub5_Sub20_19;

	@OriginalMember(owner = "client!oea", name = "Yd", descriptor = "[I")
	public static int[] anIntArray496;

	@OriginalMember(owner = "client!oea", name = "He", descriptor = "Lclient!uaa;")
	public static Interface24 anInterface24_1;

	@OriginalMember(owner = "client!oea", name = "ed", descriptor = "Lclient!jj;")
	public static final Class178 aClass178_1 = Static397.method6020();

	@OriginalMember(owner = "client!oea", name = "yd", descriptor = "[I")
	public static final int[] anIntArray495 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!oea", name = "ue", descriptor = "Lclient!sn;")
	public static final Class308 aClass308_11 = new Class308();

	@OriginalMember(owner = "client!oea", name = "l", descriptor = "(I)V")
	public static void method6148() {
		Static410.method6309();
		for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
			Static19.aClass179Array2[local6].method4349();
		}
		Static266.method4304();
		Static320.method4827();
		Static99.method1703();
		System.gc();
		Static600.aClass87_15.ya();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
	public static int method6154(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(6) int local6 = arg2.length();
		@Pc(9) int local9 = arg0.length();
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) char local15 = 0;
		@Pc(17) char local17 = 0;
		while (local6 > local11 - local15 || local13 - local17 < local9) {
			if (local11 - local15 >= local6) {
				return -1;
			}
			if (local13 - local17 >= local9) {
				return 1;
			}
			@Pc(66) char local66;
			if (local15 == '\u0000') {
				local66 = arg2.charAt(local11++);
			} else {
				local66 = local15;
			}
			@Pc(78) char local78;
			if (local17 == '\u0000') {
				local78 = arg0.charAt(local13++);
			} else {
				local78 = local17;
			}
			local15 = Static568.method7831(local66);
			local17 = Static568.method7831(local78);
			local66 = Static274.method4398(arg1, local66);
			local78 = Static274.method4398(arg1, local78);
			if (local66 != local78 && Character.toUpperCase(local66) != Character.toUpperCase(local78)) {
				local66 = Character.toLowerCase(local66);
				local78 = Character.toLowerCase(local78);
				if (local78 != local66) {
					return Static23.method588(local66, arg1) - Static23.method588(local78, arg1);
				}
			}
		}
		@Pc(137) int local137 = Math.min(local6, local9);
		for (@Pc(139) int local139 = 0; local139 < local137; local139++) {
			if (arg1 == 2) {
				local13 = local9 - local139 - 1;
				local11 = local6 - local139 - 1;
			} else {
				local13 = local139;
				local11 = local139;
			}
			@Pc(165) char local165 = arg2.charAt(local11);
			@Pc(169) char local169 = arg0.charAt(local13);
			if (local165 != local169 && Character.toUpperCase(local165) != Character.toUpperCase(local169)) {
				local165 = Character.toLowerCase(local165);
				local169 = Character.toLowerCase(local169);
				if (local165 != local169) {
					return Static23.method588(local165, arg1) - Static23.method588(local169, arg1);
				}
			}
		}
		@Pc(213) int local213 = local6 - local9;
		if (local213 != 0) {
			return local213;
		}
		for (@Pc(224) int local224 = 0; local224 < local137; local224++) {
			@Pc(229) char local229 = arg2.charAt(local224);
			@Pc(233) char local233 = arg0.charAt(local224);
			if (local233 != local229) {
				return Static23.method588(local229, arg1) - Static23.method588(local233, arg1);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!oea", name = "k", descriptor = "(B)V")
	public static void method6209() {
		Static397.method6022(Static112.aClass78_4);
		Static543.anInt9040++;
		if (Static360.aBoolean486 && Static642.aBoolean759) {
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			if (Static558.aBoolean680) {
				local34 = Static257.method4233();
				local36 = Static290.method4545();
			}
			@Pc(51) int local51 = Static6.aClass40_1.method4504() + local34;
			@Pc(57) int local57 = local36 + Static6.aClass40_1.method4499();
			local57 -= Static150.anInt3484;
			local51 -= Static622.anInt10098;
			if (Static30.anInt6666 > local51) {
				local51 = Static30.anInt6666;
			}
			if (Static580.anInt9544 > local57) {
				local57 = Static580.anInt9544;
			}
			if (local51 + Static112.aClass78_4.anInt1964 > Static217.aClass78_7.anInt1964 + Static30.anInt6666) {
				local51 = Static217.aClass78_7.anInt1964 + Static30.anInt6666 - Static112.aClass78_4.anInt1964;
			}
			if (Static580.anInt9544 + Static217.aClass78_7.anInt1991 < local57 + Static112.aClass78_4.anInt1991) {
				local57 = Static217.aClass78_7.anInt1991 + Static580.anInt9544 - Static112.aClass78_4.anInt1991;
			}
			@Pc(129) int local129 = Static217.aClass78_7.anInt1966 + local51 - Static30.anInt6666;
			@Pc(137) int local137 = Static217.aClass78_7.anInt2009 + local57 - Static580.anInt9544;
			@Pc(200) Class2_Sub42 local200;
			if (Static6.aClass40_1.method4500()) {
				if (Static543.anInt9040 > Static112.aClass78_4.anInt1974) {
					@Pc(150) int local150 = local51 - Static245.anInt4849;
					@Pc(155) int local155 = local57 - Static636.anInt10184;
					if (Static112.aClass78_4.anInt2000 < local150 || local150 < -Static112.aClass78_4.anInt2000 || local155 > Static112.aClass78_4.anInt2000 || local155 < -Static112.aClass78_4.anInt2000) {
						Static57.aBoolean82 = true;
					}
				}
				if (Static112.aClass78_4.anObjectArray22 != null && Static57.aBoolean82) {
					local200 = new Class2_Sub42();
					local200.anInt8127 = local129;
					local200.aClass78_9 = Static112.aClass78_4;
					local200.anObjectArray33 = Static112.aClass78_4.anObjectArray22;
					local200.anInt8131 = local137;
					Static639.method8539(local200);
					return;
				}
			} else {
				if (Static57.aBoolean82) {
					Static171.method3178();
					if (Static112.aClass78_4.anObjectArray27 != null) {
						local200 = new Class2_Sub42();
						local200.anInt8131 = local137;
						local200.anObjectArray33 = Static112.aClass78_4.anObjectArray27;
						local200.anInt8127 = local129;
						local200.aClass78_9 = Static112.aClass78_4;
						local200.aClass78_8 = Static112.aClass78_5;
						Static639.method8539(local200);
					}
					if (Static112.aClass78_5 != null && Static69.method1325(Static112.aClass78_4) != null) {
						Static383.method5769(Static112.aClass78_4, Static112.aClass78_5);
					}
				} else if ((Static163.anInt3666 == 1 || Static457.method6671()) && Static90.anInt1824 > 2) {
					Static425.method4453(Static150.anInt3484 + Static636.anInt10184, Static245.anInt4849 + Static622.anInt10098);
				} else if (Static56.method1027()) {
					Static425.method4453(Static636.anInt10184 + Static150.anInt3484, Static622.anInt10098 - -Static245.anInt4849);
				}
				Static112.aClass78_4 = null;
			}
		} else if (Static543.anInt9040 > 1) {
			Static112.aClass78_4 = null;
		}
	}
}
