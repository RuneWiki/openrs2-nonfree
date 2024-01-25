import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
	public static int anInt3270;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "Z")
	public static boolean aBoolean229 = false;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString200 = " from your ignore list first.";

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_58 = new Class66(5);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([II[ILclient!re;[I)V")
	public static void method2999(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class25_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(15) int local15 = arg3[local7];
			@Pc(19) int local19 = arg0[local7];
			@Pc(23) int local23 = arg1[local7];
			for (@Pc(25) int local25 = 0; local19 != 0 && arg2.aClass146Array3.length > local25; local25++) {
				if ((local19 & 0x1) != 0) {
					if (local15 == -1) {
						arg2.aClass146Array3[local25] = null;
					} else {
						@Pc(46) Class17 local46 = Static261.method4492(local15);
						@Pc(49) int local49 = local46.anInt505;
						@Pc(54) Class146 local54 = arg2.aClass146Array3[local25];
						if (local54 != null) {
							if (local15 == local54.anInt4452) {
								if (local49 == 0) {
									local54 = arg2.aClass146Array3[local25] = null;
								} else if (local49 == 1) {
									local54.anInt4451 = local23;
									local54.anInt4448 = 0;
									local54.anInt4456 = 0;
									local54.anInt4454 = 1;
									local54.anInt4449 = 0;
									Static207.method3696(0, arg2.anInt5769, local46, arg2.anInt5773, false);
								} else if (local49 == 2) {
									local54.anInt4449 = 0;
								}
							} else if (local46.anInt506 >= Static261.method4492(local54.anInt4452).anInt506) {
								local54 = arg2.aClass146Array3[local25] = null;
							}
						}
						if (local54 == null) {
							local54 = arg2.aClass146Array3[local25] = new Class146();
							local54.anInt4451 = local23;
							local54.anInt4452 = local15;
							local54.anInt4454 = 1;
							local54.anInt4448 = 0;
							local54.anInt4456 = 0;
							local54.anInt4449 = 0;
							Static207.method3696(0, arg2.anInt5769, local46, arg2.anInt5773, false);
						}
					}
				}
				local19 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	public static void method3000() {
		if (Static30.aFrame1 != null) {
			return;
		}
		@Pc(22) Container local22;
		if (Static168.aFrame2 == null) {
			local22 = Static202.aClass10_3.anApplet1;
		} else {
			local22 = Static168.aFrame2;
		}
		Static9.anInt307 = local22.getSize().width;
		Static275.anInt5385 = local22.getSize().height;
		@Pc(40) Insets local40;
		if (local22 == Static168.aFrame2) {
			local40 = Static168.aFrame2.getInsets();
			Static275.anInt5385 -= local40.top + local40.bottom;
			Static9.anInt307 -= local40.left + local40.right;
		}
		if (Static315.method5371() == 1) {
			Static17.anInt5991 = 765;
			Static269.anInt5158 = (Static9.anInt307 - 765) / 2;
			Static246.anInt4801 = 503;
			Static312.anInt5960 = 0;
		} else if (Static46.anInt1196 < 96 && Static134.anInt2746 == 0) {
			@Pc(77) int local77 = Static9.anInt307 > 1024 ? 1024 : Static9.anInt307;
			Static17.anInt5991 = local77;
			Static269.anInt5158 = (Static9.anInt307 - local77) / 2;
			@Pc(93) int local93 = Static275.anInt5385 <= 768 ? Static275.anInt5385 : 768;
			Static312.anInt5960 = 0;
			Static246.anInt4801 = local93;
		} else {
			Static312.anInt5960 = 0;
			Static17.anInt5991 = Static9.anInt307;
			Static246.anInt4801 = Static275.anInt5385;
			Static269.anInt5158 = 0;
		}
		if (Static226.anInt4439 != 0) {
			@Pc(132) boolean local132;
			if (Static17.anInt5991 < 1024 && Static246.anInt4801 < 768) {
				local132 = true;
			} else {
				local132 = false;
			}
		}
		Static243.aCanvas3.setSize(Static17.anInt5991, Static246.anInt4801);
		if (Static15.aClass59_1 != null) {
			Static15.aClass59_1.method4884();
		}
		if (local22 == Static168.aFrame2) {
			local40 = Static168.aFrame2.getInsets();
			Static243.aCanvas3.setLocation(local40.left + Static269.anInt5158, Static312.anInt5960 + local40.top);
		} else {
			Static243.aCanvas3.setLocation(Static269.anInt5158, Static312.anInt5960);
		}
		if (Static207.anInt4106 != -1) {
			Static101.method2032(true);
		}
		Static110.method2187();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BILclient!re;I)V")
	public static void method3002(@OriginalArg(1) int arg0, @OriginalArg(2) Class25_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt5312 && arg0 != -1) {
			@Pc(18) Class17 local18 = Static261.method4492(arg0);
			@Pc(21) int local21 = local18.anInt505;
			if (local21 == 1) {
				arg1.anInt5263 = arg2;
				arg1.anInt5281 = 1;
				arg1.anInt5314 = 0;
				arg1.anInt5322 = 0;
				arg1.anInt5285 = 0;
				Static207.method3696(arg1.anInt5285, arg1.anInt5769, local18, arg1.anInt5773, false);
			}
			if (local21 == 2) {
				arg1.anInt5314 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt5312 == -1 || Static261.method4492(arg0).anInt506 >= Static261.method4492(arg1.anInt5312).anInt506) {
			arg1.anInt5285 = 0;
			arg1.anInt5263 = arg2;
			arg1.anInt5312 = arg0;
			arg1.anInt5281 = 1;
			arg1.anInt5341 = arg1.anInt5337;
			arg1.anInt5322 = 0;
			arg1.anInt5314 = 0;
			if (arg1.anInt5312 != -1) {
				Static207.method3696(arg1.anInt5285, arg1.anInt5769, Static261.method4492(arg1.anInt5312), arg1.anInt5773, false);
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBI)V")
	public static void method3003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class5_Sub9_Sub16 local12 = Static239.method4052(9, arg1);
		local12.method4140();
		local12.anInt4723 = arg0;
		local12.anInt4721 = arg2;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIII)I")
	public static int method3005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(24) int local24 = arg0;
			arg0 = arg2;
			arg2 = local24;
		}
		@Pc(32) int local32 = arg1 & 0x3;
		if (local32 == 0) {
			return arg4;
		} else if (local32 == 1) {
			return 8 - arg0 - arg3;
		} else if (local32 == 2) {
			return 7 + 1 - arg4 - arg2;
		} else {
			return arg3;
		}
	}
}
