import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!af", name = "b", descriptor = "Lclient!hd;")
	public static Class138 aClass138_1;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!ot;")
	public static Class268 aClass268_1;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!gga;")
	public static Class124 aClass124_5;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "[B")
	public static byte[] aByteArray4;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "[I")
	public static int[] anIntArray3 = null;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)Z")
	public static boolean method157() {
		@Pc(10) Class2_Sub4 local10 = (Class2_Sub4) Static663.aClass271_67.method7177();
		if (local10 == null) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < local10.anInt491; local21++) {
			if (local10.aClass268Array1[local21] != null && local10.aClass268Array1[local21].anInt8008 == 0) {
				return false;
			}
			if (local10.aClass268Array2[local21] != null && local10.aClass268Array2[local21].anInt8008 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIZ)V")
	public static void method158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static96.aByteArrayArrayArray10 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BII)Z")
	public static boolean method159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0xC580) != 0;
	}
}
