import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "Lclient!mo;")
	public static Class143 aClass143_114;

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "Lclient!sn;")
	public static Class188 aClass188_2;

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "[Lclient!gl;")
	public static Class2[] aClass2Array17;

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[100];

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public static void method5820() {
		Static189.aClass11_135.method213();
		Static348.aClass11_123.method213();
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	public static void method5821() {
		Static190.aClass11_85.method213();
		Static167.aClass11_125.method213();
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(I)V")
	public static void method5824() {
		if (Static218.aClass46_5.method5102()) {
			Static349.method5911();
			Static218.aClass46_5.method5136(Static95.aCanvas2);
			Static7.method206();
		} else {
			Static253.method1025(Static67.anInt1615);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIILclient!ne;IILclient!q;I)V")
	public static void method5825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class146 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class156 arg6, @OriginalArg(8) int arg7) {
		@Pc(24) int local24 = arg5 * arg5 + arg4 * arg4;
		if (local24 > arg7) {
			return;
		}
		@Pc(38) int local38 = Math.min(arg3.anInt4133 / 2, arg3.anInt4199 / 2);
		if (local38 * local38 >= local24) {
			Static317.method5477(arg0, arg4, arg1, arg6, arg3, Static200.aClass2Array9[arg2], arg5);
			return;
		}
		local38 -= 10;
		@Pc(58) int local58;
		if (Static205.anInt4115 == 4) {
			local58 = (int) Static94.aFloat42 & 0x3FFF;
		} else {
			local58 = Static8.anInt205 + (int) Static94.aFloat42 & 0x3FFF;
		}
		@Pc(71) int local71 = Class14_Sub3_Sub34.anIntArray547[local58];
		@Pc(75) int local75 = Class14_Sub3_Sub34.anIntArray546[local58];
		if (Static205.anInt4115 != 4) {
			local71 = local71 * 256 / (Static309.anInt5886 + 256);
			local75 = local75 * 256 / (Static309.anInt5886 + 256);
		}
		@Pc(105) int local105 = local71 * arg5 + local75 * arg4 >> 15;
		@Pc(116) int local116 = local75 * arg5 - local71 * arg4 >> 15;
		@Pc(122) double local122 = Math.atan2((double) local105, (double) local116);
		@Pc(129) int local129 = (int) ((double) local38 * Math.sin(local122));
		@Pc(136) int local136 = (int) ((double) local38 * Math.cos(local122));
		aClass2Array17[arg2].method2629((float) arg3.anInt4133 / 2.0F + (float) arg1 + (float) local129, (float) arg0 + (float) arg3.anInt4199 / 2.0F - (float) local136, 4096, (int) (-local122 / 6.283185307179586D * 65535.0D));
	}
}
