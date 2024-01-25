import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "[Lclient!rg;")
	public static Class27[] aClass27Array63;

	@OriginalMember(owner = "client!aa", name = "J", descriptor = "[I")
	public static int[] anIntArray588;

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "Z")
	public static boolean aBoolean497 = false;

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "Lclient!ve;")
	public static final Class2_Sub24_Sub2 aClass2_Sub24_Sub2_43 = new Class2_Sub24_Sub2(5000);

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_207 = new Class208(42, 14);

	@OriginalMember(owner = "client!aa", name = "H", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_208 = new Class208(58, -1);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!hg;IILclient!ab;IBILclient!oj;)V")
	public static void method6063(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class48 arg7) {
		@Pc(18) Class212 local18 = Static78.aClass195_2.method4816(arg3);
		if (local18 == null || !local18.aBoolean440 || !local18.method5244(Static179.aClass115_1)) {
			return;
		}
		@Pc(38) int local38;
		if (local18.anIntArray522 != null) {
			@Pc(36) int[] local36 = new int[local18.anIntArray522.length];
			@Pc(48) int local48;
			for (local38 = 0; local38 < local36.length / 2; local38++) {
				if (Static198.anInt4108 == 4) {
					local48 = (int) Static350.aFloat74 & 0x3FFF;
				} else {
					local48 = Static319.anInt5841 + (int) Static350.aFloat74 & 0x3FFF;
				}
				@Pc(61) int local61 = Class106.anIntArray240[local48];
				@Pc(65) int local65 = Class106.anIntArray242[local48];
				if (Static198.anInt4108 != 4) {
					local61 = local61 * 256 / (Static59.anInt1283 + 256);
					local65 = local65 * 256 / (Static59.anInt1283 + 256);
				}
				local36[local38 * 2] = (local61 * (arg0 + local18.anIntArray522[local38 * 2 + 1] * 4) + local65 * (arg5 + local18.anIntArray522[local38 * 2] * 4) >> 15) + arg6 + arg4.anInt64 / 2;
				local36[local38 * 2 + 1] = arg4.anInt116 / 2 + arg2 - ((local18.anIntArray522[local38 * 2 + 1] * 4 + arg0) * local65 - (arg5 + local18.anIntArray522[local38 * 2] * 4) * local61 >> 15);
			}
			Static163.method2889(arg7, local36, local18.anInt5976, arg4.anIntArray4, arg4.anIntArray8);
			for (local48 = 0; local48 < local36.length / 2 - 1; local48++) {
				arg7.method2530(local36[local48 * 2], local36[local48 * 2 + 1], local36[(local48 + 1) * 2], local36[(local48 + 1) * 2 + 1], local18.anInt5975, arg1, arg6, arg2);
			}
			arg7.method2530(local36[local36.length - 2], local36[local36.length - 1], local36[0], local36[1], local18.anInt5975, arg1, arg6, arg2);
		}
		@Pc(271) Class27 local271 = null;
		if (local18.anInt5994 != -1) {
			local271 = local18.method5243(arg7, false);
			if (local271 != null) {
				Static294.method4826(arg5, arg1, arg0, arg6, local271, arg2, arg4);
			}
		}
		if (local18.aString58 == null) {
			return;
		}
		local38 = 0;
		if (local271 != null) {
			local38 = local271.method5327();
		}
		@Pc(305) Class44 local305 = Static135.aClass44_3;
		@Pc(307) Class24 local307 = Static35.aClass24_1;
		if (local18.anInt5993 == 1) {
			local305 = Static31.aClass44_1;
			local307 = Static209.aClass24_6;
		}
		if (local18.anInt5993 == 2) {
			local305 = Static180.aClass44_4;
			local307 = Static121.aClass24_10;
		}
		Static227.method4129(local38, arg4, arg0, local305, local18.aString58, arg6, local18.anInt5972, arg1, arg2, local307, arg5);
		return;
	}
}
