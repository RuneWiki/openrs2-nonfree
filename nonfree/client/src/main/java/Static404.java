import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
	public static int anInt6535;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "[I")
	public static final int[] anIntArray405 = new int[1000];

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "Z")
	public static boolean aBoolean535 = false;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!mv;)V")
	public static void method5025(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub11_Sub1 arg1) {
		@Pc(17) boolean local17 = arg1.method3347(1) == 1;
		if (local17) {
			Static382.anIntArray393[Static405.anInt6543++] = arg0;
		}
		@Pc(32) int local32 = arg1.method3347(2);
		@Pc(36) Class20_Sub3_Sub3_Sub1 local36 = Static73.aClass20_Sub3_Sub3_Sub1Array1[arg0];
		if (local32 != 0) {
			@Pc(148) int local148;
			@Pc(153) int local153;
			@Pc(158) int local158;
			if (local32 == 1) {
				local148 = arg1.method3347(3);
				local153 = local36.anIntArray370[0];
				local158 = local36.anIntArray369[0];
				if (local148 == 0) {
					local153--;
					local158--;
				} else if (local148 == 1) {
					local158--;
				} else if (local148 == 2) {
					local158--;
					local153++;
				} else if (local148 == 3) {
					local153--;
				} else if (local148 == 4) {
					local153++;
				} else if (local148 == 5) {
					local158++;
					local153--;
				} else if (local148 == 6) {
					local158++;
				} else if (local148 == 7) {
					local158++;
					local153++;
				}
				if (local17) {
					local36.anInt4955 = local153;
					local36.anInt4935 = local158;
					local36.aBoolean394 = true;
				} else {
					local36.method3876(Static225.aByteArray38[arg0], local158, local153);
				}
			} else if (local32 == 2) {
				local148 = arg1.method3347(4);
				local153 = local36.anIntArray370[0];
				local158 = local36.anIntArray369[0];
				if (local148 == 0) {
					local158 -= 2;
					local153 -= 2;
				} else if (local148 == 1) {
					local158 -= 2;
					local153--;
				} else if (local148 == 2) {
					local158 -= 2;
				} else if (local148 == 3) {
					local158 -= 2;
					local153++;
				} else if (local148 == 4) {
					local153 += 2;
					local158 -= 2;
				} else if (local148 == 5) {
					local158--;
					local153 -= 2;
				} else if (local148 == 6) {
					local158--;
					local153 += 2;
				} else if (local148 == 7) {
					local153 -= 2;
				} else if (local148 == 8) {
					local153 += 2;
				} else if (local148 == 9) {
					local153 -= 2;
					local158++;
				} else if (local148 == 10) {
					local153 += 2;
					local158++;
				} else if (local148 == 11) {
					local158 += 2;
					local153 -= 2;
				} else if (local148 == 12) {
					local158 += 2;
					local153--;
				} else if (local148 == 13) {
					local158 += 2;
				} else if (local148 == 14) {
					local153++;
					local158 += 2;
				} else if (local148 == 15) {
					local153 += 2;
					local158 += 2;
				}
				if (local17) {
					local36.anInt4935 = local158;
					local36.anInt4955 = local153;
					local36.aBoolean394 = true;
				} else {
					local36.method3876(Static225.aByteArray38[arg0], local158, local153);
				}
			} else {
				local148 = arg1.method3347(1);
				@Pc(414) int local414;
				@Pc(422) int local422;
				@Pc(433) int local433;
				@Pc(440) int local440;
				if (local148 == 0) {
					local153 = arg1.method3347(12);
					local158 = local153 >> 10;
					local414 = local153 >> 5 & 0x1F;
					if (local414 > 15) {
						local414 -= 32;
					}
					local422 = local153 & 0x1F;
					if (local422 > 15) {
						local422 -= 32;
					}
					local433 = local414 + local36.anIntArray370[0];
					local440 = local422 + local36.anIntArray369[0];
					if (local17) {
						local36.anInt4955 = local433;
						local36.aBoolean394 = true;
						local36.anInt4935 = local440;
					} else {
						local36.method3876(Static225.aByteArray38[arg0], local440, local433);
					}
					local36.aByte89 = (byte) (local36.aByte89 + local158 & 0x3);
					if (arg0 == Static348.anInt5668) {
						Static138.anInt3548 = local36.aByte89;
					}
				} else {
					local153 = arg1.method3347(30);
					local158 = local153 >> 28;
					local414 = local153 >> 14 & 0x3FFF;
					local422 = local153 & 0x3FFF;
					local433 = (local36.anIntArray370[0] + Static101.anInt6646 + local414 & 0x3FFF) - Static101.anInt6646;
					local440 = (local36.anIntArray369[0] + Static278.anInt4392 + local422 & 0x3FFF) - Static278.anInt4392;
					if (local17) {
						local36.anInt4935 = local440;
						local36.anInt4955 = local433;
						local36.aBoolean394 = true;
					} else {
						local36.method3876(Static225.aByteArray38[arg0], local440, local433);
					}
					local36.aByte89 = (byte) (local158 + local36.aByte89 & 0x3);
					if (arg0 == Static348.anInt5668) {
						Static138.anInt3548 = local36.aByte89;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean394 = false;
		} else if (Static348.anInt5668 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(60) Class112 local60 = Static230.aClass112Array2[arg0] = new Class112();
			local60.anInt2707 = (local36.aByte89 << 28) + (local36.anIntArray370[0] + Static101.anInt6646 >> 6 << 14) + (Static278.anInt4392 - -local36.anIntArray369[0] >> 6);
			if (local36.anInt4972 == -1) {
				local60.anInt2705 = local36.aClass145_7.method2946();
			} else {
				local60.anInt2705 = local36.anInt4972;
			}
			local60.aBoolean216 = local36.aBoolean395;
			local60.anInt2708 = local36.anInt6012;
			if (local36.anInt4953 > 0) {
				Static359.method4656(local36);
			}
			Static73.aClass20_Sub3_Sub3_Sub1Array1[arg0] = null;
			if (arg1.method3347(1) != 0) {
				Static233.method3071(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZI)I")
	public static int method5028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}
}
