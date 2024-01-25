import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
	public static int anInt1226 = 0;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!je;Lclient!pf;I)V")
	public static void method1064(@OriginalArg(1) Class12_Sub2 arg0, @OriginalArg(2) Class275 arg1, @OriginalArg(3) int arg2) {
		if (Static4.anInt29 >= 50 || (arg1 == null || arg1.anIntArrayArray47 == null || arg1.anIntArrayArray47.length <= arg2 || arg1.anIntArrayArray47[arg2] == null)) {
			return;
		}
		@Pc(32) int local32 = arg1.anIntArrayArray47[arg2][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(51) int local51 = local32 & 0x1F;
		@Pc(68) int local68;
		if (arg1.anIntArrayArray47[arg2].length > 1) {
			local68 = (int) ((double) arg1.anIntArrayArray47[arg2].length * Math.random());
			if (local68 > 0) {
				local36 = arg1.anIntArrayArray47[arg2][local68];
			}
		}
		local68 = 256;
		if (arg1.anIntArray600 != null && arg1.anIntArray603 != null) {
			local68 = (int) (Math.random() * (double) (arg1.anIntArray603[arg2] - arg1.anIntArray600[arg2])) + arg1.anIntArray600[arg2];
		}
		@Pc(116) int local116 = arg1.anIntArray601 == null ? 255 : arg1.anIntArray601[arg2];
		if (local51 == 0) {
			if (arg0 == Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2) {
				if (arg1.aBoolean542) {
					Static503.method7357(local68, local116, 0, false, local36, local42);
					return;
				}
				Static143.method2260(local116, 0, local42, local36, local68);
			}
		} else if (Static56.aClass14_Sub22_5.aClass21_Sub20_5.method7115() != 0) {
			@Pc(160) int local160 = arg0.anInt10998 - 256 >> 9;
			@Pc(167) int local167 = arg0.anInt11002 - 256 >> 9;
			@Pc(187) int local187 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 == arg0 ? 0 : local51 + (local167 << 8) + (arg0.aByte146 << 24) + (local160 << 16);
			Static178.aClass393Array1[Static4.anInt29++] = new Class393((byte) (arg1.aBoolean542 ? 2 : 1), local36, local42, 0, local116, local187, local68, arg0);
		}
	}
}
