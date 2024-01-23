import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "Lclient!nf;")
	public static Class117 aClass117_4;

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "Lclient!sl;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "Lclient!s;")
	public static Class156 aClass156_29 = new Class156(512);

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
	public static int anInt5644 = 0;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
	public static int method4459(@OriginalArg(1) int arg0) {
		@Pc(7) Class57 local7 = Static193.method3145(arg0);
		@Pc(16) int local16 = local7.anInt1481;
		@Pc(19) int local19 = local7.anInt1480;
		@Pc(22) int local22 = local7.anInt1479;
		@Pc(29) int local29 = Class191.anIntArray530[local19 - local22];
		return Static46.anIntArray78[local16] >> local22 & local29;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4460(@OriginalArg(1) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(7) char[] local7 = new char[local4];
		@Pc(17) byte local17 = 2;
		for (@Pc(23) int local23 = 0; local23 < local4; local23++) {
			@Pc(34) char local34 = arg0.charAt(local23);
			if (local17 == 0) {
				local34 = Character.toLowerCase(local34);
			} else if (local17 == 2 || Character.isUpperCase(local34)) {
				local34 = Static230.method3621(local34);
			}
			if (Character.isLetter(local34)) {
				local17 = 0;
			} else if (local34 == '.' || local34 == '?' || local34 == '!') {
				local17 = 2;
			} else if (!Character.isSpaceChar(local34)) {
				local17 = 1;
			} else if (local17 != 2) {
				local17 = 1;
			}
			local7[local23] = local34;
		}
		return new String(local7);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method4462(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
