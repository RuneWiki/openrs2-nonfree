import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!wha", name = "e", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_127 = new Class387(26, 11);

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IJ)I")
	public static int method9159(@OriginalArg(1) long arg0) {
		Static589.method8459(arg0);
		return Static242.aCalendar2.get(1);
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)V")
	public static void method9163() {
		Static376.method5512(-1, 255);
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(BLjava/lang/String;ZI)I")
	public static int method9165(@OriginalArg(1) String arg0, @OriginalArg(3) int arg1) {
		if (arg1 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + arg1);
		}
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = arg0.length();
		for (@Pc(46) int local46 = 0; local46 < local44; local46++) {
			@Pc(54) char local54 = arg0.charAt(local46);
			if (local46 == 0) {
				if (local54 == '-') {
					local31 = true;
					continue;
				}
				if (local54 == '+' && true) {
					continue;
				}
			}
			@Pc(108) int local108;
			if (local54 >= '0' && local54 <= '9') {
				local108 = local54 - '0';
			} else if (local54 >= 'A' && local54 <= 'Z') {
				local108 = local54 - '7';
			} else if (local54 >= 'a' && local54 <= 'z') {
				local108 = local54 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local108 >= arg1) {
				throw new NumberFormatException();
			}
			if (local31) {
				local108 = -local108;
			}
			@Pc(152) int local152 = arg1 * local41 + local108;
			if (local152 / arg1 != local41) {
				throw new NumberFormatException();
			}
			local33 = true;
			local41 = local152;
		}
		if (!local33) {
			throw new NumberFormatException();
		}
		return local41;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(BZ)Z")
	public static boolean method9167(@OriginalArg(1) boolean arg0) {
		@Pc(14) boolean local14 = Static457.aClass57_11.method7711();
		if (arg0 == local14) {
			return true;
		}
		if (!arg0) {
			Static457.aClass57_11.method7729();
		} else if (!Static457.aClass57_11.method7697()) {
			arg0 = false;
		}
		if (local14 == arg0) {
			return false;
		} else {
			Static637.aClass5_Sub20_31.method3194(arg0 ? 1 : 0, Static637.aClass5_Sub20_31.aClass24_Sub14_1);
			Static52.method792();
			return true;
		}
	}
}
