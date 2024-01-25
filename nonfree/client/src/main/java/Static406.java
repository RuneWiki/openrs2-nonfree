import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIB)Z")
	public static boolean method5635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)I")
	public static int method5636(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local9 & 0x33333333) + (local9 >>> 2 & 0xB3333333);
		@Pc(32) int local32 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(50) int local50 = local38 + (local38 >>> 16);
		return local50 & 0xFF;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)I")
	public static int method5637() {
		return Static341.method2573(false);
	}
}
