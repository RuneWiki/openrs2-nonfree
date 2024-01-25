import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!efa", name = "Vc", descriptor = "I")
	public static int anInt2386 = -1;

	@OriginalMember(owner = "client!efa", name = "Rc", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_43 = new Class225(81, 9);

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2067(@OriginalArg(1) String arg0) {
		return Static48.aHashtable1.containsKey(arg0);
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(IIILjava/lang/Class;)Lclient!kg;")
	public static Class4_Sub2_Sub1 method2072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class311 local7 = Static632.aClass311ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(15) Class142 local15 = local7.aClass142_2; local15 != null; local15 = local15.aClass142_1) {
			@Pc(19) Class4_Sub2_Sub1 local19 = local15.aClass4_Sub2_Sub1_1;
			if (arg3.isAssignableFrom(local19.getClass()) && local19.aShort130 == arg1 && local19.aShort127 == arg2) {
				return local19;
			}
		}
		return null;
	}
}
