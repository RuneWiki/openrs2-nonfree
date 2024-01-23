import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "[I")
	public static int[] anIntArray160;

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
	public static int anInt1889 = 0;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIIII)V")
	public static void method1433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static211.aClass2_Sub16_Sub1_2.anInt2789 = 0;
		Static211.aClass2_Sub16_Sub1_2.method2168(20);
		Static211.aClass2_Sub16_Sub1_2.method2168(arg1);
		Static211.aClass2_Sub16_Sub1_2.method2168(arg3);
		Static211.aClass2_Sub16_Sub1_2.method2143(arg2);
		Static211.aClass2_Sub16_Sub1_2.method2143(arg0);
		Static195.anInt6028 = -3;
		Static259.anInt5132 = 1;
		Static92.anInt2207 = 0;
		Static194.anInt4084 = 0;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V")
	public static void method1434() {
		Static26.aClass2_Sub8_Sub1_10 = null;
		Static30.aClass2_Sub8_Sub1_4 = null;
		Static155.aClass2_Sub8_Sub1_8 = null;
		Static50.aClass2_Sub8_Sub1_5 = null;
		Static255.aClass2_Sub8_Sub1_12 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1437(@OriginalArg(0) long arg0) {
		Static269.aCalendar2.setTime(new Date(arg0));
		@Pc(9) int local9 = Static269.aCalendar2.get(7);
		@Pc(13) int local13 = Static269.aCalendar2.get(5);
		@Pc(21) int local21 = Static269.aCalendar2.get(2);
		@Pc(30) int local30 = Static269.aCalendar2.get(1);
		@Pc(34) int local34 = Static269.aCalendar2.get(11);
		@Pc(38) int local38 = Static269.aCalendar2.get(12);
		@Pc(42) int local42 = Static269.aCalendar2.get(13);
		return Static219.aStringArray33[local9 - 1] + ", " + local13 / 10 + local13 % 10 + "-" + Static247.aStringArray11[local21] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
