import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "[Lclient!f;")
	public static Class3[] aClass3Array4;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_27 = new Class242("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method1650(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(22) int local22 = arg0.length();
		while (local11 < local22 && Static106.method1668(arg0.charAt(local11))) {
			local11++;
		}
		while (local22 > local11 && Static106.method1668(arg0.charAt(local22 - 1))) {
			local22--;
		}
		@Pc(60) int local60 = local22 - local11;
		if (local60 < 1 || local60 > 12) {
			return null;
		}
		@Pc(75) StringBuffer local75 = new StringBuffer(local60);
		for (@Pc(77) int local77 = local11; local77 < local22; local77++) {
			@Pc(83) char local83 = arg0.charAt(local77);
			if (Static132.method1938(local83)) {
				@Pc(91) char local91 = Static10.method290(local83);
				if (local91 != '\u0000') {
					local75.append(local91);
				}
			}
		}
		if (local75.length() == 0) {
			return null;
		} else {
			return local75.toString();
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIZI)I")
	public static int method1651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class4_Sub39 local8 = Static195.method2229(arg1, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray588.length) {
			return local8.anIntArray588[arg0];
		} else {
			return 0;
		}
	}
}
