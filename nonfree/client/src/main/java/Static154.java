import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static154 {

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_98 = new Class189("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
	public static int anInt3098 = 0;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)I")
	public static int method2484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static216.anIntArray269[arg0 & 0x3] : Static216.anIntArray270[arg0 & 0x3];
	}
}
