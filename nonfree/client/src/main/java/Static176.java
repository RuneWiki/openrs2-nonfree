import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "[[Lclient!vv;")
	public static Class11_Sub1[][] aClass11_Sub1ArrayArray1;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
	public static int anInt3262 = -60;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!hd;IZ)V")
	public static void method2782(@OriginalArg(0) Class130 arg0, @OriginalArg(1) int arg1) {
		if (Static494.aBoolean622) {
			arg1 = 0;
			Static494.aBoolean622 = false;
		}
		if (Static516.aClass130_2 != null && Static516.aClass130_2.method3010(arg0)) {
			return;
		}
		Static516.aClass130_2 = arg0;
		Static350.aLong157 = Static480.method6650();
		Static2.anInt65 = arg1;
		Static394.anInt6985 = arg1;
		if (Static394.anInt6985 == 0) {
			Static535.method5754();
			return;
		}
		Static580.aFloat242 = Static382.aFloat244;
		Static138.aFloat81 = Static180.aFloat239;
		Static563.aFloat236 = Static194.aFloat101;
		Static367.aClass209_5 = Static14.aClass209_1;
		Static523.anInt7894 = Static258.anInt4718;
		Static412.aFloat187 = Static360.aFloat209;
		Static169.aFloat89 = Static387.aFloat184;
		Static265.anInt4872 = Static379.anInt6760;
		Static281.anInt5188 = Static100.anInt1766;
		Static349.aFloat176 = Static354.aFloat177;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)Z")
	public static boolean method2783(@OriginalArg(0) int arg0) {
		if (arg0 == 8 || arg0 == 19 || arg0 == 16 || arg0 == 60 || arg0 == 25) {
			return true;
		} else {
			return arg0 == 44 || arg0 == 1006;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2784(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static99.anInt1760 >= 200 && !Static111.aBoolean123 || Static99.anInt1760 >= 200) {
			Static193.method3073(Static375.aClass253_14.method5453(Static161.anInt3095));
			local30 = Static375.aClass253_15.method5453(Static161.anInt3095);
			if (local30 != null) {
				Static193.method3073(local30);
			}
			return;
		}
		local30 = Static583.method7816(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(92) String local92;
		for (@Pc(53) int local53 = 0; local53 < Static99.anInt1760; local53++) {
			@Pc(61) String local61 = Static583.method7816(Static187.aStringArray6[local53]);
			if (local61 != null && local61.equals(local30)) {
				Static193.method3073(arg0 + Static375.aClass253_42.method5453(Static161.anInt3095));
				return;
			}
			if (Static527.aStringArray36[local53] != null) {
				local92 = Static583.method7816(Static527.aStringArray36[local53]);
				if (local92 != null && local92.equals(local30)) {
					Static193.method3073(arg0 + Static375.aClass253_42.method5453(Static161.anInt3095));
					return;
				}
			}
		}
		for (@Pc(119) int local119 = 0; local119 < Static549.anInt9183; local119++) {
			local92 = Static583.method7816(Static149.aStringArray3[local119]);
			if (local92 != null && local92.equals(local30)) {
				Static193.method3073(Static375.aClass253_47.method5453(Static161.anInt3095) + arg0 + Static375.aClass253_48.method5453(Static161.anInt3095));
				return;
			}
			if (Static314.aStringArray18[local119] != null) {
				@Pc(165) String local165 = Static583.method7816(Static314.aStringArray18[local119]);
				if (local165 != null && local165.equals(local30)) {
					Static193.method3073(Static375.aClass253_47.method5453(Static161.anInt3095) + arg0 + Static375.aClass253_48.method5453(Static161.anInt3095));
					return;
				}
			}
		}
		if (Static583.method7816(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aString35).equals(local30)) {
			Static193.method3073(Static375.aClass253_45.method5453(Static161.anInt3095));
		} else {
			@Pc(219) Class1_Sub9 local219 = Static123.method2194(Static469.aClass235_2, Static132.aClass208_31);
			local219.aClass1_Sub3_Sub1_1.method7917(Static331.method4899(arg0));
			local219.aClass1_Sub3_Sub1_1.method7920(arg0);
			Static42.method746(local219);
		}
	}
}
