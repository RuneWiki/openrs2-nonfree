import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_53 = new Class34("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "[I")
	public static final int[] anIntArray181 = new int[50];

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "[I")
	public static final int[] anIntArray182 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)B")
	public static byte method1612(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
	public static void method1613() {
		@Pc(13) Class87 local13 = Static332.aClass87_60;
		synchronized (Static332.aClass87_60) {
			Static332.aClass87_60.method2473(5);
		}
		local13 = Static124.aClass87_24;
		synchronized (Static124.aClass87_24) {
			Static124.aClass87_24.method2473(5);
		}
		local13 = Static77.aClass87_16;
		synchronized (Static77.aClass87_16) {
			Static77.aClass87_16.method2473(5);
		}
	}
}
