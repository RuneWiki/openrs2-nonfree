import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)I")
	public static int method6020(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
	public static int method6026(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(64) char local64;
			if (local17 == '\u0000') {
				local64 = arg1.charAt(local13++);
			} else {
				local64 = local17;
			}
			@Pc(80) char local80;
			if (local19 == '\u0000') {
				local80 = arg0.charAt(local15++);
			} else {
				local80 = local19;
			}
			local17 = Static350.method4559(local64);
			local19 = Static350.method4559(local80);
			local64 = Static39.method635(local64, arg2);
			local80 = Static39.method635(local80, arg2);
			if (local80 != local64 && Character.toUpperCase(local64) != Character.toUpperCase(local80)) {
				local64 = Character.toLowerCase(local64);
				local80 = Character.toLowerCase(local80);
				if (local80 != local64) {
					return Static272.method3424(local64, arg2) - Static272.method3424(local80, arg2);
				}
			}
		}
		@Pc(145) int local145 = Math.min(local8, local11);
		for (@Pc(147) int local147 = 0; local147 < local145; local147++) {
			if (arg2 == 2) {
				local15 = local11 - local147 - 1;
				local13 = local8 - local147 - 1;
			} else {
				local15 = local147;
				local13 = local147;
			}
			@Pc(177) char local177 = arg1.charAt(local13);
			@Pc(181) char local181 = arg0.charAt(local15);
			if (local181 != local177 && Character.toUpperCase(local177) != Character.toUpperCase(local181)) {
				local177 = Character.toLowerCase(local177);
				local181 = Character.toLowerCase(local181);
				if (local177 != local181) {
					return Static272.method3424(local177, arg2) - Static272.method3424(local181, arg2);
				}
			}
		}
		@Pc(222) int local222 = local8 - local11;
		if (local222 != 0) {
			return local222;
		}
		for (@Pc(228) int local228 = 0; local228 < local145; local228++) {
			@Pc(234) char local234 = arg1.charAt(local228);
			@Pc(238) char local238 = arg0.charAt(local228);
			if (local234 != local238) {
				return Static272.method3424(local234, arg2) - Static272.method3424(local238, arg2);
			}
		}
		return 0;
	}
}
