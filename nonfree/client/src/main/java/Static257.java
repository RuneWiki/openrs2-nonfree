import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIJ)Lclient!fk;")
	public static Class5_Sub2_Sub4 method3597(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(19) Class5_Sub2_Sub4 local19 = (Class5_Sub2_Sub4) Static365.aClass335_28.method7766(arg1 | (long) arg0 << 56);
		if (local19 == null) {
			local19 = new Class5_Sub2_Sub4(arg0, arg1);
			Static365.aClass335_28.method7770(local19.aLong329, local19);
		}
		return local19;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)Z")
	public static boolean method3598() {
		return Static374.method6479("jaclib") ? Static374.method6479("hw3d") : false;
	}
}
