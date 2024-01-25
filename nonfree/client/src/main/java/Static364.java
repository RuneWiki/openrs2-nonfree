import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_323 = new Class12(29, 6);

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
	public static void method5172() {
		try {
			if (Static25.anInt424 == 1) {
				@Pc(13) int local13 = Static398.aClass1_Sub5_Sub4_4.method4468();
				if (local13 > 0 && Static398.aClass1_Sub5_Sub4_4.method4449()) {
					local13 -= Static386.anInt6855;
					if (local13 < 0) {
						local13 = 0;
					}
					Static398.aClass1_Sub5_Sub4_4.method4473(local13);
				} else {
					Static398.aClass1_Sub5_Sub4_4.method4484();
					Static398.aClass1_Sub5_Sub4_4.method4451();
					Static180.aClass1_Sub33_3 = null;
					if (Static289.aClass109_67 == null) {
						Static25.anInt424 = 0;
					} else {
						Static25.anInt424 = 2;
					}
					Static24.aClass240_1 = null;
				}
			}
		} catch (@Pc(57) Exception local57) {
			local57.printStackTrace();
			Static398.aClass1_Sub5_Sub4_4.method4484();
			Static180.aClass1_Sub33_3 = null;
			Static24.aClass240_1 = null;
			Static289.aClass109_67 = null;
			Static25.anInt424 = 0;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II[II[I)V")
	public static void method5173(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(26) int local26 = (arg0 + arg2) / 2;
		@Pc(28) int local28 = arg0;
		@Pc(32) int local32 = arg3[local26];
		arg3[local26] = arg3[arg2];
		arg3[arg2] = local32;
		@Pc(46) int local46 = arg1[local26];
		arg1[local26] = arg1[arg2];
		arg1[arg2] = local46;
		@Pc(63) int local63 = local32 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg0; local65 < arg2; local65++) {
			if (arg3[local65] < (local65 & local63) + local32) {
				@Pc(80) int local80 = arg3[local65];
				arg3[local65] = arg3[local28];
				arg3[local28] = local80;
				@Pc(94) int local94 = arg1[local65];
				arg1[local65] = arg1[local28];
				arg1[local28++] = local94;
			}
		}
		arg3[arg2] = arg3[local28];
		arg3[local28] = local32;
		arg1[arg2] = arg1[local28];
		arg1[local28] = local46;
		method5173(arg0, arg1, local28 - 1, arg3);
		method5173(local28 + 1, arg1, arg2, arg3);
	}
}
