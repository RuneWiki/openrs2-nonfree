import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!v", name = "ab", descriptor = "[[[Lclient!fa;")
	public static Class1_Sub9[][][] aClass1_Sub9ArrayArrayArray3;

	@OriginalMember(owner = "client!v", name = "V", descriptor = "S")
	public static short aShort32 = 1;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII[Lclient!jc;II[BIZ)V")
	public static void method3527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class60[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(10) Class1_Sub26 local10 = new Class1_Sub26(arg8);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method2996();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local10.method2946();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(48) int local48 = local29 >> 12;
				@Pc(52) int local52 = local29 & 0x3F;
				@Pc(58) int local58 = local29 >> 6 & 0x3F;
				@Pc(62) int local62 = local10.method2945();
				@Pc(66) int local66 = local62 & 0x3;
				@Pc(70) int local70 = local62 >> 2;
				if (arg2 == local48 && local58 >= arg1 && local58 < arg1 + 8 && arg4 <= local52 && local52 < arg4 + 8) {
					@Pc(105) Class101 local105 = Static170.method2725(local17);
					@Pc(122) int local122 = arg0 + Static75.method1337(local105.anInt3922, local58 & 0x7, local105.anInt3904, local52 & 0x7, local66, arg6);
					@Pc(139) int local139 = arg7 + Static203.method191(arg6, local105.anInt3922, local105.anInt3904, local66, local58 & 0x7, local52 & 0x7);
					if (local122 > 0 && local139 > 0 && local122 < 103 && local139 < 103) {
						@Pc(159) Class60 local159 = null;
						@Pc(163) int local163 = arg3;
						if ((Static221.aByteArrayArrayArray14[1][local122][local139] & 0x2) == 2) {
							local163 = arg3 - 1;
						}
						if (local163 >= 0) {
							local159 = arg5[local163];
						}
						Static202.method3237(local17, local159, local70, arg3, local122, arg6 + local66 & 0x3, local139, true, arg3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
	public static void method3528() {
		System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method3529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)I")
	public static int method3530() {
		if ((double) Static24.aFloat2 == 3.0D) {
			return 37;
		} else if ((double) Static24.aFloat2 == 4.0D) {
			return 50;
		} else if ((double) Static24.aFloat2 == 6.0D) {
			return 75;
		} else {
			return 100;
		}
	}
}
