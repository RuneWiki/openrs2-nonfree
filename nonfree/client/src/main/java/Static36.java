import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bg", name = "E", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
	public static int anInt695;

	@OriginalMember(owner = "client!bg", name = "F", descriptor = "Lclient!hp;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!bg", name = "O", descriptor = "Lclient!fq;")
	public static final Class104 aClass104_2 = new Class104(7, 0, 1, 1);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method716(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static409.anInt6024 >= 200 && !Static518.aBoolean849 || Static409.anInt6024 >= 200) {
			Static496.method7251(Static287.aClass176_10.method4986(Static380.anInt7247));
			local30 = Static287.aClass176_11.method4986(Static380.anInt7247);
			if (local30 != null) {
				Static496.method7251(local30);
			}
			return;
		}
		local30 = Static629.method8529(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(89) String local89;
		for (@Pc(50) int local50 = 0; local50 < Static409.anInt6024; local50++) {
			@Pc(58) String local58 = Static629.method8529(Static573.aStringArray40[local50]);
			if (local58 != null && local58.equals(local30)) {
				Static496.method7251(arg0 + Static287.aClass176_38.method4986(Static380.anInt7247));
				return;
			}
			if (Static175.aStringArray16[local50] != null) {
				local89 = Static629.method8529(Static175.aStringArray16[local50]);
				if (local89 != null && local89.equals(local30)) {
					Static496.method7251(arg0 + Static287.aClass176_38.method4986(Static380.anInt7247));
					return;
				}
			}
		}
		for (@Pc(120) int local120 = 0; local120 < Static644.anInt10532; local120++) {
			local89 = Static629.method8529(Static615.aStringArray41[local120]);
			if (local89 != null && local89.equals(local30)) {
				Static496.method7251(Static287.aClass176_43.method4986(Static380.anInt7247) + arg0 + Static287.aClass176_44.method4986(Static380.anInt7247));
				return;
			}
			if (Static228.aStringArray20[local120] != null) {
				@Pc(164) String local164 = Static629.method8529(Static228.aStringArray20[local120]);
				if (local164 != null && local164.equals(local30)) {
					Static496.method7251(Static287.aClass176_43.method4986(Static380.anInt7247) + arg0 + Static287.aClass176_44.method4986(Static380.anInt7247));
					return;
				}
			}
		}
		if (Static629.method8529(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aString68).equals(local30)) {
			Static496.method7251(Static287.aClass176_41.method4986(Static380.anInt7247));
		} else {
			@Pc(218) Class3_Sub26 local218 = Static640.method8636(Static439.aClass344_92, Static403.aClass294_3);
			local218.aClass3_Sub15_Sub1_3.method8448(Static139.method3132(arg0));
			local218.aClass3_Sub15_Sub1_3.method8417(arg0);
			Static472.method5189(local218);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(CZ)Z")
	public static boolean method718(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method720(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
