import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!wc", name = "N", descriptor = "[Lclient!oh;")
	public static Class6_Sub1[] aClass6_Sub1Array2;

	@OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
	public static int anInt6573;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!mo;)V")
	public static void method5857(@OriginalArg(1) Class143 arg0) {
		Static7.aClass143_7 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)V")
	public static void method5858() {
		@Pc(1) Class11 local1 = Static178.aClass11_79;
		synchronized (Static178.aClass11_79) {
			Static178.aClass11_79.method213();
		}
		local1 = Static95.aClass11_52;
		synchronized (Static95.aClass11_52) {
			Static95.aClass11_52.method213();
		}
		local1 = Static206.aClass11_144;
		synchronized (Static206.aClass11_144) {
			Static206.aClass11_144.method213();
		}
	}

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "(B)V")
	public static void method5860() {
		Static15.aClass146Array3 = null;
		Static220.method3965(0, Static46.anInt1173, -1, Static324.anInt6226, 0, Static294.anInt5659, 0, 0);
		if (Static15.aClass146Array3 != null) {
			Static34.method3919(Static30.aClass146_8.anInt4171, 0, Static37.anInt894, -1412584499, 0, Static15.aClass146Array3, Static46.anInt1173, Static31.anInt737, Static294.anInt5659);
			Static15.aClass146Array3 = null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(BI)V")
	public static void method5861(@OriginalArg(1) int arg0) {
		Static17.anInt347 = -1;
		Static331.anInt6398 = 100;
		Static118.anInt2594 = arg0;
		Static28.anInt659 = 3;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!no;)I")
	public static int method5862(@OriginalArg(1) Class14_Sub23 arg0) {
		@Pc(7) String local7 = Static206.method6002(arg0);
		@Pc(15) int[] local15 = null;
		if (Static31.method760(arg0.anInt4355)) {
			local15 = Static296.method5066((int) arg0.aLong128).anIntArray647;
		} else if (Static194.method3670(arg0.anInt4355)) {
			@Pc(68) Class10_Sub3_Sub3_Sub1 local68 = Static266.aClass10_Sub3_Sub3_Sub1Array1[(int) arg0.aLong128];
			if (local68 != null) {
				local15 = local68.aClass192_1.anIntArray527;
			}
		} else if (Static254.method4389(arg0.anInt4355)) {
			if (arg0.anInt4355 == 1001) {
				local15 = Static232.method2200((int) arg0.aLong128).anIntArray171;
			} else {
				local15 = Static232.method2200((int) (arg0.aLong128 >>> 32 & 0x7FFFFFFFL)).anIntArray171;
			}
		}
		if (local15 != null) {
			local7 = local7 + Static38.method915(local15);
		}
		return Static223.aClass76_9.method2250(Static235.aClass2Array14, local7);
	}
}
