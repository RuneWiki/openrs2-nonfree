import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_43 = new Class134(5);

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "[I")
	public static final int[] anIntArray508 = new int[5];

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_65 = new Class179(80, 3);

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_124 = new Class7(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Z")
	public static boolean aBoolean393 = false;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ya;ILclient!uq;)V")
	public static void method4580(@OriginalArg(0) Class39 arg0, @OriginalArg(2) Class251 arg1) {
		@Pc(31) boolean local31 = Static165.aClass19_1.method561(arg1.anInt6673, arg1.aBoolean471 ? Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1 : null, arg1.anInt6671, arg1.anInt6719, arg1.anInt6701 | 0xFF000000, arg1.anInt6704, arg0) == null;
		if (local31) {
			Static134.aClass181_22.method4102(new Class1_Sub15(arg1.anInt6704, arg1.anInt6673, arg1.anInt6719, arg1.anInt6701 | 0xFF000000, arg1.anInt6671, arg1.aBoolean471));
			Static408.method5469(arg1);
		}
	}
}
