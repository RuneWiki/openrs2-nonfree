import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!re", name = "D", descriptor = "I")
	public static int anInt5040;

	@OriginalMember(owner = "client!re", name = "H", descriptor = "[I")
	public static int[] anIntArray542;

	@OriginalMember(owner = "client!re", name = "A", descriptor = "I")
	public static int anInt5038 = 0;

	@OriginalMember(owner = "client!re", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString214 = "Loading textures - ";

	@OriginalMember(owner = "client!re", name = "K", descriptor = "I")
	public static int anInt5044 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method4594(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static71.anInt1344 >= 100) {
			Static23.method356(Static288.aString237);
			return;
		}
		@Pc(21) String local21 = Static205.method5718(arg1);
		if (local21 == null) {
			return;
		}
		@Pc(61) String local61;
		for (@Pc(26) int local26 = 0; local26 < Static71.anInt1344; local26++) {
			@Pc(34) String local34 = Static205.method5718(Static39.aStringArray3[local26]);
			if (local34 != null && local34.equals(local21)) {
				Static23.method356(arg1 + Static141.aString108);
				return;
			}
			if (Static215.aStringArray26[local26] != null) {
				local61 = Static205.method5718(Static215.aStringArray26[local26]);
				if (local61 != null && local61.equals(local21)) {
					Static23.method356(arg1 + Static141.aString108);
					return;
				}
			}
		}
		for (@Pc(88) int local88 = 0; local88 < Static57.anInt1094; local88++) {
			local61 = Static205.method5718(Static86.aStringArray11[local88]);
			if (local61 != null && local61.equals(local21)) {
				Static23.method356(Static337.aString297 + arg1 + Static17.aString299);
				return;
			}
			if (Static328.aStringArray42[local88] != null) {
				@Pc(125) String local125 = Static205.method5718(Static328.aStringArray42[local88]);
				if (local125 != null && local125.equals(local21)) {
					Static23.method356(Static337.aString297 + arg1 + Static17.aString299);
					return;
				}
			}
		}
		if (Static205.method5718(Static253.aClass44_Sub4_Sub4_Sub1_1.aString207).equals(local21)) {
			Static23.method356(Static127.aString182);
		} else {
			Static131.aClass6_Sub10_Sub1_2.method2886(141);
			Static131.aClass6_Sub10_Sub1_2.method3968(Static302.method5198(arg1) + 1);
			Static131.aClass6_Sub10_Sub1_2.method3966(arg1);
			Static131.aClass6_Sub10_Sub1_2.method3968(arg0 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
	public static void method4595() {
		@Pc(1) Class70 local1 = Static267.aClass70_84;
		synchronized (Static267.aClass70_84) {
			Static267.aClass70_84.method1405();
		}
		local1 = Static336.aClass70_105;
		synchronized (Static336.aClass70_105) {
			Static336.aClass70_105.method1405();
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)V")
	public static void method4597() {
		@Pc(1) Class70 local1 = Static290.aClass70_91;
		synchronized (Static290.aClass70_91) {
			Static290.aClass70_91.method1399();
		}
		local1 = Static66.aClass70_27;
		synchronized (Static66.aClass70_27) {
			Static66.aClass70_27.method1399();
		}
		@Pc(31) Class137 local31 = Static270.aClass137_1;
		synchronized (Static270.aClass137_1) {
			Static270.aClass137_1.method3630();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method4598(@OriginalArg(0) long arg0) {
		Static161.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static161.aCalendar2.get(7);
		@Pc(17) int local17 = Static161.aCalendar2.get(5);
		@Pc(26) int local26 = Static161.aCalendar2.get(2);
		@Pc(30) int local30 = Static161.aCalendar2.get(1);
		@Pc(34) int local34 = Static161.aCalendar2.get(11);
		@Pc(38) int local38 = Static161.aCalendar2.get(12);
		@Pc(42) int local42 = Static161.aCalendar2.get(13);
		return Static22.aStringArray1[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static349.aStringArray44[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(I)V")
	public static void method4600() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static345.aBooleanArray28[local7] = false;
		}
		Static350.anInt6299 = 0;
		Static252.anInt4703 = Static287.anInt5405;
		Static285.anInt5395 = Static217.anInt4016;
		Static63.anInt1157 = Static76.anInt2853;
		Static233.anInt4352 = 0;
		Static12.anInt223 = -1;
		Static157.anInt2938 = Static11.anInt197;
		Static351.anInt6306 = Static79.anInt1450;
		Static275.anInt5181 = -1;
		Static334.anInt6112 = 5;
		Static269.anInt5055 = Static110.anInt2047;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)I")
	public static int method4601(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
