import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!nba", name = "u", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_78 = new Class67("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!nba", name = "x", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_90 = new Class133(5, -2);

	@OriginalMember(owner = "client!nba", name = "J", descriptor = "I")
	public static int anInt5230 = 0;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4376(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static210.method3875("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "(Z)V")
	public static void method4377() {
		Static36.anInt940 = -1;
		Static312.anInt6059 = 1;
		if (Static482.aString81 == null) {
			Static442.method6681(35);
		} else {
			@Pc(20) Class3_Sub27 local20 = new Class3_Sub27(Static443.method6715(Static515.method7365(Static482.aString81)));
			@Pc(24) long local24 = local20.method7555();
			Static209.aLong116 = local20.method7555();
			Static434.method6593(true, "", Static190.method3578(local24));
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Ljava/lang/String;ILclient!rt;)I")
	public static int method4378(@OriginalArg(0) String arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		@Pc(6) int local6 = arg1.anInt9191;
		@Pc(10) byte[] local10 = Static357.method5594(arg0);
		arg1.method7588(local10.length);
		arg1.anInt9191 += Static117.aClass13_1.method634(arg1.aByteArray114, local10.length, 0, arg1.anInt9191, local10);
		return arg1.anInt9191 - local6;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIB)Z")
	public static boolean method4379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static504.method7750(arg1, arg0)) {
			return Static225.method4080(arg1, arg0) | (arg1 & 0xB000) != 0 | Static268.method4692(arg0, arg1) ? true : (arg0 & 0x37) == 0 & (Static191.method3679(arg1, arg0) | Static409.method6183(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "(Z)V")
	public static void method4381() {
		if (Static512.anInt8932 == 2) {
			Static333.method5283(3);
		} else if (Static512.anInt8932 == 6) {
			Static333.method5283(7);
		} else if (Static512.anInt8932 == 9) {
			Static333.method5283(10);
		}
	}
}
