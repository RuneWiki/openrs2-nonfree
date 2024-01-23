import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array29 = new Class78[1000];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZI)I")
	public static int method2977(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class2_Sub26 local6 = (Class2_Sub26) Static48.aClass103_6.method3659((long) arg1);
		if (local6 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local6.anIntArray602.length; local23++) {
				if (local6.anIntArray605[local23] == arg0) {
					local21 += local6.anIntArray602[local23];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
	public static int method2978(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
