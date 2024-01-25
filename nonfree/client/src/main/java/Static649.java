import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static649 {

	@OriginalMember(owner = "client!vv", name = "v", descriptor = "F")
	public static float aFloat200;

	@OriginalMember(owner = "client!vv", name = "t", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_149 = new Class289(50, 8);

	@OriginalMember(owner = "client!vv", name = "u", descriptor = "[Lclient!oj;")
	public static final Interface20[] anInterface20Array2 = new Interface20[128];

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIII)I")
	public static int method8841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg2 & 0x3;
		if (local8 == 0) {
			return arg1;
		} else if (local8 == 1) {
			return arg0;
		} else if (local8 == 2) {
			return 4095 - arg1;
		} else {
			return 4095 - arg0;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
	public static void method8842() {
		@Pc(13) int local13 = 0;
		if (Static96.aClass6_Sub22_7 != null) {
			local13 = Static96.aClass6_Sub22_7.aClass29_Sub22_1.method7060();
		}
		@Pc(34) int local34;
		@Pc(43) int local43;
		if (local13 == 2) {
			local34 = Static338.anInt5825 <= 800 ? Static338.anInt5825 : 800;
			Static449.anInt7506 = local34;
			local43 = Static13.anInt10825 <= 600 ? Static13.anInt10825 : 600;
			Static314.anInt5339 = (Static338.anInt5825 - local34) / 2;
			Static348.anInt5935 = local43;
			Static114.anInt2051 = 0;
		} else if (local13 == 1) {
			local34 = Static338.anInt5825 <= 1024 ? Static338.anInt5825 : 1024;
			Static314.anInt5339 = (Static338.anInt5825 - local34) / 2;
			Static449.anInt7506 = local34;
			local43 = Static13.anInt10825 > 768 ? 768 : Static13.anInt10825;
			Static348.anInt5935 = local43;
			Static114.anInt2051 = 0;
		} else {
			Static314.anInt5339 = 0;
			Static449.anInt7506 = Static338.anInt5825;
			Static114.anInt2051 = 0;
			Static348.anInt5935 = Static13.anInt10825;
		}
	}

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "(I)V")
	public static void method8845() {
		@Pc(5) int local5;
		if (Static527.aClass379Array3 != null) {
			for (local5 = 0; local5 < Static33.anInt812; local5++) {
				Static527.aClass379Array3[local5] = null;
			}
			Static527.aClass379Array3 = null;
		}
		if (Static642.aClass379Array4 != null) {
			for (local5 = 0; local5 < Static288.anInt4888; local5++) {
				Static642.aClass379Array4[local5] = null;
			}
			Static642.aClass379Array4 = null;
		}
		if (Static414.aClass379Array2 != null) {
			for (local5 = 0; local5 < Static242.anInt4294; local5++) {
				Static414.aClass379Array2[local5] = null;
			}
			Static414.aClass379Array2 = null;
		}
		Static188.anIntArrayArrayArray16 = null;
		Static522.anInt8677 = -1;
		Static312.anInt8379 = -1;
		Static121.aClass379Array1 = null;
		Static115.anIntArray125 = null;
	}

	@OriginalMember(owner = "client!vv", name = "h", descriptor = "(I)V")
	public static void method8846() {
		Static563.aClient1.method1442();
		Static270.method3996();
		Static551.anInt8501 = 0;
		Static34.aClass179_39 = null;
		Static204.aClass6_Sub23_Sub1_1.anInt9901 = 0;
		Static398.aClass179_257 = null;
		Static447.anInt7487 = 0;
		Static558.aClass179_321 = null;
		Static539.method7681();
		Static150.aClass145_2 = null;
		Static619.anInt10114 = 0;
		Static96.anInt1739 = 0;
		Static145.aString26 = null;
		Static150.aClass145_1 = null;
		Static365.aClass232Array1 = null;
		Static511.anInt6141 = 0;
	}
}
