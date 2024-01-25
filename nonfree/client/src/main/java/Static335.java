import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "Lclient!wr;")
	public static Class363 aClass363_5;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_182 = new Class235(40, 2);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIBLclient!fa;IILclient!r;)V")
	public static void method4659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface7 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class134 arg5) {
		if (Static271.anInt4778 < 100) {
			Static542.method7397(arg5, arg2);
		}
		arg5.da(arg1, arg3, arg1 + arg4, arg3 + arg0);
		@Pc(32) int local32;
		@Pc(43) int local43;
		if (Static271.anInt4778 < 100) {
			local32 = arg1 + arg4 / 2;
			local43 = arg3 + arg0 / 2 - 18 - 20;
			arg5.J(arg1, arg3, arg4, arg0, -16777216, 0);
			arg5.method6958(local32 - 152, local43, 304, 34, Static556.aColorArray6[Static337.anInt8003].getRGB(), 0);
			arg5.J(local32 - 150, local43 + 2, Static271.anInt4778 * 3, 30, Static341.aColorArray2[Static337.anInt8003].getRGB(), 0);
			Static418.aClass64_11.method6605(-1, Static549.aColorArray5[Static337.anInt8003].getRGB(), local32, Static568.aClass351_22.method7651(Static307.anInt5279), local43 + 20);
			return;
		}
		@Pc(108) int local108 = Static71.anInt1407 - (int) ((float) arg4 / Static226.aFloat137);
		local32 = Static197.anInt6246 + (int) ((float) arg0 / Static226.aFloat137);
		local43 = (int) ((float) arg4 / Static226.aFloat137) + Static71.anInt1407;
		Static471.anInt8015 = Static71.anInt1407 - (int) ((float) arg4 / Static226.aFloat137);
		@Pc(141) int local141 = Static197.anInt6246 - (int) ((float) arg0 / Static226.aFloat137);
		Static9.anInt128 = (int) ((float) (arg0 * 2) / Static226.aFloat137);
		Static71.anInt1416 = Static197.anInt6246 - (int) ((float) arg0 / Static226.aFloat137);
		Static408.anInt7103 = (int) ((float) (arg4 * 2) / Static226.aFloat137);
		Static226.method5083(Static226.anInt6317 + local108, local32 + Static226.anInt6318, Static226.anInt6317 + local43, local141 + Static226.anInt6318, arg1, arg3, arg1 + arg4, arg3 - (-arg0 + -1));
		Static226.method5088(arg5);
		@Pc(200) Class353 local200 = Static226.method5086(arg5);
		Static279.method3930(arg5, local200);
		if (Static95.anInt2005 > 0) {
			Static520.anInt8816--;
			if (Static520.anInt8816 == 0) {
				Static95.anInt2005--;
				Static520.anInt8816 = 20;
			}
		}
		if (!Static57.aBoolean487) {
			return;
		}
		@Pc(228) int local228 = arg4 + arg1 - 5;
		@Pc(234) int local234 = arg0 + arg3 - 8;
		Static442.aClass64_12.method6618(local234, "Fps:" + Static163.anInt2947, -1, local228, 16776960);
		@Pc(249) int local249 = local234 - 15;
		@Pc(251) Runtime local251 = Runtime.getRuntime();
		@Pc(261) int local261 = (int) ((local251.totalMemory() - local251.freeMemory()) / 1024L);
		@Pc(263) int local263 = 16776960;
		if (local261 > 65536) {
			local263 = 16711680;
		}
		Static442.aClass64_12.method6618(local249, "Mem:" + local261 + "k", -1, local228, local263);
		local234 = local249 - 15;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIB)I")
	public static int method4660(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(47) int local47 = (arg0 & 0x7F) * 96 >> 7;
			if (local47 < 2) {
				local47 = 2;
			} else if (local47 > 126) {
				local47 = 126;
			}
			return (arg0 & 0xFF80) + local47;
		}
	}
}
