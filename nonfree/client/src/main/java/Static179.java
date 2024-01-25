import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!haa", name = "K", descriptor = "I")
	public static int anInt3622 = 0;

	@OriginalMember(owner = "client!haa", name = "P", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_48 = new Class276(73, 8);

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZB)V")
	public static void method3181(@OriginalArg(0) boolean arg0) {
		if (Static313.aClass163_1 == null) {
			Static149.method2485();
		}
		if (arg0) {
			Static313.aClass163_1.method3931();
		}
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(IBI)V")
	public static void method3182(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub9 local12 = Static587.method8316(Static187.aClass40_2, Static204.aClass230_48);
		local12.aClass3_Sub7_Sub1_1.method6495(arg1);
		local12.aClass3_Sub7_Sub1_1.method6528(arg0);
		Static230.method3933(local12);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(II[BIIBI)Z")
	public static boolean method3183(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(18) int local18;
		if (local9 == 0) {
			local18 = 0;
		} else {
			local18 = 8 - local9;
		}
		@Pc(31) int local31 = -((arg3 + 8 - 1) / 8);
		@Pc(40) int local40 = -((arg4 + 8 - 1) / 8);
		for (@Pc(42) int local42 = local31; local42 < 0; local42++) {
			for (@Pc(46) int local46 = local40; local46 < 0; local46++) {
				if (arg1[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local18;
			if (arg1[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg0;
		}
		return false;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)I")
	public static int method3184(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
