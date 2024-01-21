import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "[Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1[] aClass1_Sub1_Sub12_Sub1Array10;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!td;")
	public static Class79 aClass79_26 = new Class79(100);

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
	public static int anInt4020 = 2;

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "Z")
	public static boolean aBoolean201 = false;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public static void method2828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub6 local8 = Static87.method576(arg1);
		@Pc(15) int local15 = local8.anInt887;
		@Pc(18) int local18 = local8.anInt883;
		@Pc(21) int local21 = local8.anInt882;
		@Pc(28) int local28 = Class1_Sub22.anIntArray520[local21 - local18];
		if (arg0 < 0 || arg0 > local28) {
			arg0 = 0;
		}
		local28 <<= local18;
		Static27.anIntArray108[local15] = local28 & arg0 << local18 | Static27.anIntArray108[local15] & ~local28;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBII)Z")
	public static boolean method2829(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg1 >> 14 & 0x7FFF;
		@Pc(23) int local23 = Static123.aClass80_1.method2676(Static85.anInt2267, arg0, arg2, arg1);
		if (local23 == -1) {
			return false;
		}
		@Pc(32) int local32 = local23 & 0x1F;
		@Pc(38) int local38 = local23 >> 6 & 0x3;
		if (local32 == 10 || local32 == 11 || local32 == 22) {
			@Pc(53) Class1_Sub1_Sub3 local53 = Static84.method3155(local11);
			@Pc(64) int local64;
			@Pc(61) int local61;
			if (local38 == 0 || local38 == 2) {
				local61 = local53.anInt657;
				local64 = local53.anInt656;
			} else {
				local61 = local53.anInt656;
				local64 = local53.anInt657;
			}
			@Pc(75) int local75 = local53.anInt643;
			if (local38 != 0) {
				local75 = (local75 << local38 & 0xF) + (local75 >> 4 - local38);
			}
			Static95.method1631(local61, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], arg2, arg0, local75, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, true, 2, 0, local64);
		} else {
			Static95.method1631(0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], arg2, arg0, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], local38, true, 2, local32 + 1, 0);
		}
		Static47.anInt1255 = Static38.anInt1049;
		Static90.anInt2404 = Static165.anInt4054;
		Static10.anInt388 = 0;
		Static133.anInt3411 = 2;
		return true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public static void method2830() {
		aClass1_Sub1_Sub12_Sub1Array10 = null;
		aClass79_26 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method2831() {
		@Pc(11) int local11 = Static112.anInt2868;
		@Pc(13) int local13 = Static94.anInt2451;
		@Pc(15) int local15 = Static27.anInt864;
		@Pc(17) int local17 = Static141.anInt3598;
		Static150.method3024(local13, local11, local17, local15, 6116423);
		Static150.method3024(local13 + 1, local11 + 1, local17 - 2, 16, 0);
		Static150.method3019(local13 + 1, local11 - -18, local17 - 2, local15 + -19, 0);
		Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3058(Static153.aClass23_1441, local13 + 3, local11 + 14, 6116423, -1);
		@Pc(64) int local64 = Static96.anInt2484;
		@Pc(66) int local66 = Static163.anInt4014;
		for (@Pc(68) int local68 = 0; local68 < Static38.anInt1037; local68++) {
			@Pc(72) int local72 = 16777215;
			@Pc(85) int local85 = (Static38.anInt1037 - local68 - 1) * 15 + local11 + 31;
			if (local13 < local66 && local13 + local17 > local66 && local64 > local85 - 13 && local64 < local85 + 3) {
				local72 = 16776960;
			}
			Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3058(Static152.method2436(local68), local13 + 3, local85, local72, 0);
		}
		Static103.method1757(Static27.anInt864, Static94.anInt2451, Static112.anInt2868, Static141.anInt3598);
	}
}
