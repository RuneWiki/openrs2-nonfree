import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!mw", name = "H", descriptor = "I")
	public static int anInt6280;

	@OriginalMember(owner = "client!mw", name = "v", descriptor = "Lclient!fca;")
	public static final Class109 aClass109_6 = new Class109();

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(IZ)V")
	public static void method5210(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static133.aClass2_Sub15_Sub2_1.method4356(Static65.anInt1500) >= 15) {
				@Pc(18) int local18 = Static133.aClass2_Sub15_Sub2_1.method4355(15);
				if (local18 != 32767) {
					@Pc(25) boolean local25 = false;
					@Pc(32) Class2_Sub32 local32 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local18);
					@Pc(38) Class6_Sub1_Sub1_Sub1_Sub1 local38;
					if (local32 == null) {
						local38 = new Class6_Sub1_Sub1_Sub1_Sub1();
						local38.lb = local18;
						local32 = new Class2_Sub32(local38);
						Static544.aClass162_40.method3522(local32, (long) local18);
						Static223.aClass2_Sub32Array1[Static31.anInt820++] = local32;
						local25 = true;
					}
					local38 = local32.aClass6_Sub1_Sub1_Sub1_Sub1_1;
					Static169.anIntArray198[Static416.anInt7186++] = local18;
					local38.anInt7348 = Static412.anInt575;
					if (local38.aClass86_1 != null && local38.aClass86_1.method1577()) {
						Static121.method1779(local38);
					}
					@Pc(92) int local92 = Static133.aClass2_Sub15_Sub2_1.method4355(1);
					if (local92 == 1) {
						Static488.anIntArray591[Static405.anInt7060++] = local18;
					}
					@Pc(110) int local110;
					if (arg0) {
						local110 = Static133.aClass2_Sub15_Sub2_1.method4355(8);
						if (local110 > 127) {
							local110 -= 256;
						}
					} else {
						local110 = Static133.aClass2_Sub15_Sub2_1.method4355(5);
						if (local110 > 15) {
							local110 -= 32;
						}
					}
					@Pc(134) int local134 = Static133.aClass2_Sub15_Sub2_1.method4355(2);
					@Pc(139) int local139 = Static133.aClass2_Sub15_Sub2_1.method4355(1);
					local38.method159(Static254.aClass202_2.method4488(Static133.aClass2_Sub15_Sub2_1.method4355(14)));
					@Pc(160) int local160 = (Static133.aClass2_Sub15_Sub2_1.method4355(3) + 4 & 0xAB800007) << 11;
					@Pc(167) int local167;
					if (arg0) {
						local167 = Static133.aClass2_Sub15_Sub2_1.method4355(8);
						if (local167 > 127) {
							local167 -= 256;
						}
					} else {
						local167 = Static133.aClass2_Sub15_Sub2_1.method4355(5);
						if (local167 > 15) {
							local167 -= 32;
						}
					}
					local38.method6156(local38.aClass86_1.anInt2152);
					local38.anInt7391 = local38.aClass86_1.anInt2155 << 3;
					if (local25) {
						local38.method6169(local160, true);
					}
					local38.method152(local139 == 1, local167 + Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray509[0], local38.method6165(), local134, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray510[0] + local110);
					if (local38.aClass86_1.method1577()) {
						Static276.method3101(null, null, 0, local38, local38.anIntArray510[0], local38.anIntArray509[0], local38.aByte112);
					}
					continue;
				}
			}
			Static133.aClass2_Sub15_Sub2_1.method4361();
			return;
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BLclient!ni;)I")
	public static int method5211(@OriginalArg(1) Class6_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt7391 == 0) {
			return 0;
		}
		@Pc(67) int local67;
		@Pc(61) int local61;
		if (arg0.anInt7339 != -1) {
			@Pc(23) Class6_Sub1_Sub1_Sub1 local23 = null;
			if (arg0.anInt7339 < 32768) {
				@Pc(47) Class2_Sub32 local47 = (Class2_Sub32) Static544.aClass162_40.method3519((long) arg0.anInt7339);
				if (local47 != null) {
					local23 = local47.aClass6_Sub1_Sub1_Sub1_Sub1_1;
				}
			} else if (arg0.anInt7339 >= 32768) {
				local23 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt7339 - 32768];
			}
			if (local23 != null) {
				local61 = arg0.anInt8761 - local23.anInt8761;
				local67 = arg0.anInt8764 - local23.anInt8764;
				if (local61 != 0 || local67 != 0) {
					arg0.method6163((int) (Math.atan2((double) local61, (double) local67) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class6_Sub1_Sub1_Sub1_Sub2) {
			@Pc(167) Class6_Sub1_Sub1_Sub1_Sub2 local167 = (Class6_Sub1_Sub1_Sub1_Sub2) arg0;
			if (local167.anInt7434 != -1 && (local167.anInt7424 == 0 || local167.anInt7421 > 0)) {
				local167.method6163(local167.anInt7434);
				local167.anInt7434 = -1;
			}
		} else if (arg0 instanceof Class6_Sub1_Sub1_Sub1_Sub1) {
			@Pc(99) Class6_Sub1_Sub1_Sub1_Sub1 local99 = (Class6_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local99.anInt269 != -1 && (local99.anInt7424 == 0 || local99.anInt7421 > 0)) {
				local61 = local99.anInt8761 - (local99.anInt269 - Static35.anInt906 - Static35.anInt906) * 256;
				local67 = local99.anInt8764 - (local99.anInt277 - Static130.anInt5246 - Static130.anInt5246) * 256;
				if (local61 != 0 || local67 != 0) {
					local99.method6163((int) (Math.atan2((double) local61, (double) local67) * 2607.5945876176133D) & 0x3FFF);
				}
				local99.anInt269 = -1;
			}
		}
		return arg0.method6160();
	}
}
