import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Lclient!jn;")
	public static Class5 aClass5_5;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!lg;")
	public static Class60 aClass60_13;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "Lclient!lg;")
	public static Class60 aClass60_15;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "[I")
	public static final int[] anIntArray284 = new int[4];

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "()V")
	public static void method2782() {
		aClass5_5 = null;
		aClass60_13 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!vm;)V")
	public static void method2785(@OriginalArg(0) Class92 arg0) {
		if (aClass60_13 != null) {
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
		aClass60_13 = arg0.method4537(local7, 128, 128, 128);
		aClass60_15 = arg0.method4537(local4, 128, 128, 128);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Lclient!vm;)V")
	public static void method2789(@OriginalArg(0) Class92 arg0) {
		if (aClass5_5 != null) {
			return;
		}
		@Pc(8) Class153 local8 = new Class153(580, 1104, 1);
		local8.method4165();
		local8.method4174(128, 0, 0);
		local8.method4174(-128, 0, 0);
		for (@Pc(37) int local37 = 0; local37 <= 24; local37++) {
			@Pc(44) int local44 = local37 * 8192 / 24;
			@Pc(48) int local48 = Class4_Sub4_Sub25.anIntArray384[local44];
			@Pc(52) int local52 = Class4_Sub4_Sub25.anIntArray383[local44];
			@Pc(61) int local61;
			@Pc(67) int local67;
			@Pc(75) int local75;
			@Pc(83) int local83;
			for (@Pc(54) int local54 = 1; local54 < 24; local54++) {
				local61 = local54 * 8192 / 24;
				local67 = Class4_Sub4_Sub25.anIntArray383[local61] >> 8;
				local75 = Class4_Sub4_Sub25.anIntArray384[local61] * local48 >> 23;
				local83 = Class4_Sub4_Sub25.anIntArray384[local61] * local52 >> 23;
				local8.method4174(local67, -local75, local83);
			}
			if (local37 > 0) {
				local61 = local37 * 23 + 2;
				local67 = local61 - 23;
				local8.method4176((short) 0, (byte) 0, (short) 127, (byte) 0, (byte) 0, local67, local61, 0);
				for (local75 = 1; local75 < 23; local75++) {
					local83 = local67 + 1;
					@Pc(130) int local130 = local61 + 1;
					local8.method4176((short) 0, (byte) 0, (short) 127, (byte) 0, (byte) 0, local83, local61, local67);
					local8.method4176((short) 0, (byte) 0, (short) 127, (byte) 0, (byte) 0, local130, local61, local83);
					local67 = local83;
					local61 = local130;
				}
				local8.method4176((short) 0, (byte) 0, (short) 127, (byte) 0, (byte) 0, local67, 1, local61);
			}
		}
		local8.anInt5041 = local8.anInt5042;
		local8.anIntArray415 = null;
		local8.anIntArray417 = null;
		local8.aByteArray68 = null;
		aClass5_5 = arg0.method4513(local8, 25600, 33, 64, 768);
	}
}
