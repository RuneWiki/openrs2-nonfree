import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "J")
	public static long aLong123;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
	public static int anInt5458;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
	public static int anInt5459;

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "[S")
	public static short[] aShortArray82;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[5];

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "J")
	public static long aLong124 = 0L;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	public static void method4510() {
		Static467.aClass298_177 = new Class298();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILclient!pj;)Lclient!pv;")
	public static Class6_Sub40 method4511(@OriginalArg(1) int arg0, @OriginalArg(2) Class248 arg1) {
		@Pc(13) byte[] local13 = arg1.method5795(arg0);
		return local13 == null ? null : new Class6_Sub40(local13);
	}
}
