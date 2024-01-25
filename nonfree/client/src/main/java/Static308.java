import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "Lclient!ka;")
	public static Class128 aClass128_2;

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "Lclient!ac;")
	public static Class5 aClass5_29;

	@OriginalMember(owner = "client!laa", name = "k", descriptor = "Lclient!ac;")
	public static Class5 aClass5_30;

	@OriginalMember(owner = "client!laa", name = "r", descriptor = "[I")
	public static final int[] anIntArray362 = new int[4];

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "()V")
	public static void method5204() {
		aClass128_2 = null;
		aClass5_30 = null;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!ha;)V")
	public static void method5209(@OriginalArg(0) Class33 arg0) {
		if (aClass128_2 != null) {
			return;
		}
		@Pc(8) Class142 local8 = new Class142(580, 1104, 1);
		local8.method4368();
		local8.method4355(0, 0, 128);
		local8.method4355(0, 0, -128);
		for (@Pc(37) int local37 = 0; local37 <= 24; local37++) {
			@Pc(44) int local44 = local37 * 8192 / 24;
			@Pc(48) int local48 = Class3_Sub1_Sub2.anIntArray84[local44];
			@Pc(52) int local52 = Class3_Sub1_Sub2.anIntArray85[local44];
			@Pc(61) int local61;
			@Pc(67) int local67;
			@Pc(75) int local75;
			@Pc(83) int local83;
			for (@Pc(54) int local54 = 1; local54 < 24; local54++) {
				local61 = local54 * 8192 / 24;
				local67 = Class3_Sub1_Sub2.anIntArray85[local61] >> 7;
				local75 = Class3_Sub1_Sub2.anIntArray84[local61] * local48 >> 21;
				local83 = Class3_Sub1_Sub2.anIntArray84[local61] * local52 >> 21;
				local8.method4355(-local75, local83, local67);
			}
			if (local37 > 0) {
				local61 = local37 * 23 + 2;
				local67 = local61 - 23;
				local8.method4365((short) 0, local67, (byte) 0, (byte) 0, (short) 127, local61, (byte) 0, 0);
				for (local75 = 1; local75 < 23; local75++) {
					local83 = local67 + 1;
					@Pc(130) int local130 = local61 + 1;
					local8.method4365((short) 0, local83, (byte) 0, (byte) 0, (short) 127, local61, (byte) 0, local67);
					local8.method4365((short) 0, local130, (byte) 0, (byte) 0, (short) 127, local61, (byte) 0, local83);
					local67 = local83;
					local61 = local130;
				}
				local8.method4365((short) 0, local67, (byte) 0, (byte) 0, (short) 127, 1, (byte) 0, local61);
			}
		}
		local8.anInt5152 = local8.anInt5171;
		local8.anIntArray298 = null;
		local8.anIntArray297 = null;
		local8.aByteArray53 = null;
		aClass128_2 = arg0.method6157(local8, 51200, 33, 64, 768);
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(Lclient!ha;)V")
	public static void method5212(@OriginalArg(0) Class33 arg0) {
		if (aClass5_30 != null) {
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
		aClass5_30 = arg0.method6204(128, 128, local7, 128);
		aClass5_29 = arg0.method6204(128, 128, local4, 128);
	}
}
