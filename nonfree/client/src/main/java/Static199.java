import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
	public static int anInt4021 = 0;

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "[I")
	public static final int[] anIntArray345 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V")
	public static void method3713() {
		Static227.aClass11_94.method213();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BZ)I")
	public static int method3714(@OriginalArg(1) boolean arg0) {
		@Pc(6) long local6 = Static168.method3300();
		for (@Pc(18) Class14_Sub38 local18 = arg0 ? (Class14_Sub38) Static279.aClass25_28.method697() : (Class14_Sub38) Static279.aClass25_28.method694(); local18 != null; local18 = (Class14_Sub38) Static279.aClass25_28.method694()) {
			if (local6 > (local18.aLong206 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local18.aLong206 & 0x4000000000000000L) != 0L) {
					@Pc(43) int local43 = (int) local18.aLong217;
					Static102.anIntArray211[local43] = Static86.anIntArray191[local43];
					local18.method5986();
					return local43;
				}
				local18.method5986();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([BB)[B")
	public static byte[] method3716(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = new byte[arg0.length];
			Static358.method769(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}
}
