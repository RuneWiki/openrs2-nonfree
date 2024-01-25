import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_125 = new Class376(56, 3);

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "Lclient!ad;")
	public static final Class7 aClass7_5 = new Class7();

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!fl;)V")
	public static void method7413(@OriginalArg(1) Class23_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(16) Class3_Sub32 local16 = (Class3_Sub32) Static554.aClass62_43.method1682((long) arg0.anInt10180);
		if (local16 == null) {
			return;
		}
		if (local16.aClass3_Sub9_Sub2_1 != null) {
			Static557.aClass3_Sub9_Sub1_2.method1420(local16.aClass3_Sub9_Sub2_1);
			local16.aClass3_Sub9_Sub2_1 = null;
		}
		local16.method8770();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!fca;I)Lclient!eja;")
	public static Class103 method7414(@OriginalArg(0) Class3_Sub17 arg0) {
		@Pc(7) String local7 = arg0.method4847();
		@Pc(19) Class92 local19 = Static146.method2531()[arg0.method4888()];
		@Pc(26) Class65 local26 = Static657.method8561()[arg0.method4888()];
		@Pc(30) int local30 = arg0.method4869();
		@Pc(34) int local34 = arg0.method4869();
		@Pc(38) int local38 = arg0.method4888();
		@Pc(42) int local42 = arg0.method4888();
		@Pc(46) int local46 = arg0.method4888();
		@Pc(50) int local50 = arg0.method4858();
		@Pc(54) int local54 = arg0.method4858();
		@Pc(58) int local58 = arg0.method4868();
		@Pc(62) int local62 = arg0.method4868();
		@Pc(68) int local68 = arg0.method4868();
		return new Class103(local7, local19, local26, local30, local34, local38, local42, local46, local50, local54, local58, local62, local68);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!ha;IILclient!d;II)V")
	public static void method7416(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface5 arg4, @OriginalArg(5) int arg5) {
		if (Static678.anInt10338 < 100) {
			Static167.method2778(arg4, arg1);
		}
		arg1.KA(arg5, arg0, arg5 + arg2, arg0 - -arg3);
		@Pc(42) int local42;
		@Pc(53) int local53;
		if (Static678.anInt10338 < 100) {
			local42 = arg2 / 2 + arg5;
			local53 = arg3 / 2 + arg0 - 18 - 20;
			arg1.aa(arg5, arg0, arg2, arg3, -16777216, 0);
			arg1.method8146(local42 - 152, local53, 304, 34, Static520.aColorArray6[Static659.anInt10093].getRGB(), 0);
			arg1.aa(local42 - 150, local53 - -2, Static678.anInt10338 * 3, 30, Static408.aColorArray7[Static659.anInt10093].getRGB(), 0);
			Static243.aClass69_5.method7467(local42, -1, Static569.aClass335_19.method7694(Static319.anInt5939), Static125.aColorArray3[Static659.anInt10093].getRGB(), local53 + 20);
			return;
		}
		@Pc(117) int local117 = Static176.anInt3320 - (int) ((float) arg2 / Static574.aFloat183);
		local42 = (int) ((float) arg3 / Static574.aFloat183) + Static462.anInt7931;
		local53 = Static176.anInt3320 + (int) ((float) arg2 / Static574.aFloat183);
		@Pc(142) int local142 = Static462.anInt7931 - (int) ((float) arg3 / Static574.aFloat183);
		Static104.anInt2196 = (int) ((float) (arg3 * 2) / Static574.aFloat183);
		Static89.anInt1983 = Static176.anInt3320 - (int) ((float) arg2 / Static574.aFloat183);
		Static479.anInt8118 = (int) ((float) (arg2 * 2) / Static574.aFloat183);
		Static529.anInt8741 = Static462.anInt7931 - (int) ((float) arg3 / Static574.aFloat183);
		Static574.method7083(Static574.anInt8361 + local117, Static574.anInt8366 + local42, local53 + Static574.anInt8361, Static574.anInt8366 + local142, arg5, arg0, arg5 + arg2, arg3 + arg0 - -1);
		Static574.method7078(arg1);
		@Pc(202) Class193 local202 = Static574.method7074(arg1);
		Static580.method7797(local202, arg1);
		if (Static403.anInt6887 > 0) {
			Static666.anInt10253--;
			if (Static666.anInt10253 == 0) {
				Static666.anInt10253 = 20;
				Static403.anInt6887--;
			}
		}
		if (!Static408.aBoolean526) {
			return;
		}
		@Pc(234) int local234 = arg5 + arg2 - 5;
		@Pc(241) int local241 = arg0 + arg3 - 8;
		Static277.aClass69_9.method7458(local241, local234, "Fps:" + Static3.anInt18, -1, 16776960);
		@Pc(256) int local256 = local241 - 15;
		@Pc(258) Runtime local258 = Runtime.getRuntime();
		@Pc(267) int local267 = (int) ((local258.totalMemory() - local258.freeMemory()) / 1024L);
		@Pc(269) int local269 = 16776960;
		if (local267 > 65536) {
			local269 = 16711680;
		}
		Static277.aClass69_9.method7458(local256, local234, "Mem:" + local267 + "k", -1, local269);
		local241 = local256 - 15;
	}
}
