import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bl", name = "X", descriptor = "Lclient!uu;")
	public static Class250 aClass250_13;

	@OriginalMember(owner = "client!bl", name = "eb", descriptor = "Z")
	public static boolean aBoolean29;

	@OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
	public static int anInt543 = 0;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method547(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static39.method638(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static39.method638(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(64) StringBuffer local64 = new StringBuffer(local49);
		for (@Pc(66) int local66 = local11; local66 < local14; local66++) {
			@Pc(72) char local72 = arg0.charAt(local66);
			if (Static361.method5051(local72)) {
				@Pc(82) char local82 = Static264.method3660(local72);
				if (local82 != '\u0000') {
					local64.append(local82);
				}
			}
		}
		if (local64.length() == 0) {
			return null;
		} else {
			return local64.toString();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[S)[S")
	public static short[] method550(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static466.method209(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
