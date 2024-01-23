import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public static int anInt3570 = 0;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public static int anInt3572 = 0;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString126 = "Loaded input handler";

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
	public static int anInt3573 = 0;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
	public static int anInt3577 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
	public static void method2783() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glDisableClientState(32886);
		Static116.method1883(false);
		local1.glDisable(2929);
		local1.glPushAttrib(128);
		local1.glFogf(2915, 3072.0F);
		Static116.method1874();
		for (@Pc(19) int local19 = 0; local19 < Static69.aClass8_Sub29ArrayArray3[0].length; local19++) {
			@Pc(31) Class8_Sub29 local31 = Static69.aClass8_Sub29ArrayArray3[0][local19];
			if (local31.anInt4984 >= 0 && Static69.method1133(Static96.anInterface4_1.method1265(local31.anInt4984))) {
				local1.glColor4fv(Static57.method908(local31.anInt4981), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean403 ? 1.0F : 0.5F);
				local31.method3781(Static178.aClass8_Sub27ArrayArrayArray1, local58, true);
			}
		}
		local1.glEnableClientState(32886);
		Static116.method1877();
		local1.glEnable(2929);
		local1.glPopAttrib();
		Static116.method1881();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	public static void method2784(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static197.anInt3894 = arg4;
		Static163.anInt4481 = arg0;
		Static145.anInt2861 = arg1;
		Static151.anInt4072 = arg3;
		Static176.anInt3474 = arg2;
		if (Static151.anInt4072 >= 100) {
			@Pc(24) int local24 = Static145.anInt2861 * 128 + 64;
			@Pc(30) int local30 = Static197.anInt3894 * 128 + 64;
			@Pc(39) int local39 = Static59.method927(local24, local30, Static34.anInt770) - Static163.anInt4481;
			@Pc(43) int local43 = local24 - Static46.anInt1044;
			@Pc(48) int local48 = local39 - Static170.anInt3411;
			@Pc(53) int local53 = local30 - Static185.anInt3689;
			@Pc(64) int local64 = (int) Math.sqrt((double) (local53 * local53 + local43 * local43));
			Static56.anInt1246 = (int) (Math.atan2((double) local48, (double) local64) * 325.949D) & 0x7FF;
			Static293.anInt5684 = (int) (-325.949D * Math.atan2((double) local43, (double) local53)) & 0x7FF;
			if (Static56.anInt1246 < 128) {
				Static56.anInt1246 = 128;
			}
			if (Static56.anInt1246 > 383) {
				Static56.anInt1246 = 383;
			}
		}
		Static172.anInt3428 = 2;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pk;IZI)Lclient!wk;")
	public static Class43_Sub2 method2785(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1) {
		return Static247.method4168(arg0, 0, arg1) ? Static146.method2312() : null;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	public static void method2786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		@Pc(18) int local18;
		for (local7 = arg4; local7 <= arg4 + arg3; local7++) {
			for (local18 = arg0; local18 <= arg2 + arg0; local18++) {
				if (local18 >= 0 && local18 < 104 && local7 >= 0 && local7 < 104) {
					Static40.aByteArrayArrayArray1[arg1][local18][local7] = 127;
				}
			}
		}
		for (local7 = arg4; local7 < arg3 + arg4; local7++) {
			for (local18 = arg0; local18 < arg2 + arg0; local18++) {
				if (local18 >= 0 && local18 < 104 && local7 >= 0 && local7 < 104) {
					Static195.anIntArrayArrayArray7[arg1][local18][local7] = arg1 <= 0 ? 0 : Static195.anIntArrayArrayArray7[arg1 - 1][local18][local7];
				}
			}
		}
		if (arg0 > 0 && arg0 < 104) {
			for (local7 = arg4 + 1; local7 < arg3 + arg4; local7++) {
				if (local7 >= 0 && local7 < 104) {
					Static195.anIntArrayArrayArray7[arg1][arg0][local7] = Static195.anIntArrayArrayArray7[arg1][arg0 - 1][local7];
				}
			}
		}
		if (arg4 > 0 && arg4 < 104) {
			for (local7 = arg0 + 1; local7 < arg2 + arg0; local7++) {
				if (local7 >= 0 && local7 < 104) {
					Static195.anIntArrayArrayArray7[arg1][local7][arg4] = Static195.anIntArrayArrayArray7[arg1][local7][arg4 - 1];
				}
			}
		}
		if (arg0 < 0 || arg4 < 0 || arg0 >= 104 || arg4 >= 104) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 > 0 && Static195.anIntArrayArrayArray7[arg1][arg0 - 1][arg4] != 0) {
				Static195.anIntArrayArrayArray7[arg1][arg0][arg4] = Static195.anIntArrayArrayArray7[arg1][arg0 - 1][arg4];
			} else if (arg4 > 0 && Static195.anIntArrayArrayArray7[arg1][arg0][arg4 - 1] != 0) {
				Static195.anIntArrayArrayArray7[arg1][arg0][arg4] = Static195.anIntArrayArrayArray7[arg1][arg0][arg4 - 1];
			} else if (arg0 > 0 && arg4 > 0 && Static195.anIntArrayArrayArray7[arg1][arg0 - 1][arg4 - 1] != 0) {
				Static195.anIntArrayArrayArray7[arg1][arg0][arg4] = Static195.anIntArrayArrayArray7[arg1][arg0 - 1][arg4 - 1];
			}
		} else if (arg0 > 0 && Static195.anIntArrayArrayArray7[arg1][arg0 - 1][arg4] != Static195.anIntArrayArrayArray7[arg1 - 1][arg0 - 1][arg4]) {
			Static195.anIntArrayArrayArray7[arg1][arg0][arg4] = Static195.anIntArrayArrayArray7[arg1][arg0 - 1][arg4];
		} else if (arg4 > 0 && Static195.anIntArrayArrayArray7[arg1][arg0][arg4 - 1] != Static195.anIntArrayArrayArray7[arg1 - 1][arg0][arg4 - 1]) {
			Static195.anIntArrayArrayArray7[arg1][arg0][arg4] = Static195.anIntArrayArrayArray7[arg1][arg0][arg4 - 1];
		} else if (arg0 > 0 && arg4 > 0 && Static195.anIntArrayArrayArray7[arg1 - 1][arg0 - 1][arg4 - 1] != Static195.anIntArrayArrayArray7[arg1][arg0 - 1][arg4 - 1]) {
			Static195.anIntArrayArrayArray7[arg1][arg0][arg4] = Static195.anIntArrayArrayArray7[arg1][arg0 - 1][arg4 - 1];
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZJ)V")
	public static void method2787(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(10) InterruptedException local10) {
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!tk;I)V")
	public static void method2788(@OriginalArg(0) int arg0, @OriginalArg(2) Class159 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte17 == 0) {
			arg1.anInt5208 = arg1.anInt5158;
		} else if (arg1.aByte17 == 1) {
			arg1.anInt5208 = (arg0 - arg1.anInt5123) / 2 + arg1.anInt5158;
		} else if (arg1.aByte17 == 2) {
			arg1.anInt5208 = arg0 - arg1.anInt5158 - arg1.anInt5123;
		} else if (arg1.aByte17 == 3) {
			arg1.anInt5208 = arg1.anInt5158 * arg0 >> 14;
		} else if (arg1.aByte17 == 4) {
			arg1.anInt5208 = (arg0 - arg1.anInt5123) / 2 + (arg0 * arg1.anInt5158 >> 14);
		} else {
			arg1.anInt5208 = arg0 - (arg0 * arg1.anInt5158 >> 14) - arg1.anInt5123;
		}
		if (arg1.aByte19 == 0) {
			arg1.anInt5198 = arg1.anInt5172;
		} else if (arg1.aByte19 == 1) {
			arg1.anInt5198 = (arg2 - arg1.anInt5121) / 2 + arg1.anInt5172;
		} else if (arg1.aByte19 == 2) {
			arg1.anInt5198 = arg2 - arg1.anInt5121 - arg1.anInt5172;
		} else if (arg1.aByte19 == 3) {
			arg1.anInt5198 = arg1.anInt5172 * arg2 >> 14;
		} else if (arg1.aByte19 == 4) {
			arg1.anInt5198 = (arg2 - arg1.anInt5121) / 2 + (arg2 * arg1.anInt5172 >> 14);
		} else {
			arg1.anInt5198 = arg2 - (arg2 * arg1.anInt5172 >> 14) - arg1.anInt5121;
		}
		if (!Static104.aBoolean169 || Static42.method668(arg1).anInt4411 == 0 && arg1.anInt5197 != 0) {
			return;
		}
		if (arg1.anInt5208 < 0) {
			arg1.anInt5208 = 0;
		} else if (arg0 < arg1.anInt5208 + arg1.anInt5123) {
			arg1.anInt5208 = arg0 - arg1.anInt5123;
		}
		if (arg1.anInt5198 < 0) {
			arg1.anInt5198 = 0;
		} else if (arg1.anInt5198 + arg1.anInt5121 > arg2) {
			arg1.anInt5198 = arg2 - arg1.anInt5121;
		}
	}
}
