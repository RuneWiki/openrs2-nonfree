import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
	public static int anInt5589;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "Lclient!wu;")
	public static Class380 aClass380_85;

	@OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
	public static int anInt5604;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
	public static int anInt5597 = 0;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_193 = new Class288(43, 12);

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "Lclient!nga;")
	public static Class2_Sub32 aClass2_Sub32_5 = null;

	@OriginalMember(owner = "client!jg", name = "z", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_72 = new Class179(51, 3);

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ww;ILclient!ww;)V")
	public static void method4769(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0.aClass2_Sub2_66 != null) {
			arg0.method8271();
		}
		arg0.aClass2_Sub2_67 = arg1;
		arg0.aClass2_Sub2_66 = arg1.aClass2_Sub2_66;
		arg0.aClass2_Sub2_66.aClass2_Sub2_67 = arg0;
		arg0.aClass2_Sub2_67.aClass2_Sub2_66 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4770(@OriginalArg(1) String arg0) {
		if (!Static8.aBoolean11 || (Static241.anInt3917 & 0x18) == 0) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = Static580.anInt9430;
		@Pc(18) int[] local18 = Static6.anIntArray9;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(28) Class13_Sub1_Sub1_Sub1_Sub2 local28 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local18[local20]];
			if (local28.aString50 != null && local28.aString50.equalsIgnoreCase(arg0) && (local28 == Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 && (Static241.anInt3917 & 0x10) != 0 || local28 != null && (Static241.anInt3917 & 0x8) != 0)) {
				@Pc(61) Class2_Sub40 local61 = Static464.method6285(Static251.aClass131_1, Static163.aClass179_41);
				local61.aClass2_Sub22_Sub2_2.method8490(Static301.anInt4926);
				local61.aClass2_Sub22_Sub2_2.method8495(Static620.anInt9955);
				local61.aClass2_Sub22_Sub2_2.method8501(0);
				local61.aClass2_Sub22_Sub2_2.method8495(local18[local20]);
				local61.aClass2_Sub22_Sub2_2.method8495(Static558.anInt9109);
				Static528.method7295(local61);
				local14 = true;
				Static563.method7723(0, local28.method3950(), local28.anIntArray306[0], local28.method3950(), 0, true, local28.anIntArray307[0], -2);
				break;
			}
		}
		if (!local14) {
			Static3.method8592(Static434.aClass271_21.method5972(Static483.anInt7694) + arg0);
		}
		if (Static8.aBoolean11) {
			Static618.method8289();
		}
	}
}
