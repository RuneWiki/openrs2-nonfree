import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	public static int anInt4053;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_10 = new Class118(17);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3686(@OriginalArg(1) String arg0) {
		if (!Static581.aBoolean787 || (Static523.anInt6605 & 0x18) == 0) {
			return;
		}
		@Pc(27) boolean local27 = false;
		@Pc(29) int local29 = Static268.anInt4162;
		@Pc(31) int[] local31 = Static597.anIntArray677;
		for (@Pc(33) int local33 = 0; local33 < local29; local33++) {
			@Pc(41) Class4_Sub2_Sub1_Sub2_Sub1 local41 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local31[local33]];
			if (local41.aString4 != null && local41.aString4.equalsIgnoreCase(arg0) && (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 == local41 && (Static523.anInt6605 & 0x10) != 0 || (Static523.anInt6605 & 0x8) != 0)) {
				@Pc(81) Class2_Sub33 local81 = Static592.method8154(Static296.aClass349_72, Static487.aClass221_2.aClass48_1);
				local81.aClass2_Sub20_Sub2_1.method8551(Static359.anInt5735);
				local81.aClass2_Sub20_Sub2_1.method8550(0);
				local81.aClass2_Sub20_Sub2_1.method8533(3774, local31[local33]);
				local81.aClass2_Sub20_Sub2_1.method8577(Static203.anInt3318);
				local81.aClass2_Sub20_Sub2_1.method8533(3774, Static166.anInt2883);
				Static487.aClass221_2.method5173(local81);
				local27 = true;
				Static633.method8625(-2, local41.method2046(), local41.anIntArray183[0], 0, local41.method2046(), local41.anIntArray182[0], true, 0);
				break;
			}
		}
		if (!local27) {
			Static79.method1194(Static289.aClass191_21.method4067(Static414.anInt9485) + arg0);
		}
		if (Static581.aBoolean787) {
			Static643.method8704();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!oh;)V")
	public static void method3688(@OriginalArg(1) Class273 arg0) {
		@Pc(14) Class273 local14 = Static407.method6010(arg0);
		@Pc(19) int local19;
		@Pc(22) int local22;
		if (local14 == null) {
			local19 = Static151.anInt7983;
			local22 = Static295.anInt4558;
		} else {
			local19 = local14.anInt7402;
			local22 = local14.anInt7385;
		}
		Static490.method7036(local22, false, arg0, local19);
		Static576.method8013(local19, arg0, local22);
	}
}
