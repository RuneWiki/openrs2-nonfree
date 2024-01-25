import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "Lclient!os;")
	public static Class2_Sub9_Sub17 aClass2_Sub9_Sub17_3;

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_160 = new Class140("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "Lclient!ep;")
	public static Class62 aClass62_1 = new Class62();

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)V")
	public static void method5655(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub9_Sub4 local16 = Static98.method1971(10, arg0);
		local16.method1799();
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)V")
	public static void method5656(@OriginalArg(0) int arg0) {
		@Pc(1) Class107 local1 = Static135.aClass107_12;
		synchronized (Static135.aClass107_12) {
			Static135.aClass107_12.method3015();
			Static135.aClass107_12 = new Class107(arg0);
		}
	}
}
