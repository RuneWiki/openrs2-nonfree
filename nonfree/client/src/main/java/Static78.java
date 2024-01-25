import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!daa", name = "i", descriptor = "I")
	public static int anInt1665;

	@OriginalMember(owner = "client!daa", name = "m", descriptor = "Lclient!sa;")
	public static Class298 aClass298_2;

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "[J")
	public static final long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "([BB)[B")
	public static byte[] method1611(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static601.method2938(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIILclient!pd;IIIIBIILclient!tl;)V")
	public static void method1613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class247 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class319 arg10) {
		Static56.anInt1228 = arg0;
		Static543.aClass140_3 = null;
		Static508.anInt8641 = arg2;
		Static445.anInt7718 = arg8;
		Static179.anInt7703 = arg1;
		Static496.aClass140_2 = null;
		Static156.anInt3343 = arg9;
		Static63.anInt1291 = arg5;
		Static532.anInt8838 = arg4;
		Static311.aClass247_8 = arg3;
		Static339.aClass319_9 = arg10;
		Static252.anInt2857 = arg7;
		Static202.aClass140_1 = null;
		Static249.anInt4925 = arg6;
		Static474.method7124();
		Static186.aBoolean265 = true;
	}
}
