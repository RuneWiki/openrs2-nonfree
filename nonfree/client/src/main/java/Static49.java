import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "Lclient!kb;")
	public static Class83 aClass83_34;

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "Lclient!kb;")
	public static Class83 aClass83_35;

	@OriginalMember(owner = "client!dj", name = "G", descriptor = "[Lclient!p;")
	public static Class118[] aClass118Array1 = new Class118[50];

	@OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
	public static int anInt1370 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)V")
	public static void method1038() {
		Static153.aClass155_30.method4364(5);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1039(@OriginalArg(0) long arg0) {
		return Static222.method3915(arg0);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
	public static void method1041() {
		Static209.aFontMetrics1 = null;
		Static8.aFont2 = null;
		Static144.anImage4 = null;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)I")
	public static int method1042() {
		return 2;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!im;)V")
	public static void method1043(@OriginalArg(1) Class1_Sub16 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static205.anInt4565; local11++) {
			@Pc(18) int local18 = arg0.method2618();
			@Pc(22) int local22 = arg0.method2652();
			if (local22 == 65535) {
				local22 = -1;
			}
			if (Static24.aClass140_Sub1Array1[local18] != null) {
				Static24.aClass140_Sub1Array1[local18].anInt5454 = local22;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!lg;)V")
	public static void method1044(@OriginalArg(1) Class25_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt1633 - Static32.anInt809;
		@Pc(21) int local21 = arg0.anInt1609 * 128 + arg0.method1243() * 64;
		@Pc(32) int local32 = arg0.anInt1647 * 128 + arg0.method1243() * 64;
		arg0.anInt1604 += (local32 - arg0.anInt1604) / local9;
		arg0.anInt1683 = 0;
		if (arg0.anInt1618 == 0) {
			arg0.anInt1628 = 1024;
		}
		arg0.anInt1635 += (local21 - arg0.anInt1635) / local9;
		if (arg0.anInt1618 == 1) {
			arg0.anInt1628 = 1536;
		}
		if (arg0.anInt1618 == 2) {
			arg0.anInt1628 = 0;
		}
		if (arg0.anInt1618 == 3) {
			arg0.anInt1628 = 512;
		}
	}
}
