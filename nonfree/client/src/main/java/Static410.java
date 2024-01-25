import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
	public static int anInt7502;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	public static int anInt7495 = 0;

	@OriginalMember(owner = "client!oo", name = "y", descriptor = "[I")
	public static final int[] anIntArray458 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6501(@OriginalArg(0) String arg0) {
		if (Static402.aStringArray27 == null) {
			Static637.method8712();
		}
		Static82.aCalendar1.setTime(new Date(Static374.method6036()));
		@Pc(20) int local20 = Static82.aCalendar1.get(11);
		@Pc(24) int local24 = Static82.aCalendar1.get(12);
		@Pc(28) int local28 = Static82.aCalendar1.get(13);
		@Pc(62) String local62 = Integer.toString(local20 / 10) + local20 % 10 + ":" + local24 / 10 + local24 % 10 + ":" + local28 / 10 + local28 % 10;
		@Pc(67) String[] local67 = Static33.method1210('\n', arg0);
		for (@Pc(69) int local69 = 0; local69 < local67.length; local69++) {
			for (@Pc(73) int local73 = Static451.anInt8003; local73 > 0; local73--) {
				Static402.aStringArray27[local73] = Static402.aStringArray27[local73 - 1];
			}
			Static402.aStringArray27[0] = local62 + ": " + local67[local69];
			if (Static375.aFileOutputStream1 != null) {
				try {
					Static375.aFileOutputStream1.write(Static537.method7869(Static402.aStringArray27[0] + "\n"));
				} catch (@Pc(119) IOException local119) {
				}
			}
			if (Static402.aStringArray27.length - 1 > Static451.anInt8003) {
				Static451.anInt8003++;
				if (Static243.anInt4523 > 0) {
					Static243.anInt4523++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIB)V")
	public static void method6505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = arg2 * arg2;
		@Pc(25) int local25 = local21 << 1;
		@Pc(29) int local29 = local17 << 1;
		@Pc(33) int local33 = arg2 << 1;
		@Pc(42) int local42 = (1 - local33) * local17 + local25;
		@Pc(51) int local51 = local21 - local29 * (local33 - 1);
		@Pc(55) int local55 = local17 << 2;
		@Pc(59) int local59 = local21 << 2;
		@Pc(67) int local67 = local25 * 3;
		@Pc(75) int local75 = local29 * ((arg2 << 1) - 3);
		@Pc(81) int local81 = local59;
		Static611.method8472(arg1 + arg3, -arg1 + arg3, Static460.anIntArrayArray53[arg4], arg0);
		@Pc(100) int local100 = local55 * (arg2 - 1);
		while (local13 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local42 += local67;
					local51 += local81;
					local81 += local59;
					local7++;
					local67 += local59;
				}
			}
			if (local51 < 0) {
				local42 += local67;
				local51 += local81;
				local81 += local59;
				local67 += local59;
				local7++;
			}
			local42 += -local100;
			local51 += -local75;
			local13--;
			local100 -= local55;
			local75 -= local55;
			@Pc(167) int local167 = arg4 - local13;
			@Pc(171) int local171 = local13 + arg4;
			@Pc(175) int local175 = local7 + arg3;
			@Pc(180) int local180 = arg3 - local7;
			Static611.method8472(local175, local180, Static460.anIntArrayArray53[local167], arg0);
			Static611.method8472(local175, local180, Static460.anIntArrayArray53[local171], arg0);
		}
	}
}
