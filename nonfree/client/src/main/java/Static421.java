import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!og", name = "Wg", descriptor = "F")
	public static float aFloat144;

	@OriginalMember(owner = "client!og", name = "eh", descriptor = "I")
	public static int anInt7443;

	@OriginalMember(owner = "client!og", name = "Tg", descriptor = "I")
	public static int anInt7434 = 0;

	@OriginalMember(owner = "client!og", name = "ni", descriptor = "[Lclient!nfa;")
	public static final Interface18[] anInterface18Array2 = new Interface18[75];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6406(@OriginalArg(1) String arg0) {
		if (Static151.aClass273Array5 != null) {
			@Pc(22) Class5_Sub16 local22 = Static455.method6717(Static146.aClass187_37, Static16.aClass332_8);
			local22.aClass5_Sub15_Sub2_1.method3651(Static467.method6904(arg0));
			local22.aClass5_Sub15_Sub2_1.method3680(arg0);
			Static479.method7038(local22);
		}
	}

	@OriginalMember(owner = "client!og", name = "m", descriptor = "(Z)V")
	public static void method6408() {
		Static428.method6456();
		Static322.aClass378ArrayArray1 = null;
		Static189.aClass11_2 = null;
		Static96.aClass143_3 = null;
		Static176.aClass11_1 = null;
		Static403.aClass11_3 = null;
	}

	@OriginalMember(owner = "client!og", name = "H", descriptor = "(B)V")
	public static void method6414() {
		Static634.anInt10113 = -1;
		Static162.aClass56_11 = null;
		Static371.aClass143_7 = null;
		Static617.anInt9945 = -1;
		Static368.anInterface2Array1 = null;
		Static448.aClass56_10 = null;
		Static171.anInt2824 = -1;
		Static348.anIntArray433 = null;
		Static288.anInt4507 = -1;
		Static150.anInterface2_1 = null;
		Static563.aClass56_13 = null;
		Static559.aClass89_3.method1907();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!wq;Lclient!ha;)V")
	public static void method6415(@OriginalArg(1) Class394 arg0, @OriginalArg(2) Class143 arg1) {
		@Pc(31) boolean local31 = Static259.aClass135_1.method2778(arg0.aBoolean784 ? Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1 : null, arg0.anInt10445, arg1, arg0.anInt10504, arg0.anInt10522, arg0.anInt10452 | 0xFF000000, arg0.anInt10469) == null;
		if (local31) {
			Static614.aClass124_100.method2574(new Class5_Sub55(arg0.anInt10469, arg0.anInt10522, arg0.anInt10445, arg0.anInt10452 | 0xFF000000, arg0.anInt10504, arg0.aBoolean784));
			Static609.method8190(arg0);
		}
	}
}
