import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static195 {

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "Lclient!ok;")
	public static Class178 aClass178_53;

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
	public static int anInt3458;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_74 = new Class55("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "[I")
	public static final int[] anIntArray313 = new int[13];

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)Lclient!fe;")
	public static Class19_Sub1 method2808() {
		return Static408.anInt6459 < Static31.aClass19_Sub1Array1.length ? Static31.aClass19_Sub1Array1[Static408.anInt6459++] : null;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)I")
	public static int method2809(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
