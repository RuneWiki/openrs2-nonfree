import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ic", name = "zc", descriptor = "[Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1[] aClass1_Sub1_Sub12_Sub1Array4;

	@OriginalMember(owner = "client!ic", name = "Bc", descriptor = "Lclient!md;")
	public static Class1_Sub12 aClass1_Sub12_1;

	@OriginalMember(owner = "client!ic", name = "vc", descriptor = "Lclient!ed;")
	public static Class23 aClass23_682 = Static169.method2903("Standort");

	@OriginalMember(owner = "client!ic", name = "Dc", descriptor = "Lclient!ed;")
	public static Class23 aClass23_683 = Static169.method2903(" loggt sich ein)3");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public static void method1226() {
		aClass1_Sub1_Sub12_Sub1Array4 = null;
		aClass23_683 = null;
		aClass1_Sub12_1 = null;
		aClass23_682 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZ)V")
	public static void method1227(@OriginalArg(0) boolean arg0) {
		Static178.aBoolean211 = arg0;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(53) int local53;
		@Pc(153) int local153;
		@Pc(157) int local157;
		if (!Static178.aBoolean211) {
			local13 = Static35.aClass1_Sub8_Sub1_2.method867();
			local17 = (Static103.anInt2645 - Static35.aClass1_Sub8_Sub1_2.anInt1357) / 16;
			Static86.anIntArrayArray23 = new int[local17][4];
			for (local21 = 0; local21 < local17; local21++) {
				for (local25 = 0; local25 < 4; local25++) {
					Static86.anIntArrayArray23[local21][local25] = Static35.aClass1_Sub8_Sub1_2.method863();
				}
			}
			local25 = Static35.aClass1_Sub8_Sub1_2.method902();
			local33 = Static35.aClass1_Sub8_Sub1_2.method878();
			local38 = Static35.aClass1_Sub8_Sub1_2.method866();
			local42 = Static35.aClass1_Sub8_Sub1_2.method886();
			Static98.anIntArray312 = new int[local17];
			Static102.anIntArray326 = new int[local17];
			Static86.aByteArrayArray6 = new byte[local17][];
			@Pc(396) boolean local396 = false;
			Static23.aByteArrayArray3 = new byte[local17][];
			Static83.anIntArray287 = new int[local17];
			local17 = 0;
			if ((local33 / 8 == 48 || local33 / 8 == 49) && local13 / 8 == 48) {
				local396 = true;
			}
			if (local33 / 8 == 48 && local13 / 8 == 148) {
				local396 = true;
			}
			for (local53 = (local33 - 6) / 8; local53 <= (local33 + 6) / 8; local53++) {
				for (local153 = (local13 - 6) / 8; local153 <= (local13 + 6) / 8; local153++) {
					local157 = local153 + (local53 << 8);
					if (!local396 || local153 != 49 && local153 != 149 && local153 != 147 && local53 != 50 && (local53 != 49 || local153 != 47)) {
						Static83.anIntArray287[local17] = local157;
						Static102.anIntArray326[local17] = Static4.aClass30_Sub1_1.method1281(Static149.method2571(new Class23[] { Static84.aClass23_1673, Static27.method498(local53), Static64.aClass23_620, Static27.method498(local153) }));
						Static98.anIntArray312[local17] = Static4.aClass30_Sub1_1.method1281(Static149.method2571(new Class23[] { Static82.aClass23_812, Static27.method498(local53), Static64.aClass23_620, Static27.method498(local153) }));
						local17++;
					}
				}
			}
			Static81.method892(local25, local13, local42, local33, local38);
			return;
		}
		local13 = Static35.aClass1_Sub8_Sub1_2.method886();
		local17 = Static35.aClass1_Sub8_Sub1_2.method867();
		local21 = Static35.aClass1_Sub8_Sub1_2.method883();
		local25 = Static35.aClass1_Sub8_Sub1_2.method902();
		local33 = Static35.aClass1_Sub8_Sub1_2.method867();
		Static35.aClass1_Sub8_Sub1_2.method915();
		@Pc(46) int local46;
		for (local38 = 0; local38 < 4; local38++) {
			for (local42 = 0; local42 < 13; local42++) {
				for (local46 = 0; local46 < 13; local46++) {
					local53 = Static35.aClass1_Sub8_Sub1_2.method911(1);
					if (local53 == 1) {
						Static153.anIntArrayArrayArray5[local38][local42][local46] = Static35.aClass1_Sub8_Sub1_2.method911(26);
					} else {
						Static153.anIntArrayArrayArray5[local38][local42][local46] = -1;
					}
				}
			}
		}
		Static35.aClass1_Sub8_Sub1_2.method918();
		local42 = (Static103.anInt2645 - Static35.aClass1_Sub8_Sub1_2.anInt1357) / 16;
		Static86.anIntArrayArray23 = new int[local42][4];
		for (local46 = 0; local46 < local42; local46++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static86.anIntArrayArray23[local46][local53] = Static35.aClass1_Sub8_Sub1_2.method870();
			}
		}
		Static86.aByteArrayArray6 = new byte[local42][];
		Static83.anIntArray287 = new int[local42];
		Static102.anIntArray326 = new int[local42];
		Static23.aByteArrayArray3 = new byte[local42][];
		Static98.anIntArray312 = new int[local42];
		local42 = 0;
		for (local53 = 0; local53 < 4; local53++) {
			for (local153 = 0; local153 < 13; local153++) {
				for (local157 = 0; local157 < 13; local157++) {
					@Pc(167) int local167 = Static153.anIntArrayArrayArray5[local53][local153][local157];
					if (local167 != -1) {
						@Pc(176) int local176 = local167 >> 14 & 0x3FF;
						@Pc(182) int local182 = local167 >> 3 & 0x7FF;
						@Pc(193) int local193 = (local176 / 8 << 8) + (local182 / 8);
						for (@Pc(195) int local195 = 0; local195 < local42; local195++) {
							if (Static83.anIntArray287[local195] == local193) {
								local193 = -1;
								break;
							}
						}
						if (local193 != -1) {
							@Pc(223) int local223 = local193 >> 8 & 0xFF;
							Static83.anIntArray287[local42] = local193;
							@Pc(231) int local231 = local193 & 0xFF;
							Static102.anIntArray326[local42] = Static4.aClass30_Sub1_1.method1281(Static149.method2571(new Class23[] { Static84.aClass23_1673, Static27.method498(local223), Static64.aClass23_620, Static27.method498(local231) }));
							Static98.anIntArray312[local42] = Static4.aClass30_Sub1_1.method1281(Static149.method2571(new Class23[] { Static82.aClass23_812, Static27.method498(local223), Static64.aClass23_620, Static27.method498(local231) }));
							local42++;
						}
					}
				}
			}
		}
		Static81.method892(local25, local13, local17, local33, local21);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIILclient!a;)V")
	public static void method1228(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub1_Sub1_Sub1 arg2) {
		if (arg2.anInt1842 == arg0 && arg0 != -1) {
			@Pc(64) int local64 = Static157.method2652(arg0).anInt4297;
			if (local64 == 1) {
				arg2.anInt1862 = 0;
				arg2.anInt1812 = 0;
				arg2.anInt1846 = arg1;
				arg2.anInt1849 = 0;
			}
			if (local64 == 2) {
				arg2.anInt1812 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt1842 == -1 || Static157.method2652(arg0).anInt4287 >= Static157.method2652(arg2.anInt1842).anInt4287) {
			arg2.anInt1846 = arg1;
			arg2.anInt1842 = arg0;
			arg2.anInt1849 = 0;
			arg2.anInt1862 = 0;
			arg2.anInt1812 = 0;
			arg2.anInt1839 = arg2.anInt1863;
		}
	}
}
