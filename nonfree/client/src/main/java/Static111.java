import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!em", name = "W", descriptor = "Lclient!gp;")
	public static Class109 aClass109_1;

	@OriginalMember(owner = "client!em", name = "N", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_42 = new Class6(106, -1);

	@OriginalMember(owner = "client!em", name = "Q", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_43 = new Class6(69, 9);

	@OriginalMember(owner = "client!em", name = "T", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!em", name = "U", descriptor = "Lclient!pw;")
	public static final Class234 aClass234_4 = new Class234();

	@OriginalMember(owner = "client!em", name = "V", descriptor = "Lclient!h;")
	public static final Class114 aClass114_54 = new Class114(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!em", name = "X", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_22 = new Class38();

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIBI)V")
	public static void method2439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static89.aClass1_Sub28_Sub1_1.anInt4894 != 0 && arg2 != 0 && Static205.anInt4329 < 50 && arg0 != -1) {
			Static41.aClass67Array1[Static205.anInt4329++] = new Class67((byte) 1, arg0, arg2, arg3, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIFZII)[[I")
	public static int[][] method2440(@OriginalArg(5) float arg0) {
		@Pc(7) int[][] local7 = new int[256][64];
		@Pc(11) Class1_Sub3_Sub7 local11 = new Class1_Sub3_Sub7();
		local11.aBoolean121 = false;
		local11.anInt1704 = 4;
		local11.anInt1703 = (int) (arg0 * 4096.0F);
		local11.anInt1709 = 3;
		local11.anInt1711 = 8;
		local11.method7912();
		Static400.method6036(256, 64);
		for (@Pc(38) int local38 = 0; local38 < 256; local38++) {
			local11.method1682(local7[local38], local38);
		}
		return local7;
	}
}
