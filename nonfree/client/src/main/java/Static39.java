import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "[J")
	public static long[] aLongArray1;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_12 = new Class306("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "[S")
	public static final short[] aShortArray17 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "Z")
	public static boolean aBoolean38 = false;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "[I")
	public static final int[] anIntArray116 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "Lclient!sm;")
	public static final Class271 aClass271_1 = new Class271();

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
	public static void method887() {
		for (@Pc(12) int local12 = 0; local12 < Static157.anInt4503; local12++) {
			@Pc(18) int local18 = Static427.anIntArray711[local12];
			@Pc(25) Class1_Sub17 local25 = (Class1_Sub17) Static380.aClass17_29.method738((long) local18);
			if (local25 != null) {
				@Pc(30) Class49_Sub2_Sub2_Sub2 local30 = local25.aClass49_Sub2_Sub2_Sub2_2;
				Static452.method6439(local30, local30.aClass196_1.anInt5718);
			}
		}
	}
}
