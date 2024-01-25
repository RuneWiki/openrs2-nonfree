import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static216 {

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	public static int anInt3990;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "[S")
	public static final short[] aShortArray84 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_137 = new Class221("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
	public static int anInt3989 = 0;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "[S")
	public static short[] aShortArray85 = new short[256];

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_123 = new Class41(14, 8);

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
	public static void method3640() {
		if (Static229.aBoolean457) {
			Static229.aBoolean457 = false;
			Static248.aClass5_6 = null;
			Static208.aClass5_3 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	public static void method3641(@OriginalArg(1) int arg0) {
		if (Static138.method2407(arg0)) {
			Static305.method2103(-1, Static228.aClass155ArrayArray1[arg0]);
		}
	}
}
