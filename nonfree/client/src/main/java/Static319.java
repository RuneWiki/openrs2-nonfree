import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "Lclient!wd;")
	public static Class212 aClass212_16;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
	public static int anInt6141 = 0;

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
	public static int anInt6144 = 0;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
	public static volatile int anInt6145 = -1;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
	public static void method5482(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static98.aClass213ArrayArrayArray2 = Static342.aClass213ArrayArrayArray3;
			Static158.aClass114Array2 = Static341.aClass114Array3;
		} else {
			Static98.aClass213ArrayArrayArray2 = Static82.aClass213ArrayArrayArray1;
			Static158.aClass114Array2 = Static18.aClass114Array1;
		}
		Static125.anInt2719 = Static98.aClass213ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
	public static void method5483() {
		Static117.aClass11_120.method215(5);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method5484() {
		if (Static50.anIntArray75 != null) {
			return;
		}
		Static50.anIntArray75 = new int[65536];
		@Pc(25) double local25 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(27) int local27 = 0; local27 < 65536; local27++) {
			@Pc(41) double local41 = (double) (local27 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(52) double local52 = (double) (local27 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(59) double local59 = (double) (local27 & 0x7F) / 128.0D;
			@Pc(61) double local61 = local59;
			@Pc(63) double local63 = local59;
			@Pc(65) double local65 = local59;
			if (local52 != 0.0D) {
				@Pc(79) double local79;
				if (local59 < 0.5D) {
					local79 = (local52 + 1.0D) * local59;
				} else {
					local79 = local59 + local52 - local52 * local59;
				}
				@Pc(97) double local97 = local59 * 2.0D - local79;
				@Pc(101) double local101 = local41 + 0.3333333333333333D;
				if (local101 > 1.0D) {
					local101--;
				}
				@Pc(115) double local115 = local41 - 0.3333333333333333D;
				if (local101 * 6.0D < 1.0D) {
					local61 = local101 * 6.0D * (local79 - local97) + local97;
				} else if (local101 * 2.0D < 1.0D) {
					local61 = local79;
				} else if (local101 * 3.0D < 2.0D) {
					local61 = (0.6666666666666666D - local101) * 6.0D * (local79 - local97) + local97;
				} else {
					local61 = local97;
				}
				if (local115 < 0.0D) {
					local115++;
				}
				if (local41 * 6.0D < 1.0D) {
					local63 = local97 + local41 * 6.0D * (local79 - local97);
				} else if (local41 * 2.0D < 1.0D) {
					local63 = local79;
				} else if (local41 * 3.0D < 2.0D) {
					local63 = local97 + (local79 - local97) * (0.6666666666666666D - local41) * 6.0D;
				} else {
					local63 = local97;
				}
				if (local115 * 6.0D < 1.0D) {
					local65 = local115 * (local79 - local97) * 6.0D + local97;
				} else if (local115 * 2.0D < 1.0D) {
					local65 = local79;
				} else if (local115 * 3.0D < 2.0D) {
					local65 = (0.6666666666666666D - local115) * (-local97 + local79) * 6.0D + local97;
				} else {
					local65 = local97;
				}
			}
			local61 = Math.pow(local61, local25);
			local63 = Math.pow(local63, local25);
			local65 = Math.pow(local65, local25);
			@Pc(297) int local297 = (int) (local61 * 256.0D);
			@Pc(302) int local302 = (int) (local63 * 256.0D);
			@Pc(307) int local307 = (int) (local65 * 256.0D);
			@Pc(318) int local318 = local307 + (local297 << 16) + (local302 << 8);
			Static50.anIntArray75[local27] = local318;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)V")
	public static void method5485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(43) String local43 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local43);
		Static348.method4759(true, local43);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
	public static void method5486() {
		if (Static322.anInt6208 != 2) {
			try {
				Static356.method171(Static353.aClient1, "tbrefresh");
			} catch (@Pc(20) Throwable local20) {
			}
		}
	}
}
