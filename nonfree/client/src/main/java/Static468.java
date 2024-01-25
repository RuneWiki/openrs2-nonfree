import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "[I")
	public static int[] anIntArray741;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "Ljava/lang/Object;")
	public static Object anObject16;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Lclient!ba;")
	public static Class17 aClass17_36 = new Class17(8);

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
	public static int anInt7887 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	public static void method6554(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static436.anInt6850 - Static36.anInt792;
		if (local8 >= 100) {
			Static448.anInt7701 = 1;
			return;
		}
		@Pc(21) int local21 = (int) Static50.aFloat13;
		if (local21 < Static384.anInt6973 >> 8) {
			local21 = Static384.anInt6973 >> 8;
		}
		if (Static170.aBooleanArray18[4] && local21 < Static379.anIntArray822[4] + 128) {
			local21 = Static379.anIntArray822[4] + 128;
		}
		@Pc(58) int local58 = Static232.anInt4618 + (int) Static404.aFloat156 & 0x3FFF;
		Static358.method7326((local21 >> 3) * 3 + 600 << 2, local21, Static69.anInt1327, local58, Static81.anInt1467, arg0, Static38.method884(Static501.anInt8491, Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137, Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141) - 200);
		@Pc(104) float local104 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static516.anInt8682 = (int) (local104 * (float) (Static516.anInt8682 - Static164.anInt2973) + (float) Static164.anInt2973);
		Static504.anInt8519 = (int) ((float) Static189.anInt3362 + (float) (Static504.anInt8519 - Static189.anInt3362) * local104);
		Static522.anInt8770 = (int) ((float) Static170.anInt3052 + local104 * (float) (Static522.anInt8770 - Static170.anInt3052));
		Static381.anInt6946 = (int) ((float) Static153.anInt2803 + local104 * (float) (Static381.anInt6946 - Static153.anInt2803));
		@Pc(157) int local157 = Static305.anInt5631 - Static356.anInt6299;
		if (local157 > 8192) {
			local157 -= 16384;
		} else if (local157 < -8192) {
			local157 += 16384;
		}
		Static305.anInt5631 = (int) ((float) local157 * local104 + (float) Static356.anInt6299);
		Static305.anInt5631 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[BI[BIIIII)V")
	public static void method6555(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg5++;
				arg3[local31] = (byte) (arg3[local31] - arg1[arg6++]);
				@Pc(44) int local44 = arg5++;
				arg3[local44] = (byte) (arg3[local44] - arg1[arg6++]);
				@Pc(57) int local57 = arg5++;
				arg3[local57] = (byte) (arg3[local57] - arg1[arg6++]);
				@Pc(70) int local70 = arg5++;
				arg3[local70] = (byte) (arg3[local70] - arg1[arg6++]);
			}
			for (@Pc(89) int local89 = local15; local89 < 0; local89++) {
				local31 = arg5++;
				arg3[local31] = (byte) (arg3[local31] - arg1[arg6++]);
			}
			arg5 += arg0;
			arg6 += arg2;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZII)B")
	public static byte method6556(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!fu;Z)Z")
	public static boolean method6558(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static544.aClass205Array3 == Static209.aClass205Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5992();
		if (arg0.aShort117 < 0 || arg0.aShort116 < 0 || arg0.aShort115 >= Static93.anInt1898 || arg0.aShort118 >= Static382.anInt6965) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort117; local34 <= arg0.aShort115; local34++) {
			for (local38 = arg0.aShort116; local38 <= arg0.aShort118; local38++) {
				@Pc(45) Class255 local45 = Static188.method2930(arg0.aByte98, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort117) {
						local49++;
					}
					if (local34 < arg0.aShort115) {
						local49 += 4;
					}
					if (local38 > arg0.aShort116) {
						local49 += 8;
					}
					if (local38 < arg0.aShort118) {
						local49 += 2;
					}
					@Pc(74) Class63 local74 = Static115.method1965(local49, arg0);
					@Pc(77) Class63 local77 = local45.aClass63_3;
					if (local77 == null) {
						local45.aClass63_3 = local74;
					} else {
						while (local77.aClass63_1 != null) {
							local77 = local77.aClass63_1;
						}
						local77.aClass63_1 = local74;
					}
					local45.aByte104 = (byte) (local45.aByte104 | local49);
					if (local6 && (Static193.anIntArrayArray95[local34][local38] & 0xFF000000) != 0) {
						local8 = Static193.anIntArrayArray95[local34][local38];
						local10 = Static398.aShortArrayArray7[local34][local38];
						local12 = Static347.aByteArrayArray18[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort117; local38 <= arg0.aShort115; local38++) {
				for (@Pc(150) int local150 = arg0.aShort116; local150 <= arg0.aShort118; local150++) {
					if ((Static193.anIntArrayArray95[local38][local150] & 0xFF000000) == 0) {
						Static193.anIntArrayArray95[local38][local150] = local8;
						Static398.aShortArrayArray7[local38][local150] = local10;
						Static347.aByteArrayArray18[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static301.aClass49_Sub2Array3[Static480.anInt7981++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6559(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + Static424.method6215(arg0.charAt(local12)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BIIII)V")
	public static void method6560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static541.method7520(8, arg1);
		local8.method4946();
		local8.anInt5827 = arg2;
		local8.anInt5822 = arg0;
		local8.anInt5821 = arg3;
	}
}
