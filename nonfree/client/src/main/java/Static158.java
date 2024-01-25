import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "[I")
	public static int[] anIntArray134;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!mw;")
	public static final Class1_Sub3_Sub1 aClass1_Sub3_Sub1_2 = new Class1_Sub3_Sub1(7500);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method2592(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static549.anInt9183 >= 100) {
			Static193.method3073(Static375.aClass253_43.method5453(Static161.anInt3095));
			return;
		}
		@Pc(25) String local25 = Static583.method7816(arg1);
		if (local25 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(35) int local35 = 0; local35 < Static549.anInt9183; local35++) {
			@Pc(43) String local43 = Static583.method7816(Static149.aStringArray3[local35]);
			if (local43 != null && local43.equals(local25)) {
				Static193.method3073(arg1 + Static375.aClass253_44.method5453(Static161.anInt3095));
				return;
			}
			if (Static314.aStringArray18[local35] != null) {
				local74 = Static583.method7816(Static314.aStringArray18[local35]);
				if (local74 != null && local74.equals(local25)) {
					Static193.method3073(arg1 + Static375.aClass253_44.method5453(Static161.anInt3095));
					return;
				}
			}
		}
		for (@Pc(105) int local105 = 0; local105 < Static99.anInt1760; local105++) {
			local74 = Static583.method7816(Static187.aStringArray6[local105]);
			if (local74 != null && local74.equals(local25)) {
				Static193.method3073(Static375.aClass253_49.method5453(Static161.anInt3095) + arg1 + Static375.aClass253_50.method5453(Static161.anInt3095));
				return;
			}
			if (Static527.aStringArray36[local105] != null) {
				@Pc(149) String local149 = Static583.method7816(Static527.aStringArray36[local105]);
				if (local149 != null && local149.equals(local25)) {
					Static193.method3073(Static375.aClass253_49.method5453(Static161.anInt3095) + arg1 + Static375.aClass253_50.method5453(Static161.anInt3095));
					return;
				}
			}
		}
		if (Static583.method7816(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aString35).equals(local25)) {
			Static193.method3073(Static375.aClass253_46.method5453(Static161.anInt3095));
			return;
		}
		@Pc(203) Class1_Sub9 local203 = Static123.method2194(Static469.aClass235_2, Static294.aClass208_67);
		local203.aClass1_Sub3_Sub1_1.method7917(Static331.method4899(arg1) + 1);
		local203.aClass1_Sub3_Sub1_1.method7920(arg1);
		local203.aClass1_Sub3_Sub1_1.method7917(arg0 ? 1 : 0);
		Static42.method746(local203);
	}
}
