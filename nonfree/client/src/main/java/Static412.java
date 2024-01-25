import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
	public static int anInt6646;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)I")
	public static int method5521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + local21;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZIIII)Z")
	public static boolean method5522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static2.aByteArrayArrayArray1[0][arg0][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static2.aByteArrayArrayArray1[arg1][arg0][arg3] & 0x10) == 0) {
			return Static297.method4283(arg3, arg0, arg1) == arg2;
		} else {
			return false;
		}
	}
}
