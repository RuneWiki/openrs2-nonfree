import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public static int anInt1425 = 100;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1119(@OriginalArg(1) long arg0) {
		Static297.aCalendar2.setTime(new Date(arg0));
		@Pc(21) int local21 = Static297.aCalendar2.get(7);
		@Pc(25) int local25 = Static297.aCalendar2.get(5);
		@Pc(29) int local29 = Static297.aCalendar2.get(2);
		@Pc(33) int local33 = Static297.aCalendar2.get(1);
		@Pc(37) int local37 = Static297.aCalendar2.get(11);
		@Pc(41) int local41 = Static297.aCalendar2.get(12);
		@Pc(45) int local45 = Static297.aCalendar2.get(13);
		return Static258.aStringArray32[local21 - 1] + ", " + local25 / 10 + local25 % 10 + "-" + Static44.aStringArray6[local29] + "-" + local33 + " " + local37 / 10 + local37 % 10 + ":" + local41 / 10 + local41 % 10 + ":" + local45 / 10 + local45 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method1120() {
		Static313.aClass198_55.method5236();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII)V")
	public static void method1121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (anInt1425 < arg2 || Static236.anInt4721 > arg1) {
			return;
		}
		@Pc(20) boolean local20;
		if (arg3 < Static19.anInt533) {
			local20 = false;
			arg3 = Static19.anInt533;
		} else if (Static4.anInt75 < arg3) {
			arg3 = Static4.anInt75;
			local20 = false;
		} else {
			local20 = true;
		}
		@Pc(43) boolean local43;
		if (arg4 < Static19.anInt533) {
			arg4 = Static19.anInt533;
			local43 = false;
		} else if (arg4 > Static4.anInt75) {
			local43 = false;
			arg4 = Static4.anInt75;
		} else {
			local43 = true;
		}
		if (Static236.anInt4721 > arg2) {
			arg2 = Static236.anInt4721;
		} else {
			Static162.method1731(arg4, Static196.anIntArrayArray37[arg2++], arg3, arg0);
		}
		if (arg1 > anInt1425) {
			arg1 = anInt1425;
		} else {
			Static162.method1731(arg4, Static196.anIntArrayArray37[arg1--], arg3, arg0);
		}
		@Pc(93) int local93;
		if (local20 && local43) {
			for (local93 = arg2; local93 <= arg1; local93++) {
				@Pc(99) int[] local99 = Static196.anIntArrayArray37[local93];
				local99[arg3] = local99[arg4] = arg0;
			}
		} else if (local20) {
			for (local93 = arg2; local93 <= arg1; local93++) {
				Static196.anIntArrayArray37[local93][arg3] = arg0;
			}
		} else if (local43) {
			for (local93 = arg2; local93 <= arg1; local93++) {
				Static196.anIntArrayArray37[local93][arg4] = arg0;
			}
		}
	}
}
