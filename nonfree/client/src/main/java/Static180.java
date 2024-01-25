import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "Lclient!mo;")
	public static final Class163 aClass163_3 = new Class163(10, 14);

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "Lclient!dc;")
	public static final Class5_Sub9 aClass5_Sub9_1 = new Class5_Sub9(0, 0);

	@OriginalMember(owner = "client!ip", name = "p", descriptor = "Lclient!d;")
	public static final Class44 aClass44_29 = new Class44(4);

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "Z")
	public static boolean aBoolean201 = false;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2458(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				local15++;
			} else if (local23 > '\u07ff') {
				local15 += 3;
			} else {
				local15 += 2;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIZ)I")
	public static int method2460(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(47) int local47 = (arg0 & 0x7F) * 96 >> 7;
			if (local47 < 2) {
				local47 = 2;
			} else if (local47 > 126) {
				local47 = 126;
			}
			return local47 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
	public static void method2463() {
		if (Static219.anIntArray223 != null) {
			return;
		}
		Static219.anIntArray223 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(25) int local25 = 0; local25 < 65536; local25++) {
			@Pc(38) double local38 = (double) (local25 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(49) double local49 = (double) (local25 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(56) double local56 = (double) (local25 & 0x7F) / 128.0D;
			@Pc(58) double local58 = local56;
			@Pc(60) double local60 = local56;
			@Pc(62) double local62 = local56;
			if (local49 != 0.0D) {
				@Pc(78) double local78;
				if (local56 < 0.5D) {
					local78 = local56 * (local49 + 1.0D);
				} else {
					local78 = local56 + local49 - local49 * local56;
				}
				@Pc(93) double local93 = local56 * 2.0D - local78;
				@Pc(97) double local97 = local38 + 0.3333333333333333D;
				if (local97 > 1.0D) {
					local97--;
				}
				@Pc(111) double local111 = local38 - 0.3333333333333333D;
				if (local97 * 6.0D < 1.0D) {
					local58 = local93 + local97 * 6.0D * (local78 - local93);
				} else if (local97 * 2.0D < 1.0D) {
					local58 = local78;
				} else if (local97 * 3.0D < 2.0D) {
					local58 = (0.6666666666666666D - local97) * (local78 - local93) * 6.0D + local93;
				} else {
					local58 = local93;
				}
				if (local111 < 0.0D) {
					local111++;
				}
				if (local38 * 6.0D < 1.0D) {
					local60 = local93 + local38 * 6.0D * (local78 - local93);
				} else if (local38 * 2.0D < 1.0D) {
					local60 = local78;
				} else if (local38 * 3.0D < 2.0D) {
					local60 = (0.6666666666666666D - local38) * 6.0D * (local78 - local93) + local93;
				} else {
					local60 = local93;
				}
				if (local111 * 6.0D < 1.0D) {
					local62 = local111 * (local78 - local93) * 6.0D + local93;
				} else if (local111 * 2.0D < 1.0D) {
					local62 = local78;
				} else if (local111 * 3.0D < 2.0D) {
					local62 = local93 + (local78 - local93) * 6.0D * (0.6666666666666666D - local111);
				} else {
					local62 = local93;
				}
			}
			local58 = Math.pow(local58, local19);
			local60 = Math.pow(local60, local19);
			local62 = Math.pow(local62, local19);
			@Pc(288) int local288 = (int) (local58 * 256.0D);
			@Pc(293) int local293 = (int) (local60 * 256.0D);
			@Pc(298) int local298 = (int) (local62 * 256.0D);
			@Pc(309) int local309 = (local293 << 8) + ((local288 << 16) + local298);
			Static219.anIntArray223[local25] = local309;
		}
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
	public static void method2464() {
		Static288.method3576(Static378.aClass194_103);
		Static281.aClass5_Sub15_Sub2_13.method5566(Static31.anInt615);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZIIII)V")
	public static void method2465(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static356.anInt5817 && Static3.anInt46 >= arg1) {
			@Pc(15) int local15 = Static391.method5106(Static3.anInt45, arg0, Static112.anInt1900);
			@Pc(21) int local21 = Static391.method5106(Static3.anInt45, arg2, Static112.anInt1900);
			Static384.method5636(arg3, local21, arg1, local15);
		}
	}
}
