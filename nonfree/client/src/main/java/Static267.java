import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "F")
	public static float aFloat169;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
	public static int anInt5781;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "[Lclient!ia;")
	public static Class2_Sub4_Sub1_Sub1[] aClass2_Sub4_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "Lclient!qia;")
	public static final Class276 aClass276_38 = new Class276();

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_67 = new Class218(111, -2);

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "([[BILclient!tha;)V")
	public static void method4897(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class132_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class3_Sub15 local30 = new Class3_Sub15(local23);
				local36 = Static475.anIntArray531[local17] >> 8;
				@Pc(42) int local42 = Static475.anIntArray531[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static446.anInt8090;
				@Pc(55) int local55 = local42 * 64 - Static124.anInt3150;
				Static14.method8598();
				arg1.method7713(Static334.aClass291Array20, local55, Static124.anInt3150, Static446.anInt8090, local49, local30);
				arg1.method7723(local30, local55, local12, Static47.aClass33_3, local49);
				if (!arg1.aBoolean787 && Static472.anInt6106 / 8 == local36 && Static79.anInt1964 / 8 == local42 && local12[0] != -1) {
					Static278.aClass147_5 = Static20.aClass202_1.method5434(local12[2], local12[3], local12[0], local12[1], Static57.aClass265_33);
					Static530.anInt9140 = local12[4];
				}
			}
		}
		for (@Pc(135) int local135 = 0; local135 < local15; local135++) {
			@Pc(148) int local148 = (Static475.anIntArray531[local135] >> 8) * 64 - Static446.anInt8090;
			local36 = (Static475.anIntArray531[local135] & 0xFF) * 64 - Static124.anInt3150;
			@Pc(163) byte[] local163 = arg0[local135];
			if (local163 == null && Static79.anInt1964 < 800) {
				Static14.method8598();
				arg1.method7705(local148, local36);
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
	public static void method4900() {
		if (Static189.aClass122_1 != null) {
			Static189.aClass122_1.method6816();
		}
		if (Static569.aClass122_3 != null) {
			Static569.aClass122_3.method6816();
		}
	}
}
