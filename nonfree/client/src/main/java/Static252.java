import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!Static334.aBoolean436 || !Static11.aBoolean26) {
			return false;
		} else if (Static170.anInt2918 < 100) {
			return false;
		} else if (Static471.method6762(arg3, arg2, arg0)) {
			@Pc(33) int local33 = arg3 << Static260.anInt4053;
			@Pc(37) int local37 = arg0 << Static260.anInt4053;
			if (Static719.method9571(local33, Static158.aClass133Array4[arg2].method8217(arg3, arg0), local37, Static60.anInt1042, Static60.anInt1042, arg1)) {
				Static558.anInt8804++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method3569() {
		@Pc(9) String local9 = "www";
		if (Static11.aClass386_3 == Static229.aClass386_6) {
			local9 = "www-wtrc";
		} else if (Static229.aClass386_6 == Static114.aClass386_5) {
			local9 = "www-wtqa";
		} else if (Static229.aClass386_6 == Static469.aClass386_9) {
			local9 = "www-wtwip";
		}
		@Pc(46) String local46 = "";
		if (Static601.aString103 != null) {
			local46 = "/p=" + Static601.aString103;
		}
		return "http://" + local9 + "." + Static249.aClass150_6.aString43 + ".com/l=" + Static414.anInt9485 + "/a=" + Static175.anInt10800 + local46 + "/";
	}
}
