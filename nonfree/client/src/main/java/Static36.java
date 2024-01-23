import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!d", name = "V", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(III)V")
	public static void method580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0;
		if (arg0 > 25) {
			local7 = 25;
		}
		arg0--;
		@Pc(17) int local17 = Static86.anIntArray141[arg0];
		@Pc(21) int local21 = Static194.anIntArray446[arg0];
		if (arg1 == 0) {
			Static32.aClass1_Sub17_Sub1_1.method2182(82);
			Static32.aClass1_Sub17_Sub1_1.method2175(local7 + local7 + 3);
		}
		if (arg1 == 1) {
			Static32.aClass1_Sub17_Sub1_1.method2182(111);
			Static32.aClass1_Sub17_Sub1_1.method2175(local7 + local7 + 17);
		}
		if (arg1 == 2) {
			Static32.aClass1_Sub17_Sub1_1.method2182(246);
			Static32.aClass1_Sub17_Sub1_1.method2175(local7 + local7 + 3);
		}
		Static32.aClass1_Sub17_Sub1_1.method2175(Static188.aBooleanArray21[82] ? 1 : 0);
		Static32.aClass1_Sub17_Sub1_1.method2136(Static101.anInt2041 + local21);
		Static32.aClass1_Sub17_Sub1_1.method2154(local17 + Static91.anInt4078);
		Static163.anInt3375 = Static86.anIntArray141[0];
		Static66.anInt1298 = Static194.anIntArray446[0];
		for (@Pc(120) int local120 = 1; local120 < local7; local120++) {
			arg0--;
			Static32.aClass1_Sub17_Sub1_1.method2147(Static86.anIntArray141[arg0] - local17);
			Static32.aClass1_Sub17_Sub1_1.method2176(Static194.anIntArray446[arg0] - local21);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)V")
	public static void method581(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static74.method1093(2, arg0);
		local8.method2259();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZZ)Lclient!hh;")
	public static Class50 method582(@OriginalArg(0) int arg0) {
		return Static8.method148(arg0, true);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!hh;I)Z")
	public static boolean method583(@OriginalArg(0) Class50 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static201.anInt4066; local11++) {
			if (arg0.method1256(Static209.aClass50Array79[local11])) {
				return true;
			}
		}
		return false;
	}
}
