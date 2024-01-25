import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!go", name = "Y", descriptor = "Z")
	public static boolean aBoolean188 = false;

	@OriginalMember(owner = "client!go", name = "bb", descriptor = "I")
	public static int anInt2636 = 0;

	@OriginalMember(owner = "client!go", name = "cb", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_88 = new Class62(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!go", name = "fb", descriptor = "Ljava/lang/String;")
	public static String aString20 = "";

	@OriginalMember(owner = "client!go", name = "gb", descriptor = "Lclient!re;")
	public static final Class199 aClass199_2 = new Class199();

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIII)I")
	public static int method2122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(12) int local12 = arg3;
			arg3 = arg5;
			arg5 = local12;
		}
		@Pc(20) int local20 = arg0 & 0x3;
		if (local20 == 0) {
			return arg4;
		} else if (local20 == 1) {
			return 1 + 7 - arg3 - arg1;
		} else if (local20 == 2) {
			return 1 + 7 - arg5 - arg4;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)Z")
	public static boolean method2123() {
		try {
			return Static41.method581();
		} catch (@Pc(14) IOException local14) {
			Static185.method3422();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static178.aClass208_103 == null ? -1 : Static178.aClass208_103.method5104()) + "," + (Static217.aClass208_121 == null ? -1 : Static217.aClass208_121.method5104()) + "," + (Static198.aClass208_113 == null ? -1 : Static198.aClass208_113.method5104()) + " - " + Static248.anInt4821 + "," + (Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray466[0] + Static279.anInt5198) + "," + (Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray465[0] + Static350.anInt6470) + " - ";
			for (@Pc(79) int local79 = 0; local79 < Static248.anInt4821 && local79 < 50; local79++) {
				local77 = local77 + Static321.aClass2_Sub24_Sub2_34.aByteArray100[local79] + ",";
			}
			Static346.method5531(local19, local77);
			Static241.method2190();
			return true;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZZB)V")
	public static void method2125(@OriginalArg(1) boolean arg0) {
		Static281.anInt5258++;
		Static153.method2739();
		if (arg0) {
			Static81.anInt1750++;
			Static139.method2404();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method2127(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg6 < 128 || arg3 < 128 || Static89.anInt1891 * 128 - 256 < arg6 || arg3 > Static85.anInt1839 * 128 - 256) {
			Static128.anIntArray211[0] = Static128.anIntArray211[1] = -1;
			return;
		}
		@Pc(50) int local50 = Static36.method2335(arg3, arg2, arg6) - arg5;
		Static61.aClass21_4.method3701(arg0, 0, 0);
		Static383.aClass48_9.method2482(Static61.aClass21_4);
		Static383.aClass48_9.method2524(arg6, local50, arg3, Static128.anIntArray211);
		Static61.aClass21_4.method3701(-arg0, 0, 0);
		Static383.aClass48_9.method2482(Static61.aClass21_4);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2130(@OriginalArg(1) long arg0) {
		Static202.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static202.aCalendar1.get(7);
		@Pc(17) int local17 = Static202.aCalendar1.get(5);
		@Pc(21) int local21 = Static202.aCalendar1.get(2);
		@Pc(25) int local25 = Static202.aCalendar1.get(1);
		@Pc(29) int local29 = Static202.aCalendar1.get(11);
		@Pc(33) int local33 = Static202.aCalendar1.get(12);
		@Pc(37) int local37 = Static202.aCalendar1.get(13);
		return Static22.aStringArray2[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static181.aStringArray18[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(B)V")
	public static void method2131() {
		Static263.aClass139_1.method4293();
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static317.aLongArray8[local22] = 0L;
		}
		for (@Pc(34) int local34 = 0; local34 < 32; local34++) {
			Static134.aLongArray2[local34] = 0L;
		}
		Static315.anInt5769 = 0;
	}
}
