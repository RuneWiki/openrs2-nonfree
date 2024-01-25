import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
	public static int anInt6656;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Lclient!dk;")
	public static Class54 aClass54_108;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_93 = new Class134("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "[F")
	public static final float[] aFloatArray32 = new float[4];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method5162(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static209.anInt3494; local11++) {
			if (arg0.equalsIgnoreCase(Static290.aStringArray29[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static60.aClass3_Sub4_Sub1_Sub2_1.aString148);
	}
}
