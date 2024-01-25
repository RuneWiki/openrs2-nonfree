import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!p", name = "m", descriptor = "I")
	public static int anInt4685;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Lclient!fc;")
	public static Class71 aClass71_65;

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_164 = new Class221("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_124 = new Class77(48, 8);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZLjava/lang/String;IZBZLjava/lang/String;IIJI)V")
	public static void method4108(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Class2_Sub13 local28 = new Class2_Sub13(128);
		local28.method4207(10);
		local28.method4199((arg4 ? 4 : 0) | (arg3 ? 1 : 0) | (arg0 ? 2 : 0));
		local28.method4208(arg8);
		local28.method4218(local8[0]);
		local28.method4230(arg1);
		local28.method4218(local8[1]);
		local28.method4199(Static277.anInt2677);
		local28.method4207(arg7);
		local28.method4207(arg2);
		local28.method4218(local8[2]);
		local28.method4199(arg9);
		local28.method4199(arg6);
		local28.method4218(local8[3]);
		local28.method4233(Static41.aBigInteger1, Static318.aBigInteger5);
		@Pc(118) Class2_Sub13 local118 = new Class2_Sub13(350);
		local118.method4230(arg5);
		@Pc(133) int local133 = 8 - Static346.method5273(arg5) % 8;
		for (@Pc(135) int local135 = 0; local135 < local133; local135++) {
			local118.method4207((int) (Math.random() * 255.0D));
		}
		local118.method4247(local8);
		Static39.aClass2_Sub13_Sub2_4.anInt4788 = 0;
		Static39.aClass2_Sub13_Sub2_4.method4207(Static74.aClass101_18.anInt2534);
		Static39.aClass2_Sub13_Sub2_4.method4199(local118.anInt4788 + local28.anInt4788 + 2);
		Static39.aClass2_Sub13_Sub2_4.method4199(572);
		Static39.aClass2_Sub13_Sub2_4.method4191(local28.anInt4788, local28.aByteArray77);
		Static39.aClass2_Sub13_Sub2_4.method4191(local118.anInt4788, local118.aByteArray77);
		Static343.anInt6052 = 0;
		Static265.anInt4677 = 0;
		Static289.anInt5127 = 1;
		Static304.anInt2193 = -3;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method4110() {
		if (Static65.anInt1255 != 3) {
			Static259.anInt4618 = -1;
		}
	}
}
