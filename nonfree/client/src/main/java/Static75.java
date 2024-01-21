import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
	public static int anInt1808 = 0;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_618 = Static120.method2057(")1j");

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "Lclient!tg;")
	private static Class81 aClass81_621 = Static120.method2057("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_619 = aClass81_621;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "[I")
	public static int[] anIntArray173 = new int[5];

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "Lclient!tg;")
	public static Class81 aClass81_620 = Static120.method2057("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "[I")
	public static int[] anIntArray174 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
	public static final int anInt1814 = 50;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "Lclient!tg;")
	public static Class81 aClass81_622 = Static120.method2057("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "Lclient!tg;")
	public static Class81 aClass81_623 = Static120.method2057("null");

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III[B)I")
	public static int method1325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg1; local14++) {
			local12 = local12 >>> 8 ^ Class1_Sub5_Sub4.anIntArray60[(local12 ^ arg2[local14]) & 0xFF];
		}
		return ~local12;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method1326(@OriginalArg(1) int arg0) {
		@Pc(23) byte[] local23;
		if (arg0 == 100 && Static81.anInt1857 > 0) {
			local23 = Static171.aByteArrayArray9[--Static81.anInt1857];
			Static171.aByteArrayArray9[Static81.anInt1857] = null;
			return local23;
		} else if (arg0 == 5000 && Static44.anInt1084 > 0) {
			local23 = Static139.aByteArrayArray7[--Static44.anInt1084];
			Static139.aByteArrayArray7[Static44.anInt1084] = null;
			return local23;
		} else if (arg0 == 30000 && Static113.anInt2566 > 0) {
			local23 = Static94.aByteArrayArray4[--Static113.anInt2566];
			Static94.aByteArrayArray4[Static113.anInt2566] = null;
			return local23;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)I")
	public static int method1327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(28) int local28 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local28;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	public static void method1328() {
		aClass81_621 = null;
		anIntArray174 = null;
		anIntArray173 = null;
		aClass81_618 = null;
		aClass81_620 = null;
		aClass81_622 = null;
		aClass81_619 = null;
		aClass81_623 = null;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIBILclient!ka;I)V")
	public static void method1329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub8 arg5, @OriginalArg(7) int arg6) {
		@Pc(44) int local44;
		if (arg3 < 0 || arg3 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local44 = arg5.method336();
				if (local44 == 0) {
					return;
				}
				if (local44 == 1) {
					arg5.method336();
					return;
				}
				if (local44 <= 49) {
					arg5.method336();
				}
			}
			return;
		}
		Static43.aByteArrayArrayArray2[arg6][arg3][arg4] = 0;
		while (true) {
			local44 = arg5.method336();
			if (local44 == 0) {
				if (arg6 == 0) {
					Static157.anIntArrayArrayArray7[0][arg3][arg4] = -Static29.method617(arg1 + arg4 + 556238, arg3 + 932731 + arg2) * 8;
					return;
				} else {
					Static157.anIntArrayArrayArray7[arg6][arg3][arg4] = Static157.anIntArrayArrayArray7[arg6 - 1][arg3][arg4] - 240;
					return;
				}
			}
			if (local44 == 1) {
				@Pc(105) int local105 = arg5.method336();
				if (local105 == 1) {
					local105 = 0;
				}
				if (arg6 == 0) {
					Static157.anIntArrayArrayArray7[0][arg3][arg4] = -local105 * 8;
					return;
				}
				Static157.anIntArrayArrayArray7[arg6][arg3][arg4] = Static157.anIntArrayArrayArray7[arg6 - 1][arg3][arg4] - local105 * 8;
				return;
			}
			if (local44 <= 49) {
				Static109.aByteArrayArrayArray7[arg6][arg3][arg4] = arg5.method339();
				Static26.aByteArrayArrayArray1[arg6][arg3][arg4] = (byte) ((local44 - 2) / 4);
				Static114.aByteArrayArrayArray6[arg6][arg3][arg4] = (byte) (local44 + arg0 - 2 & 0x3);
			} else if (local44 <= 81) {
				Static43.aByteArrayArrayArray2[arg6][arg3][arg4] = (byte) (local44 - 49);
			} else {
				Static146.aByteArrayArrayArray8[arg6][arg3][arg4] = (byte) (local44 - 81);
			}
		}
	}
}
