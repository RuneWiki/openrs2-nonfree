import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "Lclient!ir;")
	public static Class100 aClass100_80;

	@OriginalMember(owner = "client!lf", name = "T", descriptor = "Lclient!ir;")
	public static Class100 aClass100_81;

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "Ljava/lang/String;")
	public static final String aString146 = "glow3:";

	@OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
	public static int anInt3791 = 0;

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
	public static int anInt3793 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method2989(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static63.method1015(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static63.method1015(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(45) int local45 = local14 - local11;
		if (local45 < 1 || local45 > 12) {
			return null;
		}
		@Pc(60) StringBuffer local60 = new StringBuffer(local45);
		for (@Pc(67) int local67 = local11; local67 < local14; local67++) {
			@Pc(73) char local73 = arg0.charAt(local67);
			if (Static329.method5374(local73)) {
				@Pc(81) char local81 = Static129.method2221(local73);
				if (local81 != '\u0000') {
					local60.append(local81);
				}
			}
		}
		if (local60.length() == 0) {
			return null;
		} else {
			return local60.toString();
		}
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
	public static void method2991() {
		@Pc(9) Class198 local9 = Static216.aClass198_40;
		synchronized (Static216.aClass198_40) {
			Static216.aClass198_40.method5236();
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(III)V")
	public static void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static60.aClass198_16 = new Class198(arg0);
		Static4.aClass198_3 = new Class198(arg1);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method2994(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg1.indexOf(arg0); local14 != -1; local14 = arg1.indexOf(arg0, local14 + arg2.length())) {
			arg1 = arg1.substring(0, local14) + arg2 + arg1.substring(arg0.length() + local14);
		}
		return arg1;
	}
}
