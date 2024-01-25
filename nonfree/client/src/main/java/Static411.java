import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!q", name = "e", descriptor = "[I")
	public static final int[] anIntArray703 = new int[500];

	@OriginalMember(owner = "client!q", name = "f", descriptor = "Lclient!ju;")
	public static final Class164 aClass164_15 = new Class164();

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)Z")
	public static boolean method7687(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2 || arg0 == 4;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method7688(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local34++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static391.aCharArray7[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					@Pc(80) int local80 = local52.length() - 1;
					local70 = ' ';
					local52.setCharAt(local80, Character.toUpperCase(local52.charAt(local80)));
				}
				local52.append(local70);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method7689(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static404.method5927(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(35) int local35 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(38) int local38;
			do {
				local38 = arg1.nextInt();
			} while (local38 >= local35);
			return Static464.method6507(local38, arg0);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method7691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static450.anIntArrayArrayArray4[arg0][local16][local20] == -Static31.anInt4658) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static339.anInt6128) + 1;
			@Pc(142) int local142 = (arg3 << Static339.anInt6128) + 2;
			@Pc(151) int local151 = Static133.aClass59Array3[arg0].JA(arg1, arg3) + arg5;
			if (!Static502.method6781(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static339.anInt6128) - 1;
			if (!Static502.method6781(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static339.anInt6128) - 1;
			if (!Static502.method6781(local20, local151, local177)) {
				return false;
			} else if (Static502.method6781(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static219.method3784(arg0, arg1, arg3)) {
			local16 = arg1 << Static339.anInt6128;
			local20 = arg3 << Static339.anInt6128;
			return Static502.method6781(local16 + 1, Static133.aClass59Array3[arg0].JA(arg1, arg3) + arg5, local20 + 1) && Static502.method6781(local16 + Static112.anInt2178 - 1, Static133.aClass59Array3[arg0].JA(arg1 + 1, arg3) + arg5, local20 + 1) && Static502.method6781(local16 + Static112.anInt2178 - 1, Static133.aClass59Array3[arg0].JA(arg1 + 1, arg3 + 1) + arg5, local20 + Static112.anInt2178 - 1) && Static502.method6781(local16 + 1, Static133.aClass59Array3[arg0].JA(arg1, arg3 + 1) + arg5, local20 + Static112.anInt2178 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)Ljava/lang/String;")
	public static String method7692() {
		return Static587.aBoolean734 || Static328.aClass6_Sub45_3 == null ? "" : Static328.aClass6_Sub45_3.aString97;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
	public static void method7694() {
		Static349.aClass206_5.method4892();
		Static264.aClass126_5.method3238();
		Static304.aClass333_1.method7235();
		Static412.aClass307_4.method6634();
		Static577.aClass125_2.method3235();
		Static444.aClass322_2.method7142();
		Static78.aClass298_2.method6515();
		Static289.aClass66_7.method1653();
		Static183.aClass316_1.method6783();
		Static509.aClass208_6.method4918();
		Static333.aClass149_1.method3767();
		Static418.aClass3_4.method63();
		Static245.aClass213_3.method5126();
		Static586.aClass89_1.method2569();
		Static577.aClass185_2.method4523();
		Static209.aClass270_1.method6102();
		Static230.aClass306_1.method6627();
		Static507.aClass196_1.method4684();
		Static543.aClass112_2.method2958();
		Static121.aClass99_1.method2783();
		Static149.method2868();
		Static148.method2862();
		Static361.method6649();
		Static387.method5719();
		Static425.method6108();
		Static552.aClass136_105.method3476();
		Static105.aClass136_24.method3476();
		Static282.aClass136_60.method3476();
		Static433.aClass136_83.method3476();
		Static446.aClass136_84.method3476();
	}
}
