import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "Lclient!eh;")
	private static Class28 aClass28_225 = Static170.method3101("Service unavailable)3");

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "Lclient!eh;")
	public static Class28 aClass28_222 = aClass28_225;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "Lclient!eh;")
	private static Class28 aClass28_224 = Static170.method3101("glow3:");

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "Lclient!eh;")
	public static Class28 aClass28_223 = aClass28_224;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "Lclient!eh;")
	public static Class28 aClass28_226 = aClass28_224;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "Lclient!eh;")
	private static Class28 aClass28_228 = Static170.method3101("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "[B")
	public static byte[] aByteArray7 = new byte[520];

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "Lclient!eh;")
	public static Class28 aClass28_229 = aClass28_228;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
	public static void method590() {
		aClass28_229 = null;
		aClass28_222 = null;
		aClass28_224 = null;
		aClass28_225 = null;
		aClass28_223 = null;
		aClass28_226 = null;
		aByteArray7 = null;
		aClass28_228 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II[BI)I")
	public static int method591(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg2; local7 < arg0; local7++) {
			local5 = local5 >>> 8 ^ Canvas_Sub1.anIntArray466[(arg1[local7] ^ local5) & 0xFF];
		}
		return ~local5;
	}
}
