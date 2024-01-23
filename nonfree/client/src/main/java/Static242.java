import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!re", name = "K", descriptor = "Lclient!nk;")
	public static Class121 aClass121_104;

	@OriginalMember(owner = "client!re", name = "H", descriptor = "I")
	public static int anInt4408 = 1;

	@OriginalMember(owner = "client!re", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray12 = new byte[250][];

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString252 = "M";

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Lclient!dj;")
	public static Class36 method3802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class36 local14 = local7.aClass36_1;
			local7.aClass36_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(III)I")
	public static int method3803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(20) int local20 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local20;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V")
	public static void method3804(@OriginalArg(0) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static125.anInt2556 += arg0 * 128;
		@Pc(40) int local40;
		if (Static228.anIntArray353.length < Static125.anInt2556) {
			local40 = (int) (Math.random() * 12.0D);
			Static125.anInt2556 -= Static228.anIntArray353.length;
			Static81.method1571(Static120.aClass23_Sub1Array1[local40]);
		}
		local40 = 0;
		@Pc(56) int local56 = arg0 * 128;
		@Pc(63) int local63 = (256 - arg0) * 128;
		@Pc(65) int local65;
		@Pc(90) int local90;
		for (local65 = 0; local65 < local63; local65++) {
			local90 = Static245.anIntArray392[local56 + local40] - Static228.anIntArray353[Static228.anIntArray353.length - 1 & Static125.anInt2556 + local40] * arg0 / 6;
			if (local90 < 0) {
				local90 = 0;
			}
			Static245.anIntArray392[local40++] = local90;
		}
		@Pc(128) int local128;
		@Pc(136) int local136;
		for (local65 = 256 - arg0; local65 < 256; local65++) {
			local90 = local65 * 128;
			for (local128 = 0; local128 < 128; local128++) {
				local136 = (int) (Math.random() * 100.0D);
				if (local136 < 50 && local128 > 10 && local128 < 118) {
					Static245.anIntArray392[local128 + local90] = 255;
				} else {
					Static245.anIntArray392[local128 + local90] = 0;
				}
			}
		}
		for (local65 = 0; local65 < 256 - arg0; local65++) {
			Static179.anIntArray291[local65] = Static179.anIntArray291[local65 + arg0];
		}
		for (local65 = 256 - arg0; local65 < 256; local65++) {
			Static179.anIntArray291[local65] = (int) (Math.sin((double) Static226.anInt4164 / 14.0D) * 16.0D + Math.sin((double) Static226.anInt4164 / 15.0D) * 14.0D + Math.sin((double) Static226.anInt4164 / 16.0D) * 12.0D);
			Static226.anInt4164++;
		}
		Static50.anInt1009 += arg0;
		local65 = (arg0 + (Static313.anInt2966 & 0x1)) / 2;
		if (local65 <= 0) {
			return;
		}
		for (local90 = 0; local90 < Static50.anInt1009; local90++) {
			local128 = (int) (Math.random() * 124.0D) + 2;
			local136 = (int) (Math.random() * 128.0D) + 128;
			Static245.anIntArray392[(local136 << 7) + local128] = 192;
		}
		Static50.anInt1009 = 0;
		@Pc(293) int local293;
		for (local90 = 0; local90 < 256; local90++) {
			local128 = 0;
			local136 = local90 * 128;
			for (local293 = -local65; local293 < 128; local293++) {
				if (local293 + local65 < 128) {
					local128 += Static245.anIntArray392[local65 + local136 + local293];
				}
				if (local293 - local65 - 1 >= 0) {
					local128 -= Static245.anIntArray392[local293 + local136 - local65 - 1];
				}
				if (local293 >= 0) {
					Static42.anIntArray48[local293 + local136] = local128 / (local65 * 2 + 1);
				}
			}
		}
		for (local90 = 0; local90 < 128; local90++) {
			local128 = 0;
			for (local136 = -local65; local136 < 256; local136++) {
				local293 = local136 * 128;
				if (local65 + local136 < 256) {
					local128 += Static42.anIntArray48[local65 * 128 + local293 + local90];
				}
				if (local136 - local65 - 1 >= 0) {
					local128 -= Static42.anIntArray48[local293 + local90 - (local65 - -1) * 128];
				}
				if (local136 >= 0) {
					Static245.anIntArray392[local90 + local293] = local128 / (local65 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZB)C")
	public static char method3805(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(42) char local42 = Static285.aCharArray4[local7 - 128];
			if (local42 == '\u0000') {
				local42 = '?';
			}
			local7 = local42;
		}
		return (char) local7;
	}
}
