import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "Z")
	public static boolean aBoolean156 = false;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(III)Lclient!ht;")
	public static Class6_Sub4_Sub6 method1408(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class6_Sub4_Sub6 local23 = (Class6_Sub4_Sub6) Static98.aClass305_13.method7447((long) arg0 << 32 | (long) arg1);
		if (local23 == null) {
			local23 = new Class6_Sub4_Sub6(arg0, arg1);
			Static98.aClass305_13.method7448(local23.aLong252, local23);
		}
		return local23;
	}
}
