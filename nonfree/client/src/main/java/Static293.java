import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!oq", name = "G", descriptor = "Lclient!fs;")
	public static Class76 aClass76_60;

	@OriginalMember(owner = "client!oq", name = "O", descriptor = "Lclient!tb;")
	public static Class99 aClass99_6;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "[S")
	public static final short[] aShortArray175 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!oq", name = "R", descriptor = "Lclient!wa;")
	public static final Class174 aClass174_1 = Static182.method2891();

	@OriginalMember(owner = "client!oq", name = "V", descriptor = "I")
	public static int anInt5286 = 0;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLclient!ya;)V")
	public static void method4033(@OriginalArg(1) Class19 arg0) {
		@Pc(7) int local7 = Static310.anInt5424;
		@Pc(9) int local9 = Static172.anInt3367;
		@Pc(11) int local11 = Static173.anInt3370;
		@Pc(13) int local13 = Static112.anInt2392;
		arg0.method4293(local7, local11, local9, -10660793, local13);
		arg0.method4293(local7 + 1, local11 - 2, local9 + 1, -16777216, 16);
		arg0.method4295(local7 + 1, -16777216, -19 + local13, local11 - 2, local9 + 18);
		Static331.aClass46_10.method5058(-1, -10660793, Static391.aClass83_133.method2267(Static178.anInt3423), local9 + 14, local7 + 3);
		@Pc(77) int local77 = Static420.aClass80_1.method2234();
		@Pc(81) int local81 = Static420.aClass80_1.method2230();
		@Pc(83) int local83 = 0;
		for (@Pc(90) Class4_Sub39 local90 = (Class4_Sub39) Static206.aClass183_28.method4140(); local90 != null; local90 = (Class4_Sub39) Static206.aClass183_28.method4144()) {
			@Pc(105) int local105 = (Static407.anInt6710 - local83 - 1) * 16 + local9 + 31;
			@Pc(107) short local107 = -1;
			if (local7 < local77 && local7 + local11 > local77 && local81 > local105 - 13 && local105 + 3 > local81 && local90.aBoolean512) {
				local107 = -256;
			}
			@Pc(149) int[] local149 = null;
			if (Static441.method5569(local90.anInt5699)) {
				local149 = Static444.aClass206_3.method4703((int) local90.aLong192).anIntArray435;
			} else if (local90.anInt5695 != -1) {
				local149 = Static444.aClass206_3.method4703(local90.anInt5695).anIntArray435;
			} else if (Static323.method4382(local90.anInt5699)) {
				@Pc(214) Class16_Sub1_Sub5_Sub2 local214 = Static143.aClass16_Sub1_Sub5_Sub2Array1[(int) local90.aLong192];
				if (local214 != null) {
					@Pc(219) Class264 local219 = local214.aClass264_1;
					if (local219.anIntArray544 != null) {
						local219 = local219.method5574(Static257.aClass114_1);
					}
					if (local219 != null) {
						local149 = local219.anIntArray547;
					}
				}
			} else if (Static106.method1982(local90.anInt5699)) {
				@Pc(186) Class202 local186;
				if (local90.anInt5699 == 1010) {
					local186 = Static267.aClass262_2.method5560((int) local90.aLong192);
				} else {
					local186 = Static267.aClass262_2.method5560((int) (local90.aLong192 >>> 32 & 0x7FFFFFFFL));
				}
				if (local186.anIntArray407 != null) {
					local186 = local186.method4584(Static257.aClass114_1);
				}
				if (local186 != null) {
					local149 = local186.anIntArray408;
				}
			}
			@Pc(255) String local255 = Static200.method3166(local90);
			if (local149 != null) {
				local255 = local255 + Static435.method5504(local149);
			}
			Static331.aClass46_10.method5057(Static278.anIntArray338, Static385.aClass57Array16, local107, local255, local7 + 3, local105);
			local83++;
			if (local90.aBoolean511) {
				Static389.aClass57_22.method5534(Static118.aClass89_5.method2340(local255) + local7 + 5, local105 + -12);
			}
		}
		Static403.method5216(Static173.anInt3370, Static112.anInt2392, Static172.anInt3367, Static310.anInt5424);
	}
}
