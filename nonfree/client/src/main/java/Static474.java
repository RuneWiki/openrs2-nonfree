import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!qaa", name = "A", descriptor = "Z")
	public static boolean aBoolean613;

	@OriginalMember(owner = "client!qaa", name = "g", descriptor = "(I)Lclient!sp;")
	public static Class171 method6819() {
		try {
			return (Class171) Class.forName("Class171_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class171_Sub1();
		}
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(III)Lclient!tc;")
	public static Class23_Sub2_Sub5 method6820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class247 local7 = Static332.aClass247ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass23_Sub2_Sub5_2;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZIII)I")
	public static int method6821(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class3_Sub29 local16 = Static577.method7771(arg0, arg1);
		if (local16 == null) {
			return -1;
		} else if (arg2 >= 0 && arg2 < local16.anIntArray353.length) {
			return local16.anIntArray353[arg2];
		} else {
			return -1;
		}
	}
}
