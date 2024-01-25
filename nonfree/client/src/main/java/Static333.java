import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "Lclient!am;")
	public static final Class6_Sub3 aClass6_Sub3_1 = new Class6_Sub3(0, 0);

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "[I")
	public static final int[] anIntArray699 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)Lclient!gn;")
	public static Class6_Sub2_Sub7 method5536(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub2_Sub7 local10 = (Class6_Sub2_Sub7) Static5.aClass31_1.method634((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = Static149.aClass53_83.method1033(arg0, 1);
		} else {
			local25 = Static338.aClass53_154.method1033(arg0 & 0x7FFF, 1);
		}
		local10 = new Class6_Sub2_Sub7();
		if (local25 != null) {
			local10.method2156(new Class6_Sub10(local25));
		}
		if (arg0 >= 32768) {
			local10.method2149();
		}
		Static5.aClass31_1.method632((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!dp;Lclient!dp;I)V")
	public static void method5538(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1) {
		Static143.aClass53_84 = arg0;
		Static47.aClass53_30 = arg1;
		Static20.anInt325 = Static47.aClass53_30.method1011(3);
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)Z")
	public static boolean method5539() {
		if (Static23.aBoolean27) {
			try {
				if ((Boolean) Static365.method3241(Static308.aClass206_5.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}
}
