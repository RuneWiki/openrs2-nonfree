import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static204 {

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "[I")
	public static final int[] anIntArray327 = new int[13];

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "Z")
	public static boolean aBoolean320 = true;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "Z")
	public static boolean aBoolean321 = false;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!bw;II)V")
	public static void method3661(@OriginalArg(0) Class3_Sub11_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static348.anInt6099 = 0;
		Static179.aBoolean278 = false;
		Static95.method524(arg0);
		Static473.method6501(arg0);
		if (Static179.aBoolean278) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt3520 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt3520 + " psize:" + arg1);
		}
	}
}
