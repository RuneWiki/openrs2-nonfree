import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
	public static int anInt3157 = 0;

	@OriginalMember(owner = "client!nc", name = "cb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1036 = Static49.method1293("blinken3:");

	@OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
	public static int anInt3162 = 0;

	@OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
	public static int anInt3168 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!gg;IILclient!fa;)V")
	public static void method2331(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub9 arg2) {
		@Pc(9) Class1_Sub18 local9 = new Class1_Sub18();
		local9.anInt3056 = arg2.method1234();
		local9.anInt3057 = arg2.method1273();
		local9.anIntArray297 = new int[local9.anInt3056];
		local9.aClass18Array1 = new Class18[local9.anInt3056];
		local9.aClass18Array2 = new Class18[local9.anInt3056];
		local9.anIntArray299 = new int[local9.anInt3056];
		local9.aByteArrayArrayArray7 = new byte[local9.anInt3056][][];
		local9.anIntArray298 = new int[local9.anInt3056];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt3056; local55++) {
			try {
				@Pc(61) int local61 = arg2.method1234();
				@Pc(95) String local95;
				@Pc(106) String local106;
				@Pc(110) int local110;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local95 = new String(arg2.method1253().method2926());
					local110 = 0;
					local106 = new String(arg2.method1253().method2926());
					if (local61 == 1) {
						local110 = arg2.method1273();
					}
					local9.anIntArray298[local55] = local61;
					local9.anIntArray297[local55] = local110;
					local9.aClass18Array2[local55] = arg0.method1480(Static8.method245(local95), local106);
				} else if (local61 == 3 || local61 == 4) {
					local95 = new String(arg2.method1253().method2926());
					local106 = new String(arg2.method1253().method2926());
					local110 = arg2.method1234();
					@Pc(113) String[] local113 = new String[local110];
					for (@Pc(115) int local115 = 0; local115 < local110; local115++) {
						local113[local115] = new String(arg2.method1253().method2926());
					}
					@Pc(137) byte[][] local137 = new byte[local110][];
					@Pc(150) int local150;
					if (local61 == 3) {
						for (@Pc(142) int local142 = 0; local142 < local110; local142++) {
							local150 = arg2.method1273();
							local137[local142] = new byte[local150];
							arg2.method1241(local137[local142], local150);
						}
					}
					@Pc(172) Class[] local172 = new Class[local110];
					local9.anIntArray298[local55] = local61;
					for (local150 = 0; local150 < local110; local150++) {
						local172[local150] = Static8.method245(local113[local150]);
					}
					local9.aClass18Array1[local55] = arg0.method1478(local172, Static8.method245(local95), local106);
					local9.aByteArrayArrayArray7[local55] = local137;
				}
			} catch (@Pc(270) ClassNotFoundException local270) {
				local9.anIntArray299[local55] = -1;
			} catch (@Pc(277) SecurityException local277) {
				local9.anIntArray299[local55] = -2;
			} catch (@Pc(284) NullPointerException local284) {
				local9.anIntArray299[local55] = -3;
			} catch (@Pc(291) Exception local291) {
				local9.anIntArray299[local55] = -4;
			} catch (@Pc(298) Throwable local298) {
				local9.anIntArray299[local55] = -5;
			}
		}
		Static154.aClass4_15.method179(local9);
	}

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)V")
	public static void method2332() {
		aClass70_1036 = null;
	}

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "(I)V")
	public static void method2334() {
		Static147.aClass25_22.method1300();
	}
}
