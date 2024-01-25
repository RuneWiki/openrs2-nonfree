import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!v", name = "J", descriptor = "Lclient!aj;")
	public static Class17 aClass17_1;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIZ)I")
	public static int method8110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 4095 - arg1;
		} else {
			return 4095 - arg2;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	public static void method8111() {
		@Pc(5) int local5 = 0;
		if (Static404.aClass2_Sub13_2 != null) {
			local5 = Static404.aClass2_Sub13_2.aClass33_Sub12_1.method4517();
		}
		@Pc(38) int local38;
		@Pc(54) int local54;
		if (local5 == 2) {
			local38 = Static519.anInt8672 > 800 ? 800 : Static519.anInt8672;
			local54 = Static547.anInt9285 > 600 ? 600 : Static547.anInt9285;
			Static480.anInt8253 = (Static519.anInt8672 - local38) / 2;
			Static571.anInt9399 = local38;
			Static386.anInt6957 = 0;
			Static585.anInt9606 = local54;
		} else if (local5 == 1) {
			local38 = Static519.anInt8672 > 1024 ? 1024 : Static519.anInt8672;
			Static480.anInt8253 = (Static519.anInt8672 - local38) / 2;
			Static571.anInt9399 = local38;
			local54 = Static547.anInt9285 > 768 ? 768 : Static547.anInt9285;
			Static585.anInt9606 = local54;
			Static386.anInt6957 = 0;
		} else {
			Static571.anInt9399 = Static519.anInt8672;
			Static480.anInt8253 = 0;
			Static386.anInt6957 = 0;
			Static585.anInt9606 = Static547.anInt9285;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!jda;Lclient!jda;)V")
	public static void method8112(@OriginalArg(1) Class2_Sub5 arg0, @OriginalArg(2) Class2_Sub5 arg1) {
		if (arg0.aClass2_Sub5_67 != null) {
			arg0.method8464();
		}
		arg0.aClass2_Sub5_66 = arg1;
		arg0.aClass2_Sub5_67 = arg1.aClass2_Sub5_67;
		arg0.aClass2_Sub5_67.aClass2_Sub5_66 = arg0;
		arg0.aClass2_Sub5_66.aClass2_Sub5_67 = arg0;
	}
}
