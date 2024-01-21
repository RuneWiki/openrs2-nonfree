import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	public static int anInt17;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	public static int anInt31;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Lclient!qc;")
	public static Class60 aClass60_10 = Static121.method2047("AUS");

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "Lclient!tb;")
	public static Class70 aClass70_1 = new Class70();

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!qc;")
	private static Class60 aClass60_11 = Static121.method2047("Bad session id)3");

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Lclient!qc;")
	public static Class60 aClass60_12 = aClass60_11;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
	public static int anInt28 = 0;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
	public static int anInt30 = 0;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
	public static int anInt32 = 0;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
	public static int anInt33 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILclient!re;)Lclient!qc;")
	public static Class60 method9(@OriginalArg(2) Class4_Sub13 arg0) {
		try {
			@Pc(7) Class60 local7 = new Class60();
			local7.anInt2310 = arg0.method1237();
			if (local7.anInt2310 > 32767) {
				local7.anInt2310 = 32767;
			}
			local7.aByteArray89 = new byte[local7.anInt2310];
			arg0.anInt1643 += Static128.aClass80_3.method2136(local7.aByteArray89, arg0.aByteArray68, local7.anInt2310, arg0.anInt1643, 0);
			return local7;
		} catch (@Pc(56) Exception local56) {
			return Static51.aClass60_513;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!wd;I)V")
	public static void method10(@OriginalArg(0) Class80 arg0) {
		Static128.aClass80_3 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)I")
	public static int method11(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method12() {
		aClass60_11 = null;
		aClass70_1 = null;
		aClass60_10 = null;
		aClass60_12 = null;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(IB)Lclient!mb;")
	public static Class4_Sub4_Sub10 method13(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub4_Sub10 local10 = (Class4_Sub4_Sub10) Static62.aClass48_38.method1390((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static38.method645(Static14.aClass40_90, Static120.aClass40_58, arg0);
		if (local10 != null) {
			Static62.aClass48_38.method1392(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZII)V")
	public static void method14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = arg0; local11 <= arg3 + arg0; local11++) {
			for (@Pc(15) int local15 = arg2; local15 <= arg1 + arg2; local15++) {
				if (local15 >= 0 && local15 < 104 && local11 >= 0 && local11 < 104) {
					Static36.aByteArrayArrayArray2[0][local15][local11] = 127;
					if (arg2 == local15 && local15 > 0) {
						Static58.anIntArrayArrayArray5[0][local15][local11] = Static58.anIntArrayArrayArray5[0][local15 - 1][local11];
					}
					if (local15 == arg1 + arg2 && local15 < 103) {
						Static58.anIntArrayArrayArray5[0][local15][local11] = Static58.anIntArrayArrayArray5[0][local15 + 1][local11];
					}
					if (arg0 == local11 && local11 > 0) {
						Static58.anIntArrayArrayArray5[0][local15][local11] = Static58.anIntArrayArrayArray5[0][local15][local11 - 1];
					}
					if (arg3 + arg0 == local11 && local11 < 103) {
						Static58.anIntArrayArrayArray5[0][local15][local11] = Static58.anIntArrayArrayArray5[0][local15][local11 + 1];
					}
				}
			}
		}
	}
}
