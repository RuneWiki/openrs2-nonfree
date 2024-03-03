import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "I")
	public static int anInt1462;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "[Lclient!nk;")
	public static Class161[] aClass161Array1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!kb;III[Z)Z", line = 4)
	public static boolean method1621(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static340.aClass6Array4 != Static174.aClass6Array2) {
			@Pc(11) int local11 = Static307.aClass6Array3[arg1].method5729(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class6 local18 = Static307.aClass6Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method5729(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method5732(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method5726(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 47)
	public static void method1622() {
		if (Class152.anInt3791 == 2) {
			Class208.anInt5790 = 96;
			return;
		}
		try {
			@Pc(29) Method local29 = Runtime.class.getMethod("maxMemory");
			if (local29 != null) {
				try {
					@Pc(33) Runtime local33 = Runtime.getRuntime();
					@Pc(39) Long local39 = (Long) local29.invoke(local33, (Object[]) null);
					Class208.anInt5790 = (int) (local39 / 1048576L) + 1;
					return;
				} catch (@Pc(49) Throwable local49) {
					return;
				}
			}
		} catch (@Pc(51) Exception local51) {
			return;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIII)V", line = 93)
	public static void method1624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 >= Class25_Sub1.anInt675 && Class61.anInt1835 >= arg1 && arg2 >= Class2_Sub40.anInt6819 && arg0 <= Class2_Sub20.anInt2951) {
			Static365.method6457(arg1, arg4, arg2, arg0, arg3);
		} else {
			Static161.method3285(arg3, arg1, arg0, arg2, arg4);
		}
	}
}
