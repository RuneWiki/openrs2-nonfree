import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!uba", name = "t", descriptor = "Lclient!xa;")
	public static Class119 aClass119_29;

	@OriginalMember(owner = "client!uba", name = "m", descriptor = "[I")
	public static final int[] anIntArray736 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!uba", name = "x", descriptor = "I")
	public static int anInt8679 = 0;

	@OriginalMember(owner = "client!uba", name = "z", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_117 = new Class158(37, 3);

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V")
	public static void method7133() {
		@Pc(1) Class125 local1 = Static260.aClass125_36;
		synchronized (Static260.aClass125_36) {
			Static260.aClass125_36.method3516();
		}
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(II)I")
	public static int method7134(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(15) int local15 = local4 | local4 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lclient!ada;Z)Z")
	public static boolean method7135(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static511.aClass52Array3 == Static238.aClass52Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7237();
		if (arg0.aShort123 < 0 || arg0.aShort120 < 0 || arg0.aShort122 >= Static126.anInt2626 || arg0.aShort121 >= Static108.anInt2385) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort123; local36 <= arg0.aShort122; local36++) {
			for (local40 = arg0.aShort120; local40 <= arg0.aShort121; local40++) {
				@Pc(47) Class290 local47 = Static326.method5207(arg0.aByte100, local36, local40);
				if (local47 != null) {
					@Pc(51) int local51 = 0;
					if (local36 > arg0.aShort123) {
						local51++;
					}
					if (local36 < arg0.aShort122) {
						local51 += 4;
					}
					if (local40 > arg0.aShort120) {
						local51 += 8;
					}
					if (local40 < arg0.aShort121) {
						local51 += 2;
					}
					@Pc(76) Class98 local76 = Static529.method7625(arg0, local51);
					@Pc(79) Class98 local79 = local47.aClass98_3;
					if (local79 == null) {
						local47.aClass98_3 = local76;
					} else {
						while (local79.aClass98_1 != null) {
							local79 = local79.aClass98_1;
						}
						local79.aClass98_1 = local76;
					}
					local47.aByte93 = (byte) (local47.aByte93 | local51);
					if (local6 && (Static63.anIntArrayArray20[local36][local40] & 0xFF000000) != 0) {
						local8 = Static63.anIntArrayArray20[local36][local40];
						local10 = Static222.aShortArrayArray5[local36][local40];
						local12 = Static125.aByteArrayArray9[local36][local40];
					}
					if (local47.aClass6_Sub3_2 != null && local47.aClass6_Sub3_2.aShort74 > local33) {
						local33 = local47.aClass6_Sub3_2.aShort74;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort123; local40 <= arg0.aShort122; local40++) {
				for (@Pc(164) int local164 = arg0.aShort120; local164 <= arg0.aShort121; local164++) {
					if ((Static63.anIntArrayArray20[local40][local164] & 0xFF000000) == 0) {
						Static63.anIntArrayArray20[local40][local164] = local8;
						Static222.aShortArrayArray5[local40][local164] = local10;
						Static125.aByteArrayArray9[local40][local164] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static167.aClass6_Sub1Array1[Static167.anInt3855++] = arg0;
		}
		if (arg1) {
			arg0.anInt8814 -= local33;
		}
		return true;
	}
}
