import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "Lclient!ha;")
	public static Class12 aClass12_15;

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "Lclient!us;")
	public static final Class295 aClass295_4 = new Class295();

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "[I")
	public static final int[] anIntArray488 = new int[25];

	@OriginalMember(owner = "client!paa", name = "e", descriptor = "I")
	public static int anInt6490 = -50;

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
	public static int anInt6491 = 0;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5639(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		while (local9 < local12 && Static23.method1018(arg0.charAt(local9))) {
			local9++;
		}
		while (local9 < local12 && Static23.method1018(arg0.charAt(local12 - 1))) {
			local12--;
		}
		@Pc(45) int local45 = local12 - local9;
		if (local45 < 1 || local45 > 12) {
			return null;
		}
		@Pc(62) StringBuffer local62 = new StringBuffer(local45);
		for (@Pc(64) int local64 = local9; local64 < local12; local64++) {
			@Pc(69) char local69 = arg0.charAt(local64);
			if (Static370.method4018(local69)) {
				@Pc(77) char local77 = Static406.method6081(local69);
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
}
