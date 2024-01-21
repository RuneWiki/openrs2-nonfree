import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
	public static int anInt3065;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "[S")
	public static final short[] aShortArray37 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1452 = Static187.method3089("Invalid username or password)3");

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1453 = Static187.method3089("Fallen lassen");

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1454 = aClass92_1452;

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "[I")
	public static final int[] anIntArray278 = new int[5];

	@OriginalMember(owner = "client!pi", name = "C", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1455 = Static187.method3089("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)I")
	public static int method2272(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local19 * arg0 >> 12) + 40960;
		return local13 * local33 >> 12;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)V")
	public static void method2273() {
		if (Static25.anInt597 > 0) {
			Static126.method1850();
		} else {
			Static48.method862(40);
			Static179.aClass57_4 = Static27.aClass57_1;
			Static27.aClass57_1 = null;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ba;B)V")
	public static void method2274(@OriginalArg(0) Class11 arg0) {
		@Pc(6) int local6 = arg0.anInt315;
		if (local6 == 324) {
			if (Static5.anInt104 == -1) {
				Static88.anInt1889 = arg0.anInt322;
				Static5.anInt104 = arg0.anInt267;
			}
			if (Static121.aClass95_106.aBoolean236) {
				arg0.anInt267 = Static5.anInt104;
			} else {
				arg0.anInt267 = Static88.anInt1889;
			}
		} else if (local6 == 325) {
			if (Static5.anInt104 == -1) {
				Static5.anInt104 = arg0.anInt267;
				Static88.anInt1889 = arg0.anInt322;
			}
			if (Static121.aClass95_106.aBoolean236) {
				arg0.anInt267 = Static88.anInt1889;
			} else {
				arg0.anInt267 = Static5.anInt104;
			}
		} else if (local6 == 327) {
			arg0.anInt258 = 150;
			arg0.anInt317 = (int) (Math.sin((double) Static155.anInt2981 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt302 = 5;
			arg0.anInt250 = -1;
		} else if (local6 == 328) {
			if (Static15.aClass8_Sub3_Sub1_1.aClass92_374 == null) {
				arg0.anInt250 = 0;
			} else {
				arg0.anInt258 = 150;
				arg0.anInt317 = (int) (Math.sin((double) Static155.anInt2981 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt302 = 5;
				arg0.anInt250 = ((int) Static15.aClass8_Sub3_Sub1_1.aClass92_374.method3217() << 11) + 2047;
				arg0.anInt276 = Static15.aClass8_Sub3_Sub1_1.anInt3566;
				arg0.anInt311 = Static15.aClass8_Sub3_Sub1_1.anInt3616;
			}
		}
	}
}
