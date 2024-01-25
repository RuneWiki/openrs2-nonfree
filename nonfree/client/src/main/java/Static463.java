import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_154 = new Class362(80, -2);

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "Lclient!gga;")
	public static final Class117 aClass117_6 = new Class117();

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "Z")
	public static boolean aBoolean508 = false;

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
	public static int anInt7202 = 0;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)V")
	public static void method5949(@OriginalArg(0) int arg0) {
		if (arg0 == Static383.anInt7366) {
			return;
		}
		Static428.anInt8046 = Static119.anInt2717 = Static417.anIntArray413[arg0];
		Static575.method8212();
		Static51.anIntArrayArray6 = new int[Static428.anInt8046][Static119.anInt2717];
		Static241.anIntArrayArray28 = new int[Static428.anInt8046][Static119.anInt2717];
		Static160.anIntArrayArrayArray4 = new int[4][Static428.anInt8046 >> 3][Static119.anInt2717 >> 3];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static86.aClass111Array1[local40] = Static406.method6392(Static119.anInt2717, Static428.anInt8046);
		}
		Static483.aByteArrayArrayArray18 = new byte[4][Static428.anInt8046][Static119.anInt2717];
		Static201.method3421(Static428.anInt8046, Static119.anInt2717);
		Static168.method3087(Static119.anInt2717 >> 3, Static440.aClass44_12, Static428.anInt8046 >> 3);
		Static383.anInt7366 = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)Lclient!rfa;")
	public static Class289 method5951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static60.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass289_1;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(IZII)V")
	public static void method5955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static213.aFloat141 = local11;
		if (Static166.anInt3419 == 2) {
			Static261.anInt5009 = local15;
			Static232.anInt4203 = local11;
			Static458.anInt8547 = 0;
		}
		Static201.aFloat128 = local15;
		Static355.method5751();
		Static65.aBoolean51 = true;
	}
}
