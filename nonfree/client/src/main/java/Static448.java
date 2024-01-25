import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!wf", name = "X", descriptor = "Lclient!jl;")
	public static Class136 aClass136_8;

	@OriginalMember(owner = "client!wf", name = "N", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_129 = new Class231("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!wf", name = "Q", descriptor = "[I")
	public static final int[] anIntArray612 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
	public static int anInt7474 = -1;

	@OriginalMember(owner = "client!wf", name = "U", descriptor = "Z")
	public static volatile boolean aBoolean509 = true;

	@OriginalMember(owner = "client!wf", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString72 = "";

	@OriginalMember(owner = "client!wf", name = "W", descriptor = "J")
	public static long aLong394 = -1L;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6074(@OriginalArg(1) String arg0) {
		if (Static57.aClass29Array1 != null) {
			Static164.method2403(Static147.aClass208_35);
			Static389.aClass2_Sub17_Sub1_2.method6172(Static380.method5246(arg0));
			Static389.aClass2_Sub17_Sub1_2.method6151(arg0);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZILclient!kj;)V")
	public static void method6075(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub5_Sub2 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt7629 > Static277.anInt5022) {
			Static108.method1797(arg1);
		} else if (Static277.anInt5022 > arg1.anInt7669) {
			Static425.method5817(arg1, false);
			local9 = Static107.anInt1820;
			local7 = Static287.anInt5147;
		} else {
			Static228.method4878(arg1);
		}
		if (arg1.anInt7626 < 128 || arg1.anInt7622 < 128 || Static234.anInt3949 * 128 - 128 <= arg1.anInt7626 || Static371.anInt6492 * 128 - 128 <= arg1.anInt7622) {
			arg1.anInt7665 = -1;
			arg1.anInt7629 = 0;
			arg1.anInt7669 = 0;
			local7 = -1;
			arg1.anInt7633 = -1;
			local9 = 0;
			arg1.anInt7667 = -1;
			arg1.anInt7626 = arg1.anIntArray632[0] * 128 + arg1.method6215() * 64;
			arg1.anInt7622 = arg1.anIntArray633[0] * 128 + arg1.method6215() * 64;
			arg1.method6219();
		}
		if (Static127.aClass11_Sub5_Sub2_Sub1_2 == arg1 && (arg1.anInt7626 < 1536 || arg1.anInt7622 < 1536 || (Static234.anInt3949 - 12) * 128 <= arg1.anInt7626 || arg1.anInt7622 >= Static371.anInt6492 * 128 - 1536)) {
			arg1.anInt7665 = -1;
			arg1.anInt7667 = -1;
			arg1.anInt7629 = 0;
			arg1.anInt7633 = -1;
			local7 = -1;
			arg1.anInt7669 = 0;
			local9 = 0;
			arg1.anInt7626 = arg1.anIntArray632[0] * 128 + arg1.method6215() * 64;
			arg1.anInt7622 = arg1.anIntArray633[0] * 128 + arg1.method6215() * 64;
			arg1.method6219();
		}
		@Pc(210) int local210 = Static462.method3621(arg1);
		Static352.method4956(local9, local7, arg1, local210);
		Static293.method4161(arg1);
	}

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "(I)Z")
	public static boolean method6076() {
		return Static162.aBoolean186;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIII)V")
	public static void method6077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static434.aClass165_Sub1_1.anInt4205 != 0 && arg1 != 0 && Static126.anInt2092 < 50 && arg2 != -1) {
			Static409.aClass253Array2[Static126.anInt2092++] = new Class253((byte) 1, arg2, arg1, arg3, arg0, 0);
		}
	}
}
