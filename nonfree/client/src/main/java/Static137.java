import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_123 = new Class305(106, -2);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
	public static void method2599() {
		Static227.aClass277_35.method7019();
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V")
	public static void method2601() {
		Static230.method4159();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static362.aClass243Array5[local8].method6471();
		}
		Static293.method7812();
		Static519.method1985();
		System.gc();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!kj;II)V")
	public static void method2603(@OriginalArg(0) Class1_Sub17_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method4517(1) == 1;
		if (local15) {
			Static241.anIntArray356[Static28.anInt772++] = arg1;
		}
		@Pc(30) int local30 = arg0.method4517(2);
		@Pc(34) Class20_Sub1_Sub1_Sub1 local34 = Static511.aClass20_Sub1_Sub1_Sub1Array1[arg1];
		if (local30 != 0) {
			@Pc(151) int local151;
			@Pc(156) int local156;
			@Pc(161) int local161;
			if (local30 == 1) {
				local151 = arg0.method4517(3);
				local156 = local34.anIntArray780[0];
				local161 = local34.anIntArray781[0];
				if (local151 == 0) {
					local156--;
					local161--;
				} else if (local151 == 1) {
					local161--;
				} else if (local151 == 2) {
					local156++;
					local161--;
				} else if (local151 == 3) {
					local156--;
				} else if (local151 == 4) {
					local156++;
				} else if (local151 == 5) {
					local156--;
					local161++;
				} else if (local151 == 6) {
					local161++;
				} else if (local151 == 7) {
					local161++;
					local156++;
				}
				if (local15) {
					local34.anInt652 = local161;
					local34.aBoolean53 = true;
					local34.anInt658 = local156;
				} else {
					local34.method727(local161, Static358.aByteArray85[arg1], local156);
				}
			} else if (local30 == 2) {
				local151 = arg0.method4517(4);
				local156 = local34.anIntArray780[0];
				local161 = local34.anIntArray781[0];
				if (local151 == 0) {
					local161 -= 2;
					local156 -= 2;
				} else if (local151 == 1) {
					local156--;
					local161 -= 2;
				} else if (local151 == 2) {
					local161 -= 2;
				} else if (local151 == 3) {
					local161 -= 2;
					local156++;
				} else if (local151 == 4) {
					local161 -= 2;
					local156 += 2;
				} else if (local151 == 5) {
					local161--;
					local156 -= 2;
				} else if (local151 == 6) {
					local161--;
					local156 += 2;
				} else if (local151 == 7) {
					local156 -= 2;
				} else if (local151 == 8) {
					local156 += 2;
				} else if (local151 == 9) {
					local161++;
					local156 -= 2;
				} else if (local151 == 10) {
					local161++;
					local156 += 2;
				} else if (local151 == 11) {
					local161 += 2;
					local156 -= 2;
				} else if (local151 == 12) {
					local156--;
					local161 += 2;
				} else if (local151 == 13) {
					local161 += 2;
				} else if (local151 == 14) {
					local161 += 2;
					local156++;
				} else if (local151 == 15) {
					local161 += 2;
					local156 += 2;
				}
				if (local15) {
					local34.anInt652 = local161;
					local34.anInt658 = local156;
					local34.aBoolean53 = true;
				} else {
					local34.method727(local161, Static358.aByteArray85[arg1], local156);
				}
			} else {
				local151 = arg0.method4517(1);
				@Pc(424) int local424;
				@Pc(432) int local432;
				@Pc(443) int local443;
				@Pc(450) int local450;
				if (local151 == 0) {
					local156 = arg0.method4517(12);
					local161 = local156 >> 10;
					local424 = local156 >> 5 & 0x1F;
					if (local424 > 15) {
						local424 -= 32;
					}
					local432 = local156 & 0x1F;
					if (local432 > 15) {
						local432 -= 32;
					}
					local443 = local34.anIntArray780[0] + local424;
					local450 = local34.anIntArray781[0] + local432;
					if (local15) {
						local34.anInt658 = local443;
						local34.anInt652 = local450;
						local34.aBoolean53 = true;
					} else {
						local34.method727(local450, Static358.aByteArray85[arg1], local443);
					}
					local34.aByte108 = (byte) (local161 + local34.aByte108 & 0x3);
					if (arg1 == Static16.anInt9513) {
						Static322.anInt6113 = local34.aByte108;
					}
				} else {
					local156 = arg0.method4517(30);
					local161 = local156 >> 28;
					local424 = local156 >> 14 & 0x3FFF;
					local432 = local156 & 0x3FFF;
					local443 = (local424 + local34.anIntArray780[0] + Static538.anInt9485 & 0x3FFF) - Static538.anInt9485;
					local450 = (local432 + local34.anIntArray781[0] + Static282.anInt5380 & 0x3FFF) - Static282.anInt5380;
					if (local15) {
						local34.anInt652 = local450;
						local34.anInt658 = local443;
						local34.aBoolean53 = true;
					} else {
						local34.method727(local450, Static358.aByteArray85[arg1], local443);
					}
					local34.aByte108 = (byte) (local34.aByte108 + local161 & 0x3);
					if (arg1 == Static16.anInt9513) {
						Static322.anInt6113 = local34.aByte108;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean53 = false;
		} else if (Static16.anInt9513 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(61) Class312 local61 = Class20_Sub1_Sub5.lb[arg1] = new Class312();
			local61.anInt9198 = (local34.anIntArray780[0] + Static538.anInt9485 >> 6 << 14) + (local34.aByte108 << 28) + (local34.anIntArray781[0] + Static282.anInt5380 >> 6);
			if (local34.anInt657 == -1) {
				local61.anInt9200 = local34.aClass209_7.method5706();
			} else {
				local61.anInt9200 = local34.anInt657;
			}
			local61.aBoolean689 = local34.aBoolean54;
			local61.anInt9201 = local34.anInt9034;
			if (local34.anInt661 > 0) {
				Static444.method6883(local34);
			}
			Static511.aClass20_Sub1_Sub1_Sub1Array1[arg1] = null;
			if (arg0.method4517(1) != 0) {
				Static538.method8164(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(B)V")
	public static void method2606() {
		Static243.method4316(Static360.aClass91_10);
		Static66.anInt1690++;
		if (Static518.aBoolean686 && Static276.aBoolean647) {
			@Pc(28) int local28 = Static10.aClass99_1.method6618();
			@Pc(32) int local32 = Static10.aClass99_1.method6619();
			local32 -= Static121.anInt2499;
			local28 -= Static342.anInt6325;
			if (Static497.anInt1561 > local28) {
				local28 = Static497.anInt1561;
			}
			if (local28 + Static360.aClass91_10.anInt2399 > Static441.aClass91_13.anInt2399 + Static497.anInt1561) {
				local28 = Static441.aClass91_13.anInt2399 + Static497.anInt1561 - Static360.aClass91_10.anInt2399;
			}
			if (local32 < Static67.anInt1732) {
				local32 = Static67.anInt1732;
			}
			if (Static360.aClass91_10.anInt2378 + local32 > Static67.anInt1732 - -Static441.aClass91_13.anInt2378) {
				local32 = Static67.anInt1732 + Static441.aClass91_13.anInt2378 - Static360.aClass91_10.anInt2378;
			}
			@Pc(94) int local94 = Static441.aClass91_13.anInt2449 + local28 - Static497.anInt1561;
			@Pc(102) int local102 = Static441.aClass91_13.anInt2406 + local32 - Static67.anInt1732;
			@Pc(125) Class1_Sub10 local125;
			if (Static10.aClass99_1.method6622()) {
				if (Static360.aClass91_10.anInt2440 < Static66.anInt1690) {
					@Pc(199) int local199 = local28 - Static119.anInt2480;
					@Pc(203) int local203 = local32 - Static438.anInt7678;
					if (local199 > Static360.aClass91_10.anInt2435 || -Static360.aClass91_10.anInt2435 > local199 || local203 > Static360.aClass91_10.anInt2435 || local203 < -Static360.aClass91_10.anInt2435) {
						Static218.aBoolean336 = true;
					}
				}
				if (Static360.aClass91_10.anObjectArray32 != null && Static218.aBoolean336) {
					local125 = new Class1_Sub10();
					local125.anInt2120 = local102;
					local125.anObjectArray4 = Static360.aClass91_10.anObjectArray32;
					local125.anInt2116 = local94;
					local125.aClass91_2 = Static360.aClass91_10;
					Static173.method3207(local125);
				}
			} else {
				if (Static218.aBoolean336) {
					Static417.method6564();
					if (Static360.aClass91_10.anObjectArray12 != null) {
						local125 = new Class1_Sub10();
						local125.aClass91_2 = Static360.aClass91_10;
						local125.anObjectArray4 = Static360.aClass91_10.anObjectArray12;
						local125.anInt2116 = local94;
						local125.aClass91_3 = Static467.aClass91_15;
						local125.anInt2120 = local102;
						Static173.method3207(local125);
					}
					if (Static467.aClass91_15 != null && Static63.method1576(Static360.aClass91_10) != null) {
						Static69.method1695(Static467.aClass91_15, Static360.aClass91_10);
					}
				} else if ((Static410.anInt7616 == 1 || Static455.method6993()) && Static197.anInt4015 > 2) {
					Static327.method5592(Static121.anInt2499 + Static438.anInt7678, Static342.anInt6325 + Static119.anInt2480);
				} else if (Static14.method516()) {
					Static327.method5592(Static121.anInt2499 + Static438.anInt7678, Static119.anInt2480 + Static342.anInt6325);
				}
				Static360.aClass91_10 = null;
			}
		} else if (Static66.anInt1690 > 1) {
			Static360.aClass91_10 = null;
		}
	}
}
