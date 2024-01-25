import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
	public static int anInt2476 = -1;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBII)V")
	public static void method2083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class304 local9 = Static610.aClass304ArrayArray1[arg0][arg2];
		Static234.method3550(local9 == null ? Static543.aClass304_2 : local9, arg1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
	public static boolean method2084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static204.method7912(arg0, arg1) || Static226.method5385(arg0, arg1);
	}
}
