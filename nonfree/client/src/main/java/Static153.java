import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public static int anInt3121;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "[I")
	public static int[] anIntArray338;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "[Lclient!dc;")
	public static final Class20[] aClass20Array26 = new Class20[1000];

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!q", name = "i", descriptor = "I")
	public static volatile int anInt3126 = 0;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "[I")
	public static final int[] anIntArray339 = new int[32];

	@OriginalMember(owner = "client!q", name = "m", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1165 = Static161.method2452(")4slr2)3ws?order=LPWM");

	@OriginalMember(owner = "client!q", name = "n", descriptor = "I")
	public static volatile int anInt3128 = 0;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1166 = Static161.method2452("blinken2:");

	@OriginalMember(owner = "client!q", name = "p", descriptor = "[I")
	public static final int[] anIntArray340 = new int[5];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!ce;B)Lclient!jb;")
	public static Class46 method2325(@OriginalArg(0) Class5_Sub6 arg0) {
		@Pc(7) Class46 local7 = new Class46();
		local7.anInt1892 = arg0.method3077();
		local7.aClass5_Sub2_Sub12_1 = Static57.method995(local7.anInt1892);
		return local7;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IJ)Lclient!dc;")
	public static Class20 method2327(@OriginalArg(1) long arg0) {
		return Static143.method2232(arg0);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Z")
	public static boolean method2328() {
		try {
			return Static67.method3012();
		} catch (@Pc(14) IOException local14) {
			Static88.method1473();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(59) String local59 = "T2 - " + Static196.anInt3834 + "," + Static50.anInt1085 + "," + Static50.anInt1080 + " - " + Static6.anInt155 + "," + (Static86.anInt1895 + Static210.aClass1_Sub2_Sub2_2.anIntArray250[0]) + "," + (Static210.aClass1_Sub2_Sub2_2.anIntArray253[0] + Static110.anInt2295) + " - ";
			for (@Pc(61) int local61 = 0; local61 < Static6.anInt155 && local61 < 50; local61++) {
				local59 = local59 + Static10.aClass5_Sub6_Sub1_1.aByteArray56[local61] + ",";
			}
			Static51.method890(local19, local59);
			Static74.method1215();
			return true;
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public static void method2329() {
		for (@Pc(3) int local3 = 0; local3 < Static83.anInt1850; local3++) {
			@Pc(9) int local9 = Static80.anIntArray175[local3];
			@Pc(13) Class1_Sub2_Sub1 local13 = Static61.aClass1_Sub2_Sub1Array1[local9];
			if (local13 != null) {
				Static53.method916(local13, local13.aClass5_Sub2_Sub20_1.anInt3610);
			}
		}
	}
}
