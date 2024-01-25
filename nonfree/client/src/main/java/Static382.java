import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!nca", name = "W", descriptor = "[Lclient!cda;")
	public static Class52[] aClass52Array1;

	@OriginalMember(owner = "client!nca", name = "Q", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!nca", name = "X", descriptor = "I")
	public static int anInt6450 = -1;

	@OriginalMember(owner = "client!nca", name = "R", descriptor = "[I")
	public static final int[] anIntArray369 = new int[13];

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5678(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = arg0.length();
		while (local18 < local21 && Static458.method6447(arg0.charAt(local18))) {
			local18++;
		}
		while (local18 < local21 && Static458.method6447(arg0.charAt(local21 - 1))) {
			local21--;
		}
		@Pc(76) int local76 = local21 - local18;
		if (local76 < 1 || local76 > 12) {
			return null;
		}
		@Pc(94) StringBuffer local94 = new StringBuffer(local76);
		for (@Pc(96) int local96 = local18; local96 < local21; local96++) {
			@Pc(104) char local104 = arg0.charAt(local96);
			if (Static66.method1107(local104)) {
				@Pc(112) char local112 = Static122.method1826(local104);
				if (local112 != '\u0000') {
					local94.append(local112);
				}
			}
		}
		if (local94.length() == 0) {
			return null;
		} else {
			return local94.toString();
		}
	}
}
