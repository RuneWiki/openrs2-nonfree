import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray7 = new byte[1000][];

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
	public static void method1079() {
		Static294.aClass375_10.method8747();
		Static89.aClass391_9.method9092();
		Static416.aClass107_1.method2168();
		Static411.aClass88_3.method2022();
		Static95.aClass188_1.method4260();
		Static340.aClass121_1.method2650();
		Static334.aClass268_2.method6471();
		Static111.aClass279_4.method6908();
		Static439.aClass372_1.method8726();
		Static313.aClass200_1.method4609();
		Static672.aClass198_3.method4603();
		Static12.aClass368_1.method8688();
		Static340.aClass186_3.method4238();
		Static252.aClass280_1.method6914();
		Static611.aClass233_1.method5358();
		Static280.aClass349_2.method8159();
		Static399.aClass194_1.method4414();
		Static186.aClass147_1.method3205();
		Static534.aClass162_1.method3624();
		Static204.aClass350_1.method8192();
		Static604.aClass76_3.method1830();
		Static118.aClass55_1.method1402();
		Static122.method1894();
		Static249.method3628();
		Static252.method3639();
		Static466.method6899();
		Static180.method8388();
		Static259.aClass10_22.method380();
		Static339.aClass10_36.method380();
		Static466.aClass10_47.method380();
		Static395.aClass10_42.method380();
		Static295.aClass10_24.method380();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIB)Lclient!ns;")
	public static Class2_Sub1_Sub1_Sub3 method1081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class351 local16 = Static441.aClass351ArrayArrayArray1[arg2][arg1][arg0];
		if (local16 == null) {
			return null;
		}
		@Pc(22) Class2_Sub1_Sub1_Sub3 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class67 local27 = local16.aClass67_3; local27 != null; local27 = local27.aClass67_1) {
			@Pc(31) Class2_Sub1_Sub1 local31 = local27.aClass2_Sub1_Sub1_1;
			if (local31 instanceof Class2_Sub1_Sub1_Sub3) {
				@Pc(37) Class2_Sub1_Sub1_Sub3 local37 = (Class2_Sub1_Sub1_Sub3) local31;
				@Pc(47) int local47 = local37.method4326() * 256 + 252 - 256;
				@Pc(55) int local55 = local37.anInt10006 - local47 >> 9;
				@Pc(62) int local62 = local37.anInt10001 - local47 >> 9;
				@Pc(69) int local69 = local47 + local37.anInt10006 >> 9;
				@Pc(76) int local76 = local37.anInt10001 + local47 >> 9;
				if (local55 <= arg1 && local62 <= arg0 && local69 >= arg1 && arg0 <= local76) {
					@Pc(113) int local113 = (local69 + 1 - arg1) * (local76 + (1 - arg0));
					if (local113 > local24) {
						local24 = local113;
						local22 = local37;
					}
				}
			}
		}
		return local22;
	}
}
