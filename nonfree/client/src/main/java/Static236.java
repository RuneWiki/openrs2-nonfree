import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!iga", name = "Bb", descriptor = "Z")
	public static boolean aBoolean320;

	@OriginalMember(owner = "client!iga", name = "bb", descriptor = "[I")
	public static final int[] anIntArray282 = new int[8];

	@OriginalMember(owner = "client!iga", name = "qb", descriptor = "I")
	public static int anInt4333 = -1;

	@OriginalMember(owner = "client!iga", name = "Fb", descriptor = "Z")
	public static boolean aBoolean321 = false;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IZILclient!ria;)V")
	public static void method3793(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class303 arg2) {
		@Pc(17) Class1 local17 = arg2.method6948(Static141.aClass13_27);
		if (local17 == null) {
			return;
		}
		Static141.aClass13_27.KA(arg0, arg1, arg2.anInt7914 + arg0, arg2.anInt7971 + arg1);
		if (Static502.anInt9931 < 3) {
			Static367.aClass31_15.method8811((float) arg0 + (float) arg2.anInt7914 / 2.0F, (float) arg2.anInt7971 / 2.0F + (float) arg1, ((int) -Static225.aFloat85 & 0x3FFF) << 2, local17, arg0, arg1);
		} else {
			Static141.aClass13_27.A(-16777216, local17, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)I")
	public static int method3799(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(6) int local6 = arg2.length();
		@Pc(9) int local9 = arg0.length();
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(19) char local19 = 0;
		@Pc(21) char local21 = 0;
		while (local11 - local19 < local6 || local13 - local21 < local9) {
			if (local11 - local19 >= local6) {
				return -1;
			}
			if (local13 - local21 >= local9) {
				return 1;
			}
			@Pc(67) char local67;
			if (local19 == '\u0000') {
				local67 = arg2.charAt(local11++);
			} else {
				local67 = local19;
			}
			@Pc(79) char local79;
			if (local21 == '\u0000') {
				local79 = arg0.charAt(local13++);
			} else {
				local79 = local21;
			}
			local19 = Static303.method4761(local67);
			local21 = Static303.method4761(local79);
			local67 = Static578.method8016(arg1, local67);
			local79 = Static578.method8016(arg1, local79);
			if (local67 != local79 && Character.toUpperCase(local67) != Character.toUpperCase(local79)) {
				local67 = Character.toLowerCase(local67);
				local79 = Character.toLowerCase(local79);
				if (local79 != local67) {
					return Static472.method6674(arg1, local67) - Static472.method6674(arg1, local79);
				}
			}
		}
		@Pc(147) int local147 = Math.min(local6, local9);
		for (@Pc(149) int local149 = 0; local149 < local147; local149++) {
			if (arg1 == 2) {
				local13 = local9 - local149 - 1;
				local11 = local6 - local149 - 1;
			} else {
				local13 = local149;
				local11 = local149;
			}
			@Pc(175) char local175 = arg2.charAt(local11);
			@Pc(179) char local179 = arg0.charAt(local13);
			if (local175 != local179 && Character.toUpperCase(local175) != Character.toUpperCase(local179)) {
				local175 = Character.toLowerCase(local175);
				local179 = Character.toLowerCase(local179);
				if (local179 != local175) {
					return Static472.method6674(arg1, local175) - Static472.method6674(arg1, local179);
				}
			}
		}
		@Pc(228) int local228 = local6 - local9;
		if (local228 != 0) {
			return local228;
		}
		for (@Pc(237) int local237 = 0; local237 < local147; local237++) {
			@Pc(242) char local242 = arg2.charAt(local237);
			@Pc(246) char local246 = arg0.charAt(local237);
			if (local246 != local242) {
				return Static472.method6674(arg1, local242) - Static472.method6674(arg1, local246);
			}
		}
		return 0;
	}
}
