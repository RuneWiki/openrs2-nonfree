import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!si", name = "f", descriptor = "I")
	public static int anInt6161;

	@OriginalMember(owner = "client!si", name = "k", descriptor = "[I")
	public static final int[] anIntArray529 = new int[13];

	@OriginalMember(owner = "client!si", name = "o", descriptor = "Lclient!cb;")
	public static final Class32 aClass32_1 = new Class32();

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)Z")
	public static boolean method4809(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static154.anInt2668; local1 < Static289.anInt4757; local1++) {
			@Pc(6) Class270[][] local6 = Static309.aClass270ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static453.anInt7270; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static352.anInt5986 + local9;
				@Pc(18) int local18 = Static352.anInt5986 - local9;
				if (local14 >= Static267.anInt4409 || local18 < Static232.anInt3747) {
					for (@Pc(27) int local27 = -Static453.anInt7270; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static411.anInt6740 + local27;
						@Pc(36) int local36 = Static411.anInt6740 - local27;
						@Pc(48) Class270 local48;
						if (local14 >= Static267.anInt4409) {
							if (local32 >= Static92.anInt1788) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean528) {
									Static204.aBoolean208 = arg0;
									Static460.aClass45_4.method5053(local48);
									Static460.aClass45_4.method5059();
								}
							}
							if (local36 < Static231.anInt3738) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean528) {
									Static204.aBoolean208 = arg0;
									Static460.aClass45_4.method5053(local48);
									Static460.aClass45_4.method5059();
								}
							}
						}
						if (local18 < Static232.anInt3747) {
							if (local32 >= Static92.anInt1788) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean528) {
									Static204.aBoolean208 = arg0;
									Static460.aClass45_4.method5053(local48);
									Static460.aClass45_4.method5059();
								}
							}
							if (local36 < Static231.anInt3738) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean528) {
									Static204.aBoolean208 = arg0;
									Static460.aClass45_4.method5053(local48);
									Static460.aClass45_4.method5059();
								}
							}
						}
						if (Static4.anInt64 == 0) {
							if (Static348.aBoolean433) {
								Static460.aClass45_4.method5054(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
	public static void method4810(@OriginalArg(0) int arg0) {
		Static412.anInt6744 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	public static void method4811() {
		Static300.anIntArray418 = null;
		Static12.anIntArray16 = null;
		Static260.aBoolean306 = false;
		Static281.anIntArray393 = null;
		Static137.anIntArray556 = null;
		Static357.anIntArray503 = null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)V")
	public static void method4812(@OriginalArg(1) int arg0) {
		Static186.method5101();
		@Pc(13) int local13 = Static275.aClass138_1.method2812(arg0).anInt2410;
		if (local13 == 0) {
			return;
		}
		@Pc(25) int local25 = Static138.aClass268_1.anIntArray638[arg0];
		if (local13 == 5) {
			Static30.anInt587 = local25;
		}
		if (local13 == 6) {
			Static300.anInt4858 = local25;
		}
	}
}
