import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_161 = new Class208(3, 6);

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "Z")
	public static boolean aBoolean401 = false;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!hg;IBILclient!rg;ILclient!ab;)V")
	public static void method4826(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class27 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class3 arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static198.anInt4108 == 4) {
			local16 = (int) Static350.aFloat74 & 0x3FFF;
		} else {
			local16 = (int) Static350.aFloat74 + Static319.anInt5841 & 0x3FFF;
		}
		@Pc(42) int local42 = Math.max(arg6.anInt64 / 2, arg6.anInt116 / 2) + 10;
		@Pc(51) int local51 = arg0 * arg0 + arg2 * arg2;
		if (local42 * local42 < local51) {
			return;
		}
		@Pc(65) int local65 = Class106.anIntArray240[local16];
		@Pc(69) int local69 = Class106.anIntArray242[local16];
		if (Static198.anInt4108 != 4) {
			local65 = local65 * 256 / (Static59.anInt1283 + 256);
			local69 = local69 * 256 / (Static59.anInt1283 + 256);
		}
		@Pc(98) int local98 = local69 * arg0 + arg2 * local65 >> 15;
		@Pc(109) int local109 = local69 * arg2 - local65 * arg0 >> 15;
		arg4.method5335(local98 + arg6.anInt64 / 2 + arg3 - arg4.method5317() / 2, arg5 - -(arg6.anInt116 / 2) + -local109 + -(arg4.method5328() / 2), arg1, arg3, arg5);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I[S[Ljava/lang/String;)V")
	public static void method4829(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static290.method4767(arg1.length - 1, 0, arg0, arg1);
	}
}
