import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(III)Z")
	public static boolean method6946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(II)I")
	public static int method6947(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(24) int local24 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCE) >>> 2);
		@Pc(32) int local32 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(43) int local43 = local32 + (local32 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}
