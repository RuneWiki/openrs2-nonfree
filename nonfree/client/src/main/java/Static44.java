import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static44 {

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "Lclient!kda;")
	public static Class160 aClass160_9;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
	public static int anInt1390 = 2;

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIB)Z")
	public static boolean method1398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
