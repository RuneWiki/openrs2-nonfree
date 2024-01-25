import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!po", name = "S", descriptor = "[Lclient!hh;")
	public static Class6[] aClass6Array11;

	@OriginalMember(owner = "client!po", name = "w", descriptor = "[I")
	public static final int[] anIntArray404 = new int[13];

	@OriginalMember(owner = "client!po", name = "I", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_79 = new Class240(2, 3);

	@OriginalMember(owner = "client!po", name = "R", descriptor = "I")
	public static int anInt7453 = -1;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIBII)V")
	public static void method6243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6;
		if (arg1 <= arg2) {
			for (local6 = arg1; local6 < arg2; local6++) {
				Static276.anIntArrayArray32[local6][arg3] = arg0;
			}
		} else {
			for (local6 = arg2; local6 < arg1; local6++) {
				Static276.anIntArrayArray32[local6][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "j", descriptor = "(I)V")
	public static void method6247() {
		try {
			if (Static634.anInt6735 == 1) {
				@Pc(10) int local10 = Static574.aClass3_Sub12_Sub3_3.method7576();
				if (local10 > 0 && Static574.aClass3_Sub12_Sub3_3.method7571()) {
					local10 -= Static27.anInt684;
					if (local10 < 0) {
						local10 = 0;
					}
					Static574.aClass3_Sub12_Sub3_3.method7553(local10);
					return;
				}
				Static574.aClass3_Sub12_Sub3_3.method7561();
				Static574.aClass3_Sub12_Sub3_3.method7554();
				Static672.aClass53_1 = null;
				if (Static554.aClass362_126 == null) {
					Static634.anInt6735 = 0;
				} else {
					Static634.anInt6735 = 2;
				}
				Static192.aClass3_Sub32_1 = null;
			}
			if (Static634.anInt6735 == 3) {
				@Pc(65) int local65 = Static574.aClass3_Sub12_Sub3_3.method7576();
				if (local65 < Static531.anInt8329 && Static574.aClass3_Sub12_Sub3_3.method7571()) {
					local65 += Static208.anInt3637;
					if (local65 > Static531.anInt8329) {
						local65 = Static531.anInt8329;
					}
					Static574.aClass3_Sub12_Sub3_3.method7553(local65);
				} else {
					Static634.anInt6735 = 0;
					Static208.anInt3637 = 0;
				}
			}
		} catch (@Pc(92) Exception local92) {
			local92.printStackTrace();
			Static574.aClass3_Sub12_Sub3_3.method7561();
			Static653.aClass3_Sub12_Sub3_4 = null;
			Static672.aClass53_1 = null;
			Static554.aClass362_126 = null;
			Static192.aClass3_Sub32_1 = null;
			Static634.anInt6735 = 0;
		}
	}
}
