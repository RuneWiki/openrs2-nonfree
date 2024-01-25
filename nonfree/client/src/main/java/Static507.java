import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!wj;)I")
	public static int method6793(@OriginalArg(1) Class389 arg0) {
		if (arg0 == Static666.aClass389_13) {
			return 5120;
		} else if (Static666.aClass389_14 == arg0) {
			return 5122;
		} else if (arg0 == Static666.aClass389_15) {
			return 5124;
		} else if (Static666.aClass389_16 == arg0) {
			return 5121;
		} else if (Static666.aClass389_17 == arg0) {
			return 5123;
		} else if (arg0 == Static666.aClass389_18) {
			return 5125;
		} else if (Static666.aClass389_19 == arg0) {
			return 5131;
		} else if (arg0 == Static666.aClass389_20) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
	public static void method6794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(19) int local19 = arg0;
		@Pc(23) int local23 = arg2 * arg2;
		@Pc(27) int local27 = arg0 * arg0;
		@Pc(31) int local31 = local27 << 1;
		@Pc(35) int local35 = local23 << 1;
		@Pc(39) int local39 = arg0 << 1;
		@Pc(48) int local48 = local23 * (1 - local39) + local31;
		@Pc(57) int local57 = local27 - (local39 - 1) * local35;
		@Pc(61) int local61 = local23 << 2;
		@Pc(65) int local65 = local27 << 2;
		@Pc(73) int local73 = local31 * 3;
		@Pc(81) int local81 = local35 * ((arg0 << 1) - 3);
		@Pc(87) int local87 = local65;
		@Pc(93) int local93 = (arg0 - 1) * local61;
		Static578.method7640(arg3, arg4 - arg2, arg4 + arg2, Static276.anIntArrayArray32[arg1]);
		while (local19 > 0) {
			if (local48 < 0) {
				while (local48 < 0) {
					local57 += local87;
					local48 += local73;
					local7++;
					local87 += local65;
					local73 += local65;
				}
			}
			if (local57 < 0) {
				local57 += local87;
				local48 += local73;
				local7++;
				local73 += local65;
				local87 += local65;
			}
			local57 += -local81;
			local48 += -local93;
			local19--;
			local93 -= local61;
			local81 -= local61;
			@Pc(182) int local182 = arg1 - local19;
			@Pc(186) int local186 = arg1 + local19;
			@Pc(190) int local190 = arg4 + local7;
			@Pc(195) int local195 = arg4 - local7;
			Static578.method7640(arg3, local195, local190, Static276.anIntArrayArray32[local182]);
			Static578.method7640(arg3, local195, local190, Static276.anIntArrayArray32[local186]);
		}
	}
}
