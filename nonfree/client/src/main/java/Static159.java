import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "[F")
	public static float[] aFloatArray64 = new float[4];

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "[S")
	public static short[] aShortArray126 = new short[256];

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString375 = "Loaded config";

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([BIII)I")
	public static int method4855(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg1; local9++) {
			local7 = Class172.anIntArray591[(local7 ^ arg0[local9]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)V")
	public static void method4859(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub3_Sub9 local13 = Static43.method2329(2, arg0);
		local13.method1519();
	}
}
