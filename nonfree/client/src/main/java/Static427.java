import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "Lclient!ul;")
	public static Class237 aClass237_1;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_237 = new Class175("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray57 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "[I")
	public static final int[] anIntArray514 = new int[32];

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILclient!qa;III)V")
	public static void method5668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2.pa(arg4, arg0, arg4 + arg1, arg0 - -arg3);
		arg2.method2600(arg3, arg4, arg1, arg0, -16777216);
		if (Static281.anInt5171 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static210.anInt7501 / (float) Static210.anInt7495;
		@Pc(38) int local38 = arg1;
		@Pc(40) int local40 = arg3;
		if (local36 < 1.0F) {
			local40 = (int) (local36 * (float) arg1);
		} else {
			local38 = (int) ((float) arg3 / local36);
		}
		@Pc(67) int local67 = arg4 + (arg1 - local38) / 2;
		@Pc(76) int local76 = arg0 + (arg3 - local40) / 2;
		if (Static273.aClass22_14 == null || Static273.aClass22_14.UA() != arg1 || Static273.aClass22_14.qa() != arg3) {
			Static210.method5883(Static210.anInt7505, Static210.anInt7496 + Static210.anInt7501, Static210.anInt7495 + Static210.anInt7505, Static210.anInt7496, local67, local76, local38 + local67, local40 + local76);
			Static210.method5889(arg2);
			Static273.aClass22_14 = arg2.method2627(local67, local76, local38, local40, false);
		}
		Static273.aClass22_14.method6074(local67, local76);
		@Pc(127) int local127 = local38 * Static381.anInt2831 / Static210.anInt7495;
		@Pc(133) int local133 = Static315.anInt5738 * local40 / Static210.anInt7501;
		@Pc(142) int local142 = local67 + Static200.anInt3951 * local38 / Static210.anInt7495;
		@Pc(156) int local156 = local76 + local40 - local133 - Static307.anInt5600 * local40 / Static210.anInt7501;
		@Pc(158) int local158 = -1996554240;
		if (Static114.aClass89_2 == Static69.aClass89_1) {
			local158 = -1996488705;
		}
		arg2.NA(local142, local156, local127, local133, local158, 1);
		arg2.method2637(local142, local156, local127, local133, local158, 0);
		if (Static284.anInt5213 <= 0) {
			return;
		}
		@Pc(191) int local191;
		if (Static27.anInt771 <= 50) {
			local191 = Static27.anInt771 * 5;
		} else {
			local191 = (100 - Static27.anInt771) * 5;
		}
		for (@Pc(205) Class3_Sub8 local205 = (Class3_Sub8) Static210.aClass229_48.method5328(); local205 != null; local205 = (Class3_Sub8) Static210.aClass229_48.method5325()) {
			@Pc(215) Class223 local215 = Static210.aClass61_4.method1426(local205.anInt1157);
			if (Static293.method2803(local215)) {
				@Pc(233) int local233;
				@Pc(246) int local246;
				if (local205.anInt1157 == Static166.anInt3528) {
					local233 = local67 + local38 * local205.anInt1153 / Static210.anInt7495;
					local246 = local76 + (Static210.anInt7501 - local205.anInt1154) * local40 / Static210.anInt7501;
					arg2.method2600(4, local233 - 2, 4, local246 - 2, local191 << 24 | 0xFFFF00);
				} else if (Static411.anInt7104 != -1 && Static411.anInt7104 == local215.anInt6730) {
					local233 = local205.anInt1153 * local38 / Static210.anInt7495 + local67;
					local246 = (Static210.anInt7501 - local205.anInt1154) * local40 / Static210.anInt7501 + local76;
					arg2.method2600(4, local233 - 2, 4, local246 - 2, local191 << 24 | 0xFFFF00);
				}
			}
		}
	}
}
