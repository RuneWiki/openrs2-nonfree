import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
	public static int anInt6473;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_106 = new Class37(8);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method5564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 >= Static60.anInt1399 && Static138.anInt6334 >= arg6 && Static60.anInt1399 <= arg3 && Static138.anInt6334 >= arg3 && Static60.anInt1399 <= arg7 && Static138.anInt6334 >= arg7 && arg8 >= Static60.anInt1399 && Static138.anInt6334 >= arg8 && Static41.anInt1131 <= arg1 && Static165.anInt3409 >= arg1 && arg0 >= Static41.anInt1131 && Static165.anInt3409 >= arg0 && arg5 >= Static41.anInt1131 && arg5 <= Static165.anInt3409 && Static41.anInt1131 <= arg4 && Static165.anInt3409 >= arg4) {
			Static182.method3229(arg1, arg6, arg5, arg2, arg3, arg8, arg0, arg4, arg7);
		} else {
			Static345.method5773(arg4, arg7, arg0, arg3, arg5, arg6, arg2, arg1, arg8);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method5566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(22) int local22 = arg2[local12 + arg0] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(40) char local40 = Static185.aCharArray3[local22 - 128];
					if (local40 == '\u0000') {
						local40 = '?';
					}
					local22 = local40;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}
}
