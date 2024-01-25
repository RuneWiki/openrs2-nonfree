import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "[I")
	public static final int[] anIntArray449 = new int[14];

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_298 = new Class159("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
	public static int anInt5512 = 1;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_299 = new Class159("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "[S")
	public static final short[] aShortArray89 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "[J")
	public static final long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
	public static void method4743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static168.aClass198_247 = new Class198(arg0);
		Static334.aClass198_140 = new Class198(arg1);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IILclient!tj;)Lclient!f;")
	public static Class4_Sub16 method4745(@OriginalArg(1) int arg0, @OriginalArg(2) Class193 arg1) {
		@Pc(8) byte[] local8 = arg1.method5049(arg0);
		return local8 == null ? null : new Class4_Sub16(local8);
	}
}
