import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "Lclient!pu;")
	public static Class50 aClass50_6;

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "Lclient!ka;")
	public static Class153 aClass153_1;

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "Lclient!pu;")
	public static Class50 aClass50_8;

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "[I")
	public static final int[] anIntArray87 = new int[4];

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "()V")
	public static void method2246() {
		aClass153_1 = null;
		aClass50_8 = null;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!ha;)V")
	public static void method2249(@OriginalArg(0) Class65 arg0) {
		if (aClass153_1 != null) {
			return;
		}
		@Pc(8) Class329 local8 = new Class329(580, 1104, 1);
		local8.method7677();
		local8.method7683(0, 128, 0);
		local8.method7683(0, -128, 0);
		for (@Pc(37) int local37 = 0; local37 <= 24; local37++) {
			@Pc(44) int local44 = local37 * 8192 / 24;
			@Pc(48) int local48 = Class200.anIntArray337[local44];
			@Pc(52) int local52 = Class200.anIntArray338[local44];
			@Pc(61) int local61;
			@Pc(67) int local67;
			@Pc(75) int local75;
			@Pc(83) int local83;
			for (@Pc(54) int local54 = 1; local54 < 24; local54++) {
				local61 = local54 * 8192 / 24;
				local67 = Class200.anIntArray338[local61] >> 7;
				local75 = Class200.anIntArray337[local61] * local48 >> 21;
				local83 = Class200.anIntArray337[local61] * local52 >> 21;
				local8.method7683(local83, local67, -local75);
			}
			if (local37 > 0) {
				local61 = local37 * 23 + 2;
				local67 = local61 - 23;
				local8.method7671(0, (byte) 0, (short) 0, (byte) 0, (byte) 0, (short) 127, local61, local67);
				for (local75 = 1; local75 < 23; local75++) {
					local83 = local67 + 1;
					@Pc(130) int local130 = local61 + 1;
					local8.method7671(local67, (byte) 0, (short) 0, (byte) 0, (byte) 0, (short) 127, local61, local83);
					local8.method7671(local83, (byte) 0, (short) 0, (byte) 0, (byte) 0, (short) 127, local61, local130);
					local67 = local83;
					local61 = local130;
				}
				local8.method7671(local61, (byte) 0, (short) 0, (byte) 0, (byte) 0, (short) 127, 1, local67);
			}
		}
		local8.anInt9031 = local8.anInt9041;
		local8.anIntArray507 = null;
		local8.anIntArray502 = null;
		local8.aByteArray91 = null;
		aClass153_1 = arg0.method6964(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(Lclient!ha;)V")
	public static void method2255(@OriginalArg(0) Class65 arg0) {
		if (aClass50_8 != null) {
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
		aClass50_8 = arg0.method6952(128, 128, local7, 128);
		aClass50_6 = arg0.method6952(128, 128, local4, 128);
	}
}
