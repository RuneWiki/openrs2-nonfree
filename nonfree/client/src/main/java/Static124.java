import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "Lclient!bi;")
	public static Class31 aClass31_25;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "[I")
	public static final int[] anIntArray262 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)I")
	public static int method2647(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static8.method7641(arg1 + 45365, arg0 - -91923, 4) + (Static8.method7641(arg1 + 10294, arg0 + 37821, 2) + -128 >> 1) + (Static8.method7641(arg1, arg0, 1) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZII)Z")
	public static boolean method2648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static379.method5833(arg1, arg0) & ((arg0 & 0x2000) != 0 | Static260.method4300(arg1, arg0) | Static454.method6415(arg1, arg0));
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(III)V")
	public static void method2650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub7_Sub5 local8 = Static218.method3780(1, arg1);
		local8.method3066();
		local8.anInt3348 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V")
	public static void method2651(@OriginalArg(0) int arg0) {
		Static518.method7283();
		@Pc(19) int local19 = Static581.aClass270_1.method5937(arg0).anInt3921;
		if (local19 == 0) {
			return;
		}
		@Pc(27) int local27 = Static511.aClass335_2.anIntArray686[arg0];
		if (local19 == 6) {
			Static19.anInt389 = local27;
		}
		if (local19 == 5) {
			Static7.anInt104 = local27;
		}
	}
}
