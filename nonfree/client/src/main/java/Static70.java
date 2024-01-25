import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	public static int anInt1271;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
	public static int anInt1276;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	public static int anInt1274 = 20;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_20 = new Class198("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "[I")
	public static final int[] anIntArray64 = new int[8];

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZ)V")
	public static void method1069(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static76.aClass5_Sub15_Sub2_1.method5608(Static128.anInt2223) >= 15) {
				@Pc(18) int local18 = Static76.aClass5_Sub15_Sub2_1.method5610(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					@Pc(30) Class5_Sub7 local30 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local18);
					@Pc(36) Class2_Sub1_Sub3_Sub1 local36;
					if (local30 == null) {
						local36 = new Class2_Sub1_Sub3_Sub1();
						local36.anInt6126 = local18;
						local30 = new Class5_Sub7(local36);
						Static380.aClass252_36.method5658(local30, (long) local18);
						local23 = true;
						Static277.aClass5_Sub7Array1[Static111.anInt1879++] = local30;
					}
					local36 = local30.aClass2_Sub1_Sub3_Sub1_1;
					Static218.anIntArray351[Static424.anInt7114++] = local18;
					local36.anInt6163 = Static85.anInt1536;
					if (local36.aClass131_1 != null && local36.aClass131_1.method2779()) {
						Static166.method2328(local36);
					}
					@Pc(90) int local90 = Static76.aClass5_Sub15_Sub2_1.method5610(1);
					@Pc(95) int local95 = Static76.aClass5_Sub15_Sub2_1.method5610(2);
					@Pc(100) int local100 = Static76.aClass5_Sub15_Sub2_1.method5610(1);
					if (local100 == 1) {
						Static175.anIntArray133[Static182.anInt3087++] = local18;
					}
					@Pc(124) int local124 = Static76.aClass5_Sub15_Sub2_1.method5610(3) + 4 << 11 & 0x3D52;
					local36.method4091(Static196.aClass180_1.method3713(Static76.aClass5_Sub15_Sub2_1.method5610(14)));
					@Pc(141) int local141;
					if (arg0) {
						local141 = Static76.aClass5_Sub15_Sub2_1.method5610(8);
						if (local141 > 127) {
							local141 -= 256;
						}
					} else {
						local141 = Static76.aClass5_Sub15_Sub2_1.method5610(5);
						if (local141 > 15) {
							local141 -= 32;
						}
					}
					@Pc(165) int local165;
					if (arg0) {
						local165 = Static76.aClass5_Sub15_Sub2_1.method5610(8);
						if (local165 > 127) {
							local165 -= 256;
						}
					} else {
						local165 = Static76.aClass5_Sub15_Sub2_1.method5610(5);
						if (local165 > 15) {
							local165 -= 32;
						}
					}
					local36.method4904(local36.aClass131_1.anInt3463);
					local36.anInt6134 = local36.aClass131_1.anInt3460 << 3;
					if (local23) {
						local36.method4909(local124, true);
					}
					local36.method4083(local95, Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray433[0] + local141, local36.method4913(), local90 == 1, Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray434[0] + local165);
					if (local36.aClass131_1.method2779()) {
						Static168.method3851(local36, local36.anIntArray434[0], null, local36.aByte105, null, local36.anIntArray433[0], 0);
					}
					continue;
				}
			}
			Static76.aClass5_Sub15_Sub2_1.method5612();
			return;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!wl;)I")
	public static int method1070(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		if (arg0.anInt6134 == 0) {
			return 0;
		}
		@Pc(72) int local72;
		@Pc(65) int local65;
		if (arg0.anInt6176 != -1) {
			@Pc(23) Class2_Sub1_Sub3 local23 = null;
			if (arg0.anInt6176 < 32768) {
				@Pc(51) Class5_Sub7 local51 = (Class5_Sub7) Static380.aClass252_36.method5659((long) arg0.anInt6176);
				if (local51 != null) {
					local23 = local51.aClass2_Sub1_Sub3_Sub1_1;
				}
			} else if (arg0.anInt6176 >= 32768) {
				local23 = Static359.aClass2_Sub1_Sub3_Sub2Array1[arg0.anInt6176 - 32768];
			}
			if (local23 != null) {
				local65 = arg0.anInt7500 - local23.anInt7500;
				local72 = arg0.anInt7502 - local23.anInt7502;
				if (local65 != 0 || local72 != 0) {
					arg0.method4915((int) (Math.atan2((double) local65, (double) local72) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class2_Sub1_Sub3_Sub2) {
			@Pc(95) Class2_Sub1_Sub3_Sub2 local95 = (Class2_Sub1_Sub3_Sub2) arg0;
			if (local95.anInt6215 != -1 && (local95.anInt6199 == 0 || local95.anInt6197 > 0)) {
				local95.method4915(local95.anInt6215);
				local95.anInt6215 = -1;
			}
		} else if (arg0 instanceof Class2_Sub1_Sub3_Sub1) {
			@Pc(124) Class2_Sub1_Sub3_Sub1 local124 = (Class2_Sub1_Sub3_Sub1) arg0;
			if (local124.anInt5275 != -1 && (local124.anInt6199 == 0 || local124.anInt6197 > 0)) {
				local65 = local124.anInt7500 - (local124.anInt5275 - Static31.anInt618 - Static31.anInt618) * 64;
				local72 = local124.anInt7502 - (local124.anInt5288 - Static226.anInt3768 - Static226.anInt3768) * 64;
				if (local65 != 0 || local72 != 0) {
					local124.method4915((int) (Math.atan2((double) local65, (double) local72) * 2607.5945876176133D) & 0x3FFF);
				}
				local124.anInt5275 = -1;
			}
		}
		return arg0.method4912();
	}
}
