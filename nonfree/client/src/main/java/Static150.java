import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!gca", name = "M", descriptor = "[Lclient!sv;")
	public static Class6_Sub1_Sub2_Sub1[] aClass6_Sub1_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!gca", name = "K", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_89 = new Class202("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!gca", name = "N", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_67 = new Class239(24, 2);

	@OriginalMember(owner = "client!gca", name = "O", descriptor = "Z")
	public static boolean aBoolean224 = false;

	@OriginalMember(owner = "client!gca", name = "P", descriptor = "[I")
	public static final int[] anIntArray338 = new int[14];

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(FIF[BIFIIFILclient!jq;IF)V")
	public static void method2605(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) float arg4, @OriginalArg(8) float arg5, @OriginalArg(10) Class148 arg6, @OriginalArg(12) float arg7) {
		for (@Pc(11) int local11 = 0; local11 < 16; local11++) {
			Static485.method7211(local11, arg3, arg0, arg1, arg2, arg7, arg6, arg4, arg5);
			arg1 += 16384;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)Z")
	public static boolean method2607(@OriginalArg(0) int arg0) {
		return (arg0 & -arg0) == arg0;
	}
}
