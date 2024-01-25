import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Z")
	public static boolean aBoolean115;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "I")
	public static int anInt1772;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	public static int anInt1769 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
	public static void method1783() {
		@Pc(5) Class11 local5 = Static94.aClass11_51;
		synchronized (Static94.aClass11_51) {
			Static94.aClass11_51.method215(5);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZIIJ)Ljava/lang/String;")
	public static String method1790(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg3 < 0L) {
			local27 = true;
			arg3 = -arg3;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(47) int local47;
		@Pc(52) int local52;
		if (arg1 > 0) {
			for (local47 = 0; local47 < arg1; local47++) {
				local52 = (int) arg3;
				arg3 /= 10L;
				local43.append((char) (local52 + 48 - (int) arg3 * 10));
			}
			local43.append(local7);
		}
		local47 = 0;
		while (true) {
			local52 = (int) arg3;
			arg3 /= 10L;
			local43.append((char) (local52 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local27) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg0) {
				local47++;
				if (local47 % 3 == 0) {
					local43.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)Z")
	public static boolean method1800(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static218.aClass46_5.method5151();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static218.aClass46_5.method5152();
		} else if (!Static218.aClass46_5.method5140()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static32.aBoolean39 = arg0;
			Static324.method5568(Static105.aClass15_2);
			return true;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method1810(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local10 + local8);
		for (@Pc(45) int local45 = 0; local45 < local8; local45++) {
			@Pc(51) char local51 = arg0.charAt(local45);
			if (local51 == '<') {
				local43.append("<lt>");
			} else if (local51 == '>') {
				local43.append("<gt>");
			} else {
				local43.append(local51);
			}
		}
		return local43.toString();
	}
}
