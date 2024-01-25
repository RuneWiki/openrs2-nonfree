import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Lclient!qr;")
	public static Class277 aClass277_1;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)Z")
	public static boolean method976(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static455.aByteArrayArrayArray17[0][arg3][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static455.aByteArrayArrayArray17[arg0][arg3][arg1] & 0x10) == 0) {
			return arg2 == Static33.method2100(arg1, arg0, arg3);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method977(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(24) char local24 = 0;
		while (local8 > local13 - local17 || local15 - local24 < local11) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local15 - local24 >= local11) {
				return 1;
			}
			@Pc(62) char local62;
			if (local17 == '\u0000') {
				local62 = arg0.charAt(local13++);
			} else {
				local62 = local17;
			}
			@Pc(78) char local78;
			if (local24 == '\u0000') {
				local78 = arg2.charAt(local15++);
			} else {
				local78 = local24;
			}
			local17 = Static144.method7273(local62);
			local24 = Static144.method7273(local78);
			local62 = Static9.method100(local62, arg1);
			local78 = Static9.method100(local78, arg1);
			if (local62 != local78 && Character.toUpperCase(local62) != Character.toUpperCase(local78)) {
				local62 = Character.toLowerCase(local62);
				local78 = Character.toLowerCase(local78);
				if (local62 != local78) {
					return Static117.method1847(arg1, local62) - Static117.method1847(arg1, local78);
				}
			}
		}
		@Pc(136) int local136 = Math.min(local8, local11);
		for (@Pc(138) int local138 = 0; local138 < local136; local138++) {
			if (arg1 == 2) {
				local13 = local8 - local138 - 1;
				local15 = local11 - local138 - 1;
			} else {
				local15 = local138;
				local13 = local138;
			}
			@Pc(168) char local168 = arg0.charAt(local13);
			@Pc(172) char local172 = arg2.charAt(local15);
			if (local172 != local168 && Character.toUpperCase(local168) != Character.toUpperCase(local172)) {
				local168 = Character.toLowerCase(local168);
				local172 = Character.toLowerCase(local172);
				if (local172 != local168) {
					return Static117.method1847(arg1, local168) - Static117.method1847(arg1, local172);
				}
			}
		}
		@Pc(219) int local219 = local8 - local11;
		if (local219 != 0) {
			return local219;
		}
		for (@Pc(228) int local228 = 0; local228 < local136; local228++) {
			@Pc(234) char local234 = arg0.charAt(local228);
			@Pc(238) char local238 = arg2.charAt(local228);
			if (local234 != local238) {
				return Static117.method1847(arg1, local234) - Static117.method1847(arg1, local238);
			}
		}
		return 0;
	}
}
