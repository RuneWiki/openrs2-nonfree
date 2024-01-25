import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "[I")
	public static int[] anIntArray784;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "[I")
	public static int[] anIntArray785;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Lclient!aq;")
	public static Class5 aClass5_16;

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
	public static int anInt6520;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "Z")
	public static boolean aBoolean487 = false;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public static void method5584() {
		for (@Pc(7) int local7 = 0; local7 < Static244.aByteArrayArrayArray4.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static244.aByteArrayArrayArray4[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static244.aByteArrayArrayArray4[0][0].length; local15++) {
					Static244.aByteArrayArrayArray4[local7][local11][local15] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I[B)[B")
	public static byte[] method5585(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static406.method5656(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
