import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "Lclient!kw;")
	public static Class178 aClass178_13;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(II)I")
	public static int method6277(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local12 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local12 += 8;
		}
		if (arg0 >= 16) {
			local12 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local12 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local12++;
		}
		return local12 + arg0;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IILclient!ik;)Lclient!hw;")
	public static Class169 method6278(@OriginalArg(0) int arg0, @OriginalArg(2) Class182 arg1) {
		@Pc(14) byte[] local14 = arg1.method3961(arg0);
		return local14 == null ? null : new Class169(local14);
	}
}
