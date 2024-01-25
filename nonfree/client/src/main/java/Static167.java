import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "[[Lclient!rb;")
	public static Class210[][] aClass210ArrayArray1;

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_93 = new Class151("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_94 = new Class151("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
	public static int anInt2743 = 0;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)I")
	public static int method2263() {
		@Pc(10) Class167 local10 = Static416.aClass167_95;
		synchronized (Static416.aClass167_95) {
			return Static416.aClass167_95.method3393();
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)S")
	public static short method2264(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(36) int local36 = local19 > 64 ? local15 * (127 - local19) >> 7 : local15 * local19 >> 7;
		@Pc(40) int local40 = local36 + local19;
		@Pc(49) int local49;
		if (local40 == 0) {
			local49 = local36 << 1;
		} else {
			local49 = (local36 << 8) / local40;
		}
		return (short) (local9 << 10 | local49 >> 4 << 7 | local40);
	}
}
