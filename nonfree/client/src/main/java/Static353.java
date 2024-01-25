import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!wp", name = "nb", descriptor = "Lclient!of;")
	public static Class40 aClass40_20;

	@OriginalMember(owner = "client!wp", name = "bb", descriptor = "Lclient!ob;")
	public static final Class150 aClass150_1 = new Class150();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIB)I")
	public static int method5801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static91.method3108(4, arg1 + 45365, arg0 + 91923) + (Static91.method3108(2, arg1 + 10294, arg0 - -37821) - 128 >> 1) + (Static91.method3108(1, arg1, arg0) - 128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "(I)V")
	public static void method5802() {
		Static256.anInt4749 = 0;
		Static214.aClass211_24.method5584();
		Static201.aBoolean284 = false;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method5804(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}
