import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static197 {

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21;

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
	public static int anInt3815;

	@OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
	public static int anInt3818;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(ZI)I")
	public static int method3005(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(BI)Z")
	public static boolean method3007(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < Static257.aBooleanArray23.length ? Static257.aBooleanArray23[arg0] : false;
	}
}
