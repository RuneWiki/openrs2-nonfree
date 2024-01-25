import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
	public static int anInt551;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "Lclient!c;")
	public static Class26 aClass26_1 = new Class26(8);

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
	public static int anInt553 = 1;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIBIZI)V")
	public static void method767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(23) int local23 = arg4 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(50) int local50 = (Static226.aShort51 - Static159.aShort49) * local23 / 100 + Static159.aShort49;
		if (Static92.aShort14 > local50) {
			local50 = Static92.aShort14;
		} else if (Static26.aShort15 < local50) {
			local50 = Static26.aShort15;
		}
		@Pc(76) int local76 = local50 * 512 * arg4 / (arg0 * 334);
		@Pc(106) int local106;
		@Pc(113) int local113;
		@Pc(81) short local81;
		if (Static83.aShort37 > local76) {
			local81 = Static83.aShort37;
			local50 = arg0 * local81 * 334 / (arg4 * 512);
			if (Static26.aShort15 < local50) {
				local50 = Static26.aShort15;
				local106 = local50 * 512 * arg4 / (local81 * 334);
				local113 = (arg0 - local106) / 2;
				if (arg3) {
					Static147.aClass4_2.method4299();
					Static147.aClass4_2.method4261(arg2, arg1, arg4, local113, -16777216);
					Static147.aClass4_2.method4261(arg2, arg0 + arg1 - local113, arg4, local113, -16777216);
				}
				arg0 -= local113 * 2;
				arg1 += local113;
			}
		} else if (Static234.aShort61 < local76) {
			local81 = Static234.aShort61;
			local50 = local81 * arg0 * 334 / (arg4 * 512);
			if (Static92.aShort14 > local50) {
				local50 = Static92.aShort14;
				local106 = arg0 * 334 * local81 / (local50 * 512);
				local113 = (arg4 - local106) / 2;
				if (arg3) {
					Static147.aClass4_2.method4299();
					Static147.aClass4_2.method4261(arg2, arg1, local113, arg0, -16777216);
					Static147.aClass4_2.method4261(arg4 + arg2 - local113, arg1, local113, arg0, -16777216);
				}
				arg2 += local113;
				arg4 -= local113 * 2;
			}
		}
		Static254.anInt5030 = (short) arg4;
		Static278.anInt5654 = (short) arg0;
		Static255.anInt5040 = arg4 * local50 / 334;
		Static7.anInt154 = arg2;
		Static156.anInt3172 = arg1;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)V")
	public static void method769(@OriginalArg(1) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static226.aByteArrayArray12;
		} else {
			local9 = Static229.aByteArrayArray7;
		}
		@Pc(16) int local16 = Static10.aByteArrayArray2.length;
		for (@Pc(23) int local23 = 0; local23 < local16; local23++) {
			@Pc(29) byte[] local29 = local9[local23];
			if (local29 != null) {
				@Pc(42) int local42 = (Static201.anIntArray310[local23] >> 8) * 64 - Static138.anInt2879;
				@Pc(53) int local53 = (Static201.anIntArray310[local23] & 0xFF) * 64 - Static342.anInt6864;
				Static166.method3083();
				Static168.method3164(Static147.aClass4_2, local42, arg0, local53, local29, Static169.aClass151Array1);
			}
		}
	}
}
