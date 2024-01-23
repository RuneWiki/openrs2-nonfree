import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
	public static int anInt1294 = 0;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "[I")
	public static int[] anIntArray95 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString72 = "shake:";

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIZZLclient!ql;)V")
	public static void method921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(9) Class1_Sub13 arg7) {
		@Pc(11) byte local11 = 0;
		@Pc(13) byte local13 = 0;
		if (arg5 == 1) {
			local13 = 1;
		} else if (arg5 == 2) {
			local11 = 1;
			local13 = 1;
		} else if (arg5 == 3) {
			local11 = 1;
		}
		@Pc(50) int local50;
		if (arg1 < 0 || arg1 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local50 = arg7.method1772();
				if (local50 == 0) {
					return;
				}
				if (local50 == 1) {
					arg7.method1772();
					return;
				}
				if (local50 <= 49) {
					arg7.method1772();
				}
			}
			return;
		}
		if (!arg6) {
			Static145.aByteArrayArrayArray13[arg3][arg1][arg4] = 0;
		}
		while (true) {
			local50 = arg7.method1772();
			if (local50 == 0) {
				if (arg3 == 0) {
					Static38.anIntArrayArrayArray6[0][arg1 + local11][local13 + arg4] = -Static50.method1011(arg0 + 556238, arg2 + 932731) * 8;
					return;
				} else {
					Static38.anIntArrayArrayArray6[arg3][local11 + arg1][local13 + arg4] = Static38.anIntArrayArrayArray6[arg3 - 1][local11 + arg1][arg4 + local13] - 240;
					return;
				}
			}
			if (local50 == 1) {
				@Pc(187) int local187 = arg7.method1772();
				if (local187 == 1) {
					local187 = 0;
				}
				if (arg3 != 0) {
					Static38.anIntArrayArrayArray6[arg3][arg1 + local11][local13 + arg4] = Static38.anIntArrayArrayArray6[arg3 - 1][local11 + arg1][local13 + arg4] - local187 * 8;
					return;
				}
				Static38.anIntArrayArrayArray6[0][arg1 + local11][arg4 + local13] = -local187 * 8;
				return;
			}
			if (local50 <= 49) {
				if (arg6) {
					arg7.method1772();
				} else {
					Static25.aByteArrayArrayArray3[arg3][arg1][arg4] = arg7.method1756();
					Static25.aByteArrayArrayArray2[arg3][arg1][arg4] = (byte) ((local50 - 2) / 4);
					Static119.aByteArrayArrayArray9[arg3][arg1][arg4] = (byte) (arg5 + local50 - 2 & 0x3);
				}
			} else if (local50 <= 81) {
				if (!arg6) {
					Static145.aByteArrayArrayArray13[arg3][arg1][arg4] = (byte) (local50 - 49);
				}
			} else if (!arg6) {
				Static102.aByteArrayArrayArray7[arg3][arg1][arg4] = (byte) (local50 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIII)V")
	public static void method922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static257.method4147(arg4);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg4 - arg5;
		@Pc(25) int local25 = -arg4;
		@Pc(27) int local27 = arg4;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(33) int local33 = local14;
		@Pc(36) int local36 = -local14;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = -1;
		@Pc(67) int local67;
		@Pc(75) int local75;
		@Pc(84) int local84;
		@Pc(92) int local92;
		if (arg2 >= Static202.anInt4469 && arg2 <= Static94.anInt4237) {
			@Pc(58) int[] local58 = Static29.anIntArrayArray10[arg2];
			local67 = Static3.method36(Static167.anInt3907, arg3 - arg4, Static150.anInt3860);
			local75 = Static3.method36(Static167.anInt3907, arg4 + arg3, Static150.anInt3860);
			local84 = Static3.method36(Static167.anInt3907, arg3 - local14, Static150.anInt3860);
			local92 = Static3.method36(Static167.anInt3907, local14 + arg3, Static150.anInt3860);
			Static147.method2681(local58, arg0, local67, local84);
			Static147.method2681(local58, arg1, local84, local92);
			Static147.method2681(local58, arg0, local92, local75);
		}
		while (local10 < local27) {
			local40 += 2;
			local25 += local40;
			local38 += 2;
			local36 += local38;
			if (local36 >= 0 && local33 >= 1) {
				local33--;
				Static261.anIntArray467[local33] = local10;
				local36 -= local33 << 1;
			}
			local10++;
			@Pc(250) int local250;
			@Pc(259) int local259;
			@Pc(270) int[] local270;
			@Pc(163) int local163;
			if (local25 >= 0) {
				local27--;
				local25 -= local27 << 1;
				local67 = arg2 + local27;
				local163 = arg2 - local27;
				if (local67 >= Static202.anInt4469 && local163 <= Static94.anInt4237) {
					if (local27 >= local14) {
						local75 = Static3.method36(Static167.anInt3907, local10 + arg3, Static150.anInt3860);
						local84 = Static3.method36(Static167.anInt3907, arg3 - local10, Static150.anInt3860);
						if (local67 <= Static94.anInt4237) {
							Static147.method2681(Static29.anIntArrayArray10[local67], arg0, local84, local75);
						}
						if (local163 >= Static202.anInt4469) {
							Static147.method2681(Static29.anIntArrayArray10[local163], arg0, local84, local75);
						}
					} else {
						local75 = Static261.anIntArray467[local27];
						local84 = Static3.method36(Static167.anInt3907, arg3 + local10, Static150.anInt3860);
						local92 = Static3.method36(Static167.anInt3907, arg3 - local10, Static150.anInt3860);
						local250 = Static3.method36(Static167.anInt3907, arg3 + local75, Static150.anInt3860);
						local259 = Static3.method36(Static167.anInt3907, arg3 - local75, Static150.anInt3860);
						if (Static94.anInt4237 >= local67) {
							local270 = Static29.anIntArrayArray10[local67];
							Static147.method2681(local270, arg0, local92, local259);
							Static147.method2681(local270, arg1, local259, local250);
							Static147.method2681(local270, arg0, local250, local84);
						}
						if (Static202.anInt4469 <= local163) {
							local270 = Static29.anIntArrayArray10[local163];
							Static147.method2681(local270, arg0, local92, local259);
							Static147.method2681(local270, arg1, local259, local250);
							Static147.method2681(local270, arg0, local250, local84);
						}
					}
				}
			}
			local67 = arg2 + local10;
			local163 = arg2 - local10;
			if (local67 >= Static202.anInt4469 && local163 <= Static94.anInt4237) {
				local84 = arg3 - local27;
				local75 = arg3 + local27;
				if (Static167.anInt3907 <= local75 && Static150.anInt3860 >= local84) {
					local75 = Static3.method36(Static167.anInt3907, local75, Static150.anInt3860);
					local84 = Static3.method36(Static167.anInt3907, local84, Static150.anInt3860);
					if (local14 > local10) {
						local92 = local33 >= local10 ? local33 : Static261.anIntArray467[local10];
						local250 = Static3.method36(Static167.anInt3907, local92 + arg3, Static150.anInt3860);
						local259 = Static3.method36(Static167.anInt3907, arg3 - local92, Static150.anInt3860);
						if (Static94.anInt4237 >= local67) {
							local270 = Static29.anIntArrayArray10[local67];
							Static147.method2681(local270, arg0, local84, local259);
							Static147.method2681(local270, arg1, local259, local250);
							Static147.method2681(local270, arg0, local250, local75);
						}
						if (local163 >= Static202.anInt4469) {
							local270 = Static29.anIntArrayArray10[local163];
							Static147.method2681(local270, arg0, local84, local259);
							Static147.method2681(local270, arg1, local259, local250);
							Static147.method2681(local270, arg0, local250, local75);
						}
					} else {
						if (Static94.anInt4237 >= local67) {
							Static147.method2681(Static29.anIntArrayArray10[local67], arg0, local84, local75);
						}
						if (local163 >= Static202.anInt4469) {
							Static147.method2681(Static29.anIntArrayArray10[local163], arg0, local84, local75);
						}
					}
				}
			}
		}
	}
}
