import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!vu", name = "H", descriptor = "[F")
	public static final float[] aFloatArray109 = new float[2];

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!cn;BLclient!cn;)V")
	public static void method9024(@OriginalArg(0) Class73 arg0, @OriginalArg(2) Class73 arg1) {
		@Pc(12) Class5_Sub50 local12 = Static457.method6722(Static533.aClass387_98, Static80.aClass313_1);
		local12.aClass5_Sub23_Sub2_2.method8486(arg0.anInt1388);
		local12.aClass5_Sub23_Sub2_2.method8492(arg0.anInt1364);
		local12.aClass5_Sub23_Sub2_2.method8514(arg1.anInt1419);
		local12.aClass5_Sub23_Sub2_2.method8520(arg0.anInt1419);
		local12.aClass5_Sub23_Sub2_2.method8490(arg1.anInt1388);
		local12.aClass5_Sub23_Sub2_2.method8514(arg1.anInt1364);
		Static494.method7120(local12);
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)V")
	public static void method9027() {
		@Pc(7) int local7 = Static116.anInt3318;
		@Pc(9) int[] local9 = Static88.anIntArray464;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class8_Sub1_Sub3_Sub2_Sub1 local19 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static549.method7982(local19.method5993(), local19);
			}
		}
	}
}
