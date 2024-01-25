import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!sm", name = "Z", descriptor = "I")
	public static int anInt9387 = -1;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(IIB)I")
	public static int method7756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(31) double local31 = local22 + (local10 - local22) * Math.random();
		return (int) (Math.pow(2.0D, local31) + 0.5D);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!jga;I)I")
	public static int method7757(@OriginalArg(0) Class14_Sub3_Sub11 arg0) {
		@Pc(7) String local7 = Static654.method9084(arg0);
		@Pc(17) int[] local17 = null;
		if (Static461.method6748(arg0.anInt4752)) {
			local17 = Static175.aClass247_2.method5962((int) arg0.aLong144).anIntArray72;
		} else if (arg0.anInt4755 != -1) {
			local17 = Static175.aClass247_2.method5962(arg0.anInt4755).anIntArray72;
		} else if (Static254.method3738(arg0.anInt4752)) {
			@Pc(96) Class14_Sub44 local96 = (Class14_Sub44) Static579.aClass187_73.method4078((long) (int) arg0.aLong144);
			if (local96 != null) {
				@Pc(101) Class12_Sub2_Sub2_Sub1_Sub1 local101 = local96.aClass12_Sub2_Sub2_Sub1_Sub1_2;
				@Pc(104) Class283 local104 = local101.aClass283_1;
				if (local104.anIntArray638 != null) {
					local104 = local104.method7129(Static595.aClass241_1);
				}
				if (local104 != null) {
					local17 = local104.anIntArray639;
				}
			}
		} else if (Static198.method3030(arg0.anInt4752)) {
			@Pc(65) Class203 local65;
			if (arg0.anInt4752 == 1010) {
				local65 = Static511.aClass13_2.method86((int) arg0.aLong144);
			} else {
				local65 = Static511.aClass13_2.method86((int) (arg0.aLong144 >>> 32 & 0x7FFFFFFFL));
			}
			if (local65.anIntArray440 != null) {
				local65 = local65.method5007(Static595.aClass241_1);
			}
			if (local65 != null) {
				local17 = local65.anIntArray444;
			}
		}
		if (local17 != null) {
			local7 = local7 + Static433.method8535(local17);
		}
		@Pc(144) int local144 = Static48.aClass158_1.method3600(local7, Static135.aClass20Array3);
		if (arg0.aBoolean327) {
			local144 += Static19.aClass20_24.method7412() + 4;
		}
		return local144;
	}
}
