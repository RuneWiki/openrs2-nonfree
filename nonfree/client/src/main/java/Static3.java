import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "[S")
	public static short[] aShortArray1;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
	public static int anInt66 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "[I")
	public static final int[] anIntArray2 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!eh;BLjava/awt/Component;Lclient!eh;)V")
	public static void method60(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class28 arg2) {
		if (Static69.aBoolean85) {
			return;
		}
		Static126.method2130();
		@Pc(15) byte[] local15 = arg2.method852(0, Static101.anInt2322);
		Static174.aClass2_Sub2_Sub17_Sub1_4 = new Class2_Sub2_Sub17_Sub1(local15, arg1);
		Static93.aClass2_Sub2_Sub17_Sub1_3 = Static174.aClass2_Sub2_Sub17_Sub1_4.method1924();
		Static184.aClass29_3 = Static130.method2182(Static67.anInt1608, arg0);
		Static69.aClass29_1 = Static130.method2182(Static208.anInt4123, arg0);
		Static192.aClass29_4 = Static130.method2182(Static121.anInt2744, arg0);
		Static142.aClass29_Sub1Array2 = Static140.method2274(Static68.anInt1619, arg0);
		Static116.aClass29Array5 = Static210.method3192(Static186.anInt3728, arg0);
		Static52.anIntArray105 = new int[256];
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			Static52.anIntArray105[local59] = local59 * 262144;
		}
		for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
			Static52.anIntArray105[local75 + 64] = local75 * 1024 + 16711680;
		}
		for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
			Static52.anIntArray105[local95 + 128] = local95 * 4 + 16776960;
		}
		for (@Pc(113) int local113 = 0; local113 < 64; local113++) {
			Static52.anIntArray105[local113 + 192] = 16777215;
		}
		Static106.anIntArray239 = new int[256];
		for (@Pc(130) int local130 = 0; local130 < 64; local130++) {
			Static106.anIntArray239[local130] = local130 * 1024;
		}
		for (@Pc(144) int local144 = 0; local144 < 64; local144++) {
			Static106.anIntArray239[local144 + 64] = local144 * 4 + 65280;
		}
		for (@Pc(162) int local162 = 0; local162 < 64; local162++) {
			Static106.anIntArray239[local162 + 128] = local162 * 262144 + 65535;
		}
		for (@Pc(183) int local183 = 0; local183 < 64; local183++) {
			Static106.anIntArray239[local183 + 192] = 16777215;
		}
		Static90.anIntArray200 = new int[256];
		for (@Pc(202) int local202 = 0; local202 < 64; local202++) {
			Static90.anIntArray200[local202] = local202 * 4;
		}
		for (@Pc(218) int local218 = 0; local218 < 64; local218++) {
			Static90.anIntArray200[local218 + 64] = local218 * 262144 + 255;
		}
		for (@Pc(236) int local236 = 0; local236 < 64; local236++) {
			Static90.anIntArray200[local236 + 128] = local236 * 1024 + 16711935;
		}
		for (@Pc(254) int local254 = 0; local254 < 64; local254++) {
			Static90.anIntArray200[local254 + 192] = 16777215;
		}
		Static111.anIntArray254 = new int[256];
		Static44.anIntArray91 = new int[32768];
		Static26.anIntArray45 = new int[32768];
		Static190.method2864(null);
		Static197.anIntArray377 = new int[32768];
		if (Static112.anInt1949 == 0) {
			Static165.aBoolean158 = true;
		} else {
			Static165.aBoolean158 = false;
		}
		Static206.aClass83_1169 = Static206.aClass83_1175;
		Static209.anInt4149 = 0;
		Static120.aBoolean135 = false;
		Static166.anIntArray322 = new int[32768];
		Static206.aClass83_1172 = Static206.aClass83_1175;
		if (Static165.aBoolean158) {
			Static123.method2103();
		} else {
			Static167.method2588(Static22.anInt586, 255, Static157.aClass28_Sub1_23);
		}
		Static46.method855(false);
		Static69.aBoolean85 = true;
		Static33.method681();
		Static188.aClass2_Sub2_Sub17_Sub1_5 = new Class2_Sub2_Sub17_Sub1(128, 254);
		Static27.aClass2_Sub2_Sub17_Sub1_2 = new Class2_Sub2_Sub17_Sub1(128, 254);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
	public static void method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass79_1 = null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZLclient!eh;II)V")
	public static void method62(@OriginalArg(1) int arg0, @OriginalArg(3) Class28 arg1, @OriginalArg(5) int arg2) {
		Static211.anInt4194 = arg2;
		Static137.anInt2903 = 10000;
		Static156.anInt4252 = arg0;
		Static138.aClass28_139 = arg1;
		Static207.aBoolean188 = false;
		Static19.anInt540 = 0;
		Static92.anInt1969 = 1;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)I")
	public static int method63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)I")
	public static int method64(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method65() {
		@Pc(13) Object local13 = Static167.anObject4;
		synchronized (Static167.anObject4) {
			if (Static104.anInt2409 == 0) {
				Static23.aClass1_1.method8(new Class95(), 5);
			}
			Static104.anInt2409 = 600;
		}
	}
}
