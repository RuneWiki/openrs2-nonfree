import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "Lclient!ct;")
	public static Class30 aClass30_46;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "Lclient!ae;")
	public static Class4 aClass4_9;

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
	public static int anInt3188 = 0;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_108 = new Class217(24, 14);

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "[I")
	public static final int[] anIntArray231 = new int[13];

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "[I")
	public static final int[] anIntArray232 = new int[50];

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_113 = new Class106("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_104 = new Class18(58, 2);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2929(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub4_Sub17 local8 = Static132.method2717(arg1, 3);
		local8.method3480();
		local8.aString34 = arg0;
	}
}
