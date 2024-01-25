import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!ff", name = "sb", descriptor = "I")
	public static int anInt2011;

	@OriginalMember(owner = "client!ff", name = "ob", descriptor = "I")
	public static int anInt2008 = -1;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BIIII)V")
	public static void method1590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static62.anInt1114 && arg2 <= Static207.anInt3632) {
			@Pc(27) int local27 = Static39.method544(arg0, Static254.anInt4211, Static275.anInt4594);
			@Pc(33) int local33 = Static39.method544(arg1, Static254.anInt4211, Static275.anInt4594);
			Static311.method4062(local33, local27, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)V")
	public static void method1596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class75 local7 = Static432.aClass75ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class8_Sub5 local13 = local7.aClass8_Sub5_2;
		@Pc(16) Class8_Sub5 local16 = local7.aClass8_Sub5_1;
		if (local13 != null) {
			local13.anInt5129 = local13.anInt5129 * arg3 / (0x10 << Static145.anInt2581 - 7);
			local13.anInt5130 = local13.anInt5130 * arg3 / (0x10 << Static145.anInt2581 - 7);
		}
		if (local16 != null) {
			local16.anInt5129 = local16.anInt5129 * arg3 / (0x10 << Static145.anInt2581 - 7);
			local16.anInt5130 = local16.anInt5130 * arg3 / (0x10 << Static145.anInt2581 - 7);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)Z")
	public static boolean method1597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static2.method8(arg0, arg1)) {
			return (arg1 & 0xB000) != 0 | Static174.method2447(arg0, arg1) | Static347.method4605(arg0, arg1) ? true : (Static454.method6024(arg0, arg1) | Static160.method3985(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)V")
	public static void method1600(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static7.aBooleanArray1[arg0]) {
			Static412.aClass211_92.method4369(arg0);
			Static412.aClass110ArrayArray2[arg0] = null;
			Static185.aClass110ArrayArray1[arg0] = null;
			Static7.aBooleanArray1[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!qn;)V")
	public static void method1607(@OriginalArg(1) Class211 arg0) {
		Static177.aClass211_48 = arg0;
	}
}
