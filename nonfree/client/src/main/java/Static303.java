import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static303 {

	@OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
	public static int anInt5383;

	@OriginalMember(owner = "client!vn", name = "I", descriptor = "Z")
	public static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!vn", name = "K", descriptor = "I")
	public static int anInt5384 = 0;

	@OriginalMember(owner = "client!vn", name = "Q", descriptor = "I")
	public static int anInt5390 = 0;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!nk;)V")
	public static void method4584(@OriginalArg(1) Class121 arg0) {
		Static79.aClass121_44 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZ)V")
	public static void method4585(@OriginalArg(1) boolean arg0) {
		Static29.aBoolean19 = arg0;
		aBoolean363 = !Static278.method4290();
	}
}
