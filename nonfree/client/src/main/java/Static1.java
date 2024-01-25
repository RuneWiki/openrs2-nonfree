import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!nca;")
	public static Class254 aClass254_144;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	public static final int anInt9139 = 1409;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "[I")
	public static final int[] anIntArray668 = new int[25];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[I[Ljava/lang/String;)V")
	public static void method8061(@OriginalArg(1) int[] arg0, @OriginalArg(2) String[] arg1) {
		Static444.method6504(arg1.length - 1, arg0, 0, arg1);
	}
}
