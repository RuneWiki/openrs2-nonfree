import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "[Lclient!tr;")
	public static Class110[] aClass110Array9;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
	public static int anInt4200 = 0;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "Lclient!us;")
	public static final Class234 aClass234_86 = new Class234(13, 6);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!tm;III[Z)Z")
	public static boolean method3892(@OriginalArg(0) Class3_Sub7_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static337.aClass7Array3 != Static25.aClass7Array1) {
			@Pc(11) int local11 = Static89.aClass7Array4[arg1].method5638(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class7 local18 = Static89.aClass7Array4[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method5638(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method5643(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method5642(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method3893(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static196.anInt5194 >= 100) {
			Static166.method5554(Static86.aClass57_33.method1122(Static66.anInt1307));
			return;
		}
		@Pc(29) String local29 = Static231.method3842(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(34) int local34 = 0; local34 < Static196.anInt5194; local34++) {
			@Pc(42) String local42 = Static231.method3842(Static152.aStringArray23[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static166.method5554(arg0 + Static63.aClass57_24.method1122(Static66.anInt1307));
				return;
			}
			if (Static295.aStringArray36[local34] != null) {
				local74 = Static231.method3842(Static295.aStringArray36[local34]);
				if (local74 != null && local74.equals(local29)) {
					Static166.method5554(arg0 + Static63.aClass57_24.method1122(Static66.anInt1307));
					return;
				}
			}
		}
		for (@Pc(104) int local104 = 0; local104 < Static351.anInt3266; local104++) {
			local74 = Static231.method3842(Static244.aStringArray28[local104]);
			if (local74 != null && local74.equals(local29)) {
				Static166.method5554(Static38.aClass57_18.method1122(Static66.anInt1307) + arg0 + Static242.aClass57_68.method1122(Static66.anInt1307));
				return;
			}
			if (Static275.aStringArray33[local104] != null) {
				@Pc(149) String local149 = Static231.method3842(Static275.aStringArray33[local104]);
				if (local149 != null && local149.equals(local29)) {
					Static166.method5554(Static38.aClass57_18.method1122(Static66.anInt1307) + arg0 + Static242.aClass57_68.method1122(Static66.anInt1307));
					return;
				}
			}
		}
		if (Static231.method3842(Static226.aClass28_Sub1_Sub1_Sub2_2.aString51).equals(local29)) {
			Static166.method5554(Static95.aClass57_94.method1122(Static66.anInt1307));
		} else {
			Static229.method3783(Static331.aClass244_77);
			Static23.aClass3_Sub5_Sub1_1.method2791(Static269.method4260(arg0) + 1);
			Static23.aClass3_Sub5_Sub1_1.method2768(arg0);
			Static23.aClass3_Sub5_Sub1_1.method2791(arg1 ? 1 : 0);
		}
	}
}
