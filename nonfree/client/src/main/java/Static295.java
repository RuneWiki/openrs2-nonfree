import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_69 = new Class208(58, 7);

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Lclient!gf;")
	public static final Class91 aClass91_12 = new Class91("", 10);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method4187(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static397.anInt6873 = arg3;
		Static412.anInt7076 = arg1;
		Static361.anInt6407 = arg2;
		Static281.anInt4446 = arg0;
		Static230.anInt3824 = arg4;
		if (arg5 && Static397.anInt6873 >= 100) {
			Static120.anInt2052 = Static281.anInt4446 * 128 + 64;
			Static263.anInt4619 = Static412.anInt7076 * 128 + 64;
			Static260.anInt4601 = Static365.method3535(Static204.anInt3498, Static263.anInt4619, Static120.anInt2052) - Static361.anInt6407;
		}
		Static25.anInt7273 = 2;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZII)V")
	public static void method4188(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static267.method3705(arg1, 13);
		local8.method2574();
		local8.anInt3131 = arg0;
	}
}
