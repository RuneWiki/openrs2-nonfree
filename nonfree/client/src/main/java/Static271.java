import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_133 = new Class158("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
	public static int anInt5262 = -1;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
	public static int anInt5263 = 0;

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "[I")
	public static final int[] anIntArray495 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "Lclient!dw;")
	public static final Class65 aClass65_7 = new Class65("", 16);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
	public static void method4035(@OriginalArg(1) int arg0) {
		Static14.anInt198 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!za;Lclient!vl;IIIII)V")
	public static void method4038(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static220.anInt4418) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static216.anInt4346) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static198.anInt7949 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class252 local62 = Static67.aClass252ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static396.aClass96Array5[local17].ua(local23, local32) + Static396.aClass96Array5[local17].ua(local23 + 1, local32) + Static396.aClass96Array5[local17].ua(local23, local32 + 1) + Static396.aClass96Array5[local17].ua(local23 + 1, local32 + 1)) / 4 - (Static396.aClass96Array5[arg2].ua(arg3, arg4) + Static396.aClass96Array5[arg2].ua(arg3 + 1, arg4) + Static396.aClass96Array5[arg2].ua(arg3, arg4 + 1) + Static396.aClass96Array5[arg2].ua(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class30_Sub3 local143 = local62.aClass30_Sub3_3;
									@Pc(146) Class30_Sub3 local146 = local62.aClass30_Sub3_2;
									if (local143 != null && local143.method5719()) {
										arg1.method5718((local23 - arg3) * Static251.anInt4890 + (1 - arg5) * Static333.anInt6111, arg0, (local32 - arg4) * Static251.anInt4890 + (1 - arg6) * Static333.anInt6111, local140, local143, local1);
									}
									if (local146 != null && local146.method5719()) {
										arg1.method5718((local23 - arg3) * Static251.anInt4890 + (1 - arg5) * Static333.anInt6111, arg0, (local32 - arg4) * Static251.anInt4890 + (1 - arg6) * Static333.anInt6111, local140, local146, local1);
									}
									for (@Pc(219) Class208 local219 = local62.aClass208_3; local219 != null; local219 = local219.aClass208_2) {
										@Pc(223) Class30_Sub1 local223 = local219.aClass30_Sub1_1;
										if (local223 != null && local223.method5719() && (local23 == local223.aShort104 || local23 == local3) && (local32 == local223.aShort103 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort105 + 1 - local223.aShort104;
											@Pc(260) int local260 = local223.aShort102 + 1 - local223.aShort103;
											arg1.method5718((local223.aShort104 - arg3) * Static251.anInt4890 + (local252 - arg5) * Static333.anInt6111, arg0, (local223.aShort103 - arg4) * Static251.anInt4890 + (local260 - arg6) * Static333.anInt6111, local140, local223, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIZ)V")
	public static void method4039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static433.aClass1_Sub3_Sub1_11.method1197(arg2);
		Static433.aClass1_Sub3_Sub1_11.method1205(arg1);
		Static433.aClass1_Sub3_Sub1_11.method1205(arg0);
	}
}
