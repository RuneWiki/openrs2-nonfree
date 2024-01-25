import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
	public static int anInt10261;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method8337(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static559.method7849(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static559.method7849(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(45) int local45 = local14 - local11;
		if (local45 < 1 || local45 > 12) {
			return null;
		}
		@Pc(65) StringBuffer local65 = new StringBuffer(local45);
		for (@Pc(67) int local67 = local11; local67 < local14; local67++) {
			@Pc(73) char local73 = arg0.charAt(local67);
			if (Static512.method7338(local73)) {
				@Pc(83) char local83 = Static589.method8118(local73);
				if (local83 != '\u0000') {
					local65.append(local83);
				}
			}
		}
		if (local65.length() == 0) {
			return null;
		} else {
			return local65.toString();
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBII)V")
	public static void method8338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class6_Sub5_Sub19 local13 = Static348.method5721(arg1, 8);
		local13.method5179();
		local13.anInt6198 = arg2;
		local13.anInt6197 = arg0;
		local13.anInt6195 = arg3;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
	public static void method8339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static632.anInt10598 == 1) {
			Static533.method7562(arg0, arg1, Static592.aClass6_Sub5_Sub9_4);
		} else if (Static632.anInt10598 == 2) {
			if (Static238.aBoolean425) {
				Static38.method1336(arg0 + Static573.method7997(), arg1 - -Static352.method5739());
			} else {
				Static38.method1336(arg0, arg1);
			}
		}
		Static632.anInt10598 = 0;
		Static592.aClass6_Sub5_Sub9_4 = null;
	}
}
