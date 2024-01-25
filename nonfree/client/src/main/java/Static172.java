import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "([BIZI)I")
	public static int method2993(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = -1;
		for (@Pc(12) int local12 = arg1; local12 < arg2; local12++) {
			local10 = Class345.anIntArray673[(arg0[local12] ^ local10) & 0xFF] ^ local10 >>> 8;
		}
		return ~local10;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)V")
	public static void method2994(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static188.method3210(11, arg0);
		local8.method923();
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(BI)I")
	public static int method2995(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
