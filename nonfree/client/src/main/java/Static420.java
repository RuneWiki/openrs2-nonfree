import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
	public static int anInt7829;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_127 = new Class67("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!ada;")
	public static Class6_Sub1 method6482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class290 local7 = Static279.aClass290ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class98 local14 = local7.aClass98_3; local14 != null; local14 = local14.aClass98_1) {
			@Pc(18) Class6_Sub1 local18 = local14.aClass6_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort123 == arg1 && local18.aShort120 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
