import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array10;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
	public static int anInt2734 = 0;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!vg;Lclient!vg;Z)V")
	public static void method2161(@OriginalArg(0) Class341 arg0, @OriginalArg(1) Class341 arg1) {
		@Pc(17) Class1_Sub11 local17 = Static276.method3885(Static247.aClass70_49, Static481.aClass276_2);
		local17.aClass1_Sub35_Sub2_1.method5792(arg0.anInt9306);
		local17.aClass1_Sub35_Sub2_1.method5776(arg1.anInt9270);
		local17.aClass1_Sub35_Sub2_1.method5776(arg0.anInt9328);
		local17.aClass1_Sub35_Sub2_1.method5789(arg1.anInt9328);
		local17.aClass1_Sub35_Sub2_1.method5773(arg1.anInt9306);
		local17.aClass1_Sub35_Sub2_1.method5740(arg0.anInt9270);
		Static48.method743(local17);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLclient!vq;)V")
	public static void method2162(@OriginalArg(1) Class8_Sub3_Sub3_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt6810 == Static301.anInt5197 || arg0.anInt6822 == -1 || arg0.anInt6785 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class290 local29 = Static192.aClass211_1.method4277(arg0.anInt6822);
			if (local29.aBoolean599 || local29.anIntArray603[arg0.anInt6803] < arg0.anInt6849 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(61) int local61 = arg0.anInt6810 - arg0.anInt6779;
			@Pc(67) int local67 = Static301.anInt5197 - arg0.anInt6779;
			@Pc(79) int local79 = arg0.anInt6847 * 512 + arg0.method5434() * 256;
			@Pc(90) int local90 = arg0.anInt6796 * 512 + arg0.method5434() * 256;
			@Pc(101) int local101 = arg0.anInt6793 * 512 + arg0.method5434() * 256;
			@Pc(112) int local112 = arg0.anInt6788 * 512 + arg0.method5434() * 256;
			arg0.anInt9365 = (local79 * (local61 - local67) + local67 * local101) / local61;
			arg0.anInt9370 = (local112 * local67 + (local61 - local67) * local90) / local61;
		}
		arg0.anInt6856 = 0;
		if (arg0.anInt6789 == 0) {
			arg0.method5435(8192, false);
		}
		if (arg0.anInt6789 == 1) {
			arg0.method5435(12288, false);
		}
		if (arg0.anInt6789 == 2) {
			arg0.method5435(0, false);
		}
		if (arg0.anInt6789 == 3) {
			arg0.method5435(4096, false);
		}
	}
}
