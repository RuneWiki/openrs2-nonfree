import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!eca", name = "y", descriptor = "[[Lclient!tc;")
	public static Class305[][] aClass305ArrayArray1;

	@OriginalMember(owner = "client!eca", name = "x", descriptor = "I")
	public static int anInt2578 = 0;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
	public static int method2273(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) int local9 = arg1.length();
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) char local15 = 0;
		@Pc(17) char local17 = 0;
		while (local6 > local11 - local15 || local9 > local13 - local17) {
			if (local6 <= local11 - local15) {
				return -1;
			}
			if (local13 - local17 >= local9) {
				return 1;
			}
			@Pc(60) char local60;
			if (local15 == '\u0000') {
				local60 = arg0.charAt(local11++);
			} else {
				local60 = local15;
			}
			@Pc(72) char local72;
			if (local17 == '\u0000') {
				local72 = arg1.charAt(local13++);
			} else {
				local72 = local17;
			}
			local15 = Static230.method3932(local60);
			local17 = Static230.method3932(local72);
			local60 = Static253.method4544(arg2, local60);
			local72 = Static253.method4544(arg2, local72);
			if (local60 != local72 && Character.toUpperCase(local60) != Character.toUpperCase(local72)) {
				local60 = Character.toLowerCase(local60);
				local72 = Character.toLowerCase(local72);
				if (local60 != local72) {
					return Static98.method4086(local60, arg2) - Static98.method4086(local72, arg2);
				}
			}
		}
		@Pc(139) int local139 = Math.min(local6, local9);
		for (@Pc(141) int local141 = 0; local141 < local139; local141++) {
			if (arg2 == 2) {
				local13 = local9 - local141 - 1;
				local11 = local6 - local141 - 1;
			} else {
				local13 = local141;
				local11 = local141;
			}
			@Pc(167) char local167 = arg0.charAt(local11);
			@Pc(171) char local171 = arg1.charAt(local13);
			if (local171 != local167 && Character.toUpperCase(local167) != Character.toUpperCase(local171)) {
				local167 = Character.toLowerCase(local167);
				local171 = Character.toLowerCase(local171);
				if (local167 != local171) {
					return Static98.method4086(local167, arg2) - Static98.method4086(local171, arg2);
				}
			}
		}
		@Pc(218) int local218 = local6 - local9;
		if (local218 != 0) {
			return local218;
		}
		for (@Pc(224) int local224 = 0; local224 < local139; local224++) {
			@Pc(229) char local229 = arg0.charAt(local224);
			@Pc(233) char local233 = arg1.charAt(local224);
			if (local229 != local233) {
				return Static98.method4086(local229, arg2) - Static98.method4086(local233, arg2);
			}
		}
		return 0;
	}
}
