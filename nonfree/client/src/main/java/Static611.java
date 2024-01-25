import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
	public static int anInt9892;

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
	public static int anInt9885 = 0;

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
	public static int anInt9889 = 0;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)V")
	public static void method8468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static489.aClass282_12.method7135(Static59.aClass43_24.method1598(Static325.anInt6083));
		@Pc(61) int local61;
		@Pc(36) int local36;
		if (Static392.aBoolean518) {
			for (@Pc(20) Class3_Sub4_Sub1 local20 = (Class3_Sub4_Sub1) Static226.aClass15_3.method897(); local20 != null; local20 = (Class3_Sub4_Sub1) Static226.aClass15_3.method898()) {
				if (local20.anInt805 == 1) {
					local36 = Static114.method2324((Class3_Sub4_Sub13) local20.aClass15_1.aClass3_Sub4_5.aClass3_Sub4_66);
				} else {
					local36 = Static559.method8066(local20);
				}
				if (local36 > local13) {
					local13 = local36;
				}
			}
			local13 += 8;
			local61 = Static157.anInt3113 * 16 + 21;
			Static354.anInt6787 = Static157.anInt3113 * 16 + (Static519.aBoolean557 ? 26 : 22);
		} else {
			for (@Pc(78) Class3_Sub4_Sub13 local78 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5874(); local78 != null; local78 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5870()) {
				local36 = Static114.method2324(local78);
				if (local36 > local13) {
					local13 = local36;
				}
			}
			local61 = Static160.anInt3142 * 16 + 21;
			Static354.anInt6787 = Static160.anInt3142 * 16 + (Static519.aBoolean557 ? 26 : 22);
			local13 += 8;
		}
		@Pc(120) int local120 = arg1 - local13 / 2;
		if (Static109.anInt2357 < local13 + local120) {
			local120 = Static109.anInt2357 - local13;
		}
		if (local120 < 0) {
			local120 = 0;
		}
		local36 = arg0;
		if (arg0 + local61 > Static330.anInt6165) {
			local36 = Static330.anInt6165 - local61;
		}
		if (local36 < 0) {
			local36 = 0;
		}
		Static276.anInt4979 = local120;
		Static625.anInt10194 = local36;
		Static447.aBoolean555 = true;
		Static452.anInt3209 = local13;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(III)I")
	public static int method8470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static349.method5808(arg0 + 91923, arg1 + 45365, 4) + (Static349.method5808(arg0 - -37821, arg1 - -10294, 2) + -128 >> 1) + (Static349.method5808(arg0, arg1, 1) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II[III)V")
	public static void method8472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(7) int local7 = arg0 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (local11 > arg1) {
			@Pc(15) int local15 = arg1 + 1;
			arg2[local15] = arg3;
			@Pc(20) int local20 = local15 + 1;
			arg2[local20] = arg3;
			@Pc(25) int local25 = local20 + 1;
			arg2[local25] = arg3;
			@Pc(30) int local30 = local25 + 1;
			arg2[local30] = arg3;
			@Pc(35) int local35 = local30 + 1;
			arg2[local35] = arg3;
			@Pc(40) int local40 = local35 + 1;
			arg2[local40] = arg3;
			@Pc(45) int local45 = local40 + 1;
			arg2[local45] = arg3;
			arg1 = local45 + 1;
			arg2[arg1] = arg3;
		}
		while (local7 > arg1) {
			arg1++;
			arg2[arg1] = arg3;
		}
	}
}
