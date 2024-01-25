import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_180 = new Class158("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "[I")
	public static final int[] anIntArray635 = new int[16];

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZLjava/lang/String;ILclient!la;)V")
	public static void method5238(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class20 arg2) {
		@Pc(20) int local20 = Static215.aClass209_7.method4686(arg1, 250, null);
		@Pc(33) int local33 = Static215.aClass209_7.method4688(null, 250, arg1) * 13;
		Static30.aClass106_3.P(6, 6, local20 + 4 + 4, local33 - -4 + 4, -16777216, 0);
		Static30.aClass106_3.method5958(6, 6, local20 + 4 + 4, local33 + 8, -1, 0);
		arg2.method5348(1, arg1, local20, -1, 10, null, 10, -1, null, null, local33, 0, 0);
		Static152.method2399(6, local20 + 8, local33 - -4 + 4, 6);
		if (arg0) {
			Static30.aClass106_3.method5977();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILclient!ou;IIII)V")
	public static void method5239(@OriginalArg(0) int arg0, @OriginalArg(2) Class30_Sub1_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		Static127.method2086(0, arg2, arg1.aByte102, arg3, arg0, arg1.anInt7488, arg1.anInt7490);
	}
}
