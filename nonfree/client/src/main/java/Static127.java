import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static127 {

	@OriginalMember(owner = "client!hm", name = "X", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_91 = new Class157(34, 7);

	@OriginalMember(owner = "client!hm", name = "db", descriptor = "J")
	public static long aLong94 = 0L;

	@OriginalMember(owner = "client!hm", name = "eb", descriptor = "I")
	public static int anInt2750 = 500;

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "(I)V")
	public static void method2503() {
		if (Static281.aBoolean502) {
			return;
		}
		Static325.method5341(Static150.aClass51ArrayArrayArray2);
		if (Static54.aClass51ArrayArrayArray1 != null) {
			Static325.method5341(Static54.aClass51ArrayArrayArray1);
		}
		Static281.aBoolean502 = true;
	}

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "(I)I")
	public static int method2504() {
		return ((Static241.anInt5136 == 0 ? 0 : 1) << 21) + (Static248.anInt5206 << 17) + ((Static134.aBoolean271 ? 1 : 0) << 15) + ((Static309.aBoolean544 ? 1 : 0) << 13) + ((Static39.aBoolean48 ? 1 : 0) << 10) + ((Static205.aBoolean391 ? 1 : 0) << 6) + ((Static146.aBoolean287 ? 1 : 0) << 5) + ((Static286.aBoolean512 ? 1 : 0) << 3) + (Static333.anInt6458 & 0x7) + ((Static346.aBoolean526 ? 1 : 0) << 4) + ((Static273.aBoolean494 ? 1 : 0) << 8) + ((Static219.aBoolean425 ? 1 : 0) << 9) + ((Static222.anInt6836 & 0x3) << 11) + ((Static245.aBoolean453 ? 1 : 0) << 16) + ((Static145.aBoolean285 ? 1 : 0) << 19) + ((Static17.anInt277 == 0 ? 0 : 1) << 20) + ((Static46.anInt752 == 0 ? 0 : 1) << 22) + (Static292.method4861() << 23) + (Static360.anInt6856 << 25) + ((Static243.aBoolean451 ? 1 : 0) << 27) + (Static18.anInt304 << 28);
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)I")
	public static int method2505(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
