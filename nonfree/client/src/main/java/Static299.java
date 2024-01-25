import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!ss", name = "M", descriptor = "[I")
	public static int[] anIntArray107;

	@OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
	private static int anInt1385;

	@OriginalMember(owner = "client!ss", name = "P", descriptor = "Z")
	private static boolean aBoolean134;

	@OriginalMember(owner = "client!ss", name = "Q", descriptor = "I")
	private static int anInt1386;

	@OriginalMember(owner = "client!ss", name = "R", descriptor = "I")
	private static int anInt1387;

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_31 = new Class34("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
	public static int anInt1377 = 0;

	@OriginalMember(owner = "client!ss", name = "providesignlink", descriptor = "(Lclient!nh;)V")
	private static void method994(@OriginalArg(0) Class143 arg0) {
		Static15.aClass143_1 = arg0;
		Static263.aClass143_5 = arg0;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZII[Ljava/lang/String;)Ljava/lang/String;")
	public static String method1000(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(24) String local24 = arg2[arg0];
			return local24 == null ? "null" : local24.toString();
		} else {
			@Pc(35) int local35 = arg1 + arg0;
			@Pc(37) int local37 = 0;
			for (@Pc(39) int local39 = arg0; local39 < local35; local39++) {
				@Pc(45) String local45 = arg2[local39];
				if (local45 == null) {
					local37 += 4;
				} else {
					local37 += local45.length();
				}
			}
			@Pc(64) StringBuffer local64 = new StringBuffer(local37);
			for (@Pc(66) int local66 = arg0; local66 < local35; local66++) {
				@Pc(72) String local72 = arg2[local66];
				if (local72 == null) {
					local64.append("null");
				} else {
					local64.append(local72);
				}
			}
			return local64.toString();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZBI)V")
	public static void method1004(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class1_Sub19 local14 = Static274.method4804(arg1, arg0);
		if (local14 != null) {
			local14.method5628();
		}
	}

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "(I)Lclient!kb;")
	public static Class112 method1008() {
		try {
			return (Class112) Class.forName("Class112_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)V")
	public static void method1010() {
		Static239.anInt4960 = -1;
		Static97.aClass5_25 = null;
	}
}
