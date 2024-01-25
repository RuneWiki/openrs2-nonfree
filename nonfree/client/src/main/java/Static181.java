import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!ll", name = "H", descriptor = "Lclient!ir;")
	public static Class100 aClass100_19;

	@OriginalMember(owner = "client!ll", name = "P", descriptor = "Z")
	private static boolean aBoolean51;

	@OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
	private static int anInt1028;

	@OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
	private static int anInt1029;

	@OriginalMember(owner = "client!ll", name = "S", descriptor = "I")
	private static int anInt1030;

	@OriginalMember(owner = "client!ll", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString31 = "glow1:";

	@OriginalMember(owner = "client!ll", name = "C", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_13 = new Class198(4);

	@OriginalMember(owner = "client!ll", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString32 = "Stellar Dawn is loading - please wait...";

	@OriginalMember(owner = "client!ll", name = "K", descriptor = "[I")
	public static final int[] anIntArray63 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
	public static int anInt1027 = -1;

	@OriginalMember(owner = "client!ll", name = "N", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_14 = new Class198(16);

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V")
	public static void method799(@OriginalArg(1) int arg0) {
		Static56.aClass198_15 = new Class198(arg0);
	}

	@OriginalMember(owner = "client!ll", name = "providesignlink", descriptor = "(Lclient!de;)V")
	private static void method804(@OriginalArg(0) Class42 arg0) {
		Static353.aClass42_5 = arg0;
		Static13.aClass42_1 = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIZLclient!tj;II[Lclient!ao;I[BII)V")
	public static void method810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class122 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class13[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(14) Class3_Sub4 local14 = new Class3_Sub4(arg8);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method3646();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local14.method3633();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(44) int local44 = local28 & 0x3F;
				@Pc(50) int local50 = local28 >> 6 & 0x3F;
				@Pc(54) int local54 = local28 >> 12;
				@Pc(58) int local58 = local14.method3643();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				if (local54 == arg0 && arg7 <= local50 && local50 < arg7 + 8 && arg9 <= local44 && arg9 + 8 > local44) {
					@Pc(97) Class170 local97 = Static268.method4553(local16);
					@Pc(114) int local114 = Static154.method5396(local97.anInt5251, local97.anInt5235, local44 & 0x7, local66, local50 & 0x7, arg2) + arg1;
					@Pc(132) int local132 = arg10 + Static236.method4019(local66, arg2, local50 & 0x7, local97.anInt5235, local44 & 0x7, local97.anInt5251);
					if (local114 > 0 && local132 > 0 && local114 < Static162.anInt2152 - 1 && Static122.anInt2632 - 1 > local132) {
						@Pc(155) Class13 local155 = null;
						if (!arg3) {
							@Pc(159) int local159 = arg5;
							if ((Static160.aByteArrayArrayArray9[1][local114][local132] & 0x2) == 2) {
								local159 = arg5 - 1;
							}
							if (local159 >= 0) {
								local155 = arg6[local159];
							}
						}
						Static122.method2151(arg5, arg5, local62, local114, arg4, arg3, -1, local132, arg2 + local66 & 0x3, local16, true, local155);
					}
				}
			}
		}
	}
}
