import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!td", name = "N", descriptor = "Lclient!lj;")
	public static Class1_Sub5_Sub6 aClass1_Sub5_Sub6_9;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "I")
	public static int anInt4858 = 0;

	@OriginalMember(owner = "client!td", name = "L", descriptor = "I")
	public static int anInt4869 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(JI)V")
	public static void method4059(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static282.anInt5138; local14++) {
			if (Static86.aLongArray6[local14] == arg0) {
				Static282.anInt5138--;
				for (@Pc(42) int local42 = local14; local42 < Static282.anInt5138; local42++) {
					Static86.aLongArray6[local42] = Static86.aLongArray6[local42 + 1];
					Static18.aStringArray3[local42] = Static18.aStringArray3[local42 + 1];
					Static114.aBooleanArray6[local42] = Static114.aBooleanArray6[local42 + 1];
				}
				Static105.anInt2227 = Static149.anInt950;
				Static116.aClass1_Sub13_Sub1_48.method1887(159);
				Static116.aClass1_Sub13_Sub1_48.method1857(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!fh;B)Ljava/lang/String;")
	public static String method4065(@OriginalArg(0) Class1_Sub13 arg0) {
		return Static57.method1026(arg0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!nm;B)V")
	public static void method4066(@OriginalArg(0) Class119 arg0) {
		Static132.aClass57_Sub1Array2 = Static2.method44(Static240.anInt4468, arg0);
		Static58.anIntArray97 = new int[256];
		@Pc(15) int local15;
		for (local15 = 0; local15 < 3; local15++) {
			@Pc(27) float local27 = (float) (Static209.anIntArray438[local15] >> 16 & 0xFF);
			@Pc(37) int local37 = Static209.anIntArray438[local15 + 1] >> 16 & 0xFF;
			@Pc(45) float local45 = ((float) local37 - local27) / 64.0F;
			@Pc(54) float local54 = (float) (Static209.anIntArray438[local15] >> 8 & 0xFF);
			@Pc(64) int local64 = Static209.anIntArray438[local15 + 1] >> 8 & 0xFF;
			@Pc(72) float local72 = ((float) local64 - local54) / 64.0F;
			@Pc(79) float local79 = (float) (Static209.anIntArray438[local15] & 0xFF);
			@Pc(87) int local87 = Static209.anIntArray438[local15 + 1] & 0xFF;
			@Pc(94) float local94 = ((float) local87 - local79) / 64.0F;
			for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
				Static58.anIntArray97[local96 + local15 * 64] = (int) local54 << 8 | (int) local27 << 16 | (int) local79;
				local79 += local94;
				local54 += local72;
				local27 += local45;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			Static58.anIntArray97[local15] = Static209.anIntArray438[3];
		}
		Static265.anIntArray550 = new int[32768];
		Static196.anIntArray412 = new int[32768];
		Static88.method1725(null);
		Static23.anIntArray52 = new int[32768];
		Static132.anIntArray202 = new int[32768];
		Static137.aClass1_Sub5_Sub6_Sub1_1 = new Class1_Sub5_Sub6_Sub1(128, 254);
	}
}
