import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Lclient!lm;")
	public static Class134 aClass134_144;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "[I")
	public static final int[] anIntArray649 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "[I")
	public static final int[] anIntArray650 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
	public static int anInt6442 = 0;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLclient!lm;)V")
	public static void method5545(@OriginalArg(1) Class134 arg0) {
		Static222.aClass134_106 = arg0;
		Static323.anInt6731 = Static222.aClass134_106.method3020(16);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIII)V")
	public static void method5546(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static305.aClass1_Sub21_Sub2_3.anInt6611 = 0;
		Static305.aClass1_Sub21_Sub2_3.method5718(20);
		Static305.aClass1_Sub21_Sub2_3.method5718(arg2);
		Static305.aClass1_Sub21_Sub2_3.method5718(arg3);
		Static305.aClass1_Sub21_Sub2_3.method5698(arg0);
		Static305.aClass1_Sub21_Sub2_3.method5698(arg1);
		Static5.anInt50 = 0;
		Static51.anInt1261 = 1;
		Static17.anInt339 = 0;
		Static3.anInt37 = -3;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!lm;Lclient!lm;ZI)V")
	public static void method5547(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class134 arg1) {
		Static173.aClass134_85 = arg1;
		Static50.aBoolean82 = true;
		Static328.aClass134_10 = arg0;
		@Pc(20) int local20 = Static328.aClass134_10.method3016() - 1;
		Static157.anInt3294 = Static328.aClass134_10.method3020(local20) + local20 * 256;
		Static203.aStringArray30 = new String[] { null, null, null, null, Static233.aString183 };
		Static206.aStringArray31 = new String[] { null, null, Static56.aString47, null, null };
	}
}
