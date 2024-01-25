import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!wt", name = "K", descriptor = "J")
	public static long aLong226;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!ta;)V")
	public static void method5850(@OriginalArg(0) int arg0, @OriginalArg(1) Class64 arg1) {
		Static58.aClass64Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!la;ZLjava/lang/String;I)V")
	public static void method5851(@OriginalArg(0) Class116 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		@Pc(26) int local26 = Static270.aClass58_11.method1338(250, null, arg2);
		@Pc(35) int local35 = Static270.aClass58_11.method1343(250, null, arg2) * 13;
		Static33.aClass49_1.O(6, 6, local26 + 4 + 4, local35 + 4 + 4, -16777216, 0);
		Static33.aClass49_1.method4426(6, 6, local26 + 4 + 4, local35 + 4 - -4, -1, 0);
		arg0.method4813(1, null, local35, 10, -1, 0, arg2, -1, 0, 10, null, local26, null);
		Static444.method5713(local35 + 4 + 4, local26 - -4 + 4, 6, 6);
		if (arg1) {
			Static33.aClass49_1.method4412();
		}
	}
}
