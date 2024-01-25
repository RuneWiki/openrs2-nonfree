import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3939(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!nt;BLclient!nt;)V")
	public static void method3943(@OriginalArg(0) Class270 arg0, @OriginalArg(2) Class270 arg1) {
		@Pc(13) Class3_Sub29 local13 = Static507.method6901(Static559.aClass144_84, Static95.aClass292_2.aClass88_2);
		local13.aClass3_Sub2_Sub1_1.method2032(arg1.anInt7001);
		local13.aClass3_Sub2_Sub1_1.method2010(arg1.anInt7020);
		local13.aClass3_Sub2_Sub1_1.method2055(arg0.anInt7001);
		local13.aClass3_Sub2_Sub1_1.method2025(arg0.anInt6973);
		local13.aClass3_Sub2_Sub1_1.method2034(arg1.anInt6973);
		local13.aClass3_Sub2_Sub1_1.method2037(arg0.anInt7020);
		Static95.aClass292_2.method6855(local13);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!ha;I)Lclient!hw;")
	public static Class169 method3944(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1) {
		@Pc(10) Class196 local10 = Static706.method9431(arg0, true, arg1, true);
		return local10 == null ? null : local10.aClass169_6;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIZFIIIII)[[I")
	public static int[][] method3945(@OriginalArg(3) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class3_Sub1_Sub32 local13 = new Class3_Sub1_Sub32();
		local13.anInt9873 = 4;
		local13.anInt9881 = 3;
		local13.anInt9879 = (int) (arg0 * 4096.0F);
		local13.aBoolean666 = false;
		local13.anInt9876 = 4;
		local13.method9578();
		Static433.method5744(64, 256);
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			local13.method8414(local9[local46], local46);
		}
		return local9;
	}
}
