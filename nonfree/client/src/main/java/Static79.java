import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "[Lclient!dk;")
	public static Class50_Sub1[] aClass50_Sub1Array1 = new Class50_Sub1[0];

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "Lclient!ka;")
	public static final Class133 aClass133_1 = new Class133();

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "Lclient!pr;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!i;III[Z)Z")
	public static boolean method1162(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static410.aClass125Array3 != Static408.aClass125Array2) {
			@Pc(11) int local11 = Static110.aClass125Array1[arg1].ca(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class125 local18 = Static110.aClass125Array1[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.ca(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method4991(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.H(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!sg;I)V")
	public static void method1163(@OriginalArg(0) Class88_Sub5 arg0) {
		arg0.aClass2_Sub1_Sub3_1 = null;
		if (Static231.anInt3827 < 20) {
			Static45.aClass107_2.method2332(arg0);
			Static231.anInt3827++;
		}
	}
}
