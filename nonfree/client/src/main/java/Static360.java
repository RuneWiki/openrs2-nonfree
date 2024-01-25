import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "Lclient!lt;")
	public static Class158 aClass158_77;

	@OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
	public static int anInt6058;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
	public static int anInt6052 = -1;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!ro;)I")
	public static int method5069(@OriginalArg(1) Class6_Sub33 arg0) {
		@Pc(7) String local7 = Static33.method703(arg0);
		@Pc(9) int[] local9 = null;
		if (Static305.method4412(arg0.anInt5954)) {
			local9 = Static354.aClass170_2.method3865((int) arg0.aLong176).anIntArray48;
		} else if (arg0.anInt5955 != -1) {
			local9 = Static354.aClass170_2.method3865(arg0.anInt5955).anIntArray48;
		} else if (Static302.method4398(arg0.anInt5954)) {
			@Pc(44) Class3_Sub3_Sub6_Sub2 local44 = Static450.aClass3_Sub3_Sub6_Sub2Array1[(int) arg0.aLong176];
			if (local44 != null) {
				@Pc(49) Class17 local49 = local44.aClass17_1;
				if (local49.anIntArray26 != null) {
					local49 = local49.method288(Static71.aClass126_1);
				}
				if (local49 != null) {
					local9 = local49.anIntArray27;
				}
			}
		} else if (Static259.method3996(arg0.anInt5954)) {
			@Pc(83) Class118 local83;
			if (arg0.anInt5954 == 1009) {
				local83 = Static113.aClass127_2.method2820((int) arg0.aLong176);
			} else {
				local83 = Static113.aClass127_2.method2820((int) (arg0.aLong176 >>> 32 & 0x7FFFFFFFL));
			}
			if (local83.anIntArray273 != null) {
				local83 = local83.method2718(Static71.aClass126_1);
			}
			if (local83 != null) {
				local9 = local83.anIntArray272;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static420.method5693(local9);
		}
		@Pc(135) int local135 = Static252.aClass201_5.method4460(Static136.aClass12Array7, local7);
		if (arg0.aBoolean390) {
			local135 += Static228.aClass12_10.method5672() + 4;
		}
		return local135;
	}
}
