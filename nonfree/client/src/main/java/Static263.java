import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "S")
	public static short aShort93 = 320;

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "Lclient!ip;")
	public static final Class111 aClass111_12 = new Class111("", 13);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZII)I")
	public static int method5519(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg1;
		}
		@Pc(17) int local17 = 128 - arg2;
		@Pc(31) int local31 = arg2 * (arg0 & 0x7F) + local17 * (arg1 & 0x7F) >> 7;
		@Pc(50) int local50 = local17 * (arg1 & 0x380) + arg2 * (arg0 & 0x380) >> 7;
		@Pc(64) int local64 = arg2 * (arg0 & 0xFC00) + (arg1 & 0xFC00) * local17 >> 7;
		return local31 & 0x7F | local50 & 0x380 | local64 & 0xFC00;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)I")
	public static int method5521(@OriginalArg(1) int arg0) {
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
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}
}
