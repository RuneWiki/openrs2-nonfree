import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
	public static int anInt1969;

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
	public static int anInt1972;

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
	public static int anInt1976;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
	public static int anInt1966 = 0;

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "S")
	public static short aShort11 = 320;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)I")
	public static int method1469(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg2.length();
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local15 - local22 < local8 || local20 > local17 - local24) {
			if (local8 <= local15 - local22) {
				return -1;
			}
			if (local20 <= local17 - local24) {
				return 1;
			}
			@Pc(69) char local69;
			if (local22 == '\u0000') {
				local69 = arg0.charAt(local15++);
			} else {
				local69 = local22;
			}
			@Pc(85) char local85;
			if (local24 == '\u0000') {
				local85 = arg2.charAt(local17++);
			} else {
				local85 = local24;
			}
			local22 = Static62.method1213(local69);
			local24 = Static62.method1213(local85);
			local69 = Static158.method2962(arg1, local69);
			local85 = Static158.method2962(arg1, local85);
			if (local85 != local69 && Character.toUpperCase(local69) != Character.toUpperCase(local85)) {
				local69 = Character.toLowerCase(local69);
				local85 = Character.toLowerCase(local85);
				if (local85 != local69) {
					return Static174.method3212(arg1, local69) - Static174.method3212(arg1, local85);
				}
			}
		}
		@Pc(149) int local149 = Math.min(local8, local20);
		@Pc(184) char local184;
		@Pc(151) int local151;
		for (local151 = 0; local151 < local149; local151++) {
			if (arg1 == 2) {
				local17 = local20 - local151 - 1;
				local15 = local8 - local151 - 1;
			} else {
				local17 = local151;
				local15 = local151;
			}
			@Pc(180) char local180 = arg0.charAt(local15);
			local184 = arg2.charAt(local17);
			if (local184 != local180 && Character.toUpperCase(local180) != Character.toUpperCase(local184)) {
				local180 = Character.toLowerCase(local180);
				local184 = Character.toLowerCase(local184);
				if (local184 != local180) {
					return Static174.method3212(arg1, local180) - Static174.method3212(arg1, local184);
				}
			}
		}
		local151 = local8 - local20;
		if (local151 != 0) {
			return local151;
		}
		for (@Pc(231) int local231 = 0; local231 < local149; local231++) {
			local184 = arg0.charAt(local231);
			@Pc(246) char local246 = arg2.charAt(local231);
			if (local246 != local184) {
				return Static174.method3212(arg1, local184) - Static174.method3212(arg1, local246);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjava/lang/String;BZ)I")
	public static int method1472(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(25) boolean local25 = false;
		@Pc(27) boolean local27 = false;
		@Pc(29) int local29 = 0;
		@Pc(37) int local37 = arg1.length();
		for (@Pc(39) int local39 = 0; local39 < local37; local39++) {
			@Pc(46) char local46 = arg1.charAt(local39);
			if (local39 == 0) {
				if (local46 == '-') {
					local25 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(70) int local70;
			if (local46 >= '0' && local46 <= '9') {
				local70 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local70 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local70 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local70) {
				throw new NumberFormatException();
			}
			if (local25) {
				local70 = -local70;
			}
			@Pc(112) int local112 = local70 + arg0 * local29;
			if (local29 != local112 / arg0) {
				throw new NumberFormatException();
			}
			local27 = true;
			local29 = local112;
		}
		if (!local27) {
			throw new NumberFormatException();
		}
		return local29;
	}
}
