import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!qaa", name = "k", descriptor = "Lclient!ii;")
	public static Class160 aClass160_1;

	@OriginalMember(owner = "client!qaa", name = "j", descriptor = "Lclient!pb;")
	public static final Class262 aClass262_13 = new Class262(2, 3);

	@OriginalMember(owner = "client!qaa", name = "l", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_115 = new Class349(50, -1);

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(II[BIIIZ)Z")
	public static boolean method5671(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(25) int local25;
		if (local9 == 0) {
			local25 = 0;
		} else {
			local25 = 8 - local9;
		}
		@Pc(38) int local38 = -((arg4 + 8 - 1) / 8);
		@Pc(47) int local47 = -((arg0 + 8 - 1) / 8);
		for (@Pc(49) int local49 = local38; local49 < 0; local49++) {
			for (@Pc(53) int local53 = local47; local53 < 0; local53++) {
				if (arg1[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local25;
			if (arg1[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)V")
	public static void method5672() {
		Static121.method1723();
	}

	@OriginalMember(owner = "client!qaa", name = "d", descriptor = "(I)V")
	public static void method5673() {
		if (Static332.aBoolean803) {
			return;
		}
		Static372.method5208(Static185.aClass228ArrayArrayArray4);
		if (Static526.aClass228ArrayArrayArray7 != null) {
			Static372.method5208(Static526.aClass228ArrayArrayArray7);
		}
		Static332.aBoolean803 = true;
	}

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "(I)I")
	public static int method5674() {
		return Static313.anInt5212;
	}
}
