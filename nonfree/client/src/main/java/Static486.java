import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!ha;")
	public static Class12 aClass12_18;

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "Lclient!r;")
	public static Class19 aClass19_7;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "Lclient!ha;")
	public static Class12 aClass12_19;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "[I")
	public static final int[] anIntArray644 = new int[4];

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method7027(@OriginalArg(0) Class9 arg0) {
		if (aClass12_18 != null) {
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
		aClass12_18 = arg0.method7641(local7, 128, 128, 128);
		aClass12_19 = arg0.method7641(local4, 128, 128, 128);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
	public static void method7030() {
		aClass19_7 = null;
		aClass12_18 = null;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(Lclient!qa;)V")
	public static void method7032(@OriginalArg(0) Class9 arg0) {
		if (aClass19_7 != null) {
			return;
		}
		@Pc(8) Class86 local8 = new Class86(580, 1104, 1);
		local8.method2801();
		local8.method2805(0, 0, 128);
		local8.method2805(0, 0, -128);
		for (@Pc(37) int local37 = 0; local37 <= 24; local37++) {
			@Pc(44) int local44 = local37 * 8192 / 24;
			@Pc(48) int local48 = Class307.anIntArray744[local44];
			@Pc(52) int local52 = Class307.anIntArray743[local44];
			@Pc(61) int local61;
			@Pc(67) int local67;
			@Pc(75) int local75;
			@Pc(83) int local83;
			for (@Pc(54) int local54 = 1; local54 < 24; local54++) {
				local61 = local54 * 8192 / 24;
				local67 = Class307.anIntArray743[local61] >> 8;
				local75 = Class307.anIntArray744[local61] * local48 >> 23;
				local83 = Class307.anIntArray744[local61] * local52 >> 23;
				local8.method2805(-local75, local83, local67);
			}
			if (local37 > 0) {
				local61 = local37 * 23 + 2;
				local67 = local61 - 23;
				local8.method2806(local61, (short) 0, (short) 127, (byte) 0, (byte) 0, 0, (byte) 0, local67);
				for (local75 = 1; local75 < 23; local75++) {
					local83 = local67 + 1;
					@Pc(130) int local130 = local61 + 1;
					local8.method2806(local61, (short) 0, (short) 127, (byte) 0, (byte) 0, local67, (byte) 0, local83);
					local8.method2806(local61, (short) 0, (short) 127, (byte) 0, (byte) 0, local83, (byte) 0, local130);
					local67 = local83;
					local61 = local130;
				}
				local8.method2806(1, (short) 0, (short) 127, (byte) 0, (byte) 0, local61, (byte) 0, local67);
			}
		}
		local8.anInt3066 = local8.anInt3059;
		local8.anIntArray241 = null;
		local8.anIntArray243 = null;
		local8.aByteArray36 = null;
		aClass19_7 = arg0.method7635(local8, 51200, 33, 64, 768);
	}
}
