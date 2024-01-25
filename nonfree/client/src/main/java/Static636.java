import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_96 = new Class144(88, -1);

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
	public static int anInt9852 = 0;

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[200];

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "[I")
	public static final int[] anIntArray711 = new int[5];

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(B)V")
	public static void method8387() {
		@Pc(8) Class3_Sub23 local8 = (Class3_Sub23) Static114.aClass342_21.method7644();
		@Pc(24) boolean local24 = Static334.aClass270_10 != null || Static116.anInt2383 > 0;
		@Pc(28) int local28 = local8.method3197();
		@Pc(32) int local32 = local8.method3196();
		if (local24) {
			Static68.anInt1625 = 1;
		}
		if (local24) {
			Static524.aClass3_Sub7_Sub10_2 = Static585.aClass3_Sub7_Sub10_3;
		} else {
			Static172.method2785(local28, local32, Static585.aClass3_Sub7_Sub10_3);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method8390(@OriginalArg(0) String arg0) {
		return Static603.method7743(10, arg0);
	}
}
