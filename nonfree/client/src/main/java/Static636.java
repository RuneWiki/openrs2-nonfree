import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "[Lclient!td;")
	public static Class24[] aClass24Array21;

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "[I")
	public static final int[] anIntArray660 = new int[5];

	@OriginalMember(owner = "client!wo", name = "v", descriptor = "[I")
	public static final int[] anIntArray661 = new int[64];

	@OriginalMember(owner = "client!wo", name = "y", descriptor = "I")
	public static final int anInt10159 = 1339;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)I")
	public static int method8709(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}
}
