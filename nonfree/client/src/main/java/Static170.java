import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!dw;[[BI)V")
	public static void method2968(@OriginalArg(0) Class70_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.anInt2459; local3++) {
			Static66.method1526();
			for (@Pc(16) int local16 = 0; local16 < Static400.anInt6818 >> 3; local16++) {
				for (@Pc(20) int local20 = 0; local20 < Static271.anInt5050 >> 3; local20++) {
					@Pc(30) int local30 = Static73.anIntArrayArrayArray3[local3][local16][local20];
					if (local30 != -1) {
						@Pc(39) int local39 = local30 >> 24 & 0x3;
						if (!arg0.aBoolean202 || local39 == 0) {
							@Pc(53) int local53 = local30 >> 1 & 0x3;
							@Pc(59) int local59 = local30 >> 14 & 0x3FF;
							@Pc(65) int local65 = local30 >> 3 & 0x7FF;
							@Pc(75) int local75 = local65 / 8 + (local59 / 8 << 8);
							for (@Pc(77) int local77 = 0; local77 < Static548.anIntArray650.length; local77++) {
								if (local75 == Static548.anIntArray650[local77] && arg1[local77] != null) {
									arg0.method2215(Static4.aClass43_1, arg1[local77], local39, local16 * 8, (local59 & 0x7) * 8, Static221.aClass95Array2, local53, (local65 & 0x7) * 8, local20 * 8, local3);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!lk;BLclient!lk;)V")
	public static void method2969(@OriginalArg(0) Class203 arg0, @OriginalArg(2) Class203 arg1) {
		@Pc(14) Class3_Sub34 local14 = Static374.method5522(Static438.aClass298_89, Static220.aClass287_2);
		local14.aClass3_Sub11_Sub1_2.method3101(arg1.anInt5531);
		local14.aClass3_Sub11_Sub1_2.method3103(arg1.anInt5504);
		local14.aClass3_Sub11_Sub1_2.method3103(arg0.anInt5504);
		local14.aClass3_Sub11_Sub1_2.method3131(arg0.anInt5507);
		local14.aClass3_Sub11_Sub1_2.method3132(arg1.anInt5507);
		local14.aClass3_Sub11_Sub1_2.method3087(arg0.anInt5531);
		Static131.method2572(local14);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2970(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}
}
