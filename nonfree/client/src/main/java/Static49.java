import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
	public static int anInt3744;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
	public static int anInt3745;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_126 = new Class48(77, -1);

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_96 = new Class211(77, 5);

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_97 = new Class211(26, 6);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)I")
	public static int method3044(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0x73333333) + (local13 & 0x33333333);
		@Pc(32) int local32 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(48) int local48 = local32 + (local32 >>> 8);
		@Pc(54) int local54 = local48 + (local48 >>> 16);
		return local54 & 0xFF;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public static void method3048() {
		@Pc(15) int local15 = Static188.aClass135_Sub1_1.method2751(Static25.anInt394);
		if (local15 == 0) {
			Static383.aByteArrayArrayArray17 = null;
			Static213.method2978(0);
		} else if (local15 == 1) {
			Static272.method4182((byte) 0);
			Static213.method2978(512);
			if (Static373.aByteArrayArrayArray16 != null) {
				Static55.method896();
			}
		} else {
			Static272.method4182((byte) (Static32.anInt649 - 4 & 0xFF));
			Static213.method2978(2);
		}
		Static256.anInt4411 = Static122.anInt2188;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIII)V")
	public static void method3049(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static391.anInt6384 = arg1;
		Static354.anInt5770 = arg4;
		Static226.anInt3832 = arg2;
		Static205.anInt3601 = arg3;
		Static18.anInt3503 = arg0;
		if (Static354.anInt5770 >= 100) {
			@Pc(27) int local27 = Static391.anInt6384 * 128 + 64;
			@Pc(33) int local33 = Static226.anInt3832 * 128 + 64;
			@Pc(42) int local42 = Static236.method3260(Static122.anInt2188, local33, local27) - Static18.anInt3503;
			@Pc(47) int local47 = local27 - Static256.anInt4409;
			@Pc(52) int local52 = local42 - Static337.anInt5598;
			@Pc(56) int local56 = local33 - Static133.anInt2471;
			@Pc(68) int local68 = (int) Math.sqrt((double) (local47 * local47 + local56 * local56));
			Static311.anInt5293 = (int) (Math.atan2((double) local52, (double) local68) * 2607.5945876176133D) & 0x3FFF;
			Static155.anInt2834 = (int) (-2607.5945876176133D * Math.atan2((double) local47, (double) local56)) & 0x3FFF;
			Static11.anInt3597 = 0;
			if (Static311.anInt5293 < 1024) {
				Static311.anInt5293 = 1024;
			}
			if (Static311.anInt5293 > 3072) {
				Static311.anInt5293 = 3072;
			}
		}
		Static323.anInt5463 = 2;
	}
}
