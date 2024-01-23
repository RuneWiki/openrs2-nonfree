import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!p", name = "pc", descriptor = "Ljava/lang/String;")
	public static String aString236;

	@OriginalMember(owner = "client!p", name = "yc", descriptor = "Lclient!fh;")
	public static Class58 aClass58_80;

	@OriginalMember(owner = "client!p", name = "zc", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!p", name = "nc", descriptor = "Lclient!ic;")
	public static Class85 aClass85_18 = new Class85(16);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIB)V")
	public static void method3332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static229.anInt4394 = -1;
		@Pc(7) float local7 = (float) Static121.anInt2960 / (float) Static121.anInt2965;
		Static16.anInt929 = -1;
		@Pc(15) int local15 = arg1;
		@Pc(17) int local17 = arg2;
		if (local7 < 1.0F) {
			local17 = (int) ((float) arg1 * local7);
		} else {
			local15 = (int) ((float) arg2 / local7);
		}
		@Pc(43) int local43 = arg0 - (arg2 - local17) / 2;
		@Pc(52) int local52 = arg3 - (arg1 - local15) / 2;
		Static22.anInt331 = Static121.anInt2965 * local52 / local15;
		Static275.anInt5232 = Static121.anInt2960 * local43 / local17;
		Static204.method3262();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III[B)Z")
	public static boolean method3333(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class4_Sub10 local12 = new Class4_Sub10(arg2);
		@Pc(14) int local14 = -1;
		label55: while (true) {
			@Pc(18) int local18 = local12.method4635();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			@Pc(28) boolean local28 = false;
			while (true) {
				@Pc(34) int local34;
				while (!local28) {
					local34 = local12.method4616();
					if (local34 == 0) {
						continue label55;
					}
					local26 += local34 - 1;
					@Pc(62) int local62 = local26 >> 6 & 0x3F;
					@Pc(68) int local68 = local12.method4666() >> 2;
					@Pc(72) int local72 = arg1 + local62;
					@Pc(76) int local76 = local26 & 0x3F;
					@Pc(80) int local80 = arg0 + local76;
					if (local72 > 0 && local80 > 0 && local72 < 103 && local80 < 103) {
						@Pc(102) Class184 local102 = Static6.method99(local14);
						if (local68 != 22 || Static117.aBoolean159 || local102.anInt5523 != 0 || local102.anInt5510 == 1 || local102.aBoolean377) {
							local28 = true;
							if (!local102.method4486()) {
								local7 = false;
								Static295.anInt5487++;
							}
						}
					}
				}
				local34 = local12.method4616();
				if (local34 == 0) {
					break;
				}
				local12.method4666();
			}
		}
	}
}
