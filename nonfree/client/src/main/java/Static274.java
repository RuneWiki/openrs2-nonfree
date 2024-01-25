import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	public static int anInt4977;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
	public static int anInt4982;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Lclient!ha;")
	public static Class35 aClass35_22;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "[[[Lclient!sk;")
	public static Class262[][][] aClass262ArrayArrayArray3;

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
	public static int anInt4992;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	public static void method4347() {
		if (Static445.anIntArray614 != null) {
			return;
		}
		Static445.anIntArray614 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(21) int local21 = 0; local21 < 65536; local21++) {
			@Pc(36) double local36 = (double) (local21 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(47) double local47 = (double) (local21 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(54) double local54 = (double) (local21 & 0x7F) / 128.0D;
			@Pc(56) double local56 = local54;
			@Pc(58) double local58 = local54;
			@Pc(60) double local60 = local54;
			if (local47 != 0.0D) {
				@Pc(74) double local74;
				if (local54 < 0.5D) {
					local74 = local54 * (local47 + 1.0D);
				} else {
					local74 = local54 + local47 - local47 * local54;
				}
				@Pc(90) double local90 = local54 * 2.0D - local74;
				@Pc(94) double local94 = local36 + 0.3333333333333333D;
				if (local94 > 1.0D) {
					local94--;
				}
				@Pc(108) double local108 = local36 - 0.3333333333333333D;
				if (local94 * 6.0D < 1.0D) {
					local56 = local90 + (local74 - local90) * 6.0D * local94;
				} else if (local94 * 2.0D < 1.0D) {
					local56 = local74;
				} else if (local94 * 3.0D < 2.0D) {
					local56 = (0.6666666666666666D - local94) * 6.0D * (local74 - local90) + local90;
				} else {
					local56 = local90;
				}
				if (local36 * 6.0D < 1.0D) {
					local58 = local36 * (local74 - local90) * 6.0D + local90;
				} else if (local36 * 2.0D < 1.0D) {
					local58 = local74;
				} else if (local36 * 3.0D < 2.0D) {
					local58 = local90 + (0.6666666666666666D - local36) * 6.0D * (local74 - local90);
				} else {
					local58 = local90;
				}
				if (local108 < 0.0D) {
					local108++;
				}
				if (local108 * 6.0D < 1.0D) {
					local60 = local90 + (local74 - local90) * 6.0D * local108;
				} else if (local108 * 2.0D < 1.0D) {
					local60 = local74;
				} else if (local108 * 3.0D < 2.0D) {
					local60 = (local74 - local90) * 6.0D * (0.6666666666666666D - local108) + local90;
				} else {
					local60 = local90;
				}
			}
			local56 = Math.pow(local56, local19);
			local58 = Math.pow(local58, local19);
			local60 = Math.pow(local60, local19);
			@Pc(288) int local288 = (int) (local56 * 256.0D);
			@Pc(293) int local293 = (int) (local58 * 256.0D);
			@Pc(298) int local298 = (int) (local60 * 256.0D);
			@Pc(308) int local308 = local298 + (local288 << 16) + (local293 << 8);
			Static445.anIntArray614[local21] = local308;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[ILclient!os;BZ)Lclient!gg;")
	public static Class19_Sub2_Sub1 method4352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class39_Sub3 arg3) {
		if (arg3.aBoolean490 || Static150.method2607(arg0) && Static150.method2607(arg1)) {
			return new Class19_Sub2_Sub1(arg3, 3553, arg0, arg1, false, arg2);
		} else if (arg3.aBoolean506) {
			return new Class19_Sub2_Sub1(arg3, 34037, arg0, arg1, false, arg2);
		} else {
			return new Class19_Sub2_Sub1(arg3, arg0, arg1, Static131.method2413(arg0), Static131.method2413(arg1), arg2);
		}
	}
}
