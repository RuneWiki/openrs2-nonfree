import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
	public static int anInt4462;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "Lclient!tn;")
	public static final Class339 aClass339_6 = new Class339(1);

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!hd;")
	public static Class28_Sub1_Sub4 method3771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class226 local7 = Static635.aClass226ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class41 local14 = local7.aClass41_3; local14 != null; local14 = local14.aClass41_2) {
			@Pc(18) Class28_Sub1_Sub4 local18 = local14.aClass28_Sub1_Sub4_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort124 == arg1 && local18.aShort121 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
