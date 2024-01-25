import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!po", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!po", name = "n", descriptor = "S")
	public static short aShort89 = 1;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!wp;II)Z")
	public static boolean method6725(@OriginalArg(0) Class8_Sub8_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method8586(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		@Pc(116) int local116;
		if (local8 == 0) {
			if (arg0.method8586(1) != 0) {
				method6725(arg0, arg1);
			}
			local28 = arg0.method8586(6);
			local33 = arg0.method8586(6);
			@Pc(45) boolean local45 = arg0.method8586(1) == 1;
			if (local45) {
				Static488.anIntArray480[Static94.anInt6311++] = arg1;
			}
			if (Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(68) Class272 local68 = Static408.aClass272Array1[arg1];
			@Pc(76) Class15_Sub1_Sub2_Sub2_Sub1 local76 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[arg1] = new Class15_Sub1_Sub2_Sub2_Sub1();
			local76.anInt8075 = arg1;
			if (Static524.aClass8_Sub8Array1[arg1] != null) {
				local76.method2763(Static524.aClass8_Sub8Array1[arg1]);
			}
			local76.method6683(local68.anInt8303, true);
			local76.anInt8108 = local68.anInt8304;
			local102 = local68.anInt8302;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			local116 = local102 & 0xFF;
			@Pc(125) int local125 = (local112 << 6) + local28 - Static628.anInt10493;
			local76.aBoolean249 = local68.aBoolean596;
			@Pc(138) int local138 = local33 + (local116 << 6) - Static594.anInt10160;
			local76.aByteArray69[0] = Static607.aByteArray60[arg1];
			local76.aByte124 = local76.aByte125 = (byte) local106;
			if (Static61.method1675(local138, local125)) {
				local76.aByte125++;
			}
			local76.method2761(local125, local138);
			local76.aBoolean248 = false;
			Static408.aClass272Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg0.method8586(2);
			local33 = Static408.aClass272Array1[arg1].anInt8302;
			Static408.aClass272Array1[arg1].anInt8302 = (((local33 >> 28) + local28 & 0x3) << 28) + (local33 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(230) int local230;
			@Pc(235) int local235;
			if (local8 != 2) {
				local28 = arg0.method8586(18);
				local33 = local28 >> 16;
				local230 = local28 >> 8 & 0xFF;
				local235 = local28 & 0xFF;
				local102 = Static408.aClass272Array1[arg1].anInt8302;
				local106 = (local102 >> 28) + local33 & 0x3;
				local112 = local230 + (local102 >> 14) & 0xFF;
				local116 = local102 + local235 & 0xFF;
				Static408.aClass272Array1[arg1].anInt8302 = local116 + (local106 << 28) + (local112 << 14);
				return false;
			}
			local28 = arg0.method8586(5);
			local33 = local28 >> 3;
			local230 = local28 & 0x7;
			local235 = Static408.aClass272Array1[arg1].anInt8302;
			@Pc(243) int local243 = (local235 >> 28) + local33 & 0x3;
			local102 = local235 >> 14 & 0xFF;
			local106 = local235 & 0xFF;
			if (local230 == 0) {
				local106--;
				local102--;
			}
			if (local230 == 1) {
				local106--;
			}
			if (local230 == 2) {
				local102++;
				local106--;
			}
			if (local230 == 3) {
				local102--;
			}
			if (local230 == 4) {
				local102++;
			}
			if (local230 == 5) {
				local106++;
				local102--;
			}
			if (local230 == 6) {
				local106++;
			}
			if (local230 == 7) {
				local106++;
				local102++;
			}
			Static408.aClass272Array1[arg1].anInt8302 = local106 + (local243 << 28) + (local102 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
	public static void method6727() {
		Static412.method6490();
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(B)V")
	public static void method6730() {
		for (@Pc(12) Class15_Sub3 local12 = (Class15_Sub3) Static627.aClass123_11.method3540(); local12 != null; local12 = (Class15_Sub3) Static627.aClass123_11.method3540()) {
			Static412.method6491(local12);
		}
		@Pc(40) int local40;
		@Pc(39) int local39;
		if (Static155.aClass8_Sub25_6.aClass36_Sub13_1.method4838() == 1) {
			local39 = 3;
			local40 = 0;
		} else {
			local39 = Static591.anInt10125;
			local40 = Static591.anInt10125;
		}
		Static73.method1931();
		for (@Pc(49) int local49 = local40; local49 <= local39; local49++) {
			Static73.method1934();
			Static73.method1930(local49);
			Static73.method1926(local49);
		}
		Static73.method1933();
		Static73.method1932();
	}
}
