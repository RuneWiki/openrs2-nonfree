import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!jo;")
	public static Class168 aClass168_44;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_44 = new Class181(20, 8);

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Z")
	public static boolean aBoolean323 = false;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	public static int anInt3896 = 2;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!nq;[[B)V")
	public static void method3468(@OriginalArg(1) Class202_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg0.anInt6804; local18++) {
			Static186.method3607();
			for (@Pc(24) int local24 = 0; local24 < Static228.anInt4746 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static44.anInt1275 >> 3; local28++) {
					@Pc(38) int local38 = Static154.anIntArrayArrayArray3[local18][local24][local28];
					if (local38 != -1) {
						@Pc(47) int local47 = local38 >> 24 & 0x3;
						if (!arg0.aBoolean511 || local47 == 0) {
							@Pc(58) int local58 = local38 >> 1 & 0x3;
							@Pc(64) int local64 = local38 >> 14 & 0x3FF;
							@Pc(70) int local70 = local38 >> 3 & 0x7FF;
							@Pc(80) int local80 = (local64 / 8 << 8) + local70 / 8;
							for (@Pc(82) int local82 = 0; local82 < Static341.anIntArray470.length; local82++) {
								if (local80 == Static341.anIntArray470[local82] && arg1[local82] != null) {
									@Pc(104) Class6_Sub26 local104 = new Class6_Sub26(arg1[local82]);
									arg0.method5725(local58, local47, local64, Static55.aClass194Array1, local24 * 8, local18, local104, local28 * 8, local70);
									arg0.method5740(local16[0] == -1 ? local16 : null, local28 * 8, Static323.aClass9_8, local64, local104, local47, local18, local70, local24 * 8, local58);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local16[0] != -1) {
			Static74.aClass38_3 = Static61.aClass15_1.method642(local16[1], Static273.aClass115_1, local16[3], local16[0], local16[2]);
			Static432.anInt7891 = local16[4];
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!w;III[Z)V")
	public static void method3472(@OriginalArg(0) Class6_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static47.aClass62Array1 == Static369.aClass62Array3) {
			return;
		}
		@Pc(9) int local9 = Static53.aClass62Array2[arg1].sa(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class62 local22 = Static53.aClass62Array2[local11];
				if (local22 != null) {
					local22.FA(arg0, arg2, local9 - local22.sa(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
