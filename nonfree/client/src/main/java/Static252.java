import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray61;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
	public static int anInt5147 = -1;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_268 = new Class159("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method4449(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local19 > local11 && Static144.method2968(arg0.charAt(local11))) {
			local11++;
		}
		while (local19 > local11 && Static144.method2968(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(58) int local58 = local19 - local11;
		if (local58 < 1 || local58 > 12) {
			return null;
		}
		@Pc(73) StringBuffer local73 = new StringBuffer(local58);
		for (@Pc(75) int local75 = local11; local75 < local19; local75++) {
			@Pc(81) char local81 = arg0.charAt(local75);
			if (Static35.method720(local81)) {
				@Pc(89) char local89 = Static292.method4886(local81);
				if (local89 != '\u0000') {
					local73.append(local89);
				}
			}
		}
		if (local73.length() == 0) {
			return null;
		} else {
			return local73.toString();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBI)V")
	public static void method4452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static26.anInt577 * arg1 >> 8;
		if (arg0 == -1 && !Static74.aBoolean135) {
			Static308.method5086();
		} else if (arg0 != -1 && (Static206.anInt4321 != arg0 || !Static290.method4877()) && local5 != 0 && !Static74.aBoolean135) {
			Static218.method3957(Static39.aClass193_11, local5, arg0);
		}
		Static206.anInt4321 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BIZ)Ljava/lang/String;")
	public static String method4454(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static157.method3058(arg0);
	}
}
