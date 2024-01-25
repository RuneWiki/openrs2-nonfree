import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
	public static int anInt816;

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
	public static int anInt817;

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_16 = new Class156(76, 0);

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
	public static int anInt815 = 2;

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString9 = null;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	public static void method855() {
		Static612.aClass168_88.method3862();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method856(@OriginalArg(0) Class100 arg0) {
		if (Static116.aBoolean570) {
			Static672.method9137(arg0);
		} else {
			Static540.method7416(arg0);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!uo;)I")
	public static int method857(@OriginalArg(1) Class5_Sub1_Sub20 arg0) {
		@Pc(14) String local14 = Static468.method6604(arg0);
		return Static73.aClass196_5.method4558(Static67.aClass155Array3, local14);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!wq;B)V")
	public static void method858(@OriginalArg(0) Class5_Sub36 arg0) {
		@Pc(9) int local9 = arg0.method7306();
		Static382.aClass52Array1 = new Class52[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static382.aClass52Array1[local14] = new Class52();
			Static382.aClass52Array1[local14].anInt1022 = arg0.method7306();
			Static382.aClass52Array1[local14].aString10 = arg0.method7275();
		}
		Static13.anInt166 = arg0.method7306();
		Static470.anInt7634 = arg0.method7306();
		Static41.anInt698 = arg0.method7306();
		Static186.aClass51_Sub1Array1 = new Class51_Sub1[Static470.anInt7634 + 1 - Static13.anInt166];
		for (@Pc(76) int local76 = 0; local76 < Static41.anInt698; local76++) {
			@Pc(86) int local86 = arg0.method7306();
			@Pc(94) Class51_Sub1 local94 = Static186.aClass51_Sub1Array1[local86] = new Class51_Sub1();
			local94.anInt3946 = arg0.method7291();
			local94.anInt3944 = arg0.method7268();
			local94.anInt3950 = Static13.anInt166 + local86;
			local94.aString36 = arg0.method7275();
			local94.aString37 = arg0.method7275();
		}
		Static24.anInt331 = arg0.method7268();
		Static189.aBoolean250 = true;
	}
}
