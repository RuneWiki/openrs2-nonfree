import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!qf", name = "S", descriptor = "Lclient!dg;")
	public static Class2_Sub2_Sub4_Sub1_Sub1 aClass2_Sub2_Sub4_Sub1_Sub1_2;

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "Lclient!i;")
	public static Class41 aClass41_1007 = Static184.method2923("Fps:");

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "Lclient!i;")
	public static Class41 aClass41_1008 = Static184.method2923("null");

	@OriginalMember(owner = "client!qf", name = "Y", descriptor = "Lclient!i;")
	public static Class41 aClass41_1009 = Static184.method2923("unzap");

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!nb;B)V")
	public static void method2613(@OriginalArg(0) Class15 arg0) {
		Static180.aClass15_38 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(Z)V")
	public static void method2614() {
		@Pc(10) int local10 = Static213.aClass12_Sub3_Sub1_1.anInt3949 + Static30.anInt722;
		if (Static219.aBooleanArray25[96]) {
			Static74.anInt1950 += (-Static74.anInt1950 - 24) / 2;
		} else if (Static219.aBooleanArray25[97]) {
			Static74.anInt1950 += (24 - Static74.anInt1950) / 2;
		} else {
			Static74.anInt1950 /= 2;
		}
		if (Static219.aBooleanArray25[98]) {
			Static50.anInt2123 += (12 - Static50.anInt2123) / 2;
		} else if (Static219.aBooleanArray25[99]) {
			Static50.anInt2123 += (-Static50.anInt2123 - 12) / 2;
		} else {
			Static50.anInt2123 /= 2;
		}
		@Pc(84) int local84 = Static213.aClass12_Sub3_Sub1_1.anInt3961 + Static198.anInt4446;
		if (Static35.anInt926 - local84 < -500 || Static35.anInt926 - local84 > 500 || Static207.anInt4612 - local10 < -500 || Static207.anInt4612 - local10 > 500) {
			Static35.anInt926 = local84;
			Static207.anInt4612 = local10;
		}
		if (local84 != Static35.anInt926) {
			Static35.anInt926 += (local84 - Static35.anInt926) / 16;
		}
		Static183.anInt1324 += Static74.anInt1950 / 2;
		Static57.anInt1618 += Static50.anInt2123 / 2;
		if (Static207.anInt4612 != local10) {
			Static207.anInt4612 += (local10 - Static207.anInt4612) / 16;
		}
		Static121.method3318();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZII)I")
	public static int method2615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}
}
