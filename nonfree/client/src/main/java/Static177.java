import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "Lclient!dp;")
	public static Class76 aClass76_3;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)Lclient!jn;")
	public static Class178 method2936(@OriginalArg(0) int arg0) {
		@Pc(8) Class178[] local8 = Static469.method6936();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			if (arg0 == local8[local15].anInt5300) {
				return local8[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(JII)Ljava/lang/String;")
	public static String method2937(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		Static334.method5409(arg0);
		@Pc(10) int local10 = Static116.aCalendar1.get(5);
		@Pc(16) int local16 = Static116.aCalendar1.get(2) + 1;
		@Pc(29) int local29 = Static116.aCalendar1.get(1);
		return Integer.toString(local10 / 10) + local10 % 10 + "/" + local16 / 10 + local16 % 10 + "/" + local29 % 100 / 10 + local29 % 10;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIII)I")
	public static int method2938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static546.aByteArrayArrayArray18[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static546.aByteArrayArrayArray18[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
