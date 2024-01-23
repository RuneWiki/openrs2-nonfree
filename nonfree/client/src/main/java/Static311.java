import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "[I")
	public static int[] anIntArray531;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean426 = true;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "[S")
	public static short[] aShortArray92 = new short[] { 40, 38, 18, 33, 43, 24, 41, 6 };

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "[I")
	public static int[] anIntArray532 = new int[32];

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
	public static int anInt5846 = 255;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "Z")
	public static boolean aBoolean427 = true;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Lclient!sm;")
	public static Class164 method4589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class164 local14 = local7.aClass164_1;
			local7.aClass164_1 = null;
			return local14;
		}
	}
}
