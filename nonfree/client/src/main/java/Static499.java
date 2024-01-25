import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "[I")
	public static final int[] anIntArray463 = new int[8];

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
	public static final int anInt8508 = 4;

	@OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
	public static int anInt8510 = 1;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(BI)V")
	public static void method7237(@OriginalArg(1) int arg0) {
		@Pc(17) Class5_Sub2_Sub4 local17 = Static257.method3597(12, (long) arg0);
		local17.method2440();
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIIB)V")
	public static void method7238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class5_Sub2_Sub4 local14 = Static257.method3597(18, (long) arg2 | (long) arg1 << 32);
		local14.method2438();
		local14.anInt2740 = arg0;
		local14.anInt2749 = arg3;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IZLclient!iw;)Z")
	public static boolean method7241(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub15_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method3702(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		if (local8 == 0) {
			if (arg1.method3702(1) != 0) {
				method7241(arg0, arg1);
			}
			local28 = arg1.method3702(6);
			local33 = arg1.method3702(6);
			@Pc(45) boolean local45 = arg1.method3702(1) == 1;
			if (local45) {
				Static450.anIntArray436[Static74.anInt1181++] = arg0;
			}
			if (Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(68) Class177 local68 = Static105.aClass177Array1[arg0];
			@Pc(76) Class41_Sub1_Sub1_Sub3_Sub2 local76 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[arg0] = new Class41_Sub1_Sub1_Sub3_Sub2();
			local76.anInt9469 = arg0;
			if (Static628.aClass5_Sub15Array1[arg0] != null) {
				local76.method7944(Static628.aClass5_Sub15Array1[arg0]);
			}
			local76.method7925(true, local68.anInt4235);
			local76.anInt9452 = local68.anInt4236;
			local102 = local68.anInt4233;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			@Pc(116) int local116 = local102 & 0xFF;
			@Pc(125) int local125 = (local112 << 6) + local28 - Static454.anInt7910;
			@Pc(134) int local134 = (local116 << 6) + local33 - Static48.anInt750;
			local76.aBoolean698 = local68.aBoolean283;
			local76.aBoolean697 = local68.aBoolean282;
			local76.aByteArray90[0] = Static209.aByteArray29[arg0];
			local76.aByte149 = local76.aByte150 = (byte) local106;
			if (Static488.method7149(local125, local134)) {
				local76.aByte150++;
			}
			local76.method7942(local125, local134);
			local76.aBoolean695 = false;
			Static105.aClass177Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg1.method3702(2);
			local33 = Static105.aClass177Array1[arg0].anInt4233;
			Static105.aClass177Array1[arg0].anInt4233 = (local33 & 0xFFFFFFF) + (((local33 >> 28) + local28 & 0x3) << 28);
			return false;
		} else {
			@Pc(231) int local231;
			@Pc(236) int local236;
			@Pc(244) int local244;
			if (local8 != 2) {
				local28 = arg1.method3702(18);
				local33 = local28 >> 16;
				local231 = local28 >> 8 & 0xFF;
				local236 = local28 & 0xFF;
				local244 = Static105.aClass177Array1[arg0].anInt4233;
				local102 = (local244 >> 28) + local33 & 0x3;
				local106 = (local244 >> 14) + local231 & 0xFF;
				local112 = local236 + local244 & 0xFF;
				Static105.aClass177Array1[arg0].anInt4233 = local112 + (local106 << 14) + (local102 << 28);
				return false;
			}
			local28 = arg1.method3702(5);
			local33 = local28 >> 3;
			local231 = local28 & 0x7;
			local236 = Static105.aClass177Array1[arg0].anInt4233;
			local244 = (local236 >> 28) + local33 & 0x3;
			local102 = local236 >> 14 & 0xFF;
			local106 = local236 & 0xFF;
			if (local231 == 0) {
				local102--;
				local106--;
			}
			if (local231 == 1) {
				local106--;
			}
			if (local231 == 2) {
				local102++;
				local106--;
			}
			if (local231 == 3) {
				local102--;
			}
			if (local231 == 4) {
				local102++;
			}
			if (local231 == 5) {
				local102--;
				local106++;
			}
			if (local231 == 6) {
				local106++;
			}
			if (local231 == 7) {
				local106++;
				local102++;
			}
			Static105.aClass177Array1[arg0].anInt4233 = local106 + (local244 << 28) + (local102 << 14);
			return false;
		}
	}
}
