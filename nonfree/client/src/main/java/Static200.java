import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!jr", name = "r", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
	public static int anInt3951;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_127 = new Class175("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
	public static int anInt3952 = 0;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB)I")
	public static int method3245(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static336.method4872(arg0);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZIZ)Ljava/lang/String;")
	public static String method3250(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(37) int local37 = 2;
		for (@Pc(41) int local41 = arg0 / 10; local41 != 0; local41 /= 10) {
			local37++;
		}
		@Pc(56) char[] local56 = new char[local37];
		local56[0] = '+';
		for (@Pc(64) int local64 = local37 - 1; local64 > 0; local64--) {
			@Pc(67) int local67 = arg0;
			arg0 /= 10;
			@Pc(78) int local78 = local67 - arg0 * 10;
			if (local78 >= 10) {
				local56[local64] = (char) (local78 + 87);
			} else {
				local56[local64] = (char) (local78 + 48);
			}
		}
		return new String(local56);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)V")
	public static void method3251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class217 local7 = Static151.aClass217ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class217 local28 = Static151.aClass217ArrayArrayArray3[local9][arg0][arg1] = Static151.aClass217ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte89--;
				for (@Pc(40) Class182 local40 = local28.aClass182_3; local40 != null; local40 = local40.aClass182_2) {
					@Pc(44) Class1_Sub3 local44 = local40.aClass1_Sub3_2;
					if (local44.aShort181 == arg0 && local44.aShort179 == arg1) {
						local44.aByte77--;
					}
				}
			}
		}
		if (Static151.aClass217ArrayArrayArray3[0][arg0][arg1] == null) {
			Static151.aClass217ArrayArrayArray3[0][arg0][arg1] = new Class217(0, arg0, arg1);
			Static151.aClass217ArrayArrayArray3[0][arg0][arg1].aByte93 = 1;
		}
		Static151.aClass217ArrayArrayArray3[0][arg0][arg1].aClass217_1 = local7;
		Static151.aClass217ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZIIZ)V")
	public static void method3253(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static161.method2807(arg2, arg1, 0, arg3, Static279.aClass145_Sub1Array9.length - 1, arg0);
		Static119.aClass3_Sub43_1 = null;
		Static309.anInt5632 = 0;
	}
}
