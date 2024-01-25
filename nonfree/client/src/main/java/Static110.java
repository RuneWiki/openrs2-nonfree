import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
	public static int anInt2471;

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "Lclient!ss;")
	public static final Class213 aClass213_7 = new Class213(0, 3);

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BII)I")
	public static int method2007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(12) int local12 = 255 - local7;
		@Pc(37) int local37 = (local7 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		return local37 + ((local12 * (arg0 & 0xFF00) & 0xFF0000 | local12 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)I")
	public static int method2008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg2 & 0xF;
		@Pc(19) int local19 = local12 >= 8 ? arg3 : arg1;
		@Pc(38) int local38 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg1 : arg0) : arg3;
		return ((local12 & 0x1) == 0 ? local19 : -local19) + ((local12 & 0x2) == 0 ? local38 : -local38);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!lp;ZIZ)V")
	public static void method2010(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) int local12 = arg0.anInt4145;
		@Pc(16) int local16 = (int) arg0.aLong213;
		arg0.method6130();
		if (arg2) {
			Static282.method4698(local12);
		}
		Static332.method5368(local12);
		@Pc(31) Class3 local31 = Static380.method5987(local16);
		if (local31 != null) {
			Static128.method2229(local31);
		}
		Static157.method2778();
		if (!arg1 && Static388.anInt7080 != -1) {
			Static206.method3765(1, Static388.anInt7080);
		}
		@Pc(52) Class216 local52 = new Class216(Static273.aClass243_20);
		for (@Pc(57) Class2_Sub26 local57 = (Class2_Sub26) local52.method5412(); local57 != null; local57 = (Class2_Sub26) local52.method5409()) {
			if (!local57.method6126()) {
				local57 = (Class2_Sub26) local52.method5412();
				if (local57 == null) {
					return;
				}
			}
			if (local57.anInt4142 == 3) {
				@Pc(81) int local81 = (int) local57.aLong213;
				if (local12 == local81 >>> 16) {
					method2010(local57, arg1, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLclient!ve;)V")
	public static void method2011(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub24_Sub2 arg1) {
		@Pc(17) boolean local17 = arg1.method5793(1) == 1;
		if (local17) {
			Static374.anIntArray578[Static70.anInt1556++] = arg0;
		}
		@Pc(32) int local32 = arg1.method5793(2);
		@Pc(36) Class1_Sub2_Sub1_Sub1 local36 = Static42.aClass1_Sub2_Sub1_Sub1Array1[arg0];
		if (local32 != 0) {
			@Pc(140) int local140;
			@Pc(145) int local145;
			@Pc(150) int local150;
			if (local32 == 1) {
				local140 = arg1.method5793(3);
				local145 = local36.anIntArray466[0];
				local150 = local36.anIntArray465[0];
				if (local140 == 0) {
					local150--;
					local145--;
				} else if (local140 == 1) {
					local150--;
				} else if (local140 == 2) {
					local150--;
					local145++;
				} else if (local140 == 3) {
					local145--;
				} else if (local140 == 4) {
					local145++;
				} else if (local140 == 5) {
					local145--;
					local150++;
				} else if (local140 == 6) {
					local150++;
				} else if (local140 == 7) {
					local145++;
					local150++;
				}
				if (local17) {
					local36.anInt959 = local150;
					local36.anInt951 = local145;
				} else {
					local36.anInt951 = -1;
					local36.method698(local145, local150, Static345.aByteArray95[arg0]);
				}
			} else if (local32 == 2) {
				local140 = arg1.method5793(4);
				local145 = local36.anIntArray466[0];
				local150 = local36.anIntArray465[0];
				if (local140 == 0) {
					local150 -= 2;
					local145 -= 2;
				} else if (local140 == 1) {
					local145--;
					local150 -= 2;
				} else if (local140 == 2) {
					local150 -= 2;
				} else if (local140 == 3) {
					local150 -= 2;
					local145++;
				} else if (local140 == 4) {
					local150 -= 2;
					local145 += 2;
				} else if (local140 == 5) {
					local150--;
					local145 -= 2;
				} else if (local140 == 6) {
					local150--;
					local145 += 2;
				} else if (local140 == 7) {
					local145 -= 2;
				} else if (local140 == 8) {
					local145 += 2;
				} else if (local140 == 9) {
					local145 -= 2;
					local150++;
				} else if (local140 == 10) {
					local150++;
					local145 += 2;
				} else if (local140 == 11) {
					local145 -= 2;
					local150 += 2;
				} else if (local140 == 12) {
					local145--;
					local150 += 2;
				} else if (local140 == 13) {
					local150 += 2;
				} else if (local140 == 14) {
					local150 += 2;
					local145++;
				} else if (local140 == 15) {
					local150 += 2;
					local145 += 2;
				}
				if (local17) {
					local36.anInt951 = local145;
					local36.anInt959 = local150;
				} else {
					local36.anInt951 = -1;
					local36.method698(local145, local150, Static345.aByteArray95[arg0]);
				}
			} else {
				local140 = arg1.method5793(1);
				@Pc(413) int local413;
				@Pc(421) int local421;
				@Pc(432) int local432;
				@Pc(439) int local439;
				if (local140 == 0) {
					local145 = arg1.method5793(12);
					local150 = local145 >> 10;
					local413 = local145 >> 5 & 0x1F;
					if (local413 > 15) {
						local413 -= 32;
					}
					local421 = local145 & 0x1F;
					if (local421 > 15) {
						local421 -= 32;
					}
					local432 = local413 + local36.anIntArray466[0];
					local439 = local421 + local36.anIntArray465[0];
					if (local17) {
						local36.anInt951 = local432;
						local36.anInt959 = local439;
					} else {
						local36.anInt951 = -1;
						local36.method698(local432, local439, Static345.aByteArray95[arg0]);
					}
					local36.aByte73 = (byte) (local150 + local36.aByte73 & 0x3);
					if (arg0 == Static93.anInt1976) {
						Static241.anInt2711 = local36.aByte73;
					}
				} else {
					local145 = arg1.method5793(30);
					local150 = local145 >> 28;
					local413 = local145 >> 14 & 0x3FFF;
					local421 = local145 & 0x3FFF;
					local432 = (local36.anIntArray466[0] + Static279.anInt5198 + local413 & 0x3FFF) - Static279.anInt5198;
					local439 = (Static350.anInt6470 + local36.anIntArray465[0] + local421 & 0x3FFF) - Static350.anInt6470;
					if (local17) {
						local36.anInt951 = local432;
						local36.anInt959 = local439;
					} else {
						local36.anInt951 = -1;
						local36.method698(local432, local439, Static345.aByteArray95[arg0]);
					}
					local36.aByte73 = (byte) (local36.aByte73 + local150 & 0x3);
					if (arg0 == Static93.anInt1976) {
						Static241.anInt2711 = local36.aByte73;
					}
				}
			}
		} else if (local17) {
			local36.anInt951 = -1;
		} else if (Static93.anInt1976 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			Static249.anIntArray396[arg0] = (local36.anIntArray465[0] + Static350.anInt6470 >> 6) + (local36.anIntArray466[0] + Static279.anInt5198 >> 6 << 14) + (local36.aByte73 << 28);
			if (local36.anInt972 == -1) {
				Static243.anIntArray393[arg0] = local36.aClass217_7.method5455();
			} else {
				Static243.anIntArray393[arg0] = local36.anInt972;
			}
			Static53.anIntArray84[arg0] = local36.anInt5418;
			if (local36.anInt964 > 0) {
				Static67.method1230(local36);
			}
			Static42.aClass1_Sub2_Sub1_Sub1Array1[arg0] = null;
			if (arg1.method5793(1) != 0) {
				Static288.method4744(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(III)V")
	public static void method2012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static77.method1332(Static213.aClass183_63);
		Static76.aClass2_Sub24_Sub2_7.method5726(arg1);
		Static76.aClass2_Sub24_Sub2_7.method5770(arg0);
	}
}
