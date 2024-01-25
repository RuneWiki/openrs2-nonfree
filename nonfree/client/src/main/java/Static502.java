import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "[Lclient!fca;")
	public static Class97[] aClass97Array2;

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
	public static int anInt8364;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "[I")
	public static final int[] anIntArray649 = new int[4096];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method6917() {
		Static16.anInt312 = -1;
		Static16.anInt311 = -1;
		Static334.anInt5975 = -1;
		Static573.anInt9601 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6919(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static2.method51(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static2.method51(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(64) StringBuffer local64 = new StringBuffer(local49);
		for (@Pc(66) int local66 = local11; local66 < local14; local66++) {
			@Pc(72) char local72 = arg0.charAt(local66);
			if (Static152.method2241(local72)) {
				@Pc(80) char local80 = Static491.method6774(local72);
				if (local80 != '\u0000') {
					local64.append(local80);
				}
			}
		}
		if (local64.length() == 0) {
			return null;
		} else {
			return local64.toString();
		}
	}
}
