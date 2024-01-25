import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZILjava/lang/String;I)I")
	public static int method398(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(40) int local40 = arg1.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(47) char local47 = arg1.charAt(local42);
			if (local42 == 0) {
				if (local47 == '-') {
					local24 = true;
					continue;
				}
				if (local47 == '+') {
					continue;
				}
			}
			@Pc(79) int local79;
			if (local47 >= '0' && local47 <= '9') {
				local79 = local47 - '0';
			} else if (local47 >= 'A' && local47 <= 'Z') {
				local79 = local47 - '7';
			} else if (local47 >= 'a' && local47 <= 'z') {
				local79 = local47 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local79 >= arg0) {
				throw new NumberFormatException();
			}
			if (local24) {
				local79 = -local79;
			}
			@Pc(121) int local121 = local28 * arg0 + local79;
			if (local121 / arg0 != local28) {
				throw new NumberFormatException();
			}
			local26 = true;
			local28 = local121;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I")
	public static int method399() {
		if ((double) Static407.aFloat126 == 3.0D) {
			return 37;
		} else if ((double) Static407.aFloat126 == 4.0D) {
			return 50;
		} else if ((double) Static407.aFloat126 == 6.0D) {
			return 75;
		} else if ((double) Static407.aFloat126 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)Z")
	public static boolean method400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static594.aClass56_14.method8389(arg2, arg1, arg0, Static545.anIntArray489);
		@Pc(13) int local13 = Static545.anIntArray489[2];
		if (local13 < 50) {
			return false;
		} else {
			Static545.anIntArray489[1] = Static545.anIntArray489[1] * Static117.anInt2045 / local13 + Static368.anInt6436;
			Static545.anIntArray489[2] = local13;
			Static545.anIntArray489[0] = Static545.anIntArray489[0] * Static405.anInt6990 / local13 + Static26.anInt351;
			return true;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZLclient!jfa;)Z")
	public static boolean method401(@OriginalArg(0) int arg0, @OriginalArg(2) Class180 arg1) {
		Static594.aClass56_14.method8389(arg1.anIntArray257[arg0], arg1.anIntArray255[arg0], arg1.anIntArray258[arg0], Static545.anIntArray489);
		@Pc(22) int local22 = Static545.anIntArray489[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray61[arg0] = (short) (Static545.anIntArray489[0] * Static405.anInt6990 / local22 + Static26.anInt351);
			arg1.aShortArray62[arg0] = (short) (Static545.anIntArray489[1] * Static117.anInt2045 / local22 + Static368.anInt6436);
			arg1.aShortArray63[arg0] = (short) local22;
			return true;
		}
	}
}
