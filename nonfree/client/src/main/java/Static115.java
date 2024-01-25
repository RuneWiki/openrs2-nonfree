import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString87 = "Allocating memory";

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "[I")
	public static final int[] anIntArray193 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString88 = "Loading sprites - ";

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString89 = "Loaded world list data";

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZII)V")
	public static void method1832(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static305.aClass1_Sub21_Sub2_3.method5757(254);
		Static305.aClass1_Sub21_Sub2_3.method5711(arg1);
		Static305.aClass1_Sub21_Sub2_3.method5738(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
	public static void method1834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class83 local7 = Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass10_Sub3_1 != null) {
			local7.aClass10_Sub3_1 = null;
		}
	}
}
