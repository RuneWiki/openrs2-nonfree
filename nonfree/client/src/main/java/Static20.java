import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!rg;)Lclient!vga;")
	public static Class358 method336(@OriginalArg(1) Class6_Sub40 arg0) {
		@Pc(7) Class358 local7 = new Class358();
		local7.anInt10061 = arg0.method8571();
		local7.aClass6_Sub2_Sub14_1 = Static337.aClass327_2.method7979(local7.anInt10061);
		return local7;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBLclient!cs;I)V")
	public static void method337(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub4 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1 == Static298.aClass8_34.aClass6_7) {
			return;
		}
		@Pc(19) int local19 = arg1.anInt1733;
		@Pc(22) int local22 = arg1.anInt1735;
		@Pc(25) int local25 = arg1.anInt1738;
		@Pc(29) int local29 = (int) arg1.aLong42;
		@Pc(32) long local32 = arg1.aLong42;
		if (local25 >= 2000) {
			local25 -= 2000;
		}
		@Pc(46) Class302 local46;
		if (local25 == 47) {
			local46 = Static110.method1816(local22, local19);
			if (local46 != null) {
				Static633.method8924();
				@Pc(53) Class6_Sub47 local53 = Static78.method1364(local46);
				Static326.method5411(local53.method8147(), local46, local53.anInt9598);
				Static173.aString38 = Static255.method4577(local46);
				Static391.aString87 = local46.aString103 + "<col=ffffff>";
				if (Static173.aString38 == null) {
					Static173.aString38 = "Null";
				}
			}
			return;
		}
		@Pc(116) Class6_Sub9 local116;
		if (local25 == 50) {
			if (Static578.anInt6641 > 0 && Static647.aClass251_1.method6712(82) && Static647.aClass251_1.method6712(81)) {
				Static372.method7366(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131, Static195.anInt3961 + local22, local19 + Static606.anInt8651);
			} else {
				Static100.anInt10040 = arg2;
				Static94.anInt1856 = 0;
				Static630.anInt10329 = 1;
				Static123.anInt2417 = arg0;
				local116 = Static560.method8089(Static391.aClass126_1, Static11.aClass208_5);
				local116.aClass6_Sub40_Sub2_1.method8593(local22 + Static195.anInt3961);
				local116.aClass6_Sub40_Sub2_1.method8609(local19 + Static606.anInt8651);
				Static263.method4681(local116);
			}
		}
		@Pc(175) Class6_Sub9 local175;
		@Pc(156) Class20_Sub2_Sub2_Sub1_Sub1 local156;
		if (local25 == 48) {
			local156 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local29];
			if (local156 != null) {
				Static100.anInt10040 = arg2;
				Static123.anInt2417 = arg0;
				Static630.anInt10329 = 2;
				Static94.anInt1856 = 0;
				local175 = Static560.method8089(Static391.aClass126_1, Static345.aClass208_56);
				local175.aClass6_Sub40_Sub2_1.method8586(Static647.aClass251_1.method6712(82) ? 1 : 0);
				local175.aClass6_Sub40_Sub2_1.method8593(local29);
				Static263.method4681(local175);
				Static522.method7786(0, true, 0, -2, local156.anIntArray336[0], local156.method4913(), local156.anIntArray335[0], local156.method4913());
			}
		}
		if (local25 == 44 || local25 == 1003) {
			Static418.method6583(local22, arg1.aString20, local19, local29);
		}
		if (local25 == 1012 || local25 == 1007 || local25 == 1002 || local25 == 1006 || local25 == 1010) {
			Static507.method7517(local19, local29, local25);
		}
		if (local25 == 16) {
			local46 = Static110.method1816(local22, local19);
			if (local46 != null) {
				Static597.method8392(local46);
			}
		}
		if (local25 == 1011) {
			Static100.anInt10040 = arg2;
			Static94.anInt1856 = 0;
			Static123.anInt2417 = arg0;
			Static630.anInt10329 = 2;
			local116 = Static560.method8089(Static391.aClass126_1, Static42.aClass208_8);
			local116.aClass6_Sub40_Sub2_1.method8609(local22 + Static195.anInt3961);
			local116.aClass6_Sub40_Sub2_1.method8556(Static647.aClass251_1.method6712(82) ? 1 : 0);
			local116.aClass6_Sub40_Sub2_1.method8561(Static606.anInt8651 + local19);
			local116.aClass6_Sub40_Sub2_1.method8565(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static263.method4681(local116);
			Static104.method1716(local22, local32, local19);
		}
		@Pc(373) Class6_Sub9 local373;
		@Pc(351) Class6_Sub46 local351;
		@Pc(358) Class20_Sub2_Sub2_Sub1_Sub2 local358;
		if (local25 == 19) {
			local351 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local29);
			if (local351 != null) {
				Static94.anInt1856 = 0;
				local358 = local351.aClass20_Sub2_Sub2_Sub1_Sub2_1;
				Static630.anInt10329 = 2;
				Static100.anInt10040 = arg2;
				Static123.anInt2417 = arg0;
				local373 = Static560.method8089(Static391.aClass126_1, Static605.aClass208_93);
				local373.aClass6_Sub40_Sub2_1.method8561(local29);
				local373.aClass6_Sub40_Sub2_1.method8586(Static647.aClass251_1.method6712(82) ? 1 : 0);
				Static263.method4681(local373);
				Static522.method7786(0, true, 0, -2, local358.anIntArray336[0], local358.method4913(), local358.anIntArray335[0], local358.method4913());
			}
		}
		if (local25 == 3) {
			Static100.anInt10040 = arg2;
			Static94.anInt1856 = 0;
			Static630.anInt10329 = 2;
			Static123.anInt2417 = arg0;
			local116 = Static560.method8089(Static391.aClass126_1, Static459.aClass208_70);
			local116.aClass6_Sub40_Sub2_1.method8586(Static647.aClass251_1.method6712(82) ? 1 : 0);
			local116.aClass6_Sub40_Sub2_1.method8561(local19 + Static606.anInt8651);
			local116.aClass6_Sub40_Sub2_1.method8561(local22 + Static195.anInt3961);
			local116.aClass6_Sub40_Sub2_1.method8593(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static263.method4681(local116);
			Static104.method1716(local22, local32, local19);
		}
		if (local25 == 15 && Static523.aClass302_53 == null) {
			Static644.method8980(local19, local22);
			Static523.aClass302_53 = Static110.method1816(local22, local19);
			Static603.method8464(Static523.aClass302_53);
		}
		if (local25 == 59) {
			local351 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local29);
			if (local351 != null) {
				local358 = local351.aClass20_Sub2_Sub2_Sub1_Sub2_1;
				Static123.anInt2417 = arg0;
				Static100.anInt10040 = arg2;
				Static94.anInt1856 = 0;
				Static630.anInt10329 = 2;
				local373 = Static560.method8089(Static391.aClass126_1, Static548.aClass208_84);
				local373.aClass6_Sub40_Sub2_1.method8563(Static647.aClass251_1.method6712(82) ? 1 : 0);
				local373.aClass6_Sub40_Sub2_1.method8565(local29);
				Static263.method4681(local373);
				Static522.method7786(0, true, 0, -2, local358.anIntArray336[0], local358.method4913(), local358.anIntArray335[0], local358.method4913());
			}
		}
		if (local25 == 20) {
			local351 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local29);
			if (local351 != null) {
				Static94.anInt1856 = 0;
				Static100.anInt10040 = arg2;
				local358 = local351.aClass20_Sub2_Sub2_Sub1_Sub2_1;
				Static123.anInt2417 = arg0;
				Static630.anInt10329 = 2;
				local373 = Static560.method8089(Static391.aClass126_1, Static412.aClass208_42);
				local373.aClass6_Sub40_Sub2_1.method8593(local29);
				local373.aClass6_Sub40_Sub2_1.method8563(Static647.aClass251_1.method6712(82) ? 1 : 0);
				Static263.method4681(local373);
				Static522.method7786(0, true, 0, -2, local358.anIntArray336[0], local358.method4913(), local358.anIntArray335[0], local358.method4913());
			}
		}
		if (local25 == 51) {
			Static100.anInt10040 = arg2;
			Static123.anInt2417 = arg0;
			Static630.anInt10329 = 2;
			Static94.anInt1856 = 0;
			local116 = Static560.method8089(Static391.aClass126_1, Static107.aClass208_18);
			local116.aClass6_Sub40_Sub2_1.method8565(local22 + Static195.anInt3961);
			local116.aClass6_Sub40_Sub2_1.method8563(Static647.aClass251_1.method6712(82) ? 1 : 0);
			local116.aClass6_Sub40_Sub2_1.method8593(local19 + Static606.anInt8651);
			local116.aClass6_Sub40_Sub2_1.method8593(local29);
			Static263.method4681(local116);
			Static39.method755(local19, local22);
		}
		if (local25 == 1001) {
			Static94.anInt1856 = 0;
			Static630.anInt10329 = 2;
			Static123.anInt2417 = arg0;
			Static100.anInt10040 = arg2;
			local116 = Static560.method8089(Static391.aClass126_1, Static114.aClass208_20);
			local116.aClass6_Sub40_Sub2_1.method8561(local29);
			Static263.method4681(local116);
		}
		if (local25 == 25) {
			local351 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local29);
			if (local351 != null) {
				Static123.anInt2417 = arg0;
				Static630.anInt10329 = 2;
				local358 = local351.aClass20_Sub2_Sub2_Sub1_Sub2_1;
				Static94.anInt1856 = 0;
				Static100.anInt10040 = arg2;
				local373 = Static560.method8089(Static391.aClass126_1, Static179.aClass208_31);
				local373.aClass6_Sub40_Sub2_1.method8593(local29);
				local373.aClass6_Sub40_Sub2_1.method8589(Static647.aClass251_1.method6712(82) ? 1 : 0);
				Static263.method4681(local373);
				Static522.method7786(0, true, 0, -2, local358.anIntArray336[0], local358.method4913(), local358.anIntArray335[0], local358.method4913());
			}
		}
		if (local25 == 49) {
			Static123.anInt2417 = arg0;
			Static630.anInt10329 = 2;
			Static100.anInt10040 = arg2;
			Static94.anInt1856 = 0;
			local116 = Static560.method8089(Static391.aClass126_1, Static540.aClass208_82);
			local116.aClass6_Sub40_Sub2_1.method8593(Static606.anInt8651 + local19);
			local116.aClass6_Sub40_Sub2_1.method8593(local22 + Static195.anInt3961);
			local116.aClass6_Sub40_Sub2_1.method8565(local29);
			local116.aClass6_Sub40_Sub2_1.method8589(Static647.aClass251_1.method6712(82) ? 1 : 0);
			Static263.method4681(local116);
			Static39.method755(local19, local22);
		}
		if (local25 == 21) {
			local156 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local29];
			if (local156 != null) {
				Static630.anInt10329 = 2;
				Static94.anInt1856 = 0;
				Static100.anInt10040 = arg2;
				Static123.anInt2417 = arg0;
				local175 = Static560.method8089(Static391.aClass126_1, Static78.aClass208_15);
				local175.aClass6_Sub40_Sub2_1.method8609(local29);
				local175.aClass6_Sub40_Sub2_1.method8563(Static647.aClass251_1.method6712(82) ? 1 : 0);
				Static263.method4681(local175);
				Static522.method7786(0, true, 0, -2, local156.anIntArray336[0], local156.method4913(), local156.anIntArray335[0], local156.method4913());
			}
		}
		if (local25 == 12) {
			local156 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local29];
			if (local156 != null) {
				Static630.anInt10329 = 2;
				Static100.anInt10040 = arg2;
				Static123.anInt2417 = arg0;
				Static94.anInt1856 = 0;
				local175 = Static560.method8089(Static391.aClass126_1, Static90.aClass208_17);
				local175.aClass6_Sub40_Sub2_1.method8556(Static647.aClass251_1.method6712(82) ? 1 : 0);
				local175.aClass6_Sub40_Sub2_1.method8565(local29);
				Static263.method4681(local175);
				Static522.method7786(0, true, 0, -2, local156.anIntArray336[0], local156.method4913(), local156.anIntArray335[0], local156.method4913());
			}
		}
		if (local25 == 2) {
			Static94.anInt1856 = 0;
			Static630.anInt10329 = 2;
			Static100.anInt10040 = arg2;
			Static123.anInt2417 = arg0;
			local116 = Static560.method8089(Static391.aClass126_1, Static195.aClass208_33);
			local116.aClass6_Sub40_Sub2_1.method8593(local19 + Static606.anInt8651);
			local116.aClass6_Sub40_Sub2_1.method8593(Static453.anInt8081);
			local116.aClass6_Sub40_Sub2_1.method8556(Static647.aClass251_1.method6712(82) ? 1 : 0);
			local116.aClass6_Sub40_Sub2_1.method8557(Static30.anInt4466);
			local116.aClass6_Sub40_Sub2_1.method8609(local29);
			local116.aClass6_Sub40_Sub2_1.method8609(local22 + Static195.anInt3961);
			local116.aClass6_Sub40_Sub2_1.method8561(Static133.anInt2549);
			Static263.method4681(local116);
			Static39.method755(local19, local22);
		}
		if (local25 == 6) {
			Static100.anInt10040 = arg2;
			Static123.anInt2417 = arg0;
			Static630.anInt10329 = 1;
			Static94.anInt1856 = 0;
			local116 = Static560.method8089(Static391.aClass126_1, Static382.aClass208_64);
			local116.aClass6_Sub40_Sub2_1.method8564(Static30.anInt4466);
			local116.aClass6_Sub40_Sub2_1.method8565(local19 + Static606.anInt8651);
			local116.aClass6_Sub40_Sub2_1.method8593(Static195.anInt3961 + local22);
			local116.aClass6_Sub40_Sub2_1.method8593(Static133.anInt2549);
			local116.aClass6_Sub40_Sub2_1.method8561(Static453.anInt8081);
			Static263.method4681(local116);
			Static522.method7786(0, true, 0, -4, local22, 1, local19, 1);
		}
		if (local25 == 57) {
			Static123.anInt2417 = arg0;
			Static100.anInt10040 = arg2;
			Static630.anInt10329 = 2;
			Static94.anInt1856 = 0;
			local116 = Static560.method8089(Static391.aClass126_1, Static199.aClass208_34);
			local116.aClass6_Sub40_Sub2_1.method8609(Static606.anInt8651 + local19);
			local116.aClass6_Sub40_Sub2_1.method8609(Static195.anInt3961 + local22);
			local116.aClass6_Sub40_Sub2_1.method8609(local29);
			local116.aClass6_Sub40_Sub2_1.method8563(Static647.aClass251_1.method6712(82) ? 1 : 0);
			Static263.method4681(local116);
			Static39.method755(local19, local22);
		}
		if (local25 == 45) {
			Static100.anInt10040 = arg2;
			Static123.anInt2417 = arg0;
			Static94.anInt1856 = 0;
			Static630.anInt10329 = 2;
			local116 = Static560.method8089(Static391.aClass126_1, Static602.aClass208_92);
			local116.aClass6_Sub40_Sub2_1.method8561(Static606.anInt8651 + local19);
			local116.aClass6_Sub40_Sub2_1.method8586(Static647.aClass251_1.method6712(82) ? 1 : 0);
			local116.aClass6_Sub40_Sub2_1.method8609(local22 + Static195.anInt3961);
			local116.aClass6_Sub40_Sub2_1.method8565(local29);
			Static263.method4681(local116);
			Static39.method755(local19, local22);
		}
		if (local25 == 23) {
			Static630.anInt10329 = 2;
			Static100.anInt10040 = arg2;
			Static94.anInt1856 = 0;
			Static123.anInt2417 = arg0;
			local116 = Static560.method8089(Static391.aClass126_1, Static372.aClass208_74);
			local116.aClass6_Sub40_Sub2_1.method8593(Static606.anInt8651 + local19);
			local116.aClass6_Sub40_Sub2_1.method8609(local22 + Static195.anInt3961);
			local116.aClass6_Sub40_Sub2_1.method8609(local29);
			local116.aClass6_Sub40_Sub2_1.method8589(Static647.aClass251_1.method6712(82) ? 1 : 0);
			Static263.method4681(local116);
			Static39.method755(local19, local22);
		}
		if (local25 == 13) {
			local351 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local29);
			if (local351 != null) {
				local358 = local351.aClass20_Sub2_Sub2_Sub1_Sub2_1;
				Static123.anInt2417 = arg0;
				Static94.anInt1856 = 0;
				Static100.anInt10040 = arg2;
				Static630.anInt10329 = 2;
				local373 = Static560.method8089(Static391.aClass126_1, Static263.aClass208_45);
				local373.aClass6_Sub40_Sub2_1.method8556(Static647.aClass251_1.method6712(82) ? 1 : 0);
				local373.aClass6_Sub40_Sub2_1.method8565(local29);
				Static263.method4681(local373);
				Static522.method7786(0, true, 0, -2, local358.anIntArray336[0], local358.method4913(), local358.anIntArray335[0], local358.method4913());
			}
		}
		if (local25 == 8) {
			Static94.anInt1856 = 0;
			Static123.anInt2417 = arg0;
			Static630.anInt10329 = 2;
			Static100.anInt10040 = arg2;
			local116 = Static560.method8089(Static391.aClass126_1, Static260.aClass208_44);
			local116.aClass6_Sub40_Sub2_1.method8565(Static195.anInt3961 + local22);
			local116.aClass6_Sub40_Sub2_1.method8589(Static647.aClass251_1.method6712(82) ? 1 : 0);
			local116.aClass6_Sub40_Sub2_1.method8565((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local116.aClass6_Sub40_Sub2_1.method8565(local19 + Static606.anInt8651);
			Static263.method4681(local116);
			Static104.method1716(local22, local32, local19);
		}
		if (local25 == 46) {
			Static94.anInt1856 = 0;
			Static100.anInt10040 = arg2;
			Static630.anInt10329 = 2;
			Static123.anInt2417 = arg0;
			local116 = Static560.method8089(Static391.aClass126_1, Static353.aClass208_58);
			local116.aClass6_Sub40_Sub2_1.method8593(Static133.anInt2549);
			local116.aClass6_Sub40_Sub2_1.method8586(Static647.aClass251_1.method6712(82) ? 1 : 0);
			local116.aClass6_Sub40_Sub2_1.method8593(Static453.anInt8081);
			local116.aClass6_Sub40_Sub2_1.method8554(Static30.anInt4466);
			local116.aClass6_Sub40_Sub2_1.method8565(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt5567);
			Static263.method4681(local116);
		}
		if (local25 == 9) {
			local156 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local29];
			if (local156 != null) {
				Static94.anInt1856 = 0;
				Static630.anInt10329 = 2;
				Static123.anInt2417 = arg0;
				Static100.anInt10040 = arg2;
				local175 = Static560.method8089(Static391.aClass126_1, Static567.aClass208_87);
				local175.aClass6_Sub40_Sub2_1.method8563(Static647.aClass251_1.method6712(82) ? 1 : 0);
				local175.aClass6_Sub40_Sub2_1.method8561(local29);
				Static263.method4681(local175);
				Static522.method7786(0, true, 0, -2, local156.anIntArray336[0], local156.method4913(), local156.anIntArray335[0], local156.method4913());
			}
		}
		if (local25 == 30) {
			local156 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local29];
			if (local156 != null) {
				Static123.anInt2417 = arg0;
				Static630.anInt10329 = 2;
				Static100.anInt10040 = arg2;
				Static94.anInt1856 = 0;
				local175 = Static560.method8089(Static391.aClass126_1, Static257.aClass208_43);
				local175.aClass6_Sub40_Sub2_1.method8609(local29);
				local175.aClass6_Sub40_Sub2_1.method8586(Static647.aClass251_1.method6712(82) ? 1 : 0);
				Static263.method4681(local175);
				Static522.method7786(0, true, 0, -2, local156.anIntArray336[0], local156.method4913(), local156.anIntArray335[0], local156.method4913());
			}
		}
		if (local25 == 1008) {
			Static123.anInt2417 = arg0;
			Static94.anInt1856 = 0;
			Static100.anInt10040 = arg2;
			Static630.anInt10329 = 2;
			local116 = Static560.method8089(Static391.aClass126_1, Static283.aClass208_53);
			local116.aClass6_Sub40_Sub2_1.method8561(local29);
			Static263.method4681(local116);
		}
		if (local25 == 11) {
			local156 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local29];
			if (local156 != null) {
				Static94.anInt1856 = 0;
				Static100.anInt10040 = arg2;
				Static630.anInt10329 = 2;
				Static123.anInt2417 = arg0;
				local175 = Static560.method8089(Static391.aClass126_1, Static353.aClass208_58);
				local175.aClass6_Sub40_Sub2_1.method8593(Static133.anInt2549);
				local175.aClass6_Sub40_Sub2_1.method8586(Static647.aClass251_1.method6712(82) ? 1 : 0);
				local175.aClass6_Sub40_Sub2_1.method8593(Static453.anInt8081);
				local175.aClass6_Sub40_Sub2_1.method8554(Static30.anInt4466);
				local175.aClass6_Sub40_Sub2_1.method8565(local29);
				Static263.method4681(local175);
				Static522.method7786(0, true, 0, -2, local156.anIntArray336[0], local156.method4913(), local156.anIntArray335[0], local156.method4913());
			}
		}
		if (local25 == 4) {
			Static94.anInt1856 = 0;
			Static630.anInt10329 = 2;
			Static100.anInt10040 = arg2;
			Static123.anInt2417 = arg0;
			local116 = Static560.method8089(Static391.aClass126_1, Static370.aClass208_61);
			local116.aClass6_Sub40_Sub2_1.method8609((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local116.aClass6_Sub40_Sub2_1.method8565(Static133.anInt2549);
			local116.aClass6_Sub40_Sub2_1.method8565(Static453.anInt8081);
			local116.aClass6_Sub40_Sub2_1.method8557(Static30.anInt4466);
			local116.aClass6_Sub40_Sub2_1.method8565(Static195.anInt3961 + local22);
			local116.aClass6_Sub40_Sub2_1.method8593(local19 + Static606.anInt8651);
			local116.aClass6_Sub40_Sub2_1.method8589(Static647.aClass251_1.method6712(82) ? 1 : 0);
			Static263.method4681(local116);
			Static104.method1716(local22, local32, local19);
		}
		if (local25 == 5) {
			local156 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local29];
			if (local156 != null) {
				Static630.anInt10329 = 2;
				Static94.anInt1856 = 0;
				Static123.anInt2417 = arg0;
				Static100.anInt10040 = arg2;
				local175 = Static560.method8089(Static391.aClass126_1, Static227.aClass208_38);
				local175.aClass6_Sub40_Sub2_1.method8563(Static647.aClass251_1.method6712(82) ? 1 : 0);
				local175.aClass6_Sub40_Sub2_1.method8593(local29);
				Static263.method4681(local175);
				Static522.method7786(0, true, 0, -2, local156.anIntArray336[0], local156.method4913(), local156.anIntArray335[0], local156.method4913());
			}
		}
		if (local25 == 60) {
			local156 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local29];
			if (local156 != null) {
				Static100.anInt10040 = arg2;
				Static94.anInt1856 = 0;
				Static123.anInt2417 = arg0;
				Static630.anInt10329 = 2;
				local175 = Static560.method8089(Static391.aClass126_1, Static589.aClass208_91);
				local175.aClass6_Sub40_Sub2_1.method8609(local29);
				local175.aClass6_Sub40_Sub2_1.method8563(Static647.aClass251_1.method6712(82) ? 1 : 0);
				Static263.method4681(local175);
				Static522.method7786(0, true, 0, -2, local156.anIntArray336[0], local156.method4913(), local156.anIntArray335[0], local156.method4913());
			}
		}
		if (local25 == 17) {
			local156 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local29];
			if (local156 != null) {
				Static94.anInt1856 = 0;
				Static123.anInt2417 = arg0;
				Static630.anInt10329 = 2;
				Static100.anInt10040 = arg2;
				local175 = Static560.method8089(Static391.aClass126_1, Static8.aClass208_1);
				local175.aClass6_Sub40_Sub2_1.method8563(Static647.aClass251_1.method6712(82) ? 1 : 0);
				local175.aClass6_Sub40_Sub2_1.method8609(local29);
				Static263.method4681(local175);
				Static522.method7786(0, true, 0, -2, local156.anIntArray336[0], local156.method4913(), local156.anIntArray335[0], local156.method4913());
			}
		}
		if (local25 == 1004) {
			Static100.anInt10040 = arg2;
			Static630.anInt10329 = 2;
			Static123.anInt2417 = arg0;
			Static94.anInt1856 = 0;
			local351 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local29);
			if (local351 != null) {
				local358 = local351.aClass20_Sub2_Sub2_Sub1_Sub2_1;
				@Pc(2130) Class247 local2130 = local358.aClass247_1;
				if (local2130.anIntArray467 != null) {
					local2130 = local2130.method6613(Static279.aClass294_1);
				}
				if (local2130 != null) {
					@Pc(2153) Class6_Sub9 local2153 = Static560.method8089(Static391.aClass126_1, Static217.aClass208_37);
					local2153.aClass6_Sub40_Sub2_1.method8561(local2130.anInt7690);
					Static263.method4681(local2153);
				}
			}
		}
		if (local25 == 10) {
			Static94.anInt1856 = 0;
			Static100.anInt10040 = arg2;
			Static630.anInt10329 = 2;
			Static123.anInt2417 = arg0;
			local116 = Static560.method8089(Static391.aClass126_1, Static642.aClass208_98);
			local116.aClass6_Sub40_Sub2_1.method8593(Static606.anInt8651 + local19);
			local116.aClass6_Sub40_Sub2_1.method8556(Static647.aClass251_1.method6712(82) ? 1 : 0);
			local116.aClass6_Sub40_Sub2_1.method8561(Static195.anInt3961 + local22);
			local116.aClass6_Sub40_Sub2_1.method8593((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static263.method4681(local116);
			Static104.method1716(local22, local32, local19);
		}
		if (local25 == 58) {
			if (Static578.anInt6641 > 0 && Static647.aClass251_1.method6712(82) && Static647.aClass251_1.method6712(81)) {
				Static372.method7366(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131, Static195.anInt3961 + local22, Static606.anInt8651 - -local19);
			} else {
				local116 = Static259.method4618(local19, local22, local29);
				if (local29 == 1) {
					local116.aClass6_Sub40_Sub2_1.method8589(-1);
					local116.aClass6_Sub40_Sub2_1.method8589(-1);
					local116.aClass6_Sub40_Sub2_1.method8561((int) Static284.aFloat164);
					local116.aClass6_Sub40_Sub2_1.method8589(57);
					local116.aClass6_Sub40_Sub2_1.method8589(Static298.anInt6417);
					local116.aClass6_Sub40_Sub2_1.method8589(Static620.anInt10702);
					local116.aClass6_Sub40_Sub2_1.method8589(89);
					local116.aClass6_Sub40_Sub2_1.method8561(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725);
					local116.aClass6_Sub40_Sub2_1.method8561(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729);
					local116.aClass6_Sub40_Sub2_1.method8589(63);
				} else {
					Static630.anInt10329 = 1;
					Static94.anInt1856 = 0;
					Static100.anInt10040 = arg2;
					Static123.anInt2417 = arg0;
				}
				Static263.method4681(local116);
				Static522.method7786(0, true, 0, -4, local22, 1, local19, 1);
			}
		}
		if (local25 == 22) {
			local351 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local29);
			if (local351 != null) {
				Static94.anInt1856 = 0;
				local358 = local351.aClass20_Sub2_Sub2_Sub1_Sub2_1;
				Static100.anInt10040 = arg2;
				Static630.anInt10329 = 2;
				Static123.anInt2417 = arg0;
				local373 = Static560.method8089(Static391.aClass126_1, Static334.aClass208_54);
				local373.aClass6_Sub40_Sub2_1.method8609(Static453.anInt8081);
				local373.aClass6_Sub40_Sub2_1.method8556(Static647.aClass251_1.method6712(82) ? 1 : 0);
				local373.aClass6_Sub40_Sub2_1.method8609(local29);
				local373.aClass6_Sub40_Sub2_1.method8557(Static30.anInt4466);
				local373.aClass6_Sub40_Sub2_1.method8561(Static133.anInt2549);
				Static263.method4681(local373);
				Static522.method7786(0, true, 0, -2, local358.anIntArray336[0], local358.method4913(), local358.anIntArray335[0], local358.method4913());
			}
		}
		if (local25 == 18) {
			Static94.anInt1856 = 0;
			Static100.anInt10040 = arg2;
			Static123.anInt2417 = arg0;
			Static630.anInt10329 = 2;
			local116 = Static560.method8089(Static391.aClass126_1, Static319.aClass208_52);
			local116.aClass6_Sub40_Sub2_1.method8609(local19 + Static606.anInt8651);
			local116.aClass6_Sub40_Sub2_1.method8586(Static647.aClass251_1.method6712(82) ? 1 : 0);
			local116.aClass6_Sub40_Sub2_1.method8609(local22 + Static195.anInt3961);
			local116.aClass6_Sub40_Sub2_1.method8561((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static263.method4681(local116);
			Static104.method1716(local22, local32, local19);
		}
		if (Static280.aBoolean380) {
			Static633.method8924();
		}
		if (Static283.aClass302_41 != null && Static606.anInt8656 == 0) {
			Static603.method8464(Static283.aClass302_41);
		}
	}
}
