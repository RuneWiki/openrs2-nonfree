import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_31 = new Class306("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "Lclient!ba;")
	public static final Class17 aClass17_11 = new Class17(16);

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
	public static int anInt2646 = 503;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "[I")
	public static final int[] anIntArray253 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "[Lclient!hr;")
	public static final Class1_Sub1_Sub6[] aClass1_Sub1_Sub6Array3 = new Class1_Sub1_Sub6[14];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B[Lclient!ha;)V")
	public static void method2248(@OriginalArg(1) Class2[] arg0) {
		Static357.anInt6307 = arg0.length;
		Static72.aClass2Array2 = new Class2[Static357.anInt6307 + 10];
		Static204.anIntArray341 = new int[Static357.anInt6307 + 10];
		Static551.method3490(arg0, 0, Static72.aClass2Array2, 0, Static357.anInt6307);
		for (@Pc(26) int local26 = 0; local26 < Static357.anInt6307; local26++) {
			Static204.anIntArray341[local26] = Static72.aClass2Array2[local26].ma();
		}
		for (@Pc(53) int local53 = Static357.anInt6307; local53 < Static72.aClass2Array2.length; local53++) {
			Static204.anIntArray341[local53] = 12;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(JJ)J")
	public static long method2249(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}
