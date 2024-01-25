import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "[I")
	public static final int[] anIntArray33 = new int[8];

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)V")
	public static void method661() {
		@Pc(5) int local5 = 0;
		if (Static181.aClass14_Sub26_9.aClass43_Sub16_1.method4851() == 1) {
			local5 = 55;
		}
		if (Static181.aClass14_Sub26_9.aClass43_Sub5_1.method1872() == 0) {
			local5 |= 0x40;
		}
		Static242.method4047(local5);
		Static212.aClass249_4.method6117(local5);
		Static252.aClass56_1.method1043(local5);
		Static152.aClass61_1.method1229(local5);
		Static453.aClass281_2.method6683(local5);
		Static164.method2368(local5);
		Static468.method7049(local5);
		Static357.method5427(local5);
		Static298.method4874(local5);
		Static535.method7899();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method665(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(19) String local19 = Static531.method7864(arg0);
		if (local19 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static261.anInt4885; local25++) {
			@Pc(30) String local30 = Static265.aStringArray23[local25];
			@Pc(34) String local34 = Static531.method7864(local30);
			if (Static266.method8783(local19, local34, arg0, local30)) {
				Static261.anInt4885--;
				for (@Pc(47) int local47 = local25; local47 < Static261.anInt4885; local47++) {
					Static265.aStringArray23[local47] = Static265.aStringArray23[local47 + 1];
					Static557.aStringArray37[local47] = Static557.aStringArray37[local47 + 1];
					Static591.anIntArray508[local47] = Static591.anIntArray508[local47 + 1];
					Static654.aStringArray46[local47] = Static654.aStringArray46[local47 + 1];
					Static286.anIntArray292[local47] = Static286.anIntArray292[local47 + 1];
					Static218.aBooleanArray11[local47] = Static218.aBooleanArray11[local47 + 1];
					Static153.aBooleanArray3[local47] = Static153.aBooleanArray3[local47 + 1];
				}
				Static46.anInt767 = Static154.anInt2379;
				@Pc(121) Class347 local121 = Static435.method6495();
				@Pc(127) Class14_Sub54 local127 = Static72.method1195(local121.aClass197_2, Static34.aClass251_20);
				local127.aClass14_Sub21_Sub2_2.method7747(Static418.method6276(arg0));
				local127.aClass14_Sub21_Sub2_2.method7690(arg0);
				local121.method8308(local127);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!wj;Lclient!wj;I)V")
	public static void method666(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class14 arg1) {
		if (arg0.aClass14_340 != null) {
			arg0.method9513();
		}
		arg0.aClass14_339 = arg1;
		arg0.aClass14_340 = arg1.aClass14_340;
		arg0.aClass14_340.aClass14_339 = arg0;
		arg0.aClass14_339.aClass14_340 = arg0;
	}
}
