import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
	public static int anInt4512 = -1;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!it;Z)V")
	public static void method3741(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort111; local2 <= arg0.aShort112; local2++) {
			for (@Pc(6) int local6 = arg0.aShort110; local6 <= arg0.aShort109; local6++) {
				@Pc(16) Class58 local16 = Static486.aClass58ArrayArrayArray2[arg0.aByte146][local2][local6];
				if (local16 != null) {
					@Pc(21) Class43 local21 = local16.aClass43_4;
					@Pc(23) Class43 local23 = null;
					while (local21 != null) {
						if (local21.aClass12_Sub2_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass43_4 = local21.aClass43_3;
							} else {
								local23.aClass43_3 = local21.aClass43_3;
							}
							local21.method1190();
							break;
						}
						local23 = local21;
						local21 = local21.aClass43_3;
					}
				}
			}
		}
		if (!arg1) {
			Static432.method6337(arg0);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)I")
	public static int method3742(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
