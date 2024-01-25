import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!du", name = "m", descriptor = "Lclient!ha;")
	public static Class22 aClass22_3;

	@OriginalMember(owner = "client!du", name = "q", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_8 = new Class320(14);

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
	public static void method2305() {
		if (Static537.anIntArray601 != null) {
			return;
		}
		Static537.anIntArray601 = new int[65536];
		@Pc(23) double local23 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(25) int local25 = 0; local25 < 65536; local25++) {
			@Pc(47) double local47 = (double) (local25 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(58) double local58 = (double) (local25 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(65) double local65 = (double) (local25 & 0x7F) / 128.0D;
			@Pc(67) double local67 = local65;
			@Pc(69) double local69 = local65;
			@Pc(71) double local71 = local65;
			if (local58 != 0.0D) {
				@Pc(87) double local87;
				if (local65 < 0.5D) {
					local87 = local65 * (local58 + 1.0D);
				} else {
					local87 = local58 + local65 - local58 * local65;
				}
				@Pc(103) double local103 = local65 * 2.0D - local87;
				@Pc(107) double local107 = local47 + 0.3333333333333333D;
				if (local107 > 1.0D) {
					local107--;
				}
				@Pc(121) double local121 = local47 - 0.3333333333333333D;
				if (local121 < 0.0D) {
					local121++;
				}
				if (local47 * 6.0D < 1.0D) {
					local69 = local47 * (local87 - local103) * 6.0D + local103;
				} else if (local47 * 2.0D < 1.0D) {
					local69 = local87;
				} else if (local47 * 3.0D < 2.0D) {
					local69 = local103 + (0.6666666666666666D - local47) * (-local103 + local87) * 6.0D;
				} else {
					local69 = local103;
				}
				if (local107 * 6.0D < 1.0D) {
					local67 = local103 + (local87 - local103) * 6.0D * local107;
				} else if (local107 * 2.0D < 1.0D) {
					local67 = local87;
				} else if (local107 * 3.0D < 2.0D) {
					local67 = (0.6666666666666666D - local107) * 6.0D * (local87 - local103) + local103;
				} else {
					local67 = local103;
				}
				if (local121 * 6.0D < 1.0D) {
					local71 = local121 * (local87 - local103) * 6.0D + local103;
				} else if (local121 * 2.0D < 1.0D) {
					local71 = local87;
				} else if (local121 * 3.0D < 2.0D) {
					local71 = (local87 - local103) * (0.6666666666666666D - local121) * 6.0D + local103;
				} else {
					local71 = local103;
				}
			}
			local67 = Math.pow(local67, local23);
			local69 = Math.pow(local69, local23);
			local71 = Math.pow(local71, local23);
			@Pc(312) int local312 = (int) (local67 * 256.0D);
			@Pc(317) int local317 = (int) (local69 * 256.0D);
			@Pc(322) int local322 = (int) (local71 * 256.0D);
			@Pc(333) int local333 = local322 + (local312 << 16) + (local317 << 8);
			Static537.anIntArray601[local25] = local333;
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(II)V")
	public static void method2306(@OriginalArg(0) int arg0) {
		if (Static580.aClass3_Sub22_24.aClass21_Sub4_1.method2001() == 0) {
			arg0 = -1;
		}
		if (Static500.anInt7979 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(29) Class356 local29 = Static608.aClass370_1.method8509(arg0);
			@Pc(33) Class361 local33 = local29.method7925();
			if (local33 == null) {
				arg0 = -1;
			} else {
				Static122.aClass47_1.method1402(local33.method8280(), local33.method8270(), Static508.aCanvas8, local33.method8281(), new Point(local29.anInt9356, local29.anInt9357));
				Static500.anInt7979 = arg0;
			}
		}
		if (arg0 == -1 && Static500.anInt7979 != -1) {
			Static122.aClass47_1.method1402((int[]) null, -1, Static508.aCanvas8, -1, new Point());
			Static500.anInt7979 = -1;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BZLclient!kt;)V")
	public static void method2307(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class9_Sub1_Sub1_Sub2 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(17) int local17 = 0;
		if (Static716.anInt11157 < arg1.anInt8811) {
			Static202.method3081(arg1);
		} else if (arg1.anInt8812 < Static716.anInt11157) {
			Static455.method6040(arg0, arg1);
			local7 = Static285.anInt4361;
			local17 = Static268.anInt4146;
		} else {
			Static602.method7734(arg1);
		}
		@Pc(96) int local96;
		if (arg1.anInt10694 < 512 || arg1.anInt10695 < 512 || arg1.anInt10694 >= Static497.anInt7926 * 512 - 512 || Static646.anInt9979 * 512 - 512 <= arg1.anInt10695) {
			arg1.aClass45_10.method6576(-1);
			for (local96 = 0; local96 < arg1.aClass407Array3.length; local96++) {
				arg1.aClass407Array3[local96].anInt11162 = -1;
				arg1.aClass407Array3[local96].aClass45_11.method6576(-1);
			}
			local17 = 0;
			arg1.anIntArray641 = null;
			local7 = -1;
			arg1.anInt8811 = 0;
			arg1.anInt8812 = 0;
			arg1.anInt10694 = arg1.anIntArray644[0] * 512 + arg1.method7485() * 256;
			arg1.anInt10695 = arg1.anIntArray643[0] * 512 + arg1.method7485() * 256;
			arg1.method7486();
		}
		if (arg1 == Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 && (arg1.anInt10694 < 6144 || arg1.anInt10695 < 6144 || arg1.anInt10694 >= Static497.anInt7926 * 512 - 6144 || (Static646.anInt9979 - 12) * 512 <= arg1.anInt10695)) {
			arg1.aClass45_10.method6576(-1);
			for (local96 = 0; local96 < arg1.aClass407Array3.length; local96++) {
				arg1.aClass407Array3[local96].anInt11162 = -1;
				arg1.aClass407Array3[local96].aClass45_11.method6576(-1);
			}
			local7 = -1;
			arg1.anInt8811 = 0;
			local17 = 0;
			arg1.anInt8812 = 0;
			arg1.anIntArray641 = null;
			arg1.anInt10694 = arg1.anIntArray644[0] * 512 + arg1.method7485() * 256;
			arg1.anInt10695 = arg1.anIntArray643[0] * 512 + arg1.method7485() * 256;
			arg1.method7486();
		}
		local96 = Static339.method4851(arg1);
		Static392.method5318(arg1);
		Static364.method5040(local96, local17, local7, arg1);
		Static534.method7109(arg1, local7);
		Static515.method6958(arg1);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II)V")
	public static void method2309(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub7_Sub21 local14 = Static136.method2378((long) arg0, 12);
		local14.method9260();
	}
}
