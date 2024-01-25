import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
	public static int anInt6452;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)I")
	public static int method5398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static275.anIntArray454[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
	public static void method5399() {
		@Pc(10) Class154 local10 = Static337.aClass154_88;
		synchronized (Static337.aClass154_88) {
			Static337.aClass154_88.method4219();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
	public static void method5400() {
		Static275.aClass154_84.method4212();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
	public static void method5401() {
		Static101.aClass154_48.method4220(5);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!tq;I)V")
	public static void method5402(@OriginalArg(0) Class4_Sub7 arg0) {
		if (arg0.aByteArray42.length - arg0.anInt2667 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method2380();
		if (local21 < 0 || local21 > 14) {
			return;
		}
		@Pc(42) byte local42;
		if (local21 == 14) {
			local42 = 36;
		} else if (local21 == 13) {
			local42 = 35;
		} else if (local21 == 12) {
			local42 = 34;
		} else if (local21 == 11) {
			local42 = 33;
		} else if (local21 == 10) {
			local42 = 32;
		} else if (local21 == 9) {
			local42 = 31;
		} else if (local21 == 8) {
			local42 = 30;
		} else if (local21 == 7) {
			local42 = 29;
		} else if (local21 == 6) {
			local42 = 28;
		} else if (local21 == 5) {
			local42 = 28;
		} else if (local21 == 4) {
			local42 = 24;
		} else if (local21 == 3) {
			local42 = 23;
		} else if (local21 == 2) {
			local42 = 22;
		} else if (local21 == 1) {
			local42 = 23;
		} else {
			local42 = 19;
		}
		if (arg0.aByteArray42.length - arg0.anInt2667 < local42) {
			return;
		}
		Static293.anInt5927 = arg0.method2380();
		if (Static293.anInt5927 < 1) {
			Static293.anInt5927 = 1;
		} else if (Static293.anInt5927 > 4) {
			Static293.anInt5927 = 4;
		}
		Static339.method5546(arg0.method2380() == 1);
		Static336.aBoolean579 = arg0.method2380() == 1;
		Static135.aBoolean261 = arg0.method2380() == 1;
		Static221.aBoolean389 = arg0.method2380() == 1;
		Static235.anInt6712 = arg0.method2380() == 1 ? 1 : 0;
		Static200.aBoolean353 = arg0.method2380() == 1;
		Static318.aBoolean552 = arg0.method2380() == 1;
		Static128.aBoolean242 = arg0.method2380() == 1;
		Static192.anInt4154 = arg0.method2380();
		if (Static192.anInt4154 > 2) {
			Static192.anInt4154 = 2;
		}
		if (local21 < 2) {
			Static58.aBoolean95 = arg0.method2380() == 1;
			arg0.method2380();
		} else {
			Static58.aBoolean95 = arg0.method2380() == 1;
		}
		Static86.aBoolean166 = arg0.method2380() == 1;
		Static131.aBoolean249 = arg0.method2380() == 1;
		Static351.anInt6806 = arg0.method2380();
		if (Static351.anInt6806 > 2) {
			Static351.anInt6806 = 2;
		}
		Static339.anInt6679 = Static351.anInt6806;
		Static240.aBoolean423 = arg0.method2380() == 1;
		Static144.anInt3226 = arg0.method2380();
		if (Static144.anInt3226 > 127) {
			Static144.anInt3226 = 127;
		}
		Static147.anInt3292 = arg0.method2380();
		Static235.anInt6709 = arg0.method2380();
		if (Static235.anInt6709 > 127) {
			Static235.anInt6709 = 127;
		}
		if (local21 >= 1) {
			Static143.anInt3193 = arg0.method2404();
			Static229.anInt4770 = arg0.method2404();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method2380();
		}
		@Pc(406) int local406;
		if (local21 >= 4) {
			local406 = arg0.method2380();
			if (local406 < 0 || local406 > 2) {
				local406 = 0;
			}
			if (Static161.anInt3644 < 96) {
				local406 = 0;
			}
			Static239.method5168(local406);
		}
		if (local21 >= 5) {
			Static115.anInt2476 = arg0.method2389();
		}
		local406 = 0;
		if (local21 >= 6) {
			Static56.anInt1228 = local406 = arg0.method2380();
		}
		if (Static56.anInt1228 != 1 && Static56.anInt1228 != 2) {
			Static56.anInt1228 = 2;
		}
		if (local21 >= 7) {
			Static332.aBoolean571 = arg0.method2380() == 1;
		}
		if (local21 >= 8) {
			Static166.aBoolean307 = arg0.method2380() == 1;
		}
		if (local21 >= 9) {
			Static152.anInt3390 = arg0.method2380();
		}
		if (Static152.anInt3390 < 0 || Static152.anInt3390 > 3) {
			Static152.anInt3390 = 0;
		}
		if (local21 >= 10) {
			Static64.aBoolean107 = arg0.method2380() != 0;
		}
		if (local21 >= 11) {
			Static2.aBoolean425 = arg0.method2380() != 0;
		}
		if (local21 >= 12) {
			Static235.anInt6712 = arg0.method2380();
		}
		if (Static235.anInt6712 < 0 || Static235.anInt6712 > 2) {
			Static235.anInt6712 = 1;
		}
		if (local21 >= 13) {
			Static68.aBoolean122 = arg0.method2380() == 1;
		}
		if (local21 >= 14) {
			Static273.anInt5611 = arg0.method2380();
		} else if (local406 == 0) {
			Static273.anInt5611 = 2;
		} else {
			Static273.anInt5611 = 1;
		}
		if (Static273.anInt5611 < 0 || Static273.anInt5611 > 3) {
			Static273.anInt5611 = 2;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!al;Ljava/awt/Canvas;II)Lclient!vm;")
	public static Class92 method5403(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2) {
		return new Class92_Sub1(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)V")
	public static void method5404(@OriginalArg(0) int arg0) {
		@Pc(5) Class154 local5 = Static337.aClass154_88;
		synchronized (Static337.aClass154_88) {
			Static337.aClass154_88.method4219();
			Static337.aClass154_88 = new Class154(arg0);
		}
	}
}
