import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!md", name = "bb", descriptor = "Lclient!of;")
	public static Class4_Sub5_Sub2_Sub1 aClass4_Sub5_Sub2_Sub1_2;

	@OriginalMember(owner = "client!md", name = "gb", descriptor = "[I")
	public static int[] anIntArray382;

	@OriginalMember(owner = "client!md", name = "K", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_91 = new Class85("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!md", name = "O", descriptor = "I")
	public static int anInt3806 = 3;

	@OriginalMember(owner = "client!md", name = "db", descriptor = "F")
	public static float aFloat34 = 0.0F;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILclient!al;Lclient!al;)V")
	public static void method3437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub1 arg3, @OriginalArg(4) Class4_Sub1 arg4) {
		if (Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static1.method3(arg0, arg1, arg2);
		}
		Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2].aClass4_Sub1_2 = arg3;
		Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2].aClass4_Sub1_1 = arg4;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!rg;)V")
	public static void method3438(@OriginalArg(1) Class5_Sub12 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static257.aClass129_5 != null) {
			@Pc(22) int local22;
			try {
				Static257.aClass129_5.method3365(0L);
				Static257.aClass129_5.method3366(local8);
				for (local22 = 0; local22 < 24 && local8[local22] == 0; local22++) {
				}
				if (local22 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(46) Exception local46) {
				for (local22 = 0; local22 < 24; local22++) {
					local8[local22] = -1;
				}
			}
		}
		arg0.method5110(24, local8);
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(B)V")
	public static void method3439() {
		if (Static203.anIntArray488 != null) {
			return;
		}
		Static203.anIntArray488 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(24) int local24 = 0; local24 < 65536; local24++) {
			@Pc(37) double local37 = (double) (local24 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(48) double local48 = (double) (local24 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(55) double local55 = (double) (local24 & 0x7F) / 128.0D;
			@Pc(57) double local57 = local55;
			@Pc(59) double local59 = local55;
			@Pc(61) double local61 = local55;
			if (local48 != 0.0D) {
				@Pc(75) double local75;
				if (local55 < 0.5D) {
					local75 = (local48 + 1.0D) * local55;
				} else {
					local75 = local55 + local48 - local48 * local55;
				}
				@Pc(90) double local90 = local55 * 2.0D - local75;
				@Pc(94) double local94 = local37 + 0.3333333333333333D;
				if (local94 > 1.0D) {
					local94--;
				}
				@Pc(108) double local108 = local37 - 0.3333333333333333D;
				if (local37 * 6.0D < 1.0D) {
					local59 = (local75 - local90) * 6.0D * local37 + local90;
				} else if (local37 * 2.0D < 1.0D) {
					local59 = local75;
				} else if (local37 * 3.0D < 2.0D) {
					local59 = (local75 - local90) * (-local37 + 0.6666666666666666D) * 6.0D + local90;
				} else {
					local59 = local90;
				}
				if (local108 < 0.0D) {
					local108++;
				}
				if (local94 * 6.0D < 1.0D) {
					local57 = local90 + (local75 - local90) * 6.0D * local94;
				} else if (local94 * 2.0D < 1.0D) {
					local57 = local75;
				} else if (local94 * 3.0D < 2.0D) {
					local57 = local90 + (local75 - local90) * 6.0D * (0.6666666666666666D - local94);
				} else {
					local57 = local90;
				}
				if (local108 * 6.0D < 1.0D) {
					local61 = local90 + (local75 - local90) * 6.0D * local108;
				} else if (local108 * 2.0D < 1.0D) {
					local61 = local75;
				} else if (local108 * 3.0D < 2.0D) {
					local61 = local90 + (local75 - local90) * 6.0D * (0.6666666666666666D - local108);
				} else {
					local61 = local90;
				}
			}
			local57 = Math.pow(local57, local17);
			local59 = Math.pow(local59, local17);
			local61 = Math.pow(local61, local17);
			@Pc(280) int local280 = (int) (local57 * 256.0D);
			@Pc(285) int local285 = (int) (local59 * 256.0D);
			@Pc(290) int local290 = (int) (local61 * 256.0D);
			@Pc(301) int local301 = local290 + (local280 << 16) + (local285 << 8);
			Static203.anIntArray488[local24] = local301;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)V")
	public static void method3441(@OriginalArg(0) int arg0) {
		Static166.anInt3323 = arg0;
		Static238.aClass109_47.method2858();
	}
}
