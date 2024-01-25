import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "I")
	public static int anInt122;

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "Lclient!cf;")
	public static final Class51 aClass51_1 = new Class51();

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "I")
	public static int anInt121 = 0;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method120(@OriginalArg(1) String arg0) {
		if (Class3_Sub6_Sub26.aString220.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class3_Sub6_Sub26.aString220.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class3_Sub6_Sub26.aString220.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!iaa;")
	public static Class25_Sub2_Sub2 method122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class333 local7 = Static189.aClass333ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class147 local14 = local7.aClass147_3; local14 != null; local14 = local14.aClass147_2) {
			@Pc(18) Class25_Sub2_Sub2 local18 = local14.aClass25_Sub2_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort106 == arg1 && local18.aShort107 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
