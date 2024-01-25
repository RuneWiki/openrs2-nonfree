import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!f", name = "r", descriptor = "I")
	public static int anInt2919 = 0;

	@OriginalMember(owner = "client!f", name = "y", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_42 = new Class45(80, -1);

	@OriginalMember(owner = "client!f", name = "z", descriptor = "I")
	public static int anInt2925 = -1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!be;IIIII)V")
	public static void method2669(@OriginalArg(1) Class30_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static361.method5626(arg0.anInt9418, arg2, 0, arg0.anInt9416, arg0.aByte99, arg1, arg3);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IBI)Z")
	public static boolean method2670(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!gn;[[BI)V")
	public static void method2672(@OriginalArg(0) Class119_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
			@Pc(27) byte[] local27 = arg1[local21];
			if (local27 != null) {
				@Pc(34) Class12_Sub8 local34 = new Class12_Sub8(local27);
				local40 = Static443.anIntArray607[local21] >> 8;
				@Pc(46) int local46 = Static443.anIntArray607[local21] & 0xFF;
				@Pc(53) int local53 = local40 * 64 - Static61.anInt1459;
				@Pc(60) int local60 = local46 * 64 - Static203.anInt4534;
				Static365.method5697();
				arg0.method3326(Static203.anInt4534, local53, local34, local60, Static510.aClass184Array1, Static61.anInt1459);
				arg0.method3340(local60, local53, Static243.aClass42_4, local34, local12);
				if (!arg0.aBoolean312 && local40 == Static248.anInt5103 / 8 && Static492.anInt8088 / 8 == local46 && local12[0] != -1) {
					Static476.aClass186_2 = Static114.aClass252_1.method6262(Static496.aClass60_3, local12[3], local12[1], local12[2], local12[0]);
					Static188.anInt4270 = local12[4];
				}
			}
		}
		for (@Pc(129) int local129 = 0; local129 < local15; local129++) {
			@Pc(141) int local141 = (Static443.anIntArray607[local129] >> 8) * 64 - Static61.anInt1459;
			local40 = (Static443.anIntArray607[local129] & 0xFF) * 64 - Static203.anInt4534;
			@Pc(156) byte[] local156 = arg1[local129];
			if (local156 == null && Static492.anInt8088 < 800) {
				Static365.method5697();
				arg0.method3333(local141, local40);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(B)V")
	public static void method2673() {
		for (@Pc(10) Class12_Sub4_Sub12 local10 = (Class12_Sub4_Sub12) Static475.aClass73_69.method2005(); local10 != null; local10 = (Class12_Sub4_Sub12) Static475.aClass73_69.method2009()) {
			@Pc(15) Class30_Sub1_Sub5 local15 = local10.aClass30_Sub1_Sub5_1;
			if (Static409.anInt7683 > local15.anInt8764) {
				local10.method7967();
				local15.method7193();
			} else if (Static409.anInt7683 >= local15.anInt8739) {
				if (local15.anInt8753 > 0) {
					@Pc(51) Class12_Sub41 local51 = (Class12_Sub41) Static29.aClass68_7.method1917((long) (local15.anInt8753 - 1));
					if (local51 != null) {
						@Pc(56) Class30_Sub1_Sub1_Sub2 local56 = local51.aClass30_Sub1_Sub1_Sub2_2;
						if (local56.anInt9418 >= 0 && Static37.anInt7512 * 128 > local56.anInt9418 && local56.anInt9416 >= 0 && Static329.anInt6247 * 128 > local56.anInt9416) {
							local15.method7190(Static409.anInt7683, local56.anInt9418, Static443.method6717(local56.anInt9418, local56.anInt9416, local15.aByte99) - local15.anInt8758, local56.anInt9416);
						}
					}
				}
				if (local15.anInt8753 < 0) {
					@Pc(117) int local117 = -local15.anInt8753 - 1;
					@Pc(122) Class30_Sub1_Sub1_Sub1 local122;
					if (local117 == Static396.anInt7452) {
						local122 = Static440.aClass30_Sub1_Sub1_Sub1_2;
					} else {
						local122 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local117];
					}
					if (local122 != null && local122.anInt9418 >= 0 && local122.anInt9418 < Static37.anInt7512 * 128 && local122.anInt9416 >= 0 && Static329.anInt6247 * 128 > local122.anInt9416) {
						local15.method7190(Static409.anInt7683, local122.anInt9418, Static443.method6717(local122.anInt9418, local122.anInt9416, local15.aByte99) - local15.anInt8758, local122.anInt9416);
					}
				}
				local15.method7192(Static481.anInt8697);
				Static135.method2775(local15, true);
			}
		}
	}
}
