import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static120 {

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
	public static int anInt43;

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "[Lclient!lg;")
	public static Class2_Sub10_Sub1[] aClass2_Sub10_Sub1Array2;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "Lclient!sf;")
	public static final Class180 aClass180_2 = new Class180();

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_5 = new Class157(17, 2);

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "[I")
	public static final int[] anIntArray4 = new int[2048];

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB)B")
	public static byte method46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!iq;)V")
	public static void method50(@OriginalArg(1) Class104 arg0) {
		Static46.aClass104_34 = arg0;
		Static303.anInt6038 = Static46.aClass104_34.method2745(4);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
	public static void method52() {
		Static250.aClass107_31.method3012();
		Static171.aClass107_19.method3012();
	}
}
