import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "[I")
	public static final int[] anIntArray547 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[IILclient!kd;I[I)Lclient!nn;")
	public static Class133_Sub2 method4978(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class39_Sub2 arg3, @OriginalArg(5) int[] arg4) {
		@Pc(8) byte[] local8 = new byte[arg0 * arg2];
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			@Pc(24) int local24 = arg4[local15] + local15 * arg2;
			for (@Pc(26) int local26 = 0; local26 < arg1[local15]; local26++) {
				local8[local24++] = -1;
			}
		}
		return new Class133_Sub2(arg3, arg2, arg0, local8);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "()V")
	public static void method4979() {
		for (@Pc(1) int local1 = 0; local1 < Static4.anInt121; local1++) {
			@Pc(6) Class31_Sub2 local6 = Static429.aClass31_Sub2Array3[local1];
			Static157.method3070(local6);
			Static429.aClass31_Sub2Array3[local1] = null;
		}
		Static4.anInt121 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILclient!ah;)Z")
	public static boolean method4980(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method316(2);
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(96) int local96;
		@Pc(100) int local100;
		@Pc(106) int local106;
		if (local8 == 0) {
			if (arg1.method316(1) != 0) {
				method4980(arg0, arg1);
			}
			local25 = arg1.method316(6);
			local30 = arg1.method316(6);
			@Pc(40) boolean local40 = arg1.method316(1) == 1;
			if (local40) {
				Static260.anIntArray404[Static194.anInt3474++] = arg0;
			}
			if (Static458.aClass31_Sub2_Sub1_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(63) Class59 local63 = Static358.aClass59Array1[arg0];
			@Pc(71) Class31_Sub2_Sub1_Sub1 local71 = Static458.aClass31_Sub2_Sub1_Sub1Array1[arg0] = new Class31_Sub2_Sub1_Sub1();
			local71.anInt7301 = arg0;
			if (Static164.aClass1_Sub5Array1[arg0] != null) {
				local71.method1188(Static164.aClass1_Sub5Array1[arg0]);
			}
			local71.method5988(local63.anInt1876);
			local71.anInt7372 = local63.anInt1878;
			local96 = local63.anInt1879;
			local100 = local96 >> 28;
			local106 = local96 >> 14 & 0xFF;
			local71.aBoolean70 = local63.aBoolean114;
			@Pc(114) int local114 = local96 & 0xFF;
			local71.aByteArray96[0] = Static144.aByteArray49[arg0];
			local71.aByte100 = (byte) local100;
			local71.method1185(local30 + (local114 << 6) - Static345.anInt5799, (local106 << 6) + local25 + -Static165.anInt3049);
			local71.aBoolean72 = false;
			Static358.aClass59Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local25 = arg1.method316(2);
			local30 = Static358.aClass59Array1[arg0].anInt1879;
			Static358.aClass59Array1[arg0].anInt1879 = (local30 & 0xFFFFFFF) + ((local25 + (local30 >> 28) & 0x3) << 28);
			return false;
		} else {
			@Pc(203) int local203;
			@Pc(208) int local208;
			@Pc(216) int local216;
			if (local8 != 2) {
				local25 = arg1.method316(18);
				local30 = local25 >> 16;
				local203 = local25 >> 8 & 0xFF;
				local208 = local25 & 0xFF;
				local216 = Static358.aClass59Array1[arg0].anInt1879;
				local96 = local30 + (local216 >> 28) & 0x3;
				local100 = local203 + (local216 >> 14) & 0xFF;
				local106 = local208 + local216 & 0xFF;
				Static358.aClass59Array1[arg0].anInt1879 = (local96 << 28) - (-(local100 << 14) - local106);
				return false;
			}
			local25 = arg1.method316(5);
			local30 = local25 >> 3;
			local203 = local25 & 0x7;
			local208 = Static358.aClass59Array1[arg0].anInt1879;
			local216 = (local208 >> 28) + local30 & 0x3;
			local96 = local208 >> 14 & 0xFF;
			local100 = local208 & 0xFF;
			if (local203 == 0) {
				local100--;
				local96--;
			}
			if (local203 == 1) {
				local100--;
			}
			if (local203 == 2) {
				local96++;
				local100--;
			}
			if (local203 == 3) {
				local96--;
			}
			if (local203 == 4) {
				local96++;
			}
			if (local203 == 5) {
				local100++;
				local96--;
			}
			if (local203 == 6) {
				local100++;
			}
			if (local203 == 7) {
				local96++;
				local100++;
			}
			Static358.aClass59Array1[arg0].anInt1879 = (local216 << 28) + (local96 << 14) + local100;
			return false;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public static void method4981() {
		for (@Pc(6) Class1_Sub28 local6 = (Class1_Sub28) Static401.aClass181_58.method4112(); local6 != null; local6 = (Class1_Sub28) Static401.aClass181_58.method4104()) {
			if (client.lb == null) {
				local6.method6020();
			} else {
				@Pc(38) int local38;
				@Pc(119) Class31_Sub1 local119;
				@Pc(140) Class31_Sub1_Sub1 local140;
				@Pc(166) Class31_Sub2 local166;
				@Pc(270) Class31_Sub4 local270;
				@Pc(51) Class31_Sub3 local51;
				@Pc(308) Class31_Sub4_Sub2 local308;
				@Pc(89) Class31_Sub3_Sub2 local89;
				if (local6.anInt4397 <= Static378.anInt4244) {
					local38 = Static58.anIntArray93[local6.anInt4381];
					if (local38 == 0) {
						local51 = Static110.method1983(local6.anInt4396, local6.anInt4382, local6.anInt4384);
						if (local51 instanceof Class31_Sub3_Sub2) {
							Static98.method1758(local6.anInt4396, local6.anInt4382, local6.anInt4384);
							local89 = (Class31_Sub3_Sub2) local51;
							if (local89.aClass31_Sub3_1 != null) {
								Static131.method2282(local6.anInt4396, local6.anInt4382, local6.anInt4384, local89.aClass31_Sub3_1, null);
							}
						}
					} else if (local38 == 1) {
						local270 = Static198.method3177(local6.anInt4396, local6.anInt4382, local6.anInt4384);
						if (local270 instanceof Class31_Sub4_Sub2) {
							Static72.method1431(local6.anInt4396, local6.anInt4382, local6.anInt4384);
							local308 = (Class31_Sub4_Sub2) local270;
							if (local308.aClass31_Sub4_3 != null) {
								Static237.method4962(local6.anInt4396, local6.anInt4382, local6.anInt4384, local308.aClass31_Sub4_3, null);
							}
						}
					} else if (local38 == 2) {
						local166 = Static357.method4896(local6.anInt4396, local6.anInt4382, local6.anInt4384, ig.class);
						if (local166 instanceof Class31_Sub2_Sub5) {
							Static83.method1584(local6.anInt4396, local6.anInt4382, local6.anInt4384, ig.class);
							@Pc(414) Class31_Sub2_Sub5 local414 = (Class31_Sub2_Sub5) local166;
							if (local414.aClass31_Sub2_2 != null) {
								Static162.method2630(local414.aClass31_Sub2_2, false);
							}
						}
					} else if (local38 == 3) {
						local119 = Static393.method5258(local6.anInt4396, local6.anInt4382, local6.anInt4384);
						if (local119 instanceof Class31_Sub1_Sub1) {
							Static351.method4859(local6.anInt4396, local6.anInt4382, local6.anInt4384);
							local140 = (Class31_Sub1_Sub1) local119;
							if (local140.aClass31_Sub1_1 != null) {
								Static428.method5679(local6.anInt4396, local6.anInt4382, local6.anInt4384, local140.aClass31_Sub1_1);
							}
						}
					}
					local6.method6020();
				} else if (local6.anInt4383 == Static378.anInt4244) {
					local38 = Static58.anIntArray93[local6.anInt4381];
					if (local38 == 0) {
						local51 = Static110.method1983(local6.anInt4396, local6.anInt4382, local6.anInt4384);
						if (local51 instanceof Class31_Sub3_Sub2) {
							local6.method6020();
						} else if (Static120.method2159(local6.anInt4396, local6.anInt4382, local6.anInt4384) == null) {
							local89 = new Class31_Sub3_Sub2(local6.anInt4381, local6.anInt4390, local6.anInt4392, local6.anInt4386, local6.anInt4393, local51);
							Static131.method2282(local6.anInt4396, local6.anInt4382, local6.anInt4384, local89, null);
						} else {
							local6.method6020();
						}
					} else if (local38 == 1) {
						local270 = Static198.method3177(local6.anInt4396, local6.anInt4382, local6.anInt4384);
						if (local270 instanceof Class31_Sub4_Sub2) {
							local6.method6020();
						} else if (Static309.method4391(local6.anInt4396, local6.anInt4382, local6.anInt4384) == null) {
							local308 = new Class31_Sub4_Sub2(local6.anInt4381, local6.anInt4390, local6.anInt4392, local6.anInt4386, local6.anInt4393, local270);
							Static237.method4962(local6.anInt4396, local6.anInt4382, local6.anInt4384, local308, null);
						} else {
							local6.method6020();
						}
					} else if (local38 == 2) {
						local166 = Static357.method4896(local6.anInt4396, local6.anInt4382, local6.anInt4384, ig.class);
						if (local166 instanceof Class31_Sub2_Sub5) {
							local6.method6020();
						} else {
							Static83.method1584(local6.anInt4396, local6.anInt4382, local6.anInt4384, ig.class);
							@Pc(197) Class129 local197 = Static349.aClass115_4.method2766(local6.anInt4391);
							@Pc(212) int local212;
							@Pc(215) int local215;
							if (local6.anInt4390 == 1 || local6.anInt4390 == 3) {
								local212 = local197.anInt3507;
								local215 = local197.anInt3517;
							} else {
								local215 = local197.anInt3507;
								local212 = local197.anInt3517;
							}
							@Pc(256) Class31_Sub2_Sub5 local256 = new Class31_Sub2_Sub5(local6.anInt4381, local6.anInt4390, local6.anInt4396, local6.anInt4392, local6.anInt4386, local6.anInt4393, local6.anInt4382, local212 + local6.anInt4382 - 1, local6.anInt4384, local6.anInt4384 + local215 - 1, local166);
							Static162.method2630(local256, false);
						}
					} else if (local38 == 3) {
						local119 = Static393.method5258(local6.anInt4396, local6.anInt4382, local6.anInt4384);
						if (local119 instanceof Class31_Sub1_Sub1) {
							local6.method6020();
						} else {
							local140 = new Class31_Sub1_Sub1(local6.anInt4392, local6.anInt4386, local6.anInt4393, local119);
							Static428.method5679(local6.anInt4396, local6.anInt4382, local6.anInt4384, local140);
						}
					}
				}
			}
		}
	}
}
