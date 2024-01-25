import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!or", name = "n", descriptor = "[I")
	public static final int[] anIntArray522 = new int[14];

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	public static void method4301() {
		if (Static404.anIntArray530 != null) {
			return;
		}
		Static404.anIntArray530 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(24) int local24 = 0; local24 < 65536; local24++) {
			@Pc(36) double local36 = (double) (local24 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(47) double local47 = (double) (local24 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(54) double local54 = (double) (local24 & 0x7F) / 128.0D;
			@Pc(56) double local56 = local54;
			@Pc(58) double local58 = local54;
			@Pc(60) double local60 = local54;
			if (local47 != 0.0D) {
				@Pc(77) double local77;
				if (local54 < 0.5D) {
					local77 = local54 * (local47 + 1.0D);
				} else {
					local77 = local47 + local54 - local54 * local47;
				}
				@Pc(90) double local90 = local54 * 2.0D - local77;
				@Pc(94) double local94 = local36 + 0.3333333333333333D;
				if (local94 > 1.0D) {
					local94--;
				}
				@Pc(108) double local108 = local36 - 0.3333333333333333D;
				if (local108 < 0.0D) {
					local108++;
				}
				if (local36 * 6.0D < 1.0D) {
					local58 = local90 + local36 * 6.0D * (local77 - local90);
				} else if (local36 * 2.0D < 1.0D) {
					local58 = local77;
				} else if (local36 * 3.0D < 2.0D) {
					local58 = (0.6666666666666666D - local36) * 6.0D * (local77 - local90) + local90;
				} else {
					local58 = local90;
				}
				if (local94 * 6.0D < 1.0D) {
					local56 = local90 + (local77 - local90) * 6.0D * local94;
				} else if (local94 * 2.0D < 1.0D) {
					local56 = local77;
				} else if (local94 * 3.0D < 2.0D) {
					local56 = (0.6666666666666666D - local94) * 6.0D * (local77 - local90) + local90;
				} else {
					local56 = local90;
				}
				if (local108 * 6.0D < 1.0D) {
					local60 = local90 + (local77 - local90) * 6.0D * local108;
				} else if (local108 * 2.0D < 1.0D) {
					local60 = local77;
				} else if (local108 * 3.0D < 2.0D) {
					local60 = local90 + (0.6666666666666666D - local108) * (-local90 + local77) * 6.0D;
				} else {
					local60 = local90;
				}
			}
			local56 = Math.pow(local56, local17);
			local58 = Math.pow(local58, local17);
			local60 = Math.pow(local60, local17);
			@Pc(279) int local279 = (int) (local56 * 256.0D);
			@Pc(284) int local284 = (int) (local58 * 256.0D);
			@Pc(289) int local289 = (int) (local60 * 256.0D);
			@Pc(300) int local300 = (local284 << 8) + ((local279 << 16) + local289);
			Static404.anIntArray530[local24] = local300;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BII)I")
	public static int method4303(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4310(@OriginalArg(0) String arg0) {
		if (!Static293.aBoolean300) {
			return;
		}
		@Pc(8) boolean local8 = false;
		@Pc(10) int local10 = Static180.anInt3908;
		@Pc(12) int[] local12 = Static274.anIntArray500;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) Class30_Sub1_Sub1_Sub2 local21 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local12[local14]];
			if (local21 != null && Static429.aClass30_Sub1_Sub1_Sub2_2 != local21 && local21.aString9 != null && local21.aString9.equalsIgnoreCase(arg0)) {
				Static32.method677(Static223.aClass177_60);
				Static433.aClass1_Sub3_Sub1_11.method1167(Static132.anInt2941);
				Static433.aClass1_Sub3_Sub1_11.method1223(local12[local14]);
				Static433.aClass1_Sub3_Sub1_11.method1223(Static118.anInt2743);
				Static433.aClass1_Sub3_Sub1_11.method1223(Static189.anInt3984);
				Static433.aClass1_Sub3_Sub1_11.method1175(0);
				Static56.method1067(0, -2, local21.anIntArray130[0], local21.anIntArray129[0], 0, true, local21.method944(), local21.method944());
				local8 = true;
				break;
			}
		}
		if (!local8) {
			Static192.method3105(Static434.aClass158_205.method3594(Static365.anInt6682) + arg0);
		}
		if (Static293.aBoolean300) {
			Static192.method3103();
		}
	}
}
