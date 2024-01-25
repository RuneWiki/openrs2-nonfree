import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "Z")
	public static final boolean aBoolean246 = false;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
	public static final int anInt3046 = 1338;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IBIILclient!av;JIILclient!aa;)V")
	public static void method2625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class20 arg3, @OriginalArg(5) long arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1 arg7) {
		@Pc(12) int local12 = arg5 * arg5 + arg2 * arg2;
		if ((long) local12 > arg4) {
			return;
		}
		@Pc(36) int local36 = Math.min(arg3.anInt509 / 2, arg3.anInt569 / 2);
		if (local36 * local36 >= local12) {
			Static38.method564(arg5, arg3, arg6, arg7, Static313.aClass9Array21[arg1], arg0, arg2);
			return;
		}
		local36 -= 10;
		@Pc(65) int local65;
		if (Static175.anInt10579 == 4) {
			local65 = (int) Static658.aFloat196 & 0x3FFF;
		} else {
			local65 = (int) Static658.aFloat196 + Static543.anInt9108 & 0x3FFF;
		}
		@Pc(78) int local78 = Class3_Sub2_Sub21.anIntArray358[local65];
		@Pc(82) int local82 = Class3_Sub2_Sub21.anIntArray356[local65];
		if (Static175.anInt10579 != 4) {
			local82 = local82 * 256 / (Static61.anInt953 + 256);
			local78 = local78 * 256 / (Static61.anInt953 + 256);
		}
		@Pc(111) int local111 = arg5 * local82 + arg2 * local78 >> 14;
		@Pc(122) int local122 = arg2 * local82 - arg5 * local78 >> 14;
		@Pc(128) double local128 = Math.atan2((double) local111, (double) local122);
		@Pc(135) int local135 = (int) ((double) local36 * Math.sin(local128));
		@Pc(142) int local142 = (int) (Math.cos(local128) * (double) local36);
		Static242.aClass9Array13[arg1].method8606((float) local135 + (float) arg3.anInt509 / 2.0F + (float) arg6, (float) -local142 + (float) arg0 + (float) arg3.anInt569 / 2.0F, 4096, (int) (-local128 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(III)Z")
	public static boolean method2626(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)I")
	public static int method2627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(19) int local19 = 255 - local7;
		@Pc(37) int local37 = ((arg0 & 0xFF00FF) * local7 & 0xFF00FF00 | local7 * (arg0 & 0xFF00) & 0xFF0000) >>> 8;
		return ((local19 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * local19 & 0xFF00FF00) >>> 8) + local37;
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V")
	public static void method2628() {
		@Pc(17) Class3_Sub53 local17;
		for (local17 = (Class3_Sub53) Static423.aClass357_43.method8391(); local17 != null; local17 = (Class3_Sub53) Static423.aClass357_43.method8392()) {
			Static252.method3953(false, local17);
		}
		for (local17 = (Class3_Sub53) Static3.aClass357_1.method8391(); local17 != null; local17 = (Class3_Sub53) Static3.aClass357_1.method8392()) {
			Static252.method3953(true, local17);
		}
	}
}
