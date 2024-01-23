import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
	public static int anInt6028;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
	public static int anInt6025 = 0;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
	public static int anInt6026 = 0;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
	public static int anInt6027 = 0;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "Lclient!cn;")
	public static Class30 aClass30_32 = new Class30(16);

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString231 = "scroll:";

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Z")
	public static boolean method4932(@OriginalArg(1) int arg0) {
		if (Static230.aBooleanArray107[arg0]) {
			return true;
		} else if (Static277.aClass155_114.method4146(arg0)) {
			@Pc(24) int local24 = Static277.aClass155_114.method4131(arg0);
			if (local24 == 0) {
				Static230.aBooleanArray107[arg0] = true;
				return true;
			}
			if (Static96.aClass151ArrayArray1[arg0] == null) {
				Static96.aClass151ArrayArray1[arg0] = new Class151[local24];
			}
			for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
				if (Static96.aClass151ArrayArray1[arg0][local44] == null) {
					@Pc(65) byte[] local65 = Static277.aClass155_114.method4121(arg0, local44);
					if (local65 != null) {
						@Pc(78) Class151 local78 = Static96.aClass151ArrayArray1[arg0][local44] = new Class151();
						local78.anInt4800 = (arg0 << 16) + local44;
						if (local65[0] == -1) {
							local78.method4010(new Class3_Sub26(local65));
						} else {
							local78.method3999(new Class3_Sub26(local65));
						}
					}
				}
			}
			Static230.aBooleanArray107[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
