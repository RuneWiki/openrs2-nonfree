import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!vc", name = "eb", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_23;

	@OriginalMember(owner = "client!vc", name = "gb", descriptor = "[I")
	public static int[] anIntArray544;

	@OriginalMember(owner = "client!vc", name = "nb", descriptor = "J")
	public static long aLong150;

	@OriginalMember(owner = "client!vc", name = "P", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!vc", name = "T", descriptor = "Lclient!o;")
	public static Class40 aClass40_708 = Static13.method257("wishes to duel with you)3");

	@OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
	public static int anInt2465 = 0;

	@OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
	public static int anInt2466 = -1;

	@OriginalMember(owner = "client!vc", name = "Z", descriptor = "Lclient!o;")
	public static Class40 aClass40_709 = Static13.method257("Connecting to friendserver");

	@OriginalMember(owner = "client!vc", name = "fb", descriptor = "Lclient!o;")
	public static Class40 aClass40_710 = Static13.method257("*6n");

	@OriginalMember(owner = "client!vc", name = "hb", descriptor = "Lclient!o;")
	public static Class40 aClass40_711 = Static13.method257("Loaded fonts");

	@OriginalMember(owner = "client!vc", name = "ib", descriptor = "I")
	public static int anInt2473 = 0;

	@OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
	public static int anInt2474 = 0;

	@OriginalMember(owner = "client!vc", name = "kb", descriptor = "[I")
	public static int[] anIntArray545 = new int[128];

	@OriginalMember(owner = "client!vc", name = "lb", descriptor = "[I")
	public static int[] anIntArray546 = new int[1000];

	@OriginalMember(owner = "client!vc", name = "mb", descriptor = "Lclient!o;")
	public static Class40 aClass40_712 = Static13.method257("Sep");

	@OriginalMember(owner = "client!vc", name = "ob", descriptor = "Lclient!o;")
	public static Class40 aClass40_713 = Static13.method257("Bad session id)3");

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!kc;III)V")
	public static void method1638(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub12_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1 == arg1 || Static34.anInt797 >= 400) {
			return;
		}
		@Pc(44) Class40 local44;
		if (arg1.anInt1373 == 0) {
			local44 = Static80.method1334(new Class40[] { arg1.aClass40_395, Static15.method1260(Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1378, arg1.anInt1378), Static31.aClass40_731, Static53.method859(arg1.anInt1378), Static90.aClass40_609 });
		} else {
			local44 = Static80.method1334(new Class40[] { arg1.aClass40_395, Static80.aClass40_556, Static53.method859(arg1.anInt1373), Static90.aClass40_609 });
		}
		@Pc(122) int local122;
		if (Static79.anInt1874 == 1) {
			Static21.method402(Static80.method1334(new Class40[] { Static27.aClass40_193, Static87.aClass40_601, Static56.aClass40_657, local44 }), 25, arg0, arg2, arg3);
		} else if (Static24.anInt641 != 1) {
			for (local122 = 4; local122 >= 0; local122--) {
				if (Static13.aClass40Array6[local122] != null) {
					@Pc(134) short local134 = 0;
					@Pc(136) int local136 = 0;
					if (Static13.aClass40Array6[local122].method1199(Static105.aClass40_729)) {
						if (Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1378 < arg1.anInt1378) {
							local134 = 2000;
						}
						if (Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1382 != 0 && arg1.anInt1382 != 0) {
							if (arg1.anInt1382 == Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1382) {
								local134 = 2000;
							} else {
								local134 = 0;
							}
						}
					} else if (Static46.aBooleanArray41[local122]) {
						local134 = 2000;
					}
					if (local122 == 0) {
						local136 = local134 + 15;
					}
					if (local122 == 1) {
						local136 = local134 + 30;
					}
					if (local122 == 2) {
						local136 = local134 + 43;
					}
					if (local122 == 3) {
						local136 = local134 + 38;
					}
					if (local122 == 4) {
						local136 = local134 + 33;
					}
					Static21.method402(Static80.method1334(new Class40[] { Static13.aClass40Array6[local122], Static4.aClass40_30, local44 }), local136, arg0, arg2, arg3);
				}
			}
		} else if ((Static86.anInt2027 & 0x8) == 8) {
			Static21.method402(Static80.method1334(new Class40[] { Static83.aClass40_567, Static4.aClass40_30, local44 }), 36, arg0, arg2, arg3);
		}
		for (local122 = 0; local122 < Static34.anInt797; local122++) {
			if (Static54.anIntArray287[local122] == 24) {
				Static18.aClass40Array8[local122] = Static80.method1334(new Class40[] { Static74.aClass40_526, local44 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
	public static void method1643() {
		anIntArray546 = null;
		aClass40_713 = null;
		aClass40_708 = null;
		aClass40_712 = null;
		anIntArray544 = null;
		aClass40_709 = null;
		aClass40_711 = null;
		aClass2_Sub2_Sub2_Sub3_23 = null;
		aClass40_710 = null;
		aCRC32_2 = null;
		anIntArray545 = null;
	}
}
