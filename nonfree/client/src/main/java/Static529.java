import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_196 = new Class200(34, 6);

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public static int anInt8507 = 7000;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	public static int anInt8509 = anInt8507;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_197 = new Class200(35, 28);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZIZIIIII)V")
	public static void method7326(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static305.aClass2_Sub49_15.aClass33_Sub9_5.method3103() != 0 && arg3 != 0 && Static110.anInt2383 < 50 && arg4 != -1) {
			Static301.aClass301Array1[Static110.anInt2383++] = new Class301((byte) 2, arg4, arg3, arg2, arg1, arg5, arg0, (Class16_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method7327(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		while (local9 < local12 && Static262.method4327(arg0.charAt(local9))) {
			local9++;
		}
		while (local12 > local9 && Static262.method4327(arg0.charAt(local12 - 1))) {
			local12--;
		}
		@Pc(45) int local45 = local12 - local9;
		if (local45 < 1 || local45 > 12) {
			return null;
		}
		@Pc(62) StringBuffer local62 = new StringBuffer(local45);
		for (@Pc(64) int local64 = local9; local64 < local12; local64++) {
			@Pc(69) char local69 = arg0.charAt(local64);
			if (Static101.method1942(local69)) {
				@Pc(77) char local77 = Static354.method5316(local69);
				if (local77 != '\u0000') {
					local62.append(local77);
				}
			}
		}
		if (local62.length() == 0) {
			return null;
		} else {
			return local62.toString();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)Z")
	public static boolean method7328(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
