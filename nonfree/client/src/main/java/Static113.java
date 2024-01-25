import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
	public static int anInt2651;

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_82 = new Class34("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
	public static int anInt2650 = 0;

	@OriginalMember(owner = "client!hk", name = "E", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_83 = new Class34("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");

	@OriginalMember(owner = "client!hk", name = "F", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_84 = new Class34("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!wo;Lclient!wo;B)I")
	public static int method2450(@OriginalArg(0) Class216 arg0, @OriginalArg(1) Class216 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method5651(Static337.anInt6460)) {
			local5++;
		}
		if (arg1.method5651(Static86.anInt2149)) {
			local5++;
		}
		if (arg1.method5651(Static27.anInt999)) {
			local5++;
		}
		if (arg0.method5651(Static337.anInt6460)) {
			local5++;
		}
		if (arg0.method5651(Static86.anInt2149)) {
			local5++;
		}
		if (arg0.method5651(Static27.anInt999)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
	public static void method2451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub4_Sub9 local8 = Static139.method4227(arg1, 16);
		local8.method1869();
		local8.anInt2142 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)V")
	public static void method2452(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub4_Sub9 local12 = Static139.method4227(arg0, 5);
		local12.method1868();
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
	public static void method2453() {
		Static287.aClass87_50.method2477();
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)V")
	public static void method2454() {
		Static342.aClass1_Sub8_Sub1_7.anInt5182 = 0;
		Static53.anInt1593 = -1;
		Static324.anInt6225 = 0;
		Static5.anInt197 = -1;
		Static85.anInt5393 = 0;
		Static311.aClass1_Sub8_Sub1_8.anInt5182 = 0;
		Static107.anInt2548 = -1;
		Static74.anInt1958 = -1;
		Static314.anInt6117 = 0;
		Static234.method4276();
		Static200.method3812();
		for (@Pc(31) int local31 = 0; local31 < Static102.aClass17_Sub1_Sub1_Sub1Array1.length; local31++) {
			if (Static102.aClass17_Sub1_Sub1_Sub1Array1[local31] != null) {
				Static102.aClass17_Sub1_Sub1_Sub1Array1[local31].anInt4829 = -1;
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static140.aClass17_Sub1_Sub1_Sub2Array1.length; local54++) {
			if (Static140.aClass17_Sub1_Sub1_Sub2Array1[local54] != null) {
				Static140.aClass17_Sub1_Sub1_Sub2Array1[local54].anInt4829 = -1;
			}
		}
		Static144.method2870();
		Static147.anInt3204 = 1;
		Static232.method4269(30);
		for (@Pc(79) int local79 = 0; local79 < 100; local79++) {
			Static223.aBooleanArray28[local79] = true;
		}
		Static64.method1564();
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(Z)V")
	public static void method2456() {
		Static324.aClass87_58.method2477();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ki;Z)V")
	public static void method2457(@OriginalArg(0) Class17_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class17_Sub1_Sub1_Sub2) {
			@Pc(19) Class17_Sub1_Sub1_Sub2 local19 = (Class17_Sub1_Sub1_Sub2) arg0;
			if (local19.aClass213_1 != null) {
				Static202.method3830(local19);
			}
		} else if (arg0 instanceof Class17_Sub1_Sub1_Sub1) {
			Static232.method4271((Class17_Sub1_Sub1_Sub1) arg0);
		} else {
			return;
		}
	}
}
