import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!st", name = "E", descriptor = "Lclient!xa;")
	public static Class4 aClass4_30;

	@OriginalMember(owner = "client!st", name = "H", descriptor = "Ljava/lang/Object;")
	public static Object anObject26;

	@OriginalMember(owner = "client!st", name = "J", descriptor = "I")
	public static int anInt8045;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)V")
	public static void method6635(@OriginalArg(0) boolean arg0) {
		Static224.anInterface14_1.method5120(arg0 || Static176.aClass121_5 != null && Static176.aClass121_5.method7097());
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(JIIB)V")
	public static void method6636(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18 = (int) arg0 >> 14 & 0x1F;
		@Pc(25) int local25 = (int) arg0 >> 20 & 0x3;
		@Pc(32) int local32 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local18 != 10 && local18 != 11 && local18 != 22) {
			Static229.method3372(local25, 0, local18, arg2, 0, 0, arg1, true);
			return;
		}
		@Pc(50) Class313 local50 = Static260.aClass100_1.method2008(local32);
		@Pc(61) int local61;
		@Pc(58) int local58;
		if (local25 == 0 || local25 == 2) {
			local61 = local50.anInt8478;
			local58 = local50.anInt8463;
		} else {
			local58 = local50.anInt8478;
			local61 = local50.anInt8463;
		}
		@Pc(72) int local72 = local50.anInt8496;
		if (local25 != 0) {
			local72 = (local72 << local25 & 0xF) + (local72 >> 4 - local25);
		}
		Static229.method3372(0, local61, 0, arg2, local72, local58, arg1, true);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II)V")
	public static void method6637(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class6 local12 = Static575.aClass212_41.method5099(); local12 != null; local12 = Static575.aClass212_41.method5103()) {
			if ((local12.aLong249 >> 48 & 0xFFFFL) == (long) arg0) {
				local12.method7849();
			}
		}
	}
}
