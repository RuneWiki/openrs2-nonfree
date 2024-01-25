import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_37 = new Class151("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIII)V")
	public static void method948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = arg0 * Static336.aClass106_Sub1_1.anInt5694 >> 8;
		if (local6 != 0 && arg1 != -1) {
			Static299.method3903(Static408.aClass113_127, local6, arg1);
			Static17.aBoolean28 = true;
		}
	}
}
