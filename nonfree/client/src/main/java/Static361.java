import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
	public static int anInt5761;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([BIIIII)V")
	public static void method5167(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(17) int local17 = arg2 - arg3 >> 2;
		arg1 += arg3;
		while (true) {
			local17--;
			if (local17 < 0) {
				local17 = arg2 - arg3 & 0x3;
				while (true) {
					local17--;
					if (local17 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(33) int local33 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg0[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg0[local38] = 1;
			arg1 = local43 + 1;
			arg0[local43] = 1;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!et;B)Lclient!le;")
	public static Class120_Sub2 method5168(@OriginalArg(0) Class2_Sub20 arg0) {
		return new Class120_Sub2(arg0.method8598(), arg0.method8598(), arg0.method8598(), arg0.method8598(), arg0.method8583(), arg0.method8581(-17416));
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[B)V")
	public static void method5172(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub20 local10 = new Class2_Sub20(arg0);
		while (true) {
			@Pc(22) int local22;
			@Pc(56) int local56;
			@Pc(51) int local51;
			label45: do {
				while (true) {
					while (true) {
						local22 = local10.method8581(-17416);
						if (local22 == 0) {
							return;
						}
						if (local22 == 1) {
							@Pc(140) int[] local140 = Static44.anIntArray54 = new int[6];
							local140[0] = local10.method8575();
							local140[1] = local10.method8575();
							local140[2] = local10.method8575();
							local140[3] = local10.method8575();
							local140[4] = local10.method8575();
							local140[5] = local10.method8575();
						} else {
							if (local22 != 4) {
								continue label45;
							}
							local51 = local10.method8581(-17416);
							Static336.anIntArray366 = new int[local51];
							for (local56 = 0; local56 < local51; local56++) {
								Static336.anIntArray366[local56] = local10.method8575();
								if (Static336.anIntArray366[local56] == 65535) {
									Static336.anIntArray366[local56] = -1;
								}
							}
						}
					}
				}
			} while (local22 != 5);
			local51 = local10.method8581(-17416);
			Static45.anIntArray56 = new int[local51];
			for (local56 = 0; local56 < local51; local56++) {
				Static45.anIntArray56[local56] = local10.method8575();
				if (Static45.anIntArray56[local56] == 65535) {
					Static45.anIntArray56[local56] = -1;
				}
			}
		}
	}
}
