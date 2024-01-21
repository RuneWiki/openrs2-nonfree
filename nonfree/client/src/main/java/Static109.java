import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!n", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!n", name = "G", descriptor = "I")
	public static int anInt2437;

	@OriginalMember(owner = "client!n", name = "E", descriptor = "Lclient!tg;")
	public static Class81 aClass81_850 = Static120.method2057(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!n", name = "F", descriptor = "Lclient!nd;")
	public static Class59 aClass59_19 = new Class59(64);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIZ)Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3 method1824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(24) long local24 = ((long) arg0 << 40) + ((long) arg3 << 16) + (long) arg2 + ((long) arg1 << 38);
		@Pc(32) Class1_Sub2_Sub2_Sub3 local32;
		if (!arg4) {
			local32 = (Class1_Sub2_Sub2_Sub3) Static156.aClass59_25.method1970(local24);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class1_Sub2_Sub12 local40 = Static54.method969(arg2);
		if (arg3 > 1 && local40.anIntArray251 != null) {
			@Pc(48) int local48 = -1;
			for (@Pc(50) int local50 = 0; local50 < 10; local50++) {
				if (arg3 >= local40.anIntArray252[local50] && local40.anIntArray252[local50] != 0) {
					local48 = local40.anIntArray251[local50];
				}
			}
			if (local48 != -1) {
				local40 = Static54.method969(local48);
			}
		}
		@Pc(89) Class1_Sub2_Sub1_Sub4_Sub1 local89 = local40.method1809();
		if (local89 == null) {
			return null;
		}
		@Pc(95) Class1_Sub2_Sub2_Sub3 local95 = null;
		if (local40.anInt2399 != -1) {
			local95 = method1824(0, 1, local40.anInt2388, 10, true);
			if (local95 == null) {
				return null;
			}
		}
		@Pc(115) int[] local115 = Static4.anIntArray355;
		@Pc(118) int[] local118 = new int[4];
		@Pc(120) int local120 = Static4.anInt3357;
		@Pc(122) int local122 = Static4.anInt3352;
		Static4.method2574(local118);
		local32 = new Class1_Sub2_Sub2_Sub3(36, 32);
		Static4.method2565(local32.anIntArray288, 36, 32);
		Static4.method2562();
		Static22.method499();
		Static22.method500(16, 16);
		@Pc(143) int local143 = local40.anInt2405;
		if (arg4) {
			local143 = (int) ((double) local143 * 1.5D);
		} else if (arg1 == 2) {
			local143 = (int) ((double) local143 * 1.04D);
		}
		Static22.aBoolean15 = false;
		@Pc(173) int local173 = local143 * Class1_Sub2_Sub2_Sub1.anIntArray30[local40.anInt2389] >> 16;
		@Pc(182) int local182 = local143 * Class1_Sub2_Sub2_Sub1.anIntArray33[local40.anInt2389] >> 16;
		local89.method1459();
		local89.method1462(local40.anInt2382, local40.anInt2397, local40.anInt2389, local40.anInt2392, local40.anInt2396 + local173 - local89.aShort36 / 2, local182 - -local40.anInt2396);
		if (arg1 >= 1) {
			local32.method2124(1);
		}
		if (arg1 >= 2) {
			local32.method2124(16777215);
		}
		if (arg0 != 0) {
			local32.method2141(arg0);
		}
		Static4.method2565(local32.anIntArray288, 36, 32);
		if (local40.anInt2399 != -1) {
			local95.method2130(0, 0);
		}
		if (!arg4 && (local40.anInt2414 == 1 || arg3 != 1) && arg3 != -1) {
			Static98.aClass1_Sub2_Sub2_Sub2_Sub1_1.method1949(Static89.method3071(arg3), 0, 9, 16776960, 1);
		}
		if (!arg4) {
			Static156.aClass59_25.method1973(local32, local24);
		}
		Static4.method2565(local115, local120, local122);
		Static4.method2566(local118);
		Static22.method499();
		Static22.aBoolean15 = true;
		return local32;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)Lclient!lg;")
	public static Class36 method1825() {
		try {
			return (Class36) Class.forName("Class36_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class36_Sub2();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLjava/lang/Object;Lclient!pf;)V")
	public static void method1826(@OriginalArg(1) Object arg0, @OriginalArg(2) Class68 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg1.anEventQueue1.peekEvent() != null; local19++) {
			Static133.method2259(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	public static void method1827() {
		Static25.aClass59_4.method1967();
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	public static void method1828() {
		aByteArrayArrayArray7 = null;
		aClass81_850 = null;
		aClass59_19 = null;
	}
}
