import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!or", name = "d", descriptor = "Lclient!kr;")
	public static Class46 aClass46_18;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "I")
	public static int anInt5659 = 0;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "I")
	public static int anInt5663 = 0;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)I")
	public static int method4779() {
		try {
			if (Static54.anInt976 == 0) {
				if (Static214.aLong148 > Static22.method285() - 5000L) {
					return 0;
				}
				Static226.aClass26_7 = Static62.aClass179_2.method4887(Static134.anInt2875, Static91.aString20);
				Static182.aLong90 = Static22.method285();
				Static54.anInt976 = 1;
			}
			if (Static182.aLong90 + 30000L < Static22.method285()) {
				return Static43.method2356(1000);
			}
			@Pc(82) int local82;
			@Pc(122) int local122;
			if (Static54.anInt976 == 1) {
				if (Static226.aClass26_7.anInt484 == 2) {
					return Static43.method2356(1001);
				}
				if (Static226.aClass26_7.anInt484 != 1) {
					return -1;
				}
				Static129.aClass117_2 = new Class117((Socket) Static226.aClass26_7.anObject1, Static62.aClass179_2);
				Static226.aClass26_7 = null;
				local82 = 0;
				if (Static122.aBoolean255) {
					local82 = Static90.anInt1756;
				}
				Static197.aClass2_Sub12_Sub2_2.anInt3606 = 0;
				Static197.aClass2_Sub12_Sub2_2.method3147(Static217.aClass69_9.anInt1946);
				Static197.aClass2_Sub12_Sub2_2.method3162(local82);
				Static129.aClass117_2.method3279(Static197.aClass2_Sub12_Sub2_2.anInt3606, Static197.aClass2_Sub12_Sub2_2.aByteArray30);
				if (Static288.aClass88_2 != null) {
					Static288.aClass88_2.method2721();
				}
				if (Static77.aClass88_1 != null) {
					Static77.aClass88_1.method2721();
				}
				local122 = Static129.aClass117_2.method3271();
				if (Static288.aClass88_2 != null) {
					Static288.aClass88_2.method2721();
				}
				if (Static77.aClass88_1 != null) {
					Static77.aClass88_1.method2721();
				}
				if (local122 != 0) {
					return Static43.method2356(local122);
				}
				Static54.anInt976 = 2;
			}
			if (Static54.anInt976 == 2) {
				if (Static129.aClass117_2.method3273() < 2) {
					return -1;
				}
				Static105.anInt2195 = Static129.aClass117_2.method3271();
				Static105.anInt2195 <<= 0x8;
				Static105.anInt2195 += Static129.aClass117_2.method3271();
				Static25.anInt400 = 0;
				Static54.anInt976 = 3;
				Static227.aByteArray62 = new byte[Static105.anInt2195];
			}
			if (Static54.anInt976 != 3) {
				return -1;
			}
			local82 = Static129.aClass117_2.method3273();
			if (local82 < 1) {
				return -1;
			}
			if (local82 > Static105.anInt2195 - Static25.anInt400) {
				local82 = Static105.anInt2195 - Static25.anInt400;
			}
			Static129.aClass117_2.method3274(Static25.anInt400, local82, Static227.aByteArray62);
			Static25.anInt400 += local82;
			if (Static105.anInt2195 > Static25.anInt400) {
				return -1;
			} else if (Static343.method3357(Static227.aByteArray62)) {
				Static339.aClass120_Sub1Array6 = new Class120_Sub1[Static109.anInt2285];
				local122 = 0;
				for (@Pc(235) int local235 = Static129.anInt2764; local235 <= Static317.anInt6258; local235++) {
					@Pc(241) Class120_Sub1 local241 = Static190.method5232(local235);
					if (local241 != null) {
						Static339.aClass120_Sub1Array6[local122++] = local241;
					}
				}
				Static75.anInt1415 = 0;
				Static204.aClass2_Sub2_1 = null;
				Static129.aClass117_2.method3278();
				Static227.aByteArray62 = null;
				Static54.anInt976 = 0;
				Static129.aClass117_2 = null;
				Static366.anInt4510 = 0;
				Static214.aLong148 = Static22.method285();
				return 0;
			} else {
				return Static43.method2356(1002);
			}
		} catch (@Pc(273) IOException local273) {
			return Static43.method2356(1003);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIII)I")
	public static int method4780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg1 & 0xF;
		@Pc(21) int local21 = local12 >= 8 ? arg3 : arg0;
		@Pc(40) int local40 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg0 : arg2) : arg3;
		return ((local12 & 0x2) == 0 ? local40 : -local40) + ((local12 & 0x1) == 0 ? local21 : -local21);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!bs;)V")
	public static void method4781(@OriginalArg(0) Class1_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort89; local2 <= arg0.aShort88; local2++) {
			for (@Pc(6) int local6 = arg0.aShort90; local6 <= arg0.aShort87; local6++) {
				@Pc(16) Class51 local16 = Static196.aClass51ArrayArrayArray3[arg0.aByte77][local2][local6];
				if (local16 != null) {
					@Pc(21) Class11 local21 = local16.aClass11_2;
					@Pc(23) Class11 local23 = null;
					while (local21 != null) {
						if (local21.aClass1_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass11_2 = local21.aClass11_1;
							} else {
								local23.aClass11_1 = local21.aClass11_1;
							}
							local21.method190();
							break;
						}
						local23 = local21;
						local21 = local21.aClass11_1;
					}
					local16.aByte7 = 0;
					for (@Pc(56) Class11 local56 = local16.aClass11_2; local56 != null; local56 = local56.aClass11_1) {
						local16.aByte7 = (byte) (local16.aByte7 | local56.anInt217);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
	public static void method4782() {
		Static79.aClass37_2.method3717(((float) Static333.anInt6458 * 0.1F + 0.7F) * Static327.aFloat77);
		Static79.aClass37_2.method3664(Static207.anInt4537, Static111.aFloat36, Static164.aFloat41, (float) Static338.anInt6589, (float) Static47.anInt780, (float) Static220.anInt4856);
		Static79.aClass37_2.method3735(Static57.aClass3_1);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!iq;ILclient!iq;)V")
	public static void method4784(@OriginalArg(0) Class104 arg0, @OriginalArg(2) Class104 arg1) {
		Static77.aClass104_53 = arg1;
		Static358.aClass104_192 = arg0;
		Static77.aClass104_53.method2745(36);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIIZI[BI[Lclient!ek;Lclient!dr;IB)V")
	public static void method4785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class61[] arg8, @OriginalArg(9) Class37 arg9, @OriginalArg(10) int arg10) {
		@Pc(18) Class2_Sub12 local18 = new Class2_Sub12(arg6);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method3120();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local18.method3153();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local18.method3124();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				if (local58 == arg2 && arg7 <= local54 && arg7 + 8 > local54 && arg1 <= local48 && local48 < arg1 + 8) {
					@Pc(97) Class74 local97 = Static228.method4210(local20);
					@Pc(114) int local114 = Static155.method3195(local97.anInt2048, local97.anInt2094, local54 & 0x7, arg0, local48 & 0x7, local70) + arg5;
					@Pc(131) int local131 = arg10 + Static193.method3606(local54 & 0x7, arg0, local97.anInt2048, local70, local97.anInt2094, local48 & 0x7);
					if (local114 > 0 && local131 > 0 && local114 < Static66.anInt1177 - 1 && Static12.anInt213 - 1 > local131) {
						@Pc(154) Class61 local154 = null;
						if (!arg4) {
							@Pc(158) int local158 = arg3;
							if ((Static243.aByteArrayArrayArray10[1][local114][local131] & 0x2) == 2) {
								local158 = arg3 - 1;
							}
							if (local158 >= 0) {
								local154 = arg8[local158];
							}
						}
						Static118.method2301(true, arg0 + local70 & 0x3, arg9, local154, local131, local20, arg4, arg3, -1, local114, arg3, local66);
					}
				}
			}
		}
	}
}
