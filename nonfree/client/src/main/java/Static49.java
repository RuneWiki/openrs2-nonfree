import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "Lclient!eb;")
	public static final Class81 aClass81_4 = new Class81();

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "[I")
	public static final int[] anIntArray138 = new int[13];

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!ed;IIIIIIIII)Z")
	public static boolean method781(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg6;
		@Pc(17) int local17 = arg8 - 64;
		Static456.anIntArrayArray66[64][64] = 99;
		@Pc(28) int local28 = arg6 - 64;
		Static518.anIntArrayArray74[64][64] = 0;
		@Pc(36) byte local36 = 0;
		@Pc(38) int local38 = 0;
		Static539.anIntArray693[0] = arg8;
		@Pc(45) int local45 = local36 + 1;
		Static440.anIntArray616[0] = arg6;
		@Pc(50) int[][] local50 = arg1.anIntArrayArray37;
		while (local38 != local45) {
			local7 = Static539.anIntArray693[local38];
			local9 = Static440.anIntArray616[local38];
			local38 = local38 + 1 & 0xFFF;
			@Pc(71) int local71 = local9 - local28;
			@Pc(76) int local76 = local7 - local17;
			@Pc(82) int local82 = local7 - arg1.anInt2635;
			@Pc(88) int local88 = local9 - arg1.anInt2638;
			if (arg0 == -4) {
				if (arg5 == local7 && local9 == arg2) {
					Static437.anInt7500 = local9;
					Static499.anInt8659 = local7;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static34.method7578(local9, 2, arg7, arg3, arg5, 2, arg2, local7)) {
					Static437.anInt7500 = local9;
					Static499.anInt8659 = local7;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg1.method2357(2, arg3, 2, arg2, local7, arg7, arg4, local9, arg5)) {
					Static499.anInt8659 = local7;
					Static437.anInt7500 = local9;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg1.method2347(local7, 2, arg2, arg3, local9, arg5, arg4, arg7)) {
					Static499.anInt8659 = local7;
					Static437.anInt7500 = local9;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg1.method2346(2, arg2, local9, local7, arg0, arg9, arg5)) {
					Static437.anInt7500 = local9;
					Static499.anInt8659 = local7;
					return true;
				}
			} else if (arg1.method2348(local9, 2, arg9, arg5, arg0, arg2, local7)) {
				Static499.anInt8659 = local7;
				Static437.anInt7500 = local9;
				return true;
			}
			@Pc(240) int local240 = Static518.anIntArrayArray74[local76][local71] + 1;
			if (local76 > 0 && Static456.anIntArrayArray66[local76 - 1][local71] == 0 && (local50[local82 - 1][local88] & 0x43A40000) == 0 && (local50[local82 - 1][local88 + 1] & 0x4E240000) == 0) {
				Static539.anIntArray693[local45] = local7 - 1;
				Static440.anIntArray616[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static456.anIntArrayArray66[local76 - 1][local71] = 2;
				Static518.anIntArrayArray74[local76 - 1][local71] = local240;
			}
			if (local76 < 126 && Static456.anIntArrayArray66[local76 + 1][local71] == 0 && (local50[local82 + 2][local88] & 0x60E40000) == 0 && (local50[local82 + 2][local88 + 1] & 0x78240000) == 0) {
				Static539.anIntArray693[local45] = local7 + 1;
				Static440.anIntArray616[local45] = local9;
				Static456.anIntArrayArray66[local76 + 1][local71] = 8;
				local45 = local45 + 1 & 0xFFF;
				Static518.anIntArrayArray74[local76 + 1][local71] = local240;
			}
			if (local71 > 0 && Static456.anIntArrayArray66[local76][local71 - 1] == 0 && (local50[local82][local88 - 1] & 0x43A40000) == 0 && (local50[local82 + 1][local88 - 1] & 0x60E40000) == 0) {
				Static539.anIntArray693[local45] = local7;
				Static440.anIntArray616[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static456.anIntArrayArray66[local76][local71 - 1] = 1;
				Static518.anIntArrayArray74[local76][local71 - 1] = local240;
			}
			if (local71 < 126 && Static456.anIntArrayArray66[local76][local71 + 1] == 0 && (local50[local82][local88 + 2] & 0x4E240000) == 0 && (local50[local82 + 1][local88 + 2] & 0x78240000) == 0) {
				Static539.anIntArray693[local45] = local7;
				Static440.anIntArray616[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static456.anIntArrayArray66[local76][local71 + 1] = 4;
				Static518.anIntArrayArray74[local76][local71 + 1] = local240;
			}
			if (local76 > 0 && local71 > 0 && Static456.anIntArrayArray66[local76 - 1][local71 - 1] == 0 && (local50[local82 - 1][local88] & 0x4FA40000) == 0 && (local50[local82 - 1][local88 - 1] & 0x43A40000) == 0 && (local50[local82][local88 - 1] & 0x63E40000) == 0) {
				Static539.anIntArray693[local45] = local7 - 1;
				Static440.anIntArray616[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static456.anIntArrayArray66[local76 - 1][local71 - 1] = 3;
				Static518.anIntArrayArray74[local76 - 1][local71 - 1] = local240;
			}
			if (local76 < 126 && local71 > 0 && Static456.anIntArrayArray66[local76 + 1][local71 - 1] == 0 && (local50[local82 + 1][local88 - 1] & 0x63E40000) == 0 && (local50[local82 + 2][local88 - 1] & 0x60E40000) == 0 && (local50[local82 + 2][local88] & 0x78E40000) == 0) {
				Static539.anIntArray693[local45] = local7 + 1;
				Static440.anIntArray616[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static456.anIntArrayArray66[local76 + 1][local71 - 1] = 9;
				Static518.anIntArrayArray74[local76 + 1][local71 - 1] = local240;
			}
			if (local76 > 0 && local71 < 126 && Static456.anIntArrayArray66[local76 - 1][local71 + 1] == 0 && (local50[local82 - 1][local88 + 1] & 0x4FA40000) == 0 && (local50[local82 - 1][local88 + 2] & 0x4E240000) == 0 && (local50[local82][local88 + 2] & 0x7E240000) == 0) {
				Static539.anIntArray693[local45] = local7 - 1;
				Static440.anIntArray616[local45] = local9 + 1;
				Static456.anIntArrayArray66[local76 - 1][local71 + 1] = 6;
				local45 = local45 + 1 & 0xFFF;
				Static518.anIntArrayArray74[local76 - 1][local71 + 1] = local240;
			}
			if (local76 < 126 && local71 < 126 && Static456.anIntArrayArray66[local76 + 1][local71 + 1] == 0 && (local50[local82 + 1][local88 + 2] & 0x7E240000) == 0 && (local50[local82 + 2][local88 + 2] & 0x78240000) == 0 && (local50[local82 + 2][local88 + 1] & 0x78E40000) == 0) {
				Static539.anIntArray693[local45] = local7 + 1;
				Static440.anIntArray616[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static456.anIntArrayArray66[local76 + 1][local71 + 1] = 12;
				Static518.anIntArrayArray74[local76 + 1][local71 + 1] = local240;
			}
		}
		Static499.anInt8659 = local7;
		Static437.anInt7500 = local9;
		return false;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!cea;)V")
	public static void method782(@OriginalArg(1) Class4_Sub9_Sub1 arg0) {
		@Pc(10) Class4_Sub5 local10 = (Class4_Sub5) Static238.aClass124_58.method3267();
		if (local10 == null) {
			return;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local10.anInt453; local25++) {
			if (local10.aClass299Array2[local25] != null) {
				if (local10.aClass299Array2[local25].anInt7985 == 2) {
					local10.anIntArray105[local25] = -5;
				}
				if (local10.aClass299Array2[local25].anInt7985 == 0) {
					local23 = true;
				}
			}
			if (local10.aClass299Array1[local25] != null) {
				if (local10.aClass299Array1[local25].anInt7985 == 2) {
					local10.anIntArray105[local25] = -6;
				}
				if (local10.aClass299Array1[local25].anInt7985 == 0) {
					local23 = true;
				}
			}
		}
		if (local23) {
			return;
		}
		@Pc(92) int local92 = arg0.anInt7219;
		arg0.method5963(local10.anInt455);
		for (@Pc(99) int local99 = 0; local99 < local10.anInt453; local99++) {
			if (local10.anIntArray105[local99] == 0) {
				try {
					@Pc(123) int local123 = local10.anIntArray104[local99];
					@Pc(132) Field local132;
					@Pc(136) int local136;
					if (local123 == 0) {
						local132 = (Field) local10.aClass299Array2[local99].anObject41;
						local136 = local132.getInt(null);
						arg0.method5961(-345277664, 0);
						arg0.method5963(local136);
					} else if (local123 == 1) {
						local132 = (Field) local10.aClass299Array2[local99].anObject41;
						local132.setInt(null, local10.anIntArray107[local99]);
						arg0.method5961(-345277664, 0);
					} else if (local123 == 2) {
						local132 = (Field) local10.aClass299Array2[local99].anObject41;
						local136 = local132.getModifiers();
						arg0.method5961(-345277664, 0);
						arg0.method5963(local136);
					}
					@Pc(204) Method local204;
					if (local123 == 3) {
						local204 = (Method) local10.aClass299Array1[local99].anObject41;
						@Pc(209) byte[][] local209 = local10.aByteArrayArrayArray1[local99];
						@Pc(213) Object[] local213 = new Object[local209.length];
						for (@Pc(215) int local215 = 0; local215 < local209.length; local215++) {
							@Pc(227) ObjectInputStream local227 = new ObjectInputStream(new ByteArrayInputStream(local209[local215]));
							local213[local215] = local227.readObject();
						}
						@Pc(242) Object local242 = local204.invoke(null, local213);
						if (local242 == null) {
							arg0.method5961(-345277664, 0);
						} else if (local242 instanceof Number) {
							arg0.method5961(-345277664, 1);
							arg0.method6008(((Number) local242).longValue());
						} else if (local242 instanceof String) {
							arg0.method5961(-345277664, 2);
							arg0.method6000((String) local242);
						} else {
							arg0.method5961(-345277664, 4);
						}
					} else if (local123 == 4) {
						local204 = (Method) local10.aClass299Array1[local99].anObject41;
						local136 = local204.getModifiers();
						arg0.method5961(-345277664, 0);
						arg0.method5963(local136);
					}
				} catch (@Pc(310) ClassNotFoundException local310) {
					arg0.method5961(-345277664, -10);
				} catch (@Pc(316) InvalidClassException local316) {
					arg0.method5961(-345277664, -11);
				} catch (@Pc(322) StreamCorruptedException local322) {
					arg0.method5961(-345277664, -12);
				} catch (@Pc(328) OptionalDataException local328) {
					arg0.method5961(-345277664, -13);
				} catch (@Pc(334) IllegalAccessException local334) {
					arg0.method5961(-345277664, -14);
				} catch (@Pc(340) IllegalArgumentException local340) {
					arg0.method5961(-345277664, -15);
				} catch (@Pc(346) InvocationTargetException local346) {
					arg0.method5961(-345277664, -16);
				} catch (@Pc(352) SecurityException local352) {
					arg0.method5961(-345277664, -17);
				} catch (@Pc(358) IOException local358) {
					arg0.method5961(-345277664, -18);
				} catch (@Pc(364) NullPointerException local364) {
					arg0.method5961(-345277664, -19);
				} catch (@Pc(370) Exception local370) {
					arg0.method5961(-345277664, -20);
				} catch (@Pc(376) Throwable local376) {
					arg0.method5961(-345277664, -21);
				}
			} else {
				arg0.method5961(-345277664, local10.anIntArray105[local99]);
			}
		}
		arg0.method6006(local92);
		local10.method8013();
	}
}
