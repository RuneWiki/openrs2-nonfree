import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
	public static int anInt5190 = 0;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(IB)V")
	public static void method4671(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static565.anInt8921 - Static224.anInt3867;
		if (local8 >= 100) {
			Static426.anInt7111 = 1;
			Static417.anInt7039 = -1;
			Static227.anInt9451 = -1;
			return;
		}
		@Pc(29) int local29 = (int) Static211.aFloat113;
		if (Static464.anInt7536 >> 8 > local29) {
			local29 = Static464.anInt7536 >> 8;
		}
		if (Static322.aBooleanArray14[4] && local29 < Static328.anIntArray322[4] + 128) {
			local29 = Static328.anIntArray322[4] + 128;
		}
		@Pc(72) int local72 = (int) Static243.aFloat117 + Static285.anInt5040 & 0x3FFF;
		Static320.method4906(arg0, local29, Static461.method6500(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805, Static324.anInt5529, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803) - 200, (local29 >> 3) * 3 + 600 << 2, Static343.anInt5712, local72, Static620.anInt8145);
		@Pc(117) float local117 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static141.anInt2764 = (int) ((float) Static360.anInt5879 + (float) (Static141.anInt2764 - Static360.anInt5879) * local117);
		Static96.anInt10862 = (int) ((float) (Static96.anInt10862 - Static459.anInt7422) * local117 + (float) Static459.anInt7422);
		Static42.anInt703 = (int) ((float) Static92.anInt9656 + local117 * (float) (Static42.anInt703 - Static92.anInt9656));
		Static282.anInt5025 = (int) (local117 * (float) (Static282.anInt5025 - Static353.anInt5829) + (float) Static353.anInt5829);
		@Pc(169) int local169 = Static542.anInt8612 - Static420.anInt7085;
		if (local169 > 8192) {
			local169 -= 16384;
		} else if (local169 < -8192) {
			local169 += 16384;
		}
		Static542.anInt8612 = (int) ((float) local169 * local117 + (float) Static420.anInt7085);
		Static542.anInt8612 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBIIIII)V")
	public static void method4672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 != 8 && arg2 != 16) {
			@Pc(24) Class128 local24 = Static283.aClass128ArrayArrayArray1[arg4][arg3][arg0];
			if (local24 == null) {
				local24 = new Class128(arg4);
			}
			if (arg2 == 1) {
				local24.aShort41 = (short) arg5;
				local24.aShort39 = (short) arg1;
			} else if (arg2 == 2) {
				local24.aShort40 = (short) arg1;
				local24.aShort42 = (short) arg5;
			}
			if (Static92.aBoolean677) {
				Static584.method8039();
			}
			return;
		}
		@Pc(82) int local82;
		@Pc(87) int local87;
		@Pc(91) int local91;
		@Pc(95) int local95;
		@Pc(105) int local105;
		@Pc(115) int local115;
		if (arg2 != 8) {
			local82 = Static492.anInt7972 + (arg3 << Static314.anInt5377);
			local87 = local82 - Static492.anInt7972;
			local91 = arg0 << Static314.anInt5377;
			local95 = Static492.anInt7972 + local91;
			local105 = Static668.aClass84Array4[arg4].method7620(arg0, arg3 + 1);
			local115 = Static668.aClass84Array4[arg4].method7620(arg0 + 1, arg3);
			Static96.aClass250Array178[Static412.anInt6979++] = new Class250(arg2, arg4, local82, local87, local87, local82, local105, local115, local115 - arg5, local105 + -arg5, local91, local95, local95, local91);
			return;
		}
		local82 = arg3 << Static314.anInt5377;
		local87 = local82 + Static492.anInt7972;
		local91 = arg0 << Static314.anInt5377;
		local95 = local91 + Static492.anInt7972;
		local105 = Static668.aClass84Array4[arg4].method7620(arg0, arg3);
		local115 = Static668.aClass84Array4[arg4].method7620(arg0 + 1, arg3 + 1);
		Static96.aClass250Array178[Static412.anInt6979++] = new Class250(arg2, arg4, local82, local87, local87, local82, local105, local115, local115 - arg5, local105 + -arg5, local91, local95, local95, local91);
	}
}
