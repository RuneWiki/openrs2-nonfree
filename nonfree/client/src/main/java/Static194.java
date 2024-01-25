import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "[Lclient!nf;")
	public static Class102[] aClass102Array16;

	@OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
	public static int anInt6122;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIZII)V")
	public static void method5131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static368.method5461(arg0)) {
			Static388.method5652(-1, arg3, arg1, Static562.aClass208ArrayArray3[arg0], arg2);
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIII)I")
	public static int method5133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static343.aClass104Array2 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 9;
		@Pc(15) int local15 = arg1 >> 9;
		if (local11 < 0 || local15 < 0 || local11 > Static251.anInt4680 - 1 || Static406.anInt6924 - 1 < local15) {
			return 0;
		}
		@Pc(48) int local48 = arg2;
		if (arg2 < 3 && (Static338.aByteArrayArrayArray13[1][local11][local15] & 0x2) != 0) {
			local48 = arg2 + 1;
		}
		return Static343.aClass104Array2[local48].method8286(arg0, arg1);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILclient!v;ZI)V")
	public static void method5134(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub6_Sub20 arg1, @OriginalArg(3) int arg2) {
		if (!Static463.aBoolean600) {
			return;
		}
		@Pc(14) int local14 = 0;
		@Pc(26) int local26;
		for (@Pc(20) Class3_Sub6_Sub16 local20 = (Class3_Sub6_Sub16) arg1.aClass258_13.method5934(); local20 != null; local20 = (Class3_Sub6_Sub16) arg1.aClass258_13.method5929()) {
			local26 = Static300.method4652(local20);
			if (local14 < local26) {
				local14 = local26;
			}
		}
		local14 += 8;
		Static274.anInt5127 = arg1.anInt9677 * 16 + (Static236.aBoolean347 ? 26 : 22);
		local26 = arg1.anInt9677 * 16 + 21;
		@Pc(66) int local66 = Static567.anInt9059 + Static108.anInt2244;
		if (local14 + local66 > Static654.anInt10064) {
			local66 = Static567.anInt9059 - local14;
		}
		if (local66 < 0) {
			local66 = 0;
		}
		@Pc(93) int local93 = Static236.aBoolean347 ? 33 : 31;
		@Pc(100) int local100 = arg2 + 13 - local93;
		if (local26 + local100 > Static483.anInt8181) {
			local100 = Static483.anInt8181 - local26;
		}
		if (local100 < 0) {
			local100 = 0;
		}
		Static382.anInt6708 = local66;
		Static226.anInt6457 = local100;
		Static505.anInt8464 = local14;
		Static407.aClass3_Sub6_Sub20_1 = arg1;
	}
}
