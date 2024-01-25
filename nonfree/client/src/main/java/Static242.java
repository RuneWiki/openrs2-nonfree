import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "Lclient!wm;")
	public static Class390 aClass390_56;

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "S")
	public static short aShort40 = 32767;

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "(I)Lclient!kj;")
	public static Class5_Sub36 method3778() {
		if (Static330.aClass114_6 == null || Static475.aClass47_1 == null) {
			return null;
		}
		for (@Pc(16) Class5_Sub36 local16 = (Class5_Sub36) Static475.aClass47_1.method746(); local16 != null; local16 = (Class5_Sub36) Static475.aClass47_1.method746()) {
			@Pc(23) Class103 local23 = Static330.aClass93_3.method2280(local16.anInt5984);
			if (local23 != null && local23.aBoolean235 && local23.method2499(Static330.anInterface2_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BII)Z")
	public static boolean method3781(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static653.method8768(arg1, arg0) | (arg0 & 0x2000) != 0 | Static651.method8725(arg1, arg0)) & Static585.method8038(arg1, arg0);
	}
}
