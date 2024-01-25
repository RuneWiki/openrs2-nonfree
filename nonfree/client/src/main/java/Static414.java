import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!qv", name = "n", descriptor = "F")
	public static float aFloat177;

	@OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
	public static int anInt7744;

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_224 = new Class88("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
	public static int anInt7740 = -1;

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "Lclient!vaa;")
	public static final Class299 aClass299_5 = new Class299();

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(ZZ)V")
	public static void method6450(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static406.anInt7660 != -1) {
				Static419.method6486(Static406.anInt7660);
			}
			for (@Pc(19) Class12_Sub34 local19 = (Class12_Sub34) Static456.aClass68_67.method1923(); local19 != null; local19 = (Class12_Sub34) Static456.aClass68_67.method1920()) {
				if (!local19.method7970()) {
					local19 = (Class12_Sub34) Static456.aClass68_67.method1923();
					if (local19 == null) {
						break;
					}
				}
				Static102.method2109(true, local19, false);
			}
			Static406.anInt7660 = -1;
			Static456.aClass68_67 = new Class68(8);
			Static391.method5854();
			Static406.anInt7660 = Static121.anInt2763;
			Static53.method1407(false);
			Static445.method6725();
			Static312.method5016(Static406.anInt7660);
		}
		Static5.aBoolean4 = true;
	}
}
