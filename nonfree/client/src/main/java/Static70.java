import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cm", name = "x", descriptor = "[Lclient!eca;")
	public static final Class2_Sub5_Sub5[] aClass2_Sub5_Sub5Array3 = new Class2_Sub5_Sub5[14];

	@OriginalMember(owner = "client!cm", name = "A", descriptor = "Z")
	public static boolean aBoolean136 = true;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I")
	public static int method1354() {
		return Static340.anIntArray413 == null ? 0 : Static340.anIntArray413.length * 2;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1355(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		while (local9 < local12 && Static116.method2407(arg0.charAt(local9))) {
			local9++;
		}
		while (local12 > local9 && Static116.method2407(arg0.charAt(local12 - 1))) {
			local12--;
		}
		@Pc(44) int local44 = local12 - local9;
		if (local44 < 1 || local44 > 12) {
			return null;
		}
		@Pc(61) StringBuffer local61 = new StringBuffer(local44);
		for (@Pc(63) int local63 = local9; local63 < local12; local63++) {
			@Pc(74) char local74 = arg0.charAt(local63);
			if (Static458.method6675(local74)) {
				@Pc(82) char local82 = Static238.method3939(local74);
				if (local82 != '\u0000') {
					local61.append(local82);
				}
			}
		}
		if (local61.length() == 0) {
			return null;
		} else {
			return local61.toString();
		}
	}
}
