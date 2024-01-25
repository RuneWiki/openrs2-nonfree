import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "Lclient!ao;")
	public static Class12 aClass12_78;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "Lclient!c;")
	public static Class32 aClass32_6;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
	public static int anInt2553;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "[[B")
	public static final byte[][] aByteArrayArray8 = new byte[50][];

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
	public static int anInt2545 = 0;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	public static void method2205() {
		Static159.aClient1.method947();
		Static18.aClass1_Sub28_Sub1_1.anInt6812 = 0;
		Static114.aClass12_56 = null;
		Static264.anInt4796 = 0;
		Static338.anInt5778 = 0;
		Static231.aClass12_112 = null;
		Static336.aClass1_Sub28_Sub1_2.anInt6812 = 0;
		Static371.aClass12_160 = null;
		aClass12_78 = null;
		Static372.anInt6263 = 0;
		for (@Pc(30) int local30 = 0; local30 < 100; local30++) {
			Static174.aStringArray14[local30] = null;
		}
		Static192.aString39 = null;
		Static150.anInt6764 = 0;
		Static240.anInt6654 = 0;
		Static400.aClass16Array1 = null;
		Static258.anInt7124 = 0;
		Static107.anInt2042 = 0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)Lclient!pj;")
	public static Class25_Sub1 method2207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class169 local7 = Static359.aClass169ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass25_Sub1_3;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZIIIZ)V")
	public static void method2216(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(21) int local21 = arg0 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(48) int local48 = local21 * (Static306.aShort92 - Static240.aShort108) / 100 + Static240.aShort108;
		if (local48 < Static19.aShort4) {
			local48 = Static19.aShort4;
		} else if (local48 > Static335.aShort98) {
			local48 = Static335.aShort98;
		}
		@Pc(78) int local78 = local48 * 512 * arg0 / (arg2 * 334);
		@Pc(123) int local123;
		@Pc(130) int local130;
		@Pc(94) short local94;
		if (local78 < Static223.aShort105) {
			local94 = Static223.aShort105;
			local48 = arg2 * local94 * 334 / (arg0 * 512);
			if (local48 > Static335.aShort98) {
				local48 = Static335.aShort98;
				local123 = arg0 * local48 * 512 / (local94 * 334);
				local130 = (arg2 - local123) / 2;
				if (arg1) {
					Static185.aClass34_7.va();
					Static185.aClass34_7.method5729(local130, arg3, arg0, -16777216, arg4);
					Static185.aClass34_7.method5729(local130, arg2 + arg3 - local130, arg0, -16777216, arg4);
				}
				arg3 += local130;
				arg2 -= local130 * 2;
			}
		} else if (Static364.aShort51 < local78) {
			local94 = Static364.aShort51;
			local48 = arg2 * 334 * local94 / (arg0 * 512);
			if (local48 < Static19.aShort4) {
				local48 = Static19.aShort4;
				local123 = local94 * 334 * arg2 / (local48 * 512);
				local130 = (arg0 - local123) / 2;
				if (arg1) {
					Static185.aClass34_7.va();
					Static185.aClass34_7.method5729(arg2, arg3, local130, -16777216, arg4);
					Static185.aClass34_7.method5729(arg2, arg3, local130, -16777216, arg0 + arg4 - local130);
				}
				arg0 -= local130 * 2;
				arg4 += local130;
			}
		}
		Static200.anInt3486 = arg0 * local48 / 334;
		Static312.anInt5417 = (short) arg0;
		Static348.anInt5969 = arg3;
		Static293.anInt5132 = (short) arg2;
		Static321.anInt5490 = arg4;
	}
}
