import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	public static int anInt10225;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
	public static int anInt10226;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_117 = new Class257(14, 8);

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString110 = null;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "[I")
	public static final int[] anIntArray600 = new int[14];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!wp;II)V")
	public static void method8251(@OriginalArg(0) Class8_Sub8_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method8586(1) == 1;
		if (local15) {
			Static488.anIntArray480[Static94.anInt6311++] = arg1;
		}
		@Pc(32) int local32 = arg0.method8586(2);
		@Pc(36) Class15_Sub1_Sub2_Sub2_Sub1 local36 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[arg1];
		if (local32 != 0) {
			@Pc(146) int local146;
			@Pc(151) int local151;
			@Pc(156) int local156;
			if (local32 == 1) {
				local146 = arg0.method8586(3);
				local151 = local36.anIntArray435[0];
				local156 = local36.anIntArray436[0];
				if (local146 == 0) {
					local156--;
					local151--;
				} else if (local146 == 1) {
					local156--;
				} else if (local146 == 2) {
					local156--;
					local151++;
				} else if (local146 == 3) {
					local151--;
				} else if (local146 == 4) {
					local151++;
				} else if (local146 == 5) {
					local151--;
					local156++;
				} else if (local146 == 6) {
					local156++;
				} else if (local146 == 7) {
					local156++;
					local151++;
				}
				if (local15) {
					local36.anInt3314 = local151;
					local36.anInt3279 = local156;
					local36.aBoolean248 = true;
				} else {
					local36.method2769(local151, Static607.aByteArray60[arg1], local156);
				}
			} else if (local32 == 2) {
				local146 = arg0.method8586(4);
				local151 = local36.anIntArray435[0];
				local156 = local36.anIntArray436[0];
				if (local146 == 0) {
					local151 -= 2;
					local156 -= 2;
				} else if (local146 == 1) {
					local151--;
					local156 -= 2;
				} else if (local146 == 2) {
					local156 -= 2;
				} else if (local146 == 3) {
					local156 -= 2;
					local151++;
				} else if (local146 == 4) {
					local156 -= 2;
					local151 += 2;
				} else if (local146 == 5) {
					local156--;
					local151 -= 2;
				} else if (local146 == 6) {
					local151 += 2;
					local156--;
				} else if (local146 == 7) {
					local151 -= 2;
				} else if (local146 == 8) {
					local151 += 2;
				} else if (local146 == 9) {
					local156++;
					local151 -= 2;
				} else if (local146 == 10) {
					local156++;
					local151 += 2;
				} else if (local146 == 11) {
					local156 += 2;
					local151 -= 2;
				} else if (local146 == 12) {
					local156 += 2;
					local151--;
				} else if (local146 == 13) {
					local156 += 2;
				} else if (local146 == 14) {
					local156 += 2;
					local151++;
				} else if (local146 == 15) {
					local156 += 2;
					local151 += 2;
				}
				if (local15) {
					local36.aBoolean248 = true;
					local36.anInt3314 = local151;
					local36.anInt3279 = local156;
				} else {
					local36.method2769(local151, Static607.aByteArray60[arg1], local156);
				}
			} else {
				local146 = arg0.method8586(1);
				@Pc(427) int local427;
				@Pc(437) int local437;
				@Pc(448) int local448;
				@Pc(455) int local455;
				if (local146 == 0) {
					local151 = arg0.method8586(12);
					local156 = local151 >> 10;
					local427 = local151 >> 5 & 0x1F;
					if (local427 > 15) {
						local427 -= 32;
					}
					local437 = local151 & 0x1F;
					if (local437 > 15) {
						local437 -= 32;
					}
					local448 = local427 + local36.anIntArray435[0];
					local455 = local437 + local36.anIntArray436[0];
					if (local15) {
						local36.aBoolean248 = true;
						local36.anInt3279 = local455;
						local36.anInt3314 = local448;
					} else {
						local36.method2769(local448, Static607.aByteArray60[arg1], local455);
					}
					local36.aByte124 = local36.aByte125 = (byte) (local36.aByte124 + local156 & 0x3);
					if (Static61.method1675(local455, local448)) {
						local36.aByte125++;
					}
					if (Static616.anInt10362 == arg1) {
						if (local36.aByte124 != Static128.anInt3428) {
							Static147.aBoolean271 = true;
						}
						Static128.anInt3428 = local36.aByte124;
					}
				} else {
					local151 = arg0.method8586(30);
					local156 = local151 >> 28;
					local427 = local151 >> 14 & 0x3FFF;
					local437 = local151 & 0x3FFF;
					local448 = (local427 + Static628.anInt10493 + local36.anIntArray435[0] & 0x3FFF) - Static628.anInt10493;
					local455 = (local437 + local36.anIntArray436[0] + Static594.anInt10160 & 0x3FFF) - Static594.anInt10160;
					if (local15) {
						local36.anInt3279 = local455;
						local36.aBoolean248 = true;
						local36.anInt3314 = local448;
					} else {
						local36.method2769(local448, Static607.aByteArray60[arg1], local455);
					}
					local36.aByte124 = local36.aByte125 = (byte) (local36.aByte124 + local156 & 0x3);
					if (Static61.method1675(local455, local448)) {
						local36.aByte125++;
					}
					if (arg1 == Static616.anInt10362) {
						Static128.anInt3428 = local36.aByte124;
					}
				}
			}
		} else if (local15) {
			local36.aBoolean248 = false;
		} else if (arg1 == Static616.anInt10362) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(60) Class272 local60 = Static408.aClass272Array1[arg1] = new Class272();
			local60.anInt8302 = (local36.aByte124 << 28) + ((local36.anIntArray435[0] + Static628.anInt10493 >> 6 << 14) + (local36.anIntArray436[0] + Static594.anInt10160 >> 6));
			if (local36.anInt3316 == -1) {
				local60.anInt8303 = local36.aClass371_7.method8432();
			} else {
				local60.anInt8303 = local36.anInt3316;
			}
			local60.aBoolean596 = local36.aBoolean249;
			local60.anInt8304 = local36.anInt8108;
			if (local36.anInt3307 > 0) {
				Static203.method3759(local36);
			}
			Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[arg1] = null;
			if (arg0.method8586(1) != 0) {
				Static434.method6725(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILclient!oh;I)Lclient!uk;")
	public static Class344 method8252(@OriginalArg(2) Class237 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method6314(arg1, 0);
		return local14 == null ? null : new Class344(local14);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!tp;Lclient!aa;IILclient!ur;ILjava/lang/String;IIBLclient!da;)V")
	public static void method8258(@OriginalArg(0) int arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class345 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class27 arg10) {
		@Pc(16) int local16;
		if (Static427.anInt8005 == 4) {
			local16 = (int) Static499.aFloat185 & 0x3FFF;
		} else {
			local16 = (int) Static499.aFloat185 + Static642.anInt10689 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg1.anInt9553 / 2, arg1.anInt9505 / 2) + 10;
		@Pc(44) int local44 = arg9 * arg9 + arg8 * arg8;
		if (local44 > local35 * local35) {
			return;
		}
		@Pc(65) int local65 = Class344.anIntArray579[local16];
		@Pc(69) int local69 = Class344.anIntArray578[local16];
		if (Static427.anInt8005 != 4) {
			local65 = local65 * 256 / (Static423.anInt7961 + 256);
			local69 = local69 * 256 / (Static423.anInt7961 + 256);
		}
		@Pc(100) int local100 = arg9 * local69 + local65 * arg8 >> 14;
		@Pc(111) int local111 = local69 * arg8 - local65 * arg9 >> 14;
		@Pc(118) int local118 = arg5.method8116(null, arg7, 100);
		@Pc(126) int local126 = arg5.method8118(100, 0, arg7, null);
		@Pc(132) int local132 = local100 - local118 / 2;
		if (-arg1.anInt9553 <= local132 && local132 <= arg1.anInt9553 && local111 >= -arg1.anInt9505 && local111 <= arg1.anInt9505) {
			arg10.method7011(0, 1, null, null, local118, arg2, 0, arg6, arg0, arg3 + local132 + arg1.anInt9553 / 2, arg3, 0, arg7, 50, arg6 + arg1.anInt9505 / 2 - local126 - arg4 - local111);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZIIII)V")
	public static void method8259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg1) {
			Static290.method4841(arg3, arg0, arg2, arg4);
		} else if (Static251.anInt9634 <= arg2 - arg4 && arg2 + arg4 <= Static366.anInt6946 && Static444.anInt8258 <= arg0 - arg1 && Static188.anInt4410 >= arg0 + arg1) {
			Static464.method6971(arg3, arg0, arg2, arg4, arg1);
		} else {
			Static638.method8601(arg1, arg2, arg3, arg4, arg0);
		}
	}
}
