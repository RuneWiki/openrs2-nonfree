import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "Lclient!ae;")
	public static Class5 aClass5_15;

	@OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
	public static int anInt2624 = 0;

	@OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
	public static int anInt2626 = 0;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	public static void method2017() {
		Static189.aClass41_1.method1580();
		for (@Pc(16) int local16 = 0; local16 < 32; local16++) {
			Static181.aLongArray7[local16] = 0L;
		}
		for (@Pc(28) int local28 = 0; local28 < 32; local28++) {
			Static165.aLongArray6[local28] = 0L;
		}
		Static159.anInt3224 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)I")
	public static int method2018(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)Lclient!qe;")
	public static Class83 method2020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - arg0;
		if (local4 < -9) {
			return Static188.aClass83_1091;
		} else if (local4 < -6) {
			return Static37.aClass83_299;
		} else if (local4 < -3) {
			return Static80.aClass83_569;
		} else if (local4 < 0) {
			return Static67.aClass83_509;
		} else if (local4 > 9) {
			return Static116.aClass83_784;
		} else if (local4 > 6) {
			return Static84.aClass83_588;
		} else if (local4 > 3) {
			return Static142.aClass83_879;
		} else if (local4 > 0) {
			return Static204.aClass83_1158;
		} else {
			return Static151.aClass83_914;
		}
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V")
	public static void method2021() {
		Static42.aClass5_8 = null;
		Static89.aByteArrayArrayArray94 = null;
		Static77.aByteArrayArrayArray33 = null;
		Static29.anIntArrayArrayArray2 = null;
		Static176.aByteArrayArrayArray68 = null;
		Static110.aByteArrayArrayArray45 = null;
		Static89.aByteArrayArrayArray95 = null;
		Static83.anInt1856 = 0;
		Static135.anIntArray289 = null;
		Static164.aByteArrayArrayArray57 = null;
		Static211.anIntArrayArrayArray11 = null;
		Static91.aClass19_9.method685();
		Static118.aClass19_12.method685();
		Static128.aClass77_75 = null;
		Static113.aClass77_67 = null;
		Static76.aClass77_110 = null;
		Static105.aClass77_57 = null;
		Static27.aClass2_Sub2_Sub17_2 = null;
		Static36.aClass77_25 = null;
		Static109.aClass77_63 = null;
		Static115.aClass77_70 = null;
		Static196.aClass77_98 = null;
	}
}
