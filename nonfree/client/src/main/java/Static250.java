import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ih", name = "I", descriptor = "Lclient!el;")
	public static final Class109 aClass109_95 = new Class109(113, 7);

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "F")
	public static float aFloat59 = 1.0F;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIZ)V")
	public static void method3677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static596.method8616(arg0)) {
			Static367.method8724(arg1, Static489.aClass73ArrayArray2[arg0], arg2, arg3, -1);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)I")
	public static int method3678(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method3679(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(19) int local19 = 0;
		@Pc(22) int local22 = arg0.length();
		while (local22 > local19 && Static447.method6656(arg0.charAt(local19))) {
			local19++;
		}
		while (local22 > local19 && Static447.method6656(arg0.charAt(local22 - 1))) {
			local22--;
		}
		@Pc(73) int local73 = local22 - local19;
		if (local73 < 1 || local73 > 12) {
			return null;
		}
		@Pc(91) StringBuffer local91 = new StringBuffer(local73);
		for (@Pc(93) int local93 = local19; local93 < local22; local93++) {
			@Pc(101) char local101 = arg0.charAt(local93);
			if (Static299.method1116(local101)) {
				@Pc(109) char local109 = Static59.method840(local101);
				if (local109 != '\u0000') {
					local91.append(local109);
				}
			}
		}
		if (local91.length() == 0) {
			return null;
		} else {
			return local91.toString();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([ILclient!la;BLclient!la;)V")
	public static void method3680(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(3) Class208 arg2) {
		Static341.aClass208_75 = arg1;
		Static367.aClass208_140 = arg2;
		if (arg0 != null) {
			Static351.anIntArray339 = arg0;
		}
	}
}
