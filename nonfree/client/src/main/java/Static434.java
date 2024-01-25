import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static434 {

	@OriginalMember(owner = "client!og", name = "q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "Z")
	public static boolean aBoolean515 = true;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Lclient!gq;")
	public static final Class140 aClass140_1 = new Class140();

	@OriginalMember(owner = "client!og", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString85 = "";

	@OriginalMember(owner = "client!og", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[8];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)Lclient!id;")
	public static Class169_Sub1 method6484(@OriginalArg(1) int arg0) {
		return Static154.aBoolean164 && arg0 >= Static625.anInt11173 && arg0 <= Static377.anInt6656 ? Static590.aClass169_Sub1Array3[arg0 - Static625.anInt11173] : null;
	}
}
