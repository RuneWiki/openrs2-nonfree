import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIB)I")
	public static int method7869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & local20 * (local20 * local20 * 15731 + 789221) + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!bi;Lclient!bi;Lclient!bi;ILclient!bi;)V")
	public static void method7870(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(4) Class31 arg3) {
		Static552.aClass31_118 = arg3;
		Static204.aClass31_43 = arg1;
		Static314.aClass31_119 = arg2;
		Static458.aClass115ArrayArray2 = new Class115[Static552.aClass31_118.method675()][];
		Static448.aBooleanArray32 = new boolean[Static552.aClass31_118.method675()];
	}
}
