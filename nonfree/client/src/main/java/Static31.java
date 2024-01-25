import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "Lclient!vm;")
	public static Class211 aClass211_1;

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString16;

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "Lclient!wo;")
	public static Class216 aClass216_7;

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
	public static int anInt1091;

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "[I")
	public static int[] anIntArray94;

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "[I")
	public static int[] anIntArray95;

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(Z)V")
	public static void method796() {
		@Pc(13) int local13 = Static357.method3877();
		if (local13 == 0) {
			Static304.aByteArrayArrayArray10 = null;
			Static81.method4488(0);
		} else if (local13 == 1) {
			Static327.method5308((byte) 0);
			Static81.method4488(512);
			if (Static200.aByteArrayArrayArray8 != null) {
				Static137.method2805();
			}
		} else {
			Static327.method5308((byte) (Static247.anInt5067 - 4 & 0xFF));
			Static81.method4488(2);
		}
		Static234.anInt4780 = Static242.anInt6745;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BIZ)V")
	public static void method798(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		Static64.aByteArrayArrayArray2 = new byte[arg0][Static233.anInt5573 + 1][Static134.anInt2971 + 1];
		Static299.anIntArray107 = new int[Static134.anInt2971];
		Static231.aByteArrayArrayArray9 = new byte[arg0][Static233.anInt5573][Static134.anInt2971];
		Static189.aByteArrayArrayArray6 = new byte[arg0][Static233.anInt5573][Static134.anInt2971];
		Static130.aByteArrayArrayArray5 = new byte[arg0][Static233.anInt5573][Static134.anInt2971];
		Static211.anInt4537 = 99;
		if (!arg1) {
			Static37.aByteArrayArrayArray1 = null;
		}
		Static340.anIntArray521 = new int[Static134.anInt2971];
		Static225.anIntArray419 = new int[Static134.anInt2971];
		Static332.aByteArrayArrayArray11 = new byte[arg0][Static233.anInt5573][Static134.anInt2971];
		Static133.anIntArray263 = new int[Static134.anInt2971];
		Static251.anIntArrayArrayArray15 = new int[arg0][Static233.anInt5573 + 1][Static134.anInt2971 + 1];
		Static3.anIntArray17 = new int[5];
		Static192.anIntArray375 = new int[Static134.anInt2971];
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method799(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) char[] local16 = new char[arg1];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < arg1; local20++) {
			@Pc(31) int local31 = arg0[arg2 + local20] & 0xFF;
			if (local31 != 0) {
				if (local31 >= 128 && local31 < 160) {
					@Pc(47) char local47 = aCharArray2[local31 - 128];
					if (local47 == '\u0000') {
						local47 = '?';
					}
					local31 = local47;
				}
				local16[local18++] = (char) local31;
			}
		}
		return new String(local16, 0, local18);
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(Z)I")
	public static int method800() {
		return 2;
	}
}
