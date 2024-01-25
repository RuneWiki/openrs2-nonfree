import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!r", name = "H", descriptor = "[J")
	public static final long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!dh;ZI)V")
	public static void method4325(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (Static58.aClass173_2 == null) {
			return;
		}
		try {
			Static58.aClass173_2.method3440(0L);
			Static58.aClass173_2.method3445(24, arg0.aByteArray64, arg1);
		} catch (@Pc(19) Exception local19) {
		}
	}
}
