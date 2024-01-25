import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!te", name = "Y", descriptor = "Lclient!ec;")
	public static Class58 aClass58_35 = new Class58(64);

	@OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
	public static int anInt5969 = 1;

	@OriginalMember(owner = "client!te", name = "db", descriptor = "Z")
	public static boolean aBoolean399 = true;

	@OriginalMember(owner = "client!te", name = "eb", descriptor = "[I")
	public static final int[] anIntArray487 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V")
	public static void method5129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class106 local7 = Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class67_Sub1 local13 = local7.aClass67_Sub1_1;
		@Pc(16) Class67_Sub1 local16 = local7.aClass67_Sub1_2;
		if (local13 != null) {
			local13.anInt5255 = local13.anInt5255 * arg3 / 16;
			local13.anInt5247 = local13.anInt5247 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt5255 = local16.anInt5255 * arg3 / 16;
			local16.anInt5247 = local16.anInt5247 * arg3 / 16;
		}
	}
}
