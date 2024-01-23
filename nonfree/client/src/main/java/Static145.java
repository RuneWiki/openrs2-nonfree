import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!k", name = "z", descriptor = "Lclient!en;")
	public static Class44 aClass44_18 = new Class44();

	@OriginalMember(owner = "client!k", name = "H", descriptor = "Lclient!sf;")
	public static Class157 aClass157_27 = new Class157(64);

	@OriginalMember(owner = "client!k", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[112];

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)I")
	public static int method2548(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZII)I")
	public static int method2549(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 >> 31 & arg0 - 1;
		return local13 + ((arg1 >>> 31) + arg1) % arg0;
	}
}
