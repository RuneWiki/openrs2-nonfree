import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
	public static int anInt3051;

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "J")
	public static long aLong86 = 0L;

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "Lclient!ri;")
	public static final Class303 aClass303_3 = new Class303();

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "Z")
	public static boolean aBoolean216 = false;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)I")
	public static int method2668(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}
}
