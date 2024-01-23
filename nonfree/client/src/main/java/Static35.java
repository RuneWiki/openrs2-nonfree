import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
	public static int anInt641 = 0;

	@OriginalMember(owner = "client!cl", name = "F", descriptor = "J")
	public static long aLong32 = 0L;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V")
	public static void method598() {
		@Pc(9) int local9 = Static245.aClass1_Sub1_Sub12_2.method4438(Static143.aString98);
		@Pc(11) int local11;
		@Pc(20) int local20;
		for (local11 = 0; local11 < Static316.anInt5941; local11++) {
			local20 = Static245.aClass1_Sub1_Sub12_2.method4438(Static190.method3114(local11));
			if (local20 > local9) {
				local9 = local20;
			}
		}
		local9 += 8;
		@Pc(36) int local36 = Static268.anInt5935;
		local20 = Static64.anInt3058 - local9 / 2;
		local11 = Static316.anInt5941 * 15 + 21;
		if (Static136.anInt2696 < local36 + local11) {
			local36 = Static136.anInt2696 - local11;
		}
		if (local36 < 0) {
			local36 = 0;
		}
		if (Static159.anInt3348 < local9 + local20) {
			local20 = Static159.anInt3348 - local9;
		}
		if (local20 < 0) {
			local20 = 0;
		}
		if (Static190.anInt3885 == 1) {
			if (Static107.anInt2125 == Static64.anInt3058 && Static60.anInt1202 == Static268.anInt5935) {
				Static44.anInt848 = local9;
				Static190.anInt3885 = 0;
				Static78.anInt1455 = local36;
				Static66.anInt1303 = (Static37.aBoolean62 ? 26 : 22) + Static316.anInt5941 * 15;
				Static108.aBoolean161 = true;
				Static143.anInt2824 = local20;
			}
		} else if (Static84.anInt1530 == Static64.anInt3058 && Static46.anInt894 == Static268.anInt5935) {
			Static44.anInt848 = local9;
			Static190.anInt3885 = 0;
			Static143.anInt2824 = local20;
			Static78.anInt1455 = local36;
			Static108.aBoolean161 = true;
			Static66.anInt1303 = Static316.anInt5941 * 15 + (Static37.aBoolean62 ? 26 : 22);
		} else {
			Static60.anInt1202 = Static46.anInt894;
			Static190.anInt3885 = 1;
			Static107.anInt2125 = Static84.anInt1530;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B[JII[I)V")
	public static void method599(@OriginalArg(1) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(10) int local10 = arg1;
		@Pc(17) int local17 = (arg1 + arg2) / 2;
		@Pc(21) long local21 = arg0[local17];
		arg0[local17] = arg0[arg2];
		arg0[arg2] = local21;
		@Pc(35) int local35 = arg3[local17];
		arg3[local17] = arg3[arg2];
		arg3[arg2] = local35;
		for (@Pc(47) int local47 = arg1; local47 < arg2; local47++) {
			if (arg0[local47] < (long) (local47 & 0x1) + local21) {
				@Pc(69) long local69 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local69;
				@Pc(83) int local83 = arg3[local47];
				arg3[local47] = arg3[local10];
				arg3[local10++] = local83;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local21;
		arg3[arg2] = arg3[local10];
		arg3[local10] = local35;
		method599(arg0, arg1, local10 - 1, arg3);
		method599(arg0, local10 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method602(@OriginalArg(1) long arg0) {
		Static81.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static81.aCalendar1.get(7);
		@Pc(17) int local17 = Static81.aCalendar1.get(5);
		@Pc(21) int local21 = Static81.aCalendar1.get(2);
		@Pc(25) int local25 = Static81.aCalendar1.get(1);
		@Pc(29) int local29 = Static81.aCalendar1.get(11);
		@Pc(44) int local44 = Static81.aCalendar1.get(12);
		@Pc(48) int local48 = Static81.aCalendar1.get(13);
		return Static60.aStringArray10[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static101.aStringArray17[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local44 / 10 + local44 % 10 + ":" + local48 / 10 + local48 % 10 + " GMT";
	}
}
