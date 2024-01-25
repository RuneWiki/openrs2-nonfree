import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gfa", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIZ)I")
	public static int method2702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static132.anIntArray117[arg0 & 0x3] : Static639.anIntArray586[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V")
	public static void method2703() {
		@Pc(9) Class281 local9 = null;
		try {
			@Pc(15) Class297 local15 = Static150.aClass202_2.method4733("");
			while (local15.anInt8459 == 0) {
				Static127.method1985(1L);
			}
			if (local15.anInt8459 == 1) {
				local9 = (Class281) local15.anObject15;
				@Pc(41) Class5_Sub15 local41 = Static655.aClass5_Sub36_29.method5352();
				local9.method6892(local41.anInt4144, 0, local41.aByteArray45);
			}
		} catch (@Pc(51) Exception local51) {
		}
		try {
			if (local9 != null) {
				local9.method6893();
			}
		} catch (@Pc(58) Exception local58) {
		}
	}
}
