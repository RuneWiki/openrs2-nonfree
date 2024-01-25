import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "Lclient!ec;")
	public static Class58 aClass58_18 = new Class58(8);

	@OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
	public static int anInt4032 = 0;

	@OriginalMember(owner = "client!mp", name = "u", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_71 = new Class117("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!mp", name = "v", descriptor = "[[B")
	public static final byte[][] aByteArrayArray30 = new byte[250][];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
	public static void method3593() {
		if (Static136.anInt6476 == 0) {
			return;
		}
		try {
			if (++Static2.anInt9 > 2000) {
				if (Static291.aClass156_103 != null) {
					Static291.aClass156_103.method4190();
					Static291.aClass156_103 = null;
				}
				if (Static41.anInt740 >= 1) {
					Static90.anInt4649 = -5;
					Static136.anInt6476 = 0;
					return;
				}
				Static136.anInt6476 = 1;
				Static41.anInt740++;
				if (Static201.anInt6769 == Static11.anInt233) {
					Static11.anInt233 = Static156.anInt2981;
				} else {
					Static11.anInt233 = Static201.anInt6769;
				}
				Static2.anInt9 = 0;
			}
			if (Static136.anInt6476 == 1) {
				Static86.aClass2_3 = Static77.aClass118_7.method2708(Static11.anInt233, Static342.aString65);
				Static136.anInt6476 = 2;
			}
			@Pc(121) int local121;
			if (Static136.anInt6476 == 2) {
				if (Static86.aClass2_3.anInt6 == 2) {
					throw new IOException();
				}
				if (Static86.aClass2_3.anInt6 != 1) {
					return;
				}
				Static291.aClass156_103 = new Class156((Socket) Static86.aClass2_3.anObject1, Static77.aClass118_7);
				Static86.aClass2_3 = null;
				Static291.aClass156_103.method4183(Static313.aClass11_Sub25_Sub1_5.aByteArray93, Static313.aClass11_Sub25_Sub1_5.anInt6076);
				if (Static126.aClass78_4 != null) {
					Static126.aClass78_4.method5519();
				}
				if (Static143.aClass78_3 != null) {
					Static143.aClass78_3.method5519();
				}
				local121 = Static291.aClass156_103.method4187();
				if (Static126.aClass78_4 != null) {
					Static126.aClass78_4.method5519();
				}
				if (Static143.aClass78_3 != null) {
					Static143.aClass78_3.method5519();
				}
				if (local121 != 21) {
					Static90.anInt4649 = local121;
					Static136.anInt6476 = 0;
					Static291.aClass156_103.method4190();
					Static291.aClass156_103 = null;
					return;
				}
				Static136.anInt6476 = 3;
			}
			if (Static136.anInt6476 == 3) {
				if (Static291.aClass156_103.method4193() < 1) {
					return;
				}
				Static300.aStringArray49 = new String[Static291.aClass156_103.method4187()];
				Static136.anInt6476 = 4;
			}
			if (Static136.anInt6476 == 4 && Static291.aClass156_103.method4193() >= Static300.aStringArray49.length * 8) {
				Static246.aClass11_Sub25_Sub1_3.anInt6076 = 0;
				Static291.aClass156_103.method4189(Static300.aStringArray49.length * 8, Static246.aClass11_Sub25_Sub1_3.aByteArray93, 0);
				for (local121 = 0; local121 < Static300.aStringArray49.length; local121++) {
					Static300.aStringArray49[local121] = Static11.method173(Static246.aClass11_Sub25_Sub1_3.method5174());
				}
				Static136.anInt6476 = 0;
				Static90.anInt4649 = 21;
				Static291.aClass156_103.method4190();
				Static291.aClass156_103 = null;
			}
		} catch (@Pc(221) IOException local221) {
			if (Static291.aClass156_103 != null) {
				Static291.aClass156_103.method4190();
				Static291.aClass156_103 = null;
			}
			if (Static41.anInt740 < 1) {
				Static41.anInt740++;
				Static2.anInt9 = 0;
				Static136.anInt6476 = 1;
				if (Static11.anInt233 == Static201.anInt6769) {
					Static11.anInt233 = Static156.anInt2981;
				} else {
					Static11.anInt233 = Static201.anInt6769;
				}
			} else {
				Static90.anInt4649 = -4;
				Static136.anInt6476 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)I")
	public static int method3595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static303.anIntArrayArray55 == null ? 0 : Static303.anIntArrayArray55[arg0][arg1] >>> 21 & 0x7F8;
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)V")
	public static void method3596(@OriginalArg(1) int arg0) {
		@Pc(10) Class11_Sub4_Sub12 local10 = Static35.method512(11, arg0);
		local10.method3864();
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLclient!ak;IIII)V")
	public static void method3597(@OriginalArg(1) Class11_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt91 == -1 && arg0.anIntArray11 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(22) int local22 = Static326.anInt5865 * arg0.anInt93 >> 8;
		if (arg0.anInt85 < arg1) {
			local15 = arg1 - arg0.anInt85;
		} else if (arg0.anInt88 > arg1) {
			local15 = arg0.anInt88 - arg1;
		}
		if (arg0.anInt100 < arg3) {
			local15 += arg3 - arg0.anInt100;
		} else if (arg0.anInt97 > arg3) {
			local15 += arg0.anInt97 - arg3;
		}
		if (arg0.anInt86 == 0 || local15 - 64 > arg0.anInt86 || Static326.anInt5865 == 0 || arg0.anInt98 != arg4) {
			if (arg0.aClass11_Sub10_Sub1_2 != null) {
				Static341.aClass11_Sub10_Sub3_2.method3737(arg0.aClass11_Sub10_Sub1_2);
				arg0.aClass11_Sub10_Sub1_2 = null;
			}
			if (arg0.aClass11_Sub10_Sub1_1 != null) {
				Static341.aClass11_Sub10_Sub3_2.method3737(arg0.aClass11_Sub10_Sub1_1);
				arg0.aClass11_Sub10_Sub1_1 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(143) int local143 = (arg0.anInt86 - local15) * local22 / arg0.anInt86;
		if (arg0.aClass11_Sub10_Sub1_2 != null) {
			arg0.aClass11_Sub10_Sub1_2.method760(local143);
		} else if (arg0.anInt91 >= 0) {
			@Pc(161) Class102 local161 = Static365.method1992(Static177.aClass144_45, arg0.anInt91, 0);
			if (local161 != null) {
				@Pc(168) Class11_Sub15_Sub1 local168 = local161.method1995().method5478(Static107.aClass103_1);
				@Pc(173) Class11_Sub10_Sub1 local173 = Static361.method773(local168, local143);
				local173.method797(-1);
				Static341.aClass11_Sub10_Sub3_2.method3741(local173);
				arg0.aClass11_Sub10_Sub1_2 = local173;
			}
		}
		if (arg0.aClass11_Sub10_Sub1_1 != null) {
			arg0.aClass11_Sub10_Sub1_1.method760(local143);
			if (arg0.aClass11_Sub10_Sub1_1.method5704()) {
				return;
			}
			arg0.aClass11_Sub10_Sub1_1 = null;
		} else if (arg0.anIntArray11 != null && (arg0.anInt92 -= arg2) <= 0) {
			@Pc(204) int local204 = (int) (Math.random() * (double) arg0.anIntArray11.length);
			@Pc(212) Class102 local212 = Static365.method1992(Static177.aClass144_45, arg0.anIntArray11[local204], 0);
			if (local212 != null) {
				@Pc(219) Class11_Sub15_Sub1 local219 = local212.method1995().method5478(Static107.aClass103_1);
				@Pc(224) Class11_Sub10_Sub1 local224 = Static361.method773(local219, local143);
				local224.method797(0);
				Static341.aClass11_Sub10_Sub3_2.method3741(local224);
				arg0.anInt92 = arg0.anInt95 + (int) (Math.random() * (double) (arg0.anInt87 - arg0.anInt95));
				arg0.aClass11_Sub10_Sub1_1 = local224;
				return;
			}
		}
	}
}
