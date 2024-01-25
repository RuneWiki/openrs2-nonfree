import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	public static int anInt2255;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "Lclient!cla;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!vo;")
	public static Class389 aClass389_3;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_5 = new Class118(50);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILclient!eg;Lclient!eg;)V")
	public static void method1982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub2_Sub3 arg3, @OriginalArg(4) Class4_Sub2_Sub3 arg4) {
		@Pc(4) Class311 local4 = Static582.method8090(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub2_Sub3_2 = arg3;
		local4.aClass4_Sub2_Sub3_1 = arg4;
		@Pc(22) int local22 = Static158.aClass133Array4 == Static685.aClass133Array5 ? 1 : 0;
		if (!arg3.method8970()) {
			arg3.aClass4_Sub2_25 = Static699.aClass4_Sub2Array6[local22];
			Static699.aClass4_Sub2Array6[local22] = arg3;
		} else if (arg3.method8976()) {
			arg3.aClass4_Sub2_25 = Static161.aClass4_Sub2Array1[local22];
			Static161.aClass4_Sub2Array1[local22] = arg3;
		} else {
			arg3.aClass4_Sub2_25 = Static594.aClass4_Sub2Array5[local22];
			Static594.aClass4_Sub2Array5[local22] = arg3;
			Static415.aBoolean615 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8970()) {
			if (arg4.method8976()) {
				arg4.aClass4_Sub2_25 = Static161.aClass4_Sub2Array1[local22];
				Static161.aClass4_Sub2Array1[local22] = arg4;
				return;
			}
			arg4.aClass4_Sub2_25 = Static594.aClass4_Sub2Array5[local22];
			Static594.aClass4_Sub2Array5[local22] = arg4;
			Static415.aBoolean615 = true;
			return;
		}
		arg4.aClass4_Sub2_25 = Static699.aClass4_Sub2Array6[local22];
		Static699.aClass4_Sub2Array6[local22] = arg4;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILclient!ha;III)V")
	public static void method1983(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class145 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if ((Static107.aClass43_3 == null || Static164.aClass43_17 == null || Static539.aClass43_25 == null) && Static117.aClass254_47.method6072(Static164.anInt2783) && Static117.aClass254_47.method6072(Static168.anInt2904) && Static117.aClass254_47.method6072(Static446.anInt7237)) {
			@Pc(41) Class355 local41 = Static737.method8362(Static117.aClass254_47, Static168.anInt2904, 0);
			Static164.aClass43_17 = arg2.method9683(local41, true);
			local41.method8352();
			Static705.aClass43_31 = arg2.method9683(local41, true);
			Static107.aClass43_3 = arg2.method9683(Static737.method8362(Static117.aClass254_47, Static164.anInt2783, 0), true);
			@Pc(66) Class355 local66 = Static737.method8362(Static117.aClass254_47, Static446.anInt7237, 0);
			Static539.aClass43_25 = arg2.method9683(local66, true);
			local66.method8352();
			Static672.aClass43_30 = arg2.method9683(local66, true);
		}
		if (Static107.aClass43_3 == null || Static164.aClass43_17 == null || Static539.aClass43_25 == null) {
			return;
		}
		@Pc(112) int local112 = (arg4 - Static539.aClass43_25.method9601() * 2) / Static107.aClass43_3.method9601();
		for (@Pc(114) int local114 = 0; local114 < local112; local114++) {
			Static107.aClass43_3.method9588(arg0 + Static539.aClass43_25.method9601() + Static107.aClass43_3.method9601() * local114, arg1 + arg3 + -Static107.aClass43_3.method9592());
		}
		@Pc(158) int local158 = (arg1 - Static539.aClass43_25.method9592() - 20) / Static164.aClass43_17.method9592();
		for (@Pc(160) int local160 = 0; local160 < local158; local160++) {
			Static164.aClass43_17.method9588(arg0, local160 * Static164.aClass43_17.method9592() + arg3 + 20);
			Static705.aClass43_31.method9588(arg0 + arg4 - Static705.aClass43_31.method9601(), arg3 - -20 + Static164.aClass43_17.method9592() * local160);
		}
		Static539.aClass43_25.method9588(arg0, arg3 + arg1 - Static539.aClass43_25.method9592());
		Static672.aClass43_30.method9588(arg0 + arg4 - Static539.aClass43_25.method9601(), -Static539.aClass43_25.method9592() + (arg3 - -arg1));
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z")
	public static boolean method1985(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)I")
	public static int method1986() {
		@Pc(5) Class85 local5 = Static650.aClass85_66;
		synchronized (Static650.aClass85_66) {
			return Static650.aClass85_66.method1738();
		}
	}
}
