import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!mia", name = "m", descriptor = "I")
	public static int anInt6689 = 104;

	@OriginalMember(owner = "client!mia", name = "f", descriptor = "I")
	public static int anInt6690 = 765;

	@OriginalMember(owner = "client!mia", name = "g", descriptor = "I")
	public static int anInt6697 = 503;

	@OriginalMember(owner = "client!mia", name = "l", descriptor = "I")
	public static int anInt6702 = 0;

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method5852(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(24) int local24 = local6 + 3 & 0xFFFFFFFC;
		@Pc(30) int local30 = local24 / 4 * 3;
		if (local24 - 2 >= local6 || Static376.method7669(arg0.charAt(local24 - 2)) == -1) {
			local30 -= 2;
		} else if (local24 - 1 >= local6 || Static376.method7669(arg0.charAt(local24 - 1)) == -1) {
			local30--;
		}
		@Pc(81) byte[] local81 = new byte[local30];
		Static327.method5105(arg0, 0, local81);
		return local81;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(BI)V")
	public static void method5854(@OriginalArg(1) int arg0) {
		if (Static558.method8063(arg0)) {
			Static370.method5551(-1, Static339.aClass299ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(III)V")
	public static void method5855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static644.anInt10590 = arg1 - Static224.anInt1291;
		Static19.anInt249 = arg0 - Static224.anInt1292;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lclient!qga;B)Ljava/lang/String;")
	public static String method5856(@OriginalArg(0) Class299 arg0) {
		if (Static80.method1360(arg0).method482() == 0) {
			return null;
		} else if (arg0.aString97 == null || arg0.aString97.trim().length() == 0) {
			return Static123.aBoolean140 ? "Hidden-use" : null;
		} else {
			return arg0.aString97;
		}
	}
}
