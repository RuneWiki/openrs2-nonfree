import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!to", name = "e", descriptor = "I")
	public static int anInt9555;

	@OriginalMember(owner = "client!to", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray60 = new String[100];

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BZIIII)V")
	public static void method8046(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(23) int local23 = arg3 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(48) int local48 = Static73.aShort23 + (Static183.aShort48 - Static73.aShort23) * local23 / 100;
		if (local48 < Static492.aShort80) {
			local48 = Static492.aShort80;
		} else if (Static423.aShort84 < local48) {
			local48 = Static423.aShort84;
		}
		@Pc(74) int local74 = local48 * 512 * arg3 / (arg1 * 334);
		@Pc(111) int local111;
		@Pc(118) int local118;
		@Pc(82) short local82;
		if (Static168.aShort42 > local74) {
			local82 = Static168.aShort42;
			local48 = local82 * arg1 * 334 / (arg3 * 512);
			if (Static423.aShort84 < local48) {
				local48 = Static423.aShort84;
				local111 = arg3 * local48 * 512 / (local82 * 334);
				local118 = (arg1 - local111) / 2;
				if (arg0) {
					Static546.aClass132_13.la();
					Static546.aClass132_13.method7512(arg3, local118, arg4, arg2, -16777216);
					Static546.aClass132_13.method7512(arg3, local118, arg1 + arg4 - local118, arg2, -16777216);
				}
				arg1 -= local118 * 2;
				arg4 += local118;
			}
		} else if (local74 > Static372.aShort82) {
			local82 = Static372.aShort82;
			local48 = local82 * arg1 * 334 / (arg3 * 512);
			if (Static492.aShort80 > local48) {
				local48 = Static492.aShort80;
				local111 = arg1 * 334 * local82 / (local48 * 512);
				local118 = (arg3 - local111) / 2;
				if (arg0) {
					Static546.aClass132_13.la();
					Static546.aClass132_13.method7512(local118, arg1, arg4, arg2, -16777216);
					Static546.aClass132_13.method7512(local118, arg1, arg4, arg2 + arg3 - local118, -16777216);
				}
				arg3 -= local118 * 2;
				arg2 += local118;
			}
		}
		Static3.anInt1080 = local48 * arg3 / 334;
		Static24.anInt590 = (short) arg1;
		Static598.anInt9789 = arg2;
		Static111.anInt6761 = (short) arg3;
		Static305.anInt5198 = arg4;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ha;Lclient!ro;BII)V")
	public static void method8048(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) Class308 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class281 local9 = Static340.aClass186_3.method4234(arg2.anInt8614);
		if (local9.anInt8088 == -1) {
			return;
		}
		if (arg2.aBoolean600) {
			@Pc(22) int local22 = arg3 + arg2.anInt8600;
			arg3 = local22 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(38) Class9 local38 = local9.method6920(arg3, arg2.aBoolean605, arg1);
		if (local38 == null) {
			return;
		}
		@Pc(48) int local48 = arg2.anInt8587;
		@Pc(51) int local51 = arg2.anInt8589;
		if ((arg3 & 0x1) == 1) {
			local51 = arg2.anInt8587;
			local48 = arg2.anInt8589;
		}
		@Pc(65) int local65 = local38.method8937();
		@Pc(68) int local68 = local38.method8930();
		if (local9.aBoolean557) {
			local68 = local51 * 4;
			local65 = local48 * 4;
		}
		if (local9.anInt8085 == 0) {
			local38.method8936(arg0, arg4 - (local51 - 1) * 4, local65, local68);
		} else {
			local38.method8924(arg0, arg4 + 4 - local51 * 4, local65, local68, 0, local9.anInt8085 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!lm;ILclient!lm;)V")
	public static void method8049(@OriginalArg(0) Class6_Sub4 arg0, @OriginalArg(2) Class6_Sub4 arg1) {
		if (arg0.aClass6_Sub4_66 != null) {
			arg0.method9043();
		}
		arg0.aClass6_Sub4_67 = arg1.aClass6_Sub4_67;
		arg0.aClass6_Sub4_66 = arg1;
		arg0.aClass6_Sub4_66.aClass6_Sub4_67 = arg0;
		arg0.aClass6_Sub4_67.aClass6_Sub4_66 = arg0;
	}
}
