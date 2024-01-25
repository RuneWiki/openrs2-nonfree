import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
	public static int anInt2640;

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_125 = new Class159("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBLclient!lf;)Ljava/lang/String;")
	public static String method2332(@OriginalArg(2) Class4_Sub11 arg0) {
		try {
			@Pc(15) int local15 = arg0.method3457();
			if (local15 > 32767) {
				local15 = 32767;
			}
			@Pc(27) byte[] local27 = new byte[local15];
			arg0.anInt3768 += Static292.aClass211_1.method5469(local27, 0, arg0.aByteArray55, arg0.anInt3768, local15);
			return Static57.method1206(0, local15, local27);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}
}
