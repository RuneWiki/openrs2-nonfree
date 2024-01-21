import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!md", name = "S", descriptor = "Lclient!of;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "[Lclient!tg;")
	public static Class81[] aClass81Array8 = new Class81[100];

	@OriginalMember(owner = "client!md", name = "T", descriptor = "Lclient!tg;")
	private static Class81 aClass81_812 = Static120.method2057(" is already on your friend list)3");

	@OriginalMember(owner = "client!md", name = "V", descriptor = "Lclient!tg;")
	public static Class81 aClass81_813 = aClass81_812;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I[BZIIIIII[Lclient!gf;)V")
	public static void method1728(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class28[] arg8) {
		@Pc(12) int local12 = -1;
		@Pc(17) Class1_Sub8 local17 = new Class1_Sub8(arg1);
		while (true) {
			@Pc(21) int local21 = local17.method330();
			if (local21 == 0) {
				return;
			}
			@Pc(28) int local28 = 0;
			local12 += local21;
			while (true) {
				@Pc(36) int local36 = local17.method330();
				if (local36 == 0) {
					break;
				}
				@Pc(45) int local45 = local17.method336();
				local28 += local36 - 1;
				@Pc(55) int local55 = local45 >> 2;
				@Pc(59) int local59 = local28 >> 12;
				@Pc(65) int local65 = local28 >> 6 & 0x3F;
				@Pc(69) int local69 = local28 & 0x3F;
				@Pc(73) int local73 = local45 & 0x3;
				if (local59 == arg0 && local65 >= arg6 && arg6 + 8 > local65 && arg5 <= local69 && arg5 + 8 > local69) {
					@Pc(112) Class1_Sub2_Sub8 local112 = Static14.method220(local12);
					@Pc(130) int local130 = arg4 + Static48.method2782(local112.anInt1237, local112.anInt1277, local73, arg3, local69 & 0x7, local65 & 0x7);
					@Pc(148) int local148 = arg2 + Static15.method230(local65 & 0x7, local112.anInt1277, arg3, local112.anInt1237, local73, local69 & 0x7);
					if (local130 > 0 && local148 > 0 && local130 < 103 && local148 < 103) {
						@Pc(160) int local160 = arg7;
						@Pc(162) Class28 local162 = null;
						if ((Static43.aByteArrayArrayArray2[1][local130][local148] & 0x2) == 2) {
							local160 = arg7 - 1;
						}
						if (local160 >= 0) {
							local162 = arg8[local160];
						}
						Static101.method1673(local73 + arg3 & 0x3, local162, local130, local55, local148, arg7, local12);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
	public static void method1729() {
		aClass81Array8 = null;
		aClass81_812 = null;
		aClass63_1 = null;
		aClass81_813 = null;
	}
}
