import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static20 {

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "Lclient!gi;")
	public static final Class85 aClass85_9 = new Class85(16);

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
	public static int anInt6289 = 0;

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "[I")
	public static final int[] anIntArray384 = new int[4];

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)Z")
	public static boolean method5174() {
		return Static230.aClass35_2 != Static80.aClass35_1 || Static300.anInt5196 >= 2;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5179(@OriginalArg(0) String arg0) {
		System.exit(1);
	}
}
