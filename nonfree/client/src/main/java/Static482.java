import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_420 = new Class305(99, 3);

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
	public static int anInt8558 = 0;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_125 = new Class45(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Z")
	public static boolean aBoolean635 = false;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([[BILclient!vk;)V")
	public static void method7477(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class102_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt9074; local14++) {
			Static422.method6584();
			for (@Pc(20) int local20 = 0; local20 < Static237.anInt4563 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static373.anInt6694 >> 3; local24++) {
					@Pc(34) int local34 = Static329.anIntArrayArrayArray18[local14][local20][local24];
					if (local34 != -1) {
						@Pc(44) int local44 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean681 || local44 == 0) {
							@Pc(58) int local58 = local34 >> 1 & 0x3;
							@Pc(64) int local64 = local34 >> 14 & 0x3FF;
							@Pc(70) int local70 = local34 >> 3 & 0x7FF;
							@Pc(81) int local81 = (local64 / 8 << 8) + (local70 / 8);
							for (@Pc(83) int local83 = 0; local83 < Static378.anIntArray656.length; local83++) {
								if (local81 == Static378.anIntArray656[local83] && arg0[local83] != null) {
									@Pc(101) Class1_Sub17 local101 = new Class1_Sub17(arg0[local83]);
									arg1.method7844(local24 * 8, Static362.aClass243Array5, local44, local20 * 8, local64, local101, local14, local70, local58);
									arg1.method7858(local20 * 8, Static455.aClass4_11, local44, local58, local24 * 8, local12[0] == -1 ? local12 : null, local70, local64, local14, local101);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static516.aClass62_1 = Static402.aClass2_1.method181(Static435.aClass280_1, local12[0], local12[3], local12[2], local12[1]);
			Static74.anInt1796 = local12[4];
		}
	}
}
