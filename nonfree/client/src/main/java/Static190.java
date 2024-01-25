import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_54 = new Class231("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "[Lclient!ho;")
	public static final Class107[] aClass107Array1 = new Class107[8];

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)V")
	public static void method2936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static8.aClass173_Sub1_1.anInt4414 * arg0 >> 8;
		if (arg1 == -1 && !Static284.aBoolean341) {
			Static376.method4541();
		} else if (arg1 != -1 && (arg1 != Static75.anInt1505 || !Static12.method159()) && local6 != 0 && !Static284.aBoolean341) {
			Static120.method1924(local6, arg1, arg2, Static280.aClass158_63);
		}
		Static75.anInt1505 = arg1;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
	public static void method2937() {
		@Pc(8) Class6_Sub1_Sub12 local8 = Static449.method5975(0, 15);
		local8.method3048();
	}
}
