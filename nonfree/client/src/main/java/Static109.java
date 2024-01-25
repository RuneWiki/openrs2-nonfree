import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
	public static int anInt1838;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_23 = new Class208(49, 5);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)I")
	public static int method1799(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
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
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)I")
	public static int method1801() {
		return Static39.anInt646;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(IZ)I")
	public static int method1802(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
