import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "[Lclient!kr;")
	public static Class46[] aClass46Array50;

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
	public static int anInt6685;

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
	public static int anInt6686;

	@OriginalMember(owner = "client!ui", name = "I", descriptor = "Lclient!wr;")
	public static Class80 aClass80_29;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_156 = new Class140("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "[I")
	public static final int[] anIntArray510 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "Lclient!fh;")
	public static Class68 aClass68_40 = null;

	@OriginalMember(owner = "client!ui", name = "D", descriptor = "Z")
	public static boolean aBoolean597 = false;

	@OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
	public static int anInt6687 = -2;

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "[I")
	public static final int[] anIntArray511 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
	public static int anInt6688 = 0;

	@OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
	public static int anInt6689 = 13156520;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
	public static void method5594(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub9_Sub4 local13 = Static98.method1971(6, arg0);
		local13.method1799();
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	public static void method5595() {
		Static264.aClass68ArrayArray1 = new Class68[Static14.aClass104_9.method2757()][];
		Static230.aBooleanArray26 = new boolean[Static14.aClass104_9.method2757()];
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B[Lclient!kr;)V")
	public static void method5596(@OriginalArg(1) Class46[] arg0) {
		Static231.anInt4996 = arg0.length;
		Static87.anIntArray130 = new int[Static231.anInt4996 + 10];
		Static65.aClass46Array24 = new Class46[Static231.anInt4996 + 10];
		Static369.method2581(arg0, 0, Static65.aClass46Array24, 0, Static231.anInt4996);
		for (@Pc(31) int local31 = 0; local31 < Static231.anInt4996; local31++) {
			Static87.anIntArray130[local31] = Static65.aClass46Array24[local31].method5022();
		}
		for (@Pc(46) int local46 = Static231.anInt4996; local46 < Static65.aClass46Array24.length; local46++) {
			Static87.anIntArray130[local46] = 12;
		}
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
	public static void method5597() {
		if (Static293.anInt5826 == 2) {
			Static147.anInt3175 = 96;
			return;
		}
		try {
			@Pc(30) Method local30 = Runtime.class.getMethod("maxMemory");
			if (local30 != null) {
				try {
					@Pc(34) Runtime local34 = Runtime.getRuntime();
					@Pc(40) Long local40 = (Long) local30.invoke(local34, (Object[]) null);
					Static147.anInt3175 = (int) (local40 / 1048576L) + 1;
				} catch (@Pc(50) Throwable local50) {
				}
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
	public static void method5598() {
		Static242.aClass46_18 = null;
		Static41.aClass46Array43 = null;
		Static132.aClass46Array26 = null;
		aClass46Array50 = null;
		Static270.aClass46Array42 = null;
		Static240.aClass46Array38 = null;
		Static78.aClass46Array11 = null;
		Static295.aClass71_5 = null;
		Static80.aClass46Array12 = null;
		Static340.aClass46Array48 = null;
		Static10.aClass46Array1 = null;
		Static51.aClass46Array5 = null;
		Static56.aClass46Array6 = null;
		Static272.aClass71_4 = null;
		Static81.aClass46Array13 = null;
		Static25.aClass71_1 = null;
		Static26.aClass46_11 = null;
		Static279.aClass46Array31 = null;
	}
}
