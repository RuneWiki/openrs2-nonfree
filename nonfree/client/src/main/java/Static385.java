import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "J")
	public static long aLong182 = 0L;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IBI)Z")
	public static boolean method5624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static28.method920(arg1, arg0) || Static179.method2975(arg1, arg0);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)I")
	public static int method5625(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0x73333333) + (local9 & 0x33333333);
		@Pc(31) int local31 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(48) int local48 = local37 + (local37 >>> 16);
		return local48 & 0xFF;
	}
}
