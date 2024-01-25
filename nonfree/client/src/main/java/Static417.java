import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static417 {

	@OriginalMember(owner = "client!up", name = "Z", descriptor = "Lclient!oi;")
	public static Class185 aClass185_112;

	@OriginalMember(owner = "client!up", name = "P", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_108 = new Class142("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!up", name = "W", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!up", name = "Y", descriptor = "I")
	public static int anInt6743 = 16777215;

	@OriginalMember(owner = "client!up", name = "ab", descriptor = "I")
	public static int anInt6744 = 0;

	@OriginalMember(owner = "client!up", name = "bb", descriptor = "I")
	public static final int anInt6745 = 0;

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(III)V")
	public static void method5345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static264.anInt4588 == 1) {
			Static331.method4349(Static150.aClass1_Sub10_6, arg0, arg1);
		} else if (Static264.anInt4588 == 2) {
			Static460.method5927(arg1, arg0);
		}
		Static264.anInt4588 = 0;
		Static150.aClass1_Sub10_6 = null;
	}
}
