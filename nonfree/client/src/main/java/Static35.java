import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!de", name = "dc", descriptor = "I")
	public static int anInt988;

	@OriginalMember(owner = "client!de", name = "Lb", descriptor = "Z")
	public static boolean aBoolean61 = false;

	@OriginalMember(owner = "client!de", name = "Pb", descriptor = "[I")
	public static final int[] anIntArray75 = new int[32];

	@OriginalMember(owner = "client!de", name = "kc", descriptor = "I")
	public static int anInt992 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!vd;)Lclient!vd;")
	public static Class92 method653(@OriginalArg(1) Class92 arg0) {
		@Pc(8) Class1_Sub7 local8 = Static107.method1614(arg0);
		return local8 == null ? Static43.aClass92_462 : local8.aClass92_400;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII[Lclient!ba;)V")
	public static void method654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class11[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg3.length; local12++) {
			@Pc(18) Class11 local18 = arg3[local12];
			if (local18 != null && local18.anInt256 == arg2) {
				if (local18.aByte3 == 0) {
					local18.anInt263 = local18.anInt296;
				} else if (local18.aByte3 == 1) {
					local18.anInt263 = arg1 - local18.anInt296;
				} else if (local18.aByte3 == 2) {
					local18.anInt263 = local18.anInt296 * arg1 >> 14;
				} else if (local18.aByte3 == 3) {
					if (local18.anInt326 == 2) {
						local18.anInt263 = (local18.anInt296 - 1) * local18.anInt254 + local18.anInt296 * 32;
					} else if (local18.anInt326 == 7) {
						local18.anInt263 = local18.anInt296 * 12 + (local18.anInt296 - 1) * local18.anInt254;
					}
				}
				if (local18.aByte2 == 0) {
					local18.anInt291 = local18.anInt305;
				} else if (local18.aByte2 == 1) {
					local18.anInt291 = (arg1 - local18.anInt263) / 2 + local18.anInt305;
				} else if (local18.aByte2 == 2) {
					local18.anInt291 = arg1 - local18.anInt263 - local18.anInt305;
				} else if (local18.aByte2 == 3) {
					local18.anInt291 = arg1 * local18.anInt305 >> 14;
				} else if (local18.aByte2 == 4) {
					local18.anInt291 = (arg1 - local18.anInt263) / 2 + (arg1 * local18.anInt305 >> 14);
				} else {
					local18.anInt291 = arg1 - (arg1 * local18.anInt305 >> 14) - local18.anInt263;
				}
				if (local18.aByte4 == 0) {
					local18.anInt312 = local18.anInt307;
				} else if (local18.aByte4 == 1) {
					local18.anInt312 = arg0 - local18.anInt307;
				} else if (local18.aByte4 == 2) {
					local18.anInt312 = local18.anInt307 * arg0 >> 14;
				} else if (local18.aByte4 == 3) {
					if (local18.anInt326 == 2) {
						local18.anInt312 = local18.anInt307 * 32 + local18.anInt278 * (local18.anInt307 - 1);
					} else if (local18.anInt326 == 7) {
						local18.anInt312 = local18.anInt307 * 115 + (local18.anInt307 - 1) * local18.anInt278;
					}
				}
				local18.anInt291 += local18.anInt319;
				if (local18.aByte1 == 0) {
					local18.anInt255 = local18.anInt300;
				} else if (local18.aByte1 == 1) {
					local18.anInt255 = local18.anInt300 + (arg0 - local18.anInt312) / 2;
				} else if (local18.aByte1 == 2) {
					local18.anInt255 = arg0 - local18.anInt300 - local18.anInt312;
				} else if (local18.aByte1 == 3) {
					local18.anInt255 = arg0 * local18.anInt300 >> 14;
				} else if (local18.aByte1 == 4) {
					local18.anInt255 = (arg0 - local18.anInt312) / 2 + (arg0 * local18.anInt300 >> 14);
				} else {
					local18.anInt255 = arg0 - local18.anInt312 - (arg0 * local18.anInt300 >> 14);
				}
				if (local18.anInt268 - local18.anInt312 < local18.anInt299) {
					local18.anInt299 = local18.anInt268 - local18.anInt312;
				}
				if (local18.anInt318 - local18.anInt263 < local18.anInt297) {
					local18.anInt297 = local18.anInt318 - local18.anInt263;
				}
				if (local18.anInt297 < 0) {
					local18.anInt297 = 0;
				}
				local18.anInt255 += local18.anInt260;
				if (local18.anInt299 < 0) {
					local18.anInt299 = 0;
				}
				if (local18.anInt326 == 0) {
					Static71.method1101(local18);
				}
			}
		}
	}
}
