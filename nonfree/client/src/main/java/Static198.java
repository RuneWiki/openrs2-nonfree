import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!t", name = "t", descriptor = "Lclient!jb;")
	public static Class28 aClass28_69;

	@OriginalMember(owner = "client!t", name = "q", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1130 = Static231.method3737("hint_mapmarkers");

	@OriginalMember(owner = "client!t", name = "r", descriptor = "I")
	public static int anInt4319 = 0;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1131 = Static231.method3737("showingVideoAd");

	@OriginalMember(owner = "client!t", name = "u", descriptor = "[Lclient!ed;")
	public static Class5_Sub5_Sub1[] aClass5_Sub5_Sub1Array1 = new Class5_Sub5_Sub1[2048];

	@OriginalMember(owner = "client!t", name = "w", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1132 = Static231.method3737("<col=ffff00>");

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Z")
	public static boolean method3188(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIZI)I")
	public static int method3190(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub20 local12 = (Class1_Sub20) Static169.aClass50_20.method1364((long) arg0);
		if (local12 == null) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local12.anIntArray264.length; local20++) {
			if (local12.anIntArray264[local20] >= 0 && local12.anIntArray264[local20] < Static58.anInt1424) {
				@Pc(43) Class75 local43 = Static128.method2147(local12.anIntArray264[local20]);
				if (local43.aClass50_17 != null) {
					@Pc(54) Class1_Sub5 local54 = (Class1_Sub5) local43.aClass50_17.method1364((long) arg2);
					if (local54 != null) {
						if (arg1) {
							local18 += local12.anIntArray263[local20] * local54.anInt782;
						} else {
							local18 += local54.anInt782;
						}
					}
				}
			}
		}
		return local18;
	}
}
