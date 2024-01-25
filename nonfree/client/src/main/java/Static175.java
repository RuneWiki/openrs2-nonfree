import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public static void method3077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class41_Sub7 local7 = new Class41_Sub7();
		local7.anInt8364 = arg0;
		local7.anInt8371 = Static506.anInt8251 + arg2;
		local7.aString80 = arg4;
		local7.anInt8372 = arg6;
		local7.anInt8366 = arg1;
		local7.anInt8365 = arg5;
		local7.anInt8367 = arg3;
		Static82.aClass178_21.method4166(local7);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B[BII)[B")
	public static byte[] method3078(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) byte[] local10;
		if (arg2 > 0) {
			local10 = new byte[arg1];
			for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
				local10[local12] = arg0[local12 + arg2];
			}
		} else {
			local10 = arg0;
		}
		@Pc(34) Class101 local34 = new Class101();
		local34.method2847();
		local34.method2846(local10, (long) (arg1 * 8));
		@Pc(48) byte[] local48 = new byte[64];
		local34.method2849(local48);
		return local48;
	}
}
