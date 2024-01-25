import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Z")
	public static boolean aBoolean223 = false;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "J")
	public static long aLong98 = 0L;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "Lclient!ft;")
	public static final Class88 aClass88_28 = new Class88();

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public static void method2812() {
		Static449.anIntArray638 = Static85.method1525(0.4F);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/lang/String;Lclient!hf;I)Lclient!uu;")
	public static Class249 method2815(@OriginalArg(1) String arg0, @OriginalArg(2) Class103 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg1.method2370(arg0);
		} else if (arg2 == 1) {
			@Pc(38) Class249 local38;
			try {
				Static453.method334(new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg0)).toString() }, "openjs", arg1.anApplet1);
				local38 = new Class249();
				local38.anInt6929 = 1;
				return local38;
			} catch (@Pc(44) Throwable local44) {
				local38 = new Class249();
				local38.anInt6929 = 2;
				return local38;
			}
		} else {
			@Pc(80) Class249 local80;
			if (arg2 == 2) {
				try {
					arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_blank");
					local80 = new Class249();
					local80.anInt6929 = 1;
					return local80;
				} catch (@Pc(86) Exception local86) {
					local80 = new Class249();
					local80.anInt6929 = 2;
					return local80;
				}
			} else if (arg2 == 3) {
				try {
					Static453.method333(arg1.anApplet1, "loggedout");
				} catch (@Pc(108) Throwable local108) {
				}
				try {
					arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_top");
					local80 = new Class249();
					local80.anInt6929 = 1;
					return local80;
				} catch (@Pc(130) Exception local130) {
					local80 = new Class249();
					local80.anInt6929 = 2;
					return local80;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)I")
	public static int method2816(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IFIIII[FFIII)V")
	public static void method2818(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg2 - arg8;
		@Pc(9) int local9 = arg7 - arg9;
		@Pc(13) int local13 = arg4 - arg0;
		@Pc(38) float local38 = arg5[1] * (float) local13 + (float) local9 * arg5[0] + (float) local5 * arg5[2];
		@Pc(59) float local59 = (float) local13 * arg5[4] + (float) local9 * arg5[3] + (float) local5 * arg5[5];
		@Pc(80) float local80 = arg5[6] * (float) local9 + arg5[7] * (float) local13 + (float) local5 * arg5[8];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg1 != 1.0F) {
			local91 *= arg1;
		}
		@Pc(110) float local110 = local59 + arg6 + 0.5F;
		@Pc(117) float local117;
		if (arg3 == 1) {
			local117 = local91;
			local91 = -local110;
			local110 = local117;
		} else if (arg3 == 2) {
			local91 = -local91;
			local110 = -local110;
		} else if (arg3 == 3) {
			local117 = local91;
			local91 = local110;
			local110 = -local117;
		}
		Static356.aFloat94 = local110;
		Static431.aFloat93 = local91;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!qh;II)V")
	public static void method2824(@OriginalArg(1) Class3_Sub3_Sub6_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt6713 == arg1 && arg1 != -1) {
			@Pc(28) Class83 local28 = Static244.aClass174_2.method4011(arg1);
			@Pc(31) int local31 = local28.anInt1981;
			if (local31 == 1) {
				arg0.anInt6725 = arg2;
				arg0.anInt6728 = 0;
				arg0.anInt6692 = 1;
				arg0.anInt6683 = 0;
				arg0.anInt6723 = 0;
				Static34.method731(local28, arg0.aByte93, arg0.anInt6683, arg0 == Static134.aClass3_Sub3_Sub6_Sub1_1, arg0.anInt6675, arg0.anInt6677);
			}
			if (local31 == 2) {
				arg0.anInt6728 = 0;
				return;
			}
		} else if (arg1 == -1 || arg0.anInt6713 == -1 || Static244.aClass174_2.method4011(arg1).anInt1998 >= Static244.aClass174_2.method4011(arg0.anInt6713).anInt1998) {
			arg0.anInt6692 = 1;
			arg0.anInt6755 = arg0.anInt6756;
			arg0.anInt6725 = arg2;
			arg0.anInt6723 = 0;
			arg0.anInt6683 = 0;
			arg0.anInt6728 = 0;
			arg0.anInt6713 = arg1;
			if (arg0.anInt6713 == -1) {
				return;
			}
			Static34.method731(Static244.aClass174_2.method4011(arg0.anInt6713), arg0.aByte93, arg0.anInt6683, Static134.aClass3_Sub3_Sub6_Sub1_1 == arg0, arg0.anInt6675, arg0.anInt6677);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method2825(@OriginalArg(0) Class6_Sub15 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static182.aClass155_5 != null) {
			@Pc(25) int local25;
			try {
				Static182.aClass155_5.method3607(0L);
				Static182.aClass155_5.method3602(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(50) Exception local50) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method3135(24, local13);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIZ)V")
	public static void method2827(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class6_Sub17 local10 = Static85.method1523(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray289.length; local15++) {
				local10.anIntArray289[local15] = -1;
				local10.anIntArray287[local15] = 0;
			}
		}
	}
}
