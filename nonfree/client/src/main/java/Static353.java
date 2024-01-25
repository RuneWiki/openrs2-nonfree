import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
	public static int anInt5706;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "Lclient!o;")
	public static Class85 aClass85_17;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_87 = new Class142("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BII)I")
	public static int method4607(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = arg0 & 0x1 | local12 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local12;
	}
}
