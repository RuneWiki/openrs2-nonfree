import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "[I")
	public static int[] anIntArray120;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "[I")
	public static int[] anIntArray121;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IJI)Lclient!sf;")
	public static Class5_Sub1_Sub18 method1827(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class5_Sub1_Sub18 local14 = (Class5_Sub1_Sub18) Static537.aClass306_38.method6943(arg0 | (long) arg1 << 56);
		if (local14 == null) {
			local14 = new Class5_Sub1_Sub18(arg1, arg0);
			Static537.aClass306_38.method6944(local14, local14.aLong312, -12002);
		}
		return local14;
	}
}
