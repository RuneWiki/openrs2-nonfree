import java.awt.Rectangle;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/util/Random;IB)I")
	public static int method3692(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static232.method4114(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(59) int local59 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(62) int local62;
			do {
				local62 = arg0.nextInt();
			} while (local62 >= local59);
			return Static667.method8846(arg1, local62);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V")
	public static void method3697(@OriginalArg(0) int arg0, @OriginalArg(2) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static290.anInt10204 == 1) {
			Static409.aClass75_13.method6711(arg1, arg0, Static592.anInt9421, Static211.anInt4193);
		} else {
			Static409.aClass75_13.method6711(arg1, arg0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!aa;IIILclient!cd;IZLjava/lang/String;IILclient!vo;Lclient!da;)V")
	public static void method3699(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class53 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class381 arg9, @OriginalArg(11) Class67 arg10) {
		@Pc(11) int local11;
		if (Static526.anInt8626 == 4) {
			local11 = (int) Static409.aFloat135 & 0x3FFF;
		} else {
			local11 = (int) Static409.aFloat135 + Static51.anInt622 & 0x3FFF;
		}
		@Pc(51) int local51 = Math.max(arg9.anInt10159 / 2, arg9.anInt10131 / 2) + 10;
		@Pc(59) int local59 = arg1 * arg1 + arg7 * arg7;
		if (local59 > local51 * local51) {
			return;
		}
		@Pc(74) int local74 = Class6_Sub2_Sub12.anIntArray293[local11];
		@Pc(78) int local78 = Class6_Sub2_Sub12.anIntArray292[local11];
		if (Static526.anInt8626 != 4) {
			local78 = local78 * 256 / (Static41.anInt542 + 256);
			local74 = local74 * 256 / (Static41.anInt542 + 256);
		}
		@Pc(107) int local107 = arg7 * local74 + arg1 * local78 >> 14;
		@Pc(118) int local118 = local78 * arg7 - local74 * arg1 >> 14;
		@Pc(125) int local125 = arg4.method814(100, arg6, (Class49[]) null);
		@Pc(133) int local133 = arg4.method815((Class49[]) null, 100, arg6, 0);
		@Pc(139) int local139 = local107 - local125 / 2;
		if (local139 >= -arg9.anInt10159 && arg9.anInt10159 >= local139 && -arg9.anInt10131 <= local118 && local118 <= arg9.anInt10131) {
			arg10.method8281(arg9.anInt10131 / 2 + arg8 - arg2 - local118 - local133, arg5, arg9.anInt10159 / 2 + local139 + arg3, (int[]) null, 1, 50, arg8, 0, 0, arg3, (Class49[]) null, 0, arg0, local125, arg6);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method3700(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static661.anInt10532;
		@Pc(9) int[] local9 = Static591.anIntArray611;
		@Pc(11) boolean local11 = false;
		for (@Pc(18) int local18 = 0; local18 < local7; local18++) {
			@Pc(26) Class60_Sub1_Sub1_Sub3_Sub1 local26 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local9[local18]];
			if (local26 != null && Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 != local26 && local26.aString23 != null && local26.aString23.equalsIgnoreCase(arg1)) {
				@Pc(47) Class241 local47 = null;
				if (arg0 == 1) {
					local47 = Static338.aClass241_75;
				} else if (arg0 == 4) {
					local47 = Static485.aClass241_100;
				} else if (arg0 == 5) {
					local47 = Static658.aClass241_121;
				} else if (arg0 == 6) {
					local47 = Static431.aClass241_93;
				} else if (arg0 == 7) {
					local47 = Static221.aClass241_61;
				} else if (arg0 == 9) {
					local47 = Static597.aClass241_113;
				}
				local11 = true;
				if (local47 != null) {
					@Pc(106) Class6_Sub13 local106 = Static30.method353(local47, Static525.aClass260_4.aClass270_2);
					local106.aClass6_Sub15_Sub1_1.method2984(local9[local18]);
					local106.aClass6_Sub15_Sub1_1.method3016(0);
					Static525.aClass260_4.method6404(local106);
				}
				break;
			}
		}
		if (!local11) {
			Static298.method4814(Static50.aClass43_21.method596(Static601.anInt9518) + arg1);
		}
	}
}
