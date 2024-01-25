import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ot", name = "E", descriptor = "I")
	public static int anInt4966 = -1;

	@OriginalMember(owner = "client!ot", name = "F", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_256 = new Class12(88, 28);

	@OriginalMember(owner = "client!ot", name = "G", descriptor = "I")
	public static int anInt4967 = -1;

	@OriginalMember(owner = "client!ot", name = "T", descriptor = "I")
	public static int anInt4975 = 0;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method4058(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(44) int local44 = 2;
		@Pc(48) int local48 = arg0 / 10;
		while (local48 != 0) {
			local48 /= 10;
			local44++;
		}
		@Pc(60) char[] local60 = new char[local44];
		local60[0] = '+';
		for (@Pc(68) int local68 = local44 - 1; local68 > 0; local68--) {
			@Pc(72) int local72 = arg0;
			arg0 /= 10;
			@Pc(83) int local83 = local72 - arg0 * 10;
			if (local83 < 10) {
				local60[local68] = (char) (local83 + 48);
			} else {
				local60[local68] = (char) (local83 + 87);
			}
		}
		return new String(local60);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIII)V")
	public static void method4060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(19) int local19 = arg3;
		@Pc(23) int local23 = arg1 * arg1;
		@Pc(27) int local27 = arg3 * arg3;
		@Pc(31) int local31 = local27 << 1;
		@Pc(35) int local35 = local23 << 1;
		@Pc(39) int local39 = arg3 << 1;
		@Pc(48) int local48 = local31 + local23 * (1 - local39);
		@Pc(57) int local57 = local27 - (local39 - 1) * local35;
		@Pc(61) int local61 = local23 << 2;
		@Pc(65) int local65 = local27 << 2;
		@Pc(73) int local73 = local31 * 3;
		@Pc(81) int local81 = local35 * ((arg3 << 1) - 3);
		@Pc(87) int local87 = local65;
		@Pc(93) int local93 = local61 * (arg3 - 1);
		@Pc(107) int local107;
		@Pc(116) int local116;
		if (arg2 >= Static357.anInt6537 && Static85.anInt1517 >= arg2) {
			local107 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg1 + arg0);
			local116 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg0 - arg1);
			Static23.method323(Static283.anIntArrayArray30[arg2], local116, arg4, local107);
		}
		while (local19 > 0) {
			if (local48 < 0) {
				while (local48 < 0) {
					local48 += local73;
					local57 += local87;
					local7++;
					local87 += local65;
					local73 += local65;
				}
			}
			if (local57 < 0) {
				local48 += local73;
				local57 += local87;
				local73 += local65;
				local7++;
				local87 += local65;
			}
			local57 += -local81;
			local48 += -local93;
			local19--;
			local93 -= local61;
			local81 -= local61;
			local107 = arg2 - local19;
			local116 = local19 + arg2;
			if (local116 >= Static357.anInt6537 && local107 <= Static85.anInt1517) {
				@Pc(213) int local213 = Static248.method3569(Static47.anInt762, Static60.anInt1086, local7 + arg0);
				@Pc(222) int local222 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg0 - local7);
				if (Static357.anInt6537 <= local107) {
					Static23.method323(Static283.anIntArrayArray30[local107], local222, arg4, local213);
				}
				if (Static85.anInt1517 >= local116) {
					Static23.method323(Static283.anIntArrayArray30[local116], local222, arg4, local213);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!tn;ZI)V")
	public static void method4063(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(3) int arg2) {
		anInt4966 = arg2;
		Static378.anInt6794 = arg0;
		Static93.aClass229_2 = arg1;
	}
}
