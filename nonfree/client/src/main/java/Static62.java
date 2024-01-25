import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "Lclient!la;")
	public static Class96 aClass96_4;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "[I")
	public static final int[] anIntArray54 = new int[14];

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_27 = new Class208(54, 6);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
	public static void method1010() {
		@Pc(12) Class1_Sub8_Sub9 local12 = Static465.method6470(0, 15);
		local12.method4835();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ls;B)V")
	public static void method1012(@OriginalArg(0) Class11_Sub1_Sub1_Sub3 arg0) {
		@Pc(9) boolean local9 = false;
		if (Static518.anInt9331 == arg0.anInt7568 || arg0.anInt7591 == -1 || arg0.anInt7532 != 0) {
			local9 = true;
		} else {
			@Pc(31) Class197 local31 = Static223.aClass245_1.method5312(arg0.anInt7591);
			if (local31.aBoolean384 || local31.anIntArray279[arg0.anInt7558] < arg0.anInt7580 + 1) {
				local9 = true;
			}
		}
		if (local9) {
			@Pc(55) int local55 = arg0.anInt7568 - arg0.anInt7584;
			@Pc(60) int local60 = Static518.anInt9331 - arg0.anInt7584;
			@Pc(72) int local72 = arg0.anInt7557 * 512 + arg0.method6058() * 256;
			@Pc(83) int local83 = arg0.anInt7569 * 512 + arg0.method6058() * 256;
			@Pc(96) int local96 = arg0.anInt7556 * 512 + arg0.method6058() * 256;
			@Pc(109) int local109 = arg0.anInt7598 * 512 + arg0.method6058() * 256;
			arg0.anInt8906 = ((local55 - local60) * local83 + local109 * local60) / local55;
			arg0.anInt8902 = (local96 * local60 + local72 * (local55 - local60)) / local55;
		}
		arg0.anInt7605 = 0;
		if (arg0.anInt7555 == 0) {
			arg0.method6072(false, 8192);
		}
		if (arg0.anInt7555 == 1) {
			arg0.method6072(false, 12288);
		}
		if (arg0.anInt7555 == 2) {
			arg0.method6072(false, 0);
		}
		if (arg0.anInt7555 == 3) {
			arg0.method6072(false, 4096);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IC)Z")
	public static boolean method1013(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
