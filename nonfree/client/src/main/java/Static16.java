import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_5;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "Lclient!mb;")
	public static Class70 aClass70_7;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "I")
	public static int anInt385;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "I")
	public static int anInt379 = 0;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "I")
	public static int anInt386 = 0;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "I")
	public static int anInt387 = 2;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "I")
	public static int anInt391 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method294(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static188.aClass22_1);
		arg0.removeFocusListener(Static188.aClass22_1);
		Static53.anInt1239 = -1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!cg;B)V")
	public static void method295(@OriginalArg(0) Class1_Sub5 arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = -1;
		if (arg0.anInt665 == 0) {
			local5 = Static225.method3687(arg0.anInt672, arg0.anInt666, arg0.anInt667);
		}
		@Pc(22) int local22 = 0;
		if (arg0.anInt665 == 1) {
			local5 = Static104.method1769(arg0.anInt672, arg0.anInt666, arg0.anInt667);
		}
		if (arg0.anInt665 == 2) {
			local5 = Static25.method503(arg0.anInt672, arg0.anInt666, arg0.anInt667);
		}
		if (arg0.anInt665 == 3) {
			local5 = Static224.method3674(arg0.anInt672, arg0.anInt666, arg0.anInt667);
		}
		if (local5 != 0L) {
			local7 = (int) local5 >> 14 & 0x1F;
			local9 = (int) (local5 >>> 32) & Integer.MAX_VALUE;
			local22 = (int) local5 >> 20 & 0x3;
		}
		arg0.anInt670 = local22;
		arg0.anInt673 = local9;
		arg0.anInt671 = local7;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZIZIIII)V")
	public static void method296(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (Static57.anInt1354 == arg0 && Static39.anInt965 == arg2 && (arg4 == Static158.anInt3438 || Static112.method1883())) {
			return;
		}
		Static57.anInt1354 = arg0;
		Static158.anInt3438 = arg4;
		Static39.anInt965 = arg2;
		if (Static112.method1883()) {
			Static158.anInt3438 = 0;
		}
		Static142.method2482(25);
		Static211.method3502(Static30.aClass51_737, true);
		@Pc(53) int local53 = Static118.anInt2541;
		@Pc(55) int local55 = Static198.anInt4217;
		Static198.anInt4217 = arg0 * 8 - 48;
		@Pc(66) int local66 = Static198.anInt4217 - local55;
		Static118.anInt2541 = (arg2 - 6) * 8;
		@Pc(76) int local76 = Static118.anInt2541 - local53;
		@Pc(84) int local84;
		@Pc(94) int local94;
		for (local84 = 0; local84 < 32768; local84++) {
			@Pc(90) Class5_Sub1_Sub2 local90 = Static168.aClass5_Sub1_Sub2Array1[local84];
			if (local90 != null) {
				for (local94 = 0; local94 < 10; local94++) {
					local90.anIntArray238[local94] -= local66;
					local90.anIntArray233[local94] -= local76;
				}
				local90.anInt3598 -= local76 * 128;
				local90.anInt3624 -= local66 * 128;
			}
		}
		for (local84 = 0; local84 < 2048; local84++) {
			@Pc(245) Class5_Sub1_Sub1 local245 = Static191.aClass5_Sub1_Sub1Array1[local84];
			if (local245 != null) {
				for (local94 = 0; local94 < 10; local94++) {
					local245.anIntArray238[local94] -= local66;
					local245.anIntArray233[local94] -= local76;
				}
				local245.anInt3598 -= local76 * 128;
				local245.anInt3624 -= local66 * 128;
			}
		}
		Static197.anInt2422 = arg4;
		Static73.aClass5_Sub1_Sub1_1.method2797(arg1, false, arg3);
		@Pc(305) byte local305 = 1;
		@Pc(307) byte local307 = 104;
		@Pc(309) byte local309 = 104;
		@Pc(311) byte local311 = 0;
		@Pc(313) byte local313 = 0;
		@Pc(315) byte local315 = 1;
		if (local76 < 0) {
			local309 = -1;
			local311 = 103;
			local315 = -1;
		}
		if (local66 < 0) {
			local305 = -1;
			local307 = -1;
			local313 = 103;
		}
		for (@Pc(339) int local339 = local313; local339 != local307; local339 += local305) {
			for (@Pc(343) int local343 = local311; local343 != local309; local343 += local315) {
				@Pc(350) int local350 = local343 + local76;
				@Pc(354) int local354 = local66 + local339;
				for (@Pc(356) int local356 = 0; local356 < 4; local356++) {
					if (local354 >= 0 && local350 >= 0 && local354 < 104 && local350 < 104) {
						Static111.aClass105ArrayArrayArray1[local356][local339][local343] = Static111.aClass105ArrayArrayArray1[local356][local354][local350];
					} else {
						Static111.aClass105ArrayArrayArray1[local356][local339][local343] = null;
					}
				}
			}
		}
		for (@Pc(427) Class1_Sub5 local427 = (Class1_Sub5) Static51.aClass105_6.method3120(); local427 != null; local427 = (Class1_Sub5) Static51.aClass105_6.method3109()) {
			local427.anInt666 -= local66;
			local427.anInt667 -= local76;
			if (local427.anInt666 < 0 || local427.anInt667 < 0 || local427.anInt666 >= 104 || local427.anInt667 >= 104) {
				local427.method3758();
			}
		}
		Static70.anInt1624 = 1;
		if (Static79.anInt1782 != 0) {
			Static79.anInt1782 -= local66;
			Static32.anInt707 -= local76;
		}
		Static161.anInt3459 = 0;
		Static15.anInt354 = -1;
		Static205.aClass105_21.method3114();
		Static64.aClass105_7.method3114();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(JB)V")
	public static void method297(@OriginalArg(0) long arg0) {
		Static165.method2812();
		Static167.aClass1_Sub16_Sub1_2.anInt4860 = 0;
		Static167.aClass1_Sub16_Sub1_2.method3765(228);
		Static167.aClass1_Sub16_Sub1_2.method3786(arg0);
		Static128.anInt4777 = 1;
		Static176.anInt3867 = 2;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!mb;)I")
	public static int method299(@OriginalArg(1) Class70 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3519(Static123.anInt2716)) {
			local5++;
		}
		if (arg0.method3519(Static32.anInt706)) {
			local5++;
		}
		return local5;
	}
}
