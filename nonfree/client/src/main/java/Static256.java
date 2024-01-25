import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!iia", name = "F", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!iia", name = "y", descriptor = "I")
	public static int anInt4715 = 0;

	@OriginalMember(owner = "client!iia", name = "B", descriptor = "Lclient!fca;")
	public static Class114 aClass114_27 = new Class114();

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3991(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static253.anInt4604 >= 200 && !Static289.aBoolean488 || Static253.anInt4604 >= 200) {
			Static491.method7052(Static64.aClass52_11.method907(Static544.anInt8937));
			return;
		}
		@Pc(30) String local30 = Static79.method1039(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(75) String local75;
		for (@Pc(35) int local35 = 0; local35 < Static253.anInt4604; local35++) {
			@Pc(42) String local42 = Static79.method1039(Static326.aStringArray31[local35]);
			if (local42 != null && local42.equals(local30)) {
				Static491.method7052(arg0 + Static64.aClass52_38.method907(Static544.anInt8937));
				return;
			}
			if (Static558.aStringArray43[local35] != null) {
				local75 = Static79.method1039(Static558.aStringArray43[local35]);
				if (local75 != null && local75.equals(local30)) {
					Static491.method7052(arg0 + Static64.aClass52_38.method907(Static544.anInt8937));
					return;
				}
			}
		}
		for (@Pc(106) int local106 = 0; local106 < Static264.anInt4921; local106++) {
			local75 = Static79.method1039(Static593.aStringArray55[local106]);
			if (local75 != null && local75.equals(local30)) {
				Static491.method7052(Static64.aClass52_43.method907(Static544.anInt8937) + arg0 + Static64.aClass52_44.method907(Static544.anInt8937));
				return;
			}
			if (Static650.aStringArray57[local106] != null) {
				@Pc(151) String local151 = Static79.method1039(Static650.aStringArray57[local106]);
				if (local151 != null && local151.equals(local30)) {
					Static491.method7052(Static64.aClass52_43.method907(Static544.anInt8937) + arg0 + Static64.aClass52_44.method907(Static544.anInt8937));
					return;
				}
			}
		}
		if (Static79.method1039(Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aString45).equals(local30)) {
			Static491.method7052(Static64.aClass52_41.method907(Static544.anInt8937));
		} else {
			@Pc(211) Class5_Sub21 local211 = Static64.method905(Static263.aClass49_1, Static314.aClass305_48);
			local211.aClass5_Sub41_Sub2_1.method7798(Static314.method4952(arg0));
			local211.aClass5_Sub41_Sub2_1.method7854(arg0);
			Static495.method7092(local211);
		}
	}
}
