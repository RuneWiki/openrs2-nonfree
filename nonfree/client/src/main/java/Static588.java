import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!va", name = "L", descriptor = "Lclient!da;")
	public static Class34 aClass34_14;

	@OriginalMember(owner = "client!va", name = "G", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_174 = new Class73(105, 6);

	@OriginalMember(owner = "client!va", name = "I", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_65 = new Class94(3000000, 200);

	@OriginalMember(owner = "client!va", name = "K", descriptor = "I")
	public static int anInt9948 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II[B)[B")
	public static byte[] method8112(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static653.method6537(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!va", name = "g", descriptor = "(I)Lclient!jha;")
	public static Class67_Sub1 method8113() {
		return Static423.anInt7805 < Static56.aClass67_Sub1Array1.length ? Static56.aClass67_Sub1Array1[Static423.anInt7805++] : null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([BZ)Ljava/lang/String;")
	public static String method8114(@OriginalArg(0) byte[] arg0) {
		return Static99.method2380(arg0.length, 0, arg0);
	}
}
