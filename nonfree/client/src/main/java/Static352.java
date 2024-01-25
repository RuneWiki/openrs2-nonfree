import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "F")
	public static float aFloat67 = 0.0F;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "Z")
	public static boolean aBoolean518 = false;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILclient!bu;IIZI)V")
	public static void method4667(@OriginalArg(1) int arg0, @OriginalArg(2) Class32 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static410.anInt6753 = 1;
		Static181.anInt3614 = arg2;
		Static50.aClass32_21 = arg1;
		Static120.anInt2585 = 0;
		Static61.anInt1580 = arg3;
		Static193.aBoolean332 = false;
		Static301.anInt2467 = Static452.aClass3_Sub5_Sub4_3.method5125() / arg0;
		if (Static301.anInt2467 < 1) {
			Static301.anInt2467 = 1;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(JI)V")
	public static void method4669(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IC)Z")
	public static boolean method4670(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V")
	public static void method4671() {
		if (Static135.anIntArray174 != null) {
			return;
		}
		Static135.anIntArray174 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(19) int local19 = 0; local19 < 65536; local19++) {
			@Pc(32) double local32 = (double) (local19 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(43) double local43 = (double) (local19 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(50) double local50 = (double) (local19 & 0x7F) / 128.0D;
			@Pc(52) double local52 = local50;
			@Pc(54) double local54 = local50;
			@Pc(56) double local56 = local50;
			if (local43 != 0.0D) {
				@Pc(70) double local70;
				if (local50 < 0.5D) {
					local70 = local50 * (local43 + 1.0D);
				} else {
					local70 = local43 + local50 - local50 * local43;
				}
				@Pc(86) double local86 = local50 * 2.0D - local70;
				@Pc(90) double local90 = local32 + 0.3333333333333333D;
				if (local90 > 1.0D) {
					local90--;
				}
				@Pc(104) double local104 = local32 - 0.3333333333333333D;
				if (local32 * 6.0D < 1.0D) {
					local54 = (local70 - local86) * 6.0D * local32 + local86;
				} else if (local32 * 2.0D < 1.0D) {
					local54 = local70;
				} else if (local32 * 3.0D < 2.0D) {
					local54 = local86 + (local70 - local86) * 6.0D * (0.6666666666666666D - local32);
				} else {
					local54 = local86;
				}
				if (local104 < 0.0D) {
					local104++;
				}
				if (local90 * 6.0D < 1.0D) {
					local52 = (local70 - local86) * 6.0D * local90 + local86;
				} else if (local90 * 2.0D < 1.0D) {
					local52 = local70;
				} else if (local90 * 3.0D < 2.0D) {
					local52 = local86 + (0.6666666666666666D - local90) * 6.0D * (local70 - local86);
				} else {
					local52 = local86;
				}
				if (local104 * 6.0D < 1.0D) {
					local56 = local104 * 6.0D * (local70 - local86) + local86;
				} else if (local104 * 2.0D < 1.0D) {
					local56 = local70;
				} else if (local104 * 3.0D < 2.0D) {
					local56 = local86 + (local70 - local86) * 6.0D * (0.6666666666666666D - local104);
				} else {
					local56 = local86;
				}
			}
			local52 = Math.pow(local52, local17);
			local54 = Math.pow(local54, local17);
			local56 = Math.pow(local56, local17);
			@Pc(276) int local276 = (int) (local52 * 256.0D);
			@Pc(281) int local281 = (int) (local54 * 256.0D);
			@Pc(286) int local286 = (int) (local56 * 256.0D);
			@Pc(296) int local296 = (local281 << 8) + (local276 << 16) + local286;
			Static135.anIntArray174[local19] = local296;
		}
	}
}
