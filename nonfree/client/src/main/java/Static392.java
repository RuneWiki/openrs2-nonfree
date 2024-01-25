import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!tp", name = "D", descriptor = "S")
	public static short aShort86 = 1;

	@OriginalMember(owner = "client!tp", name = "G", descriptor = "I")
	public static int anInt6294 = 0;

	@OriginalMember(owner = "client!tp", name = "Y", descriptor = "I")
	public static int anInt6303 = 765;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "([Ljava/lang/String;IZI)Ljava/lang/String;")
	public static String method5246(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(16) String local16 = arg0[arg1];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(27) int local27 = arg1 + arg2;
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = arg1; local31 < local27; local31++) {
				@Pc(36) String local36 = arg0[local31];
				if (local36 == null) {
					local29 += 4;
				} else {
					local29 += local36.length();
				}
			}
			@Pc(59) StringBuffer local59 = new StringBuffer(local29);
			for (@Pc(61) int local61 = arg1; local61 < local27; local61++) {
				@Pc(66) String local66 = arg0[local61];
				if (local66 == null) {
					local59.append("null");
				} else {
					local59.append(local66);
				}
			}
			return local59.toString();
		}
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)Z")
	public static boolean method5250() {
		if (Static189.aBoolean208) {
			try {
				Static463.method2376("showVideoAd", Static77.aClass180_1.anApplet1);
				return true;
			} catch (@Pc(25) Throwable local25) {
			}
		}
		return false;
	}
}
