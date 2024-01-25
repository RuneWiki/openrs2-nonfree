import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static189 {

	@OriginalMember(owner = "client!gba", name = "H", descriptor = "I")
	public static int anInt3684;

	@OriginalMember(owner = "client!gba", name = "K", descriptor = "Lclient!on;")
	public static Class267 aClass267_1;

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(BII)Z")
	public static boolean method3159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static228.method3553(arg1, arg0) & ((arg1 & 0x2000) != 0 | Static97.method1947(arg0, arg1) | Static302.method4800(arg0, arg1));
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIILclient!ck;I)Lclient!rc;")
	public static Class80_Sub2_Sub1 method3161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class65_Sub1 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean103 || Static111.method4954(arg4) && Static111.method4954(arg0)) {
			return new Class80_Sub2_Sub1(arg3, 3553, arg1, arg2, arg4, arg0, true);
		} else if (arg3.aBoolean99) {
			return new Class80_Sub2_Sub1(arg3, 34037, arg1, arg2, arg4, arg0, true);
		} else {
			return new Class80_Sub2_Sub1(arg3, arg1, arg2, arg4, arg0, Static67.method917(arg4), Static67.method917(arg0), true);
		}
	}
}
