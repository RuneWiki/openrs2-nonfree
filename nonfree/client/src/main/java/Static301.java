import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!kha", name = "p", descriptor = "I")
	public static final int anInt5209 = 1400;

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)V")
	public static void method4696() {
		@Pc(21) short local21 = 1024;
		@Pc(23) short local23 = 3072;
		if (Static305.aBoolean339) {
			if (Static657.aBoolean757) {
				local21 = 2048;
			}
			local23 = 4096;
		}
		if ((float) local21 > Static211.aFloat113) {
			Static211.aFloat113 = (float) local21;
		}
		while (Static243.aFloat117 >= 16384.0F) {
			Static243.aFloat117 -= 16384.0F;
		}
		if (Static211.aFloat113 > (float) local23) {
			Static211.aFloat113 = (float) local23;
		}
		while (Static243.aFloat117 < 0.0F) {
			Static243.aFloat117 += 16384.0F;
		}
		@Pc(85) int local85 = Static620.anInt8145 >> 9;
		@Pc(89) int local89 = Static343.anInt5712 >> 9;
		@Pc(95) int local95 = Static461.method6500(Static620.anInt8145, Static324.anInt5529, Static343.anInt5712);
		@Pc(97) int local97 = 0;
		@Pc(129) int local129;
		if (local85 > 3 && local89 > 3 && local85 < Static271.anInt4910 - 4 && Static613.anInt9909 - 4 > local89) {
			for (local129 = local85 - 4; local129 <= local85 + 4; local129++) {
				for (@Pc(137) int local137 = local89 - 4; local137 <= local89 + 4; local137++) {
					@Pc(141) int local141 = Static324.anInt5529;
					if (local141 < 3 && Static389.method1741(local137, local129)) {
						local141++;
					}
					@Pc(158) int local158 = 0;
					if (Static168.aClass137_Sub1_1.aByteArrayArrayArray18 != null && Static168.aClass137_Sub1_1.aByteArrayArrayArray18[local141] != null) {
						local158 = (Static168.aClass137_Sub1_1.aByteArrayArrayArray18[local141][local129][local137] & 0xFF) * 8 << 2;
					}
					if (Static177.aClass84Array2 != null && Static177.aClass84Array2[local141] != null) {
						@Pc(204) int local204 = local95 + local158 - Static177.aClass84Array2[local141].method7620(local137, local129);
						if (local97 < local204) {
							local97 = local204;
						}
					}
				}
			}
		}
		local129 = (local97 >> 2) * 1536;
		if (local129 > 786432) {
			local129 = 786432;
		}
		if (local129 < 262144) {
			local129 = 262144;
		}
		if (local129 > Static464.anInt7536) {
			Static464.anInt7536 += (local129 - Static464.anInt7536) / 24;
		} else if (Static464.anInt7536 > local129) {
			Static464.anInt7536 += (local129 - Static464.anInt7536) / 80;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Lclient!hk;IIIILclient!aa;Lclient!mj;I)V")
	public static void method4698(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) Class238 arg5, @OriginalArg(7) int arg6) {
		if (arg0 == null) {
			return;
		}
		@Pc(17) int local17;
		if (Static426.anInt7111 == 4) {
			local17 = (int) Static243.aFloat117 & 0x3FFF;
		} else {
			local17 = Static271.anInt4907 + (int) Static243.aFloat117 & 0x3FFF;
		}
		@Pc(38) int local38 = Math.max(arg5.anInt5985 / 2, arg5.anInt5973 / 2) + 10;
		@Pc(47) int local47 = arg6 * arg6 + arg1 * arg1;
		if (local47 > local38 * local38) {
			return;
		}
		@Pc(62) int local62 = Class42.anIntArray51[local17];
		@Pc(66) int local66 = Class42.anIntArray52[local17];
		if (Static426.anInt7111 != 4) {
			local62 = local62 * 256 / (Static283.anInt5029 + 256);
			local66 = local66 * 256 / (Static283.anInt5029 + 256);
		}
		@Pc(95) int local95 = arg6 * local66 + arg1 * local62 >> 14;
		@Pc(106) int local106 = arg1 * local66 - local62 * arg6 >> 14;
		arg0.method7203(arg5.anInt5985 / 2 + arg2 + local95 - arg0.method7206() / 2, -local106 + arg5.anInt5973 / 2 + arg3 - arg0.method7209() / 2, arg4, arg2, arg3);
	}
}
