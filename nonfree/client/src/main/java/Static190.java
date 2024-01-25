import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "Lclient!cb;")
	public static Class50 aClass50_49;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "[I")
	public static final int[] anIntArray174 = new int[13];

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
	public static void method2743() {
		for (@Pc(9) Class5_Sub2_Sub13 local9 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2572(); local9 != null; local9 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2569()) {
			if (Static77.method1114(local9.anInt6711)) {
				Static536.method7432(local9);
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III[BII)Z")
	public static boolean method2750(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = true;
		@Pc(10) Class5_Sub15 local10 = new Class5_Sub15(arg2);
		@Pc(17) int local17 = -1;
		label56: while (true) {
			@Pc(21) int local21 = local10.method3663();
			if (local21 == 0) {
				return local5;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(37) int local37;
				while (!local31) {
					local37 = local10.method3690();
					if (local37 == 0) {
						continue label56;
					}
					local29 += local37 - 1;
					@Pc(63) int local63 = local29 & 0x3F;
					@Pc(69) int local69 = local29 >> 6 & 0x3F;
					@Pc(77) int local77 = local10.method3642() >> 2;
					@Pc(81) int local81 = local69 + arg0;
					@Pc(86) int local86 = local63 + arg1;
					if (local81 > 0 && local86 > 0 && arg4 - 1 > local81 && local86 < arg3 - 1) {
						@Pc(105) Class81 local105 = Static400.aClass140_4.method2839(local17);
						if (local77 != 22 || Static655.aClass5_Sub36_29.aClass2_Sub3_1.method2012() != 0 || local105.anInt1885 != 0 || local105.anInt1881 == 1 || local105.aBoolean130) {
							if (!local105.method1758()) {
								local5 = false;
								Static3.anInt23++;
							}
							local31 = true;
						}
					}
				}
				local37 = local10.method3690();
				if (local37 == 0) {
					break;
				}
				local10.method3642();
			}
		}
	}
}
