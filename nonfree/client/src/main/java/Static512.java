import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "[I")
	public static final int[] anIntArray586 = new int[8];

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[5];

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
	public static int anInt8137 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qea;ILclient!tl;I)V")
	public static void method7252(@OriginalArg(0) Class307 arg0, @OriginalArg(2) Class4_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (Static66.anInt1152 >= 50 || (arg0 == null || arg0.anIntArrayArray51 == null || arg2 >= arg0.anIntArrayArray51.length || arg0.anIntArrayArray51[arg2] == null)) {
			return;
		}
		@Pc(40) int local40 = arg0.anIntArrayArray51[arg2][0];
		@Pc(44) int local44 = local40 >> 8;
		@Pc(50) int local50 = local40 >> 5 & 0x7;
		@Pc(67) int local67;
		if (arg0.anIntArrayArray51[arg2].length > 1) {
			local67 = (int) (Math.random() * (double) arg0.anIntArrayArray51[arg2].length);
			if (local67 > 0) {
				local44 = arg0.anIntArrayArray51[arg2][local67];
			}
		}
		@Pc(83) int local83 = local40 & 0x1F;
		local67 = 256;
		if (arg0.anIntArray585 != null && arg0.anIntArray583 != null) {
			local67 = (int) (Math.random() * (double) (arg0.anIntArray583[arg2] - arg0.anIntArray585[arg2])) + arg0.anIntArray585[arg2];
		}
		@Pc(133) int local133 = arg0.anIntArray584 == null ? 255 : arg0.anIntArray584[arg2];
		if (local83 == 0) {
			if (arg1 == Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2) {
				if (!arg0.aBoolean702) {
					Static485.method6932(local67, local50, local133, 0, local44);
					return;
				}
				Static43.method587(local44, local133, false, local50, local67, 0);
			}
		} else if (Static650.aClass2_Sub30_29.aClass11_Sub5_1.method1696(1) != 0) {
			@Pc(180) int local180 = arg1.anInt10229 - 256 >> 9;
			@Pc(187) int local187 = arg1.anInt10228 - 256 >> 9;
			@Pc(208) int local208 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 == arg1 ? 0 : (local180 << 16) + (arg1.aByte133 << 24) + (local187 << 8) + local83;
			Static461.aClass177Array1[Static66.anInt1152++] = new Class177((byte) (arg0.aBoolean702 ? 2 : 1), local44, local50, 0, local133, local208, local67, arg1);
		}
	}
}
