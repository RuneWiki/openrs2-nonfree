import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!as", name = "Dc", descriptor = "I")
	public static int anInt535;

	@OriginalMember(owner = "client!as", name = "Ec", descriptor = "I")
	public static int anInt536;

	@OriginalMember(owner = "client!as", name = "Gc", descriptor = "[I")
	public static int[] anIntArray30;

	@OriginalMember(owner = "client!as", name = "Hc", descriptor = "Lclient!kw;")
	public static Class179 aClass179_1;

	@OriginalMember(owner = "client!as", name = "Bb", descriptor = "I")
	public static int anInt506 = 0;

	@OriginalMember(owner = "client!as", name = "Zb", descriptor = "Lclient!ada;")
	public static Class8 aClass8_7 = new Class8();

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)Z")
	public static boolean method457() {
		if (Static118.aBoolean172) {
			try {
				if ((Boolean) Static654.method5164(Static42.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BILclient!vt;)V")
	public static void method466(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40_Sub2 arg1) {
		Static17.aBoolean8 = false;
		anInt506 = 0;
		Static319.method5324(arg1);
		Static499.method7444(arg1);
		if (Static17.aBoolean8) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt10169 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt10169 + " psize:" + arg0);
		}
	}
}
