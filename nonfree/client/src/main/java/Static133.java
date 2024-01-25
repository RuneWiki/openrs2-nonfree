import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!j", name = "w", descriptor = "[I")
	public static int[] anIntArray263;

	@OriginalMember(owner = "client!j", name = "G", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!j", name = "D", descriptor = "Lclient!hq;")
	public static Class87 aClass87_27 = new Class87(64);

	@OriginalMember(owner = "client!j", name = "O", descriptor = "I")
	public static int anInt2962 = 0;

	@OriginalMember(owner = "client!j", name = "S", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_95 = new Class34("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!j", name = "T", descriptor = "I")
	public static int anInt2966 = 0;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
	public static void method2747() {
		@Pc(1) Class87 local1 = Static248.aClass87_43;
		synchronized (Static248.aClass87_43) {
			Static248.aClass87_43.method2485();
		}
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(B)V")
	public static void method2748() {
		@Pc(9) Class87 local9 = Static22.aClass87_44;
		synchronized (Static22.aClass87_44) {
			Static22.aClass87_44.method2485();
		}
		local9 = Static337.aClass87_61;
		synchronized (Static337.aClass87_61) {
			Static337.aClass87_61.method2485();
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)Lclient!vq;")
	public static Class213 method2749(@OriginalArg(0) int arg0) {
		@Pc(5) Class87 local5 = Static332.aClass87_60;
		@Pc(14) Class213 local14;
		synchronized (Static332.aClass87_60) {
			local14 = (Class213) Static332.aClass87_60.method2482((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static327.aClass216_94.method5648(Static311.method5177(arg0), Static224.method4191(arg0));
		local14 = new Class213();
		local14.anInt6512 = arg0;
		if (local34 != null) {
			local14.method5482(new Class1_Sub8(local34));
		}
		local14.method5479();
		@Pc(63) Class87 local63 = Static332.aClass87_60;
		synchronized (Static332.aClass87_60) {
			Static332.aClass87_60.method2481(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!uo;ILclient!wo;Lclient!wo;)V")
	public static void method2751(@OriginalArg(0) Class32 arg0, @OriginalArg(2) Class216 arg1, @OriginalArg(3) Class216 arg2) {
		Static26.aClass63_2 = Static7.method272(Static337.anInt6460, arg2);
		Static56.aClass9_2 = arg0.method2199(Static26.aClass63_2, Static366.method2659(arg1, Static337.anInt6460));
		Static195.aClass63_5 = Static7.method272(Static86.anInt2149, arg2);
		Static212.aClass9_3 = arg0.method2199(Static195.aClass63_5, Static366.method2659(arg1, Static86.anInt2149));
		Static90.aClass63_3 = Static7.method272(Static27.anInt999, arg2);
		Static49.aClass9_1 = arg0.method2199(Static90.aClass63_3, Static366.method2659(arg1, Static27.anInt999));
	}
}
