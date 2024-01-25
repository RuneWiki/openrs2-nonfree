import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cka", name = "k", descriptor = "[I")
	public static int[] anIntArray125;

	@OriginalMember(owner = "client!cka", name = "d", descriptor = "I")
	public static int anInt1423 = 0;

	@OriginalMember(owner = "client!cka", name = "g", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_27 = new Class180(101, 0);

	@OriginalMember(owner = "client!cka", name = "l", descriptor = "[I")
	public static final int[] anIntArray126 = new int[32];

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "([II[Ljava/lang/Object;II)V")
	public static void method1433(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg3) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) int local20 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local20;
		@Pc(34) Object local34 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local34;
		@Pc(51) int local51 = local20 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg1; local53 < arg3; local53++) {
			if ((local53 & local51) + local20 > arg0[local53]) {
				@Pc(72) int local72 = arg0[local53];
				arg0[local53] = arg0[local16];
				arg0[local16] = local72;
				@Pc(86) Object local86 = arg2[local53];
				arg2[local53] = arg2[local16];
				arg2[local16++] = local86;
			}
		}
		arg0[arg3] = arg0[local16];
		arg0[local16] = local20;
		arg2[arg3] = arg2[local16];
		arg2[local16] = local34;
		method1433(arg0, arg1, arg2, local16 - 1);
		method1433(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(III)I")
	public static int method1434(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return (arg0 & 0xFF80) + local17;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IBI)I")
	public static int method1435(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static366.anInt5930 == -1) {
			return 1;
		}
		if (arg1 != Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970()) {
			Static341.method5108(Static601.aClass346_15.method8440(Static609.anInt9834), true, arg1);
			if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() != arg1) {
				return -1;
			}
		}
		try {
			@Pc(44) Dimension local44 = Static126.aCanvas6.getSize();
			Static21.method603(Static504.aClass69_11, Static674.aClass13_22, Static253.aClass88_19, true, Static601.aClass346_15.method8440(Static609.anInt9834));
			@Pc(62) Class117 local62 = Static98.method1747(Static476.aClass15_122, Static366.anInt5930);
			@Pc(65) long local65 = Static524.method7320();
			Static674.aClass13_22.la();
			Static63.aClass239_1.method9234(0, Static597.anInt9602, 0);
			Static674.aClass13_22.method8501(Static63.aClass239_1);
			Static674.aClass13_22.DA(local44.width / 2, local44.height / 2, 512, 512);
			Static674.aClass13_22.xa(1.0F);
			Static674.aClass13_22.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(106) Class95 local106 = Static674.aClass13_22.method8489(local62, 2048, 64, 64, 768);
			@Pc(108) int local108 = 0;
			label41: for (@Pc(110) int local110 = 0; local110 < 500; local110++) {
				Static674.aClass13_22.GA(0);
				Static674.aClass13_22.ya();
				for (@Pc(119) int local119 = 15; local119 >= 0; local119--) {
					for (@Pc(123) int local123 = 0; local123 <= local119; local123++) {
						Static101.aClass239_2.method9234((int) (((float) local123 - (float) local119 / 2.0F) * (float) Static207.anInt4003), 0, Static207.anInt4003 * (local119 + 1));
						local108++;
						local106.method5653(Static101.aClass239_2, (Class28_Sub8) null, 0);
						if (Static524.method7320() - local65 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static674.aClass13_22.method8457();
			@Pc(201) long local201 = (long) (local108 * 1000) / (Static524.method7320() - local65);
			Static674.aClass13_22.GA(0);
			Static674.aClass13_22.ya();
			return (int) local201;
		} catch (@Pc(210) Throwable local210) {
			local210.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(III)V")
	public static void method1438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static18.anInt450 != 0) {
			if (arg0 < 0) {
				for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
					Static231.anIntArray387[local8] = arg1;
				}
			} else {
				Static231.anIntArray387[arg0] = arg1;
			}
		}
		Static366.aClass3_Sub1_Sub3_4.method2169(arg1, arg0);
	}
}
