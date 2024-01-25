import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "Lclient!c;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "Lclient!f;")
	public static Class78 aClass78_2;

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "Lclient!f;")
	public static Class78 aClass78_3;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "[I")
	public static final int[] anIntArray11 = new int[4];

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method170(@OriginalArg(0) Class121 arg0) {
		if (aClass78_3 != null) {
			return;
		}
		@Pc(4) int[] local4 = new int[16384];
		@Pc(7) int[] local7 = new int[16384];
		for (@Pc(9) int local9 = 0; local9 < 64; local9++) {
			@Pc(14) int local14 = 64 - local9;
			@Pc(18) int local18 = local14 * local14;
			@Pc(24) int local24 = 128 - local9 - 1;
			@Pc(28) int local28 = local9 * 128;
			@Pc(32) int local32 = local24 * 128;
			for (@Pc(34) int local34 = 0; local34 < 64; local34++) {
				@Pc(39) int local39 = 64 - local34;
				@Pc(43) int local43 = local39 * local39;
				@Pc(49) int local49 = 128 - local34 - 1;
				@Pc(59) int local59 = 256 - (local43 + local18 << 8) / 4096;
				local59 = local59 * 16 * 192 / 1536;
				if (local59 < 0) {
					local59 = 0;
				} else if (local59 > 255) {
					local59 = 255;
				}
				@Pc(81) int local81 = local59 / 2;
				local7[local28 + local34] = local7[local28 + local49] = local7[local32 + local34] = local7[local32 + local49] = (local59 | 0xFF00) << 16;
				local4[local28 + local34] = local4[local28 + local49] = local4[local32 + local34] = local4[local32 + local49] = 127 - local81 << 24 | 0xFFFFFF;
			}
		}
		aClass78_3 = arg0.method4575(local7, 128, 128, 128);
		aClass78_2 = arg0.method4575(local4, 128, 128, 128);
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "()V")
	public static void method171() {
		aClass37_1 = null;
		aClass78_3 = null;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(Lclient!qa;)V")
	public static void method173(@OriginalArg(0) Class121 arg0) {
		if (aClass37_1 != null) {
			return;
		}
		@Pc(8) Class155 local8 = new Class155(580, 1104, 1);
		local8.method3399();
		local8.method3392(0, 128, 0);
		local8.method3392(0, -128, 0);
		for (@Pc(37) int local37 = 0; local37 <= 24; local37++) {
			@Pc(44) int local44 = local37 * 8192 / 24;
			@Pc(48) int local48 = Class262.anIntArray575[local44];
			@Pc(52) int local52 = Class262.anIntArray576[local44];
			@Pc(61) int local61;
			@Pc(67) int local67;
			@Pc(75) int local75;
			@Pc(83) int local83;
			for (@Pc(54) int local54 = 1; local54 < 24; local54++) {
				local61 = local54 * 8192 / 24;
				local67 = Class262.anIntArray576[local61] >> 8;
				local75 = Class262.anIntArray575[local61] * local48 >> 23;
				local83 = Class262.anIntArray575[local61] * local52 >> 23;
				local8.method3392(-local75, local67, local83);
			}
			if (local37 > 0) {
				local61 = local37 * 23 + 2;
				local67 = local61 - 23;
				local8.method3404(0, (byte) 0, (byte) 0, (short) 0, local67, local61, (byte) 0, (short) 127);
				for (local75 = 1; local75 < 23; local75++) {
					local83 = local67 + 1;
					@Pc(130) int local130 = local61 + 1;
					local8.method3404(local67, (byte) 0, (byte) 0, (short) 0, local83, local61, (byte) 0, (short) 127);
					local8.method3404(local83, (byte) 0, (byte) 0, (short) 0, local130, local61, (byte) 0, (short) 127);
					local67 = local83;
					local61 = local130;
				}
				local8.method3404(local61, (byte) 0, (byte) 0, (short) 0, local67, 1, (byte) 0, (short) 127);
			}
		}
		local8.anInt4081 = local8.anInt4068;
		local8.anIntArray328 = null;
		local8.anIntArray325 = null;
		local8.aByteArray43 = null;
		aClass37_1 = arg0.method4617(local8, 51200, 33, 64, 768);
	}
}
