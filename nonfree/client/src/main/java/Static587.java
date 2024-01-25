import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "Lclient!la;")
	public static Class208 aClass208_133;

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[100];

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)I")
	public static int method8424(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local15 - local19 < local11) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(72) char local72;
			if (local17 == '\u0000') {
				local72 = arg0.charAt(local13++);
			} else {
				local72 = local17;
			}
			@Pc(82) char local82;
			if (local19 == '\u0000') {
				local82 = arg2.charAt(local15++);
			} else {
				local82 = local19;
			}
			local17 = Static138.method1951(local72);
			local19 = Static138.method1951(local82);
			local72 = Static3.method36(local72, arg1);
			local82 = Static3.method36(local82, arg1);
			if (local72 != local82 && Character.toUpperCase(local72) != Character.toUpperCase(local82)) {
				local72 = Character.toLowerCase(local72);
				local82 = Character.toLowerCase(local82);
				if (local82 != local72) {
					return Static529.method7631(local72, arg1) - Static529.method7631(local82, arg1);
				}
			}
		}
		@Pc(159) int local159 = Math.min(local8, local11);
		for (@Pc(161) int local161 = 0; local161 < local159; local161++) {
			if (arg1 == 2) {
				local15 = local11 - local161 - 1;
				local13 = local8 - local161 - 1;
			} else {
				local15 = local161;
				local13 = local161;
			}
			@Pc(191) char local191 = arg0.charAt(local13);
			@Pc(195) char local195 = arg2.charAt(local15);
			if (local191 != local195 && Character.toUpperCase(local191) != Character.toUpperCase(local195)) {
				local191 = Character.toLowerCase(local191);
				local195 = Character.toLowerCase(local195);
				if (local195 != local191) {
					return Static529.method7631(local191, arg1) - Static529.method7631(local195, arg1);
				}
			}
		}
		@Pc(246) int local246 = local8 - local11;
		if (local246 != 0) {
			return local246;
		}
		for (@Pc(255) int local255 = 0; local255 < local159; local255++) {
			@Pc(263) char local263 = arg0.charAt(local255);
			@Pc(267) char local267 = arg2.charAt(local255);
			if (local267 != local263) {
				return Static529.method7631(local263, arg1) - Static529.method7631(local267, arg1);
			}
		}
		return 0;
	}
}
