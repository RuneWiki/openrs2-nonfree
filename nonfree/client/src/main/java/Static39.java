import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "Lclient!xa;")
	public static Class58 aClass58_26;

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
	public static int anInt4952;

	@OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
	public static int anInt4953;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_78 = new Class47(63, 4);

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_96 = new Class73(45, -1);

	@OriginalMember(owner = "client!bj", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray40 = new int[128][128];

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([[BBLclient!go;)V")
	public static void method4287(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class115_Sub1 arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20 = arg0.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(28) byte[] local28 = arg0[local22];
			if (local28 != null) {
				@Pc(35) Class6_Sub21 local35 = new Class6_Sub21(local28);
				local41 = Static365.anIntArray477[local22] >> 8;
				@Pc(47) int local47 = Static365.anIntArray477[local22] & 0xFF;
				@Pc(54) int local54 = local41 * 64 - anInt4952;
				@Pc(61) int local61 = local47 * 64 - Static138.anInt3088;
				Static482.method6632();
				arg1.method3145(anInt4952, local61, Static138.anInt3088, local54, local35, Static579.aClass189Array4);
				arg1.method3159(local61, Static240.aClass14_7, local17, local54, local35);
				if (!arg1.aBoolean249 && Static447.anInt7737 / 8 == local41 && local47 == Static455.anInt7847 / 8 && local17[0] != -1) {
					Static385.aClass268_1 = Static209.aClass270_1.method6106(local17[1], Static230.aClass306_1, local17[2], local17[0], local17[3]);
					Static596.anInt9622 = local17[4];
				}
			}
		}
		for (@Pc(140) int local140 = 0; local140 < local20; local140++) {
			@Pc(153) int local153 = (Static365.anIntArray477[local140] >> 8) * 64 - anInt4952;
			local41 = (Static365.anIntArray477[local140] & 0xFF) * 64 - Static138.anInt3088;
			@Pc(168) byte[] local168 = arg0[local140];
			if (local168 == null && Static455.anInt7847 < 800) {
				Static482.method6632();
				arg1.method3143(local153, local41);
			}
		}
	}
}
