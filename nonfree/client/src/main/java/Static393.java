import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "Lclient!xa;")
	public static Class4 aClass4_22;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "[I")
	public static final int[] anIntArray565 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V")
	public static void method5813() {
		Static137.aClass332_64.method7512();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)Lclient!bg;")
	public static Class29_Sub1 method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class9 local7 = Static208.aClass9ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass29_Sub1_1;
	}
}
