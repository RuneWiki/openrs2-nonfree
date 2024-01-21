import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "Lclient!b;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
	public static int anInt2882 = 0;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "[B")
	public static byte[] aByteArray35 = new byte[520];

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1246 = Static51.method932("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "[I")
	public static int[] anIntArray320 = new int[100];

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1248 = aClass10_1246;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public static void method2078() {
		aClass5_1 = null;
		aByteArray35 = null;
		aClass10_1246 = null;
		aClass10_1248 = null;
		anIntArray320 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BJ)V")
	public static void method2079(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static76.anInt1789 >= 100 && Static163.anInt3514 != 1 || Static76.anInt1789 >= 200) {
			Static96.method2627(Static63.aClass10_687, 0, Static59.aClass10_649);
			return;
		}
		@Pc(35) Class10 local35 = Static36.method764(arg0).method361();
		for (@Pc(37) int local37 = 0; local37 < Static76.anInt1789; local37++) {
			if (Static16.aLongArray2[local37] == arg0) {
				Static96.method2627(Static63.aClass10_687, 0, Static3.method36(new Class10[] { local35, Static99.aClass10_1000 }));
				return;
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static139.anInt3081; local76++) {
			if (arg0 == Static167.aLongArray6[local76]) {
				Static96.method2627(Static63.aClass10_687, 0, Static3.method36(new Class10[] { Static20.aClass10_242, local35, Static22.aClass10_255 }));
				return;
			}
		}
		if (local35.method358(Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.aClass10_598)) {
			Static96.method2627(Static63.aClass10_687, 0, Static155.aClass10_1456);
			return;
		}
		Static5.aClass10Array2[Static76.anInt1789] = local35;
		Static16.aLongArray2[Static76.anInt1789] = arg0;
		Static70.anIntArray181[Static76.anInt1789] = 0;
		Static62.anIntArray174[Static76.anInt1789] = 0;
		Static76.anInt1789++;
		Static1.anInt5 = Static12.anInt364;
		Static141.aClass2_Sub11_Sub1_3.method1495(110);
		Static141.aClass2_Sub11_Sub1_3.method1458(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BIIII)I")
	public static int method2080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class2_Sub1_Sub4_Sub4.anIntArray304[arg3 * 1024 / arg1] >> 1;
		return ((65536 - local21) * arg2 >> 16) + (local21 * arg0 >> 16);
	}
}
