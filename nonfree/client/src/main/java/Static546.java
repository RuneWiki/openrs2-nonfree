import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "[Lclient!vh;")
	public static Class342[] aClass342Array4;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "[I")
	public static final int[] anIntArray686 = new int[50];

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray195 = new int[128][128];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!vg;BZII)V")
	public static void method7461(@OriginalArg(0) Class341 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0.anInt9300;
		if (arg0.aByte118 == 0) {
			arg0.anInt9300 = arg0.anInt9305;
		} else if (arg0.aByte118 == 1) {
			arg0.anInt9300 = arg3 - arg0.anInt9305;
		} else if (arg0.aByte118 == 2) {
			arg0.anInt9300 = arg3 * arg0.anInt9305 >> 14;
		}
		@Pc(48) int local48 = arg0.anInt9248;
		if (arg0.aByte120 == 0) {
			arg0.anInt9248 = arg0.anInt9302;
		} else if (arg0.aByte120 == 1) {
			arg0.anInt9248 = arg2 - arg0.anInt9302;
		} else if (arg0.aByte120 == 2) {
			arg0.anInt9248 = arg0.anInt9302 * arg2 >> 14;
		}
		if (arg0.aByte118 == 4) {
			arg0.anInt9300 = arg0.anInt9250 * arg0.anInt9248 / arg0.anInt9319;
		}
		if (arg0.aByte120 == 4) {
			arg0.anInt9248 = arg0.anInt9319 * arg0.anInt9300 / arg0.anInt9250;
		}
		if (Static595.aBoolean755 && (Static63.method1137(arg0).anInt9530 != 0 || arg0.anInt9309 == 0)) {
			if (arg0.anInt9248 < 5 && arg0.anInt9300 < 5) {
				arg0.anInt9248 = 5;
				arg0.anInt9300 = 5;
			} else {
				if (arg0.anInt9248 <= 0) {
					arg0.anInt9248 = 5;
				}
				if (arg0.anInt9300 <= 0) {
					arg0.anInt9300 = 5;
				}
			}
		}
		if (Static371.anInt6169 == arg0.anInt9297) {
			Static376.aClass341_17 = arg0;
		}
		if (arg1 && arg0.anObjectArray32 != null && (arg0.anInt9300 != local8 || arg0.anInt9248 != local48)) {
			@Pc(200) Class1_Sub15 local200 = new Class1_Sub15();
			local200.aClass341_10 = arg0;
			local200.anObjectArray1 = arg0.anObjectArray32;
			Static567.aClass353_64.method7679(local200);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)C")
	public static char method7462(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(43) char local43 = Static539.aCharArray7[local7 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local7 = local43;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)I")
	public static int method7463() {
		return 16;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
	public static void method7464(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static410.aBooleanArray15[arg0]) {
			Static466.aClass270_99.method5692(arg0);
			Static578.aClass341ArrayArray2[arg0] = null;
			Static294.aClass341ArrayArray1[arg0] = null;
			Static410.aBooleanArray15[arg0] = false;
		}
	}
}
