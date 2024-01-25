import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	public static int anInt6219 = -1;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_151 = new Class25(37, -2);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLclient!na;IZ[II)Lclient!me;")
	public static Class64_Sub4_Sub1 method4957(@OriginalArg(1) Class75_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3) {
		if (arg0.aBoolean360 || Static409.method687(arg1) && Static409.method687(arg3)) {
			return new Class64_Sub4_Sub1(arg0, 3553, arg1, arg3, false, arg2);
		} else if (arg0.aBoolean345) {
			return new Class64_Sub4_Sub1(arg0, 34037, arg1, arg3, false, arg2);
		} else {
			return new Class64_Sub4_Sub1(arg0, arg1, arg3, Static43.method654(arg1), Static43.method654(arg3), arg2);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method4958(@OriginalArg(0) long arg0) {
		Static97.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static97.aCalendar2.get(7);
		@Pc(17) int local17 = Static97.aCalendar2.get(5);
		@Pc(21) int local21 = Static97.aCalendar2.get(2);
		@Pc(32) int local32 = Static97.aCalendar2.get(1);
		@Pc(36) int local36 = Static97.aCalendar2.get(11);
		@Pc(40) int local40 = Static97.aCalendar2.get(12);
		@Pc(44) int local44 = Static97.aCalendar2.get(13);
		return Static32.aStringArray70[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static90.aStringArray18[local21] + "-" + local32 + " " + local36 / 10 + local36 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!hw;)V")
	public static void method4959(@OriginalArg(1) Class2_Sub17 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static291.aClass201_5 != null) {
			@Pc(22) int local22;
			try {
				Static291.aClass201_5.method4606(0L);
				Static291.aClass201_5.method4605(local8);
				for (local22 = 0; local22 < 24 && local8[local22] == 0; local22++) {
				}
				if (local22 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local22 = 0; local22 < 24; local22++) {
					local8[local22] = -1;
				}
			}
		}
		arg0.method6167(local8, 24);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I")
	public static int method4961(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
