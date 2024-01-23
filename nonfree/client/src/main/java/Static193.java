import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!th", name = "s", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_28;

	@OriginalMember(owner = "client!th", name = "t", descriptor = "[I")
	public static int[] anIntArray536;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!th", name = "m", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1392 = Static200.method3116("Loading wordpack )2 ");

	@OriginalMember(owner = "client!th", name = "k", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1391 = aClass60_1392;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	public static int anInt4129 = 0;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1393 = Static200.method3116("<col=ffff00>");

	@OriginalMember(owner = "client!th", name = "o", descriptor = "I")
	public static int anInt4130 = 0;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1394 = Static200.method3116("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!th", name = "q", descriptor = "I")
	public static int anInt4131 = 0;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1395 = Static200.method3116("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!th", name = "u", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1396 = Static200.method3116("weiss:");

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLclient!kh;Lclient!nc;)I")
	public static int method3010(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		@Pc(11) int local11 = arg1.anInt1192;
		arg1.method893(arg0.anInt2439);
		arg1.anInt1192 += Static10.aClass101_1.method3121(arg1.aByteArray20, arg1.anInt1192, 0, arg0.aByteArray34, arg0.anInt2439);
		return arg1.anInt1192 - local11;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)Lclient!sd;")
	public static Class1_Sub1_Sub22 method3011(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub22 local10 = (Class1_Sub1_Sub22) Static9.aClass39_26.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static124.aClass7_22.method3242(26, arg0);
		local10 = new Class1_Sub1_Sub22();
		if (local25 != null) {
			local10.method2850(new Class1_Sub9(local25));
		}
		Static9.aClass39_26.method1152((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	public static void method3013(@OriginalArg(0) int arg0) {
		Static79.method1400();
		Static219.method3521();
		@Pc(14) int local14 = Static218.method3519(arg0).anInt368;
		if (local14 == 0) {
			return;
		}
		@Pc(27) int local27 = Static126.anIntArray358[arg0];
		if (local14 == 1) {
			Static44.anInt1000 = local27;
			if (Static44.anInt1000 == 1) {
				Static81.method1432(0.9F);
			}
			if (Static44.anInt1000 == 2) {
				Static81.method1432(0.8F);
			}
			if (Static44.anInt1000 == 3) {
				Static81.method1432(0.7F);
			}
			if (Static44.anInt1000 == 4) {
				Static81.method1432(0.6F);
			}
			Static106.method1828();
		}
		if (local14 == 3) {
			@Pc(65) short local65 = 0;
			if (local27 == 0) {
				local65 = 255;
			}
			if (local27 == 1) {
				local65 = 192;
			}
			if (local27 == 2) {
				local65 = 128;
			}
			if (local27 == 3) {
				local65 = 64;
			}
			if (local27 == 4) {
				local65 = 0;
			}
			if (local65 != Static155.anInt3456) {
				if (Static155.anInt3456 == 0 && Static163.anInt3583 != -1) {
					Static84.method1048(Static163.anInt3583, local65, Static106.aClass7_Sub1_19);
					Static105.aBoolean134 = false;
				} else if (local65 == 0) {
					Static220.method3532();
					Static105.aBoolean134 = false;
				} else {
					Static73.method1320(local65);
				}
				Static155.anInt3456 = local65;
			}
		}
		if (local14 == 4) {
			if (local27 == 0) {
				Static67.anInt1657 = 127;
			}
			if (local27 == 1) {
				Static67.anInt1657 = 96;
			}
			if (local27 == 2) {
				Static67.anInt1657 = 64;
			}
			if (local27 == 3) {
				Static67.anInt1657 = 32;
			}
			if (local27 == 4) {
				Static67.anInt1657 = 0;
			}
		}
		if (local14 == 5) {
			Static173.anInt3720 = local27;
		}
		if (local14 == 10) {
			if (local27 == 0) {
				Static79.anInt1900 = 127;
			}
			if (local27 == 1) {
				Static79.anInt1900 = 96;
			}
			if (local27 == 2) {
				Static79.anInt1900 = 64;
			}
			if (local27 == 3) {
				Static79.anInt1900 = 32;
			}
			if (local27 == 4) {
				Static79.anInt1900 = 0;
			}
		}
		if (local14 == 9) {
			Static159.anInt3551 = local27;
		}
		if (local14 == 6) {
			Static57.anInt1494 = local27;
		}
	}
}
