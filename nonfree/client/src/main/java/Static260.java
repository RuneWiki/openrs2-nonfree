import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "F")
	public static float aFloat200;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
	public static int anInt8919 = -1;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
	public static void method7706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class77 local7 = Static330.aClass77ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static475.method7133(local7.aClass4_Sub1_Sub3_2);
		Static475.method7133(local7.aClass4_Sub1_Sub3_1);
		if (local7.aClass4_Sub1_Sub3_2 != null) {
			local7.aClass4_Sub1_Sub3_2 = null;
		}
		if (local7.aClass4_Sub1_Sub3_1 != null) {
			local7.aClass4_Sub1_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V")
	public static void method7708(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static307.anInt5465 != -1) {
				Static248.method4014(Static307.anInt5465);
			}
			for (@Pc(18) Class3_Sub29 local18 = (Class3_Sub29) Static356.aClass280_29.method7110(); local18 != null; local18 = (Class3_Sub29) Static356.aClass280_29.method7108()) {
				if (!local18.method8770()) {
					local18 = (Class3_Sub29) Static356.aClass280_29.method7110();
					if (local18 == null) {
						break;
					}
				}
				Static54.method1546(true, false, local18);
			}
			Static307.anInt5465 = -1;
			Static356.aClass280_29 = new Class280(8);
			Static619.method8587();
			Static307.anInt5465 = Static489.anInt8493;
			Static422.method6616(false);
			Static40.method1343();
			Static304.method4838(Static307.anInt5465);
		}
		Static446.aString85 = "";
		Static336.aString67 = "";
		Static48.aBoolean92 = false;
		Static329.method5385();
		Static32.anInt7819 = -1;
		Static563.method8100(Static291.anInt5161);
		Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 = new Class4_Sub1_Sub2_Sub1_Sub2();
		Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911 = Static638.anInt10172 * 512 / 2;
		Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray310[0] = Static634.anInt10129 / 2;
		Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916 = Static634.anInt10129 * 512 / 2;
		Static20.anInt824 = 0;
		Static611.anInt9892 = 0;
		Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray309[0] = Static638.anInt10172 / 2;
		if (Static305.anInt5422 == 2) {
			Static20.anInt824 = Static22.anInt921 << 9;
			Static611.anInt9892 = Static221.anInt4220 << 9;
		} else {
			Static169.method2961();
		}
		Static175.method3056();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIILclient!qq;)V")
	public static void method7709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub45 arg3) {
		@Pc(16) long local16 = (long) (arg1 << 14 | arg2 << 28 | arg0);
		@Pc(22) Class3_Sub51 local22 = (Class3_Sub51) Static356.aClass280_28.method7107(local16);
		if (local22 == null) {
			local22 = new Class3_Sub51();
			Static356.aClass280_28.method7109(local22, local16);
			local22.aClass223_62.method5868(arg3);
			return;
		}
		@Pc(45) Class38 local45 = Static320.aClass53_2.method1770(arg3.anInt8270);
		@Pc(48) int local48 = local45.anInt1463;
		if (local45.anInt1434 == 1) {
			local48 *= arg3.anInt8272 + 1;
		}
		for (@Pc(69) Class3_Sub45 local69 = (Class3_Sub45) local22.aClass223_62.method5874(); local69 != null; local69 = (Class3_Sub45) local22.aClass223_62.method5870()) {
			local45 = Static320.aClass53_2.method1770(local69.anInt8270);
			@Pc(80) int local80 = local45.anInt1463;
			if (local45.anInt1434 == 1) {
				local80 *= local69.anInt8272 + 1;
			}
			if (local80 < local48) {
				Static123.method2427(arg3, local69);
				return;
			}
		}
		local22.aClass223_62.method5868(arg3);
	}
}
