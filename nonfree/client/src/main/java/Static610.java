import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
	public static int anInt9839;

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
	public static int anInt9845 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!dba;ILclient!dba;)V")
	public static void method8666(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg0.aClass3_338 != null) {
			arg0.method9380();
		}
		arg0.aClass3_337 = arg1;
		arg0.aClass3_338 = arg1.aClass3_338;
		arg0.aClass3_338.aClass3_337 = arg0;
		arg0.aClass3_337.aClass3_338 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BII)V")
	public static void method8667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static27.method666(arg1)) {
			Static315.method4810(arg0, Static489.aClass260ArrayArray3[arg1]);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIZZI)I")
	public static int method8668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class3_Sub24 local10 = Static640.method8894(arg1, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray307.length; local18++) {
			if (local10.anIntArray307[local18] >= 0 && Static170.aClass370_1.anInt10161 > local10.anIntArray307[local18]) {
				@Pc(46) Class374 local46 = Static170.aClass370_1.method8900(local10.anIntArray307[local18]);
				@Pc(58) int local58 = local46.method8997(Static467.aClass367_1.method8812(arg0).anInt9033, arg0);
				if (arg2) {
					local16 += local10.anIntArray306[local18] * local58;
				} else {
					local16 += local58;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)Z")
	public static boolean method8669() {
		return Static18.anInt450 == 0 ? Static366.aClass3_Sub1_Sub3_4.method2161() : true;
	}
}
