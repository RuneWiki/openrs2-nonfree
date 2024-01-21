import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "Lclient!dd;")
	public static Class16 aClass16_6;

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_423 = Static8.method128("mapscene");

	@OriginalMember(owner = "client!gd", name = "eb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_425 = Static8.method128("glow1:");

	@OriginalMember(owner = "client!gd", name = "cb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_424 = aClass18_425;

	@OriginalMember(owner = "client!gd", name = "fb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_426 = Static8.method128("sl_stars");

	@OriginalMember(owner = "client!gd", name = "gb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_427 = Static8.method128("scrollen:");

	@OriginalMember(owner = "client!gd", name = "mb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_428 = Static8.method128(" x ");

	@OriginalMember(owner = "client!gd", name = "ob", descriptor = "Lclient!ea;")
	public static Class18 aClass18_429 = aClass18_425;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "(I)V")
	public static void method1128() {
		Static76.anInt2355 = 0;
		Static118.anInt3362 = 0;
		Static87.method1886();
		Static121.method2381();
		Static119.method2350();
		@Pc(30) int local30;
		for (@Pc(24) int local24 = 0; local24 < Static118.anInt3362; local24++) {
			local30 = Static35.anIntArray48[local24];
			if (Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local30].anInt3557 != Static41.anInt1322) {
				Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local30].aClass1_Sub1_Sub15_1 = null;
				Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local30] = null;
			}
		}
		if (Static167.aClass1_Sub6_Sub1_3.anInt839 != Static12.anInt4661) {
			throw new RuntimeException("gnp1 pos:" + Static167.aClass1_Sub6_Sub1_3.anInt839 + " psize:" + Static12.anInt4661);
		}
		for (local30 = 0; local30 < Static155.anInt4267; local30++) {
			if (Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[Static150.anIntArray382[local30]] == null) {
				throw new RuntimeException("gnp2 pos:" + local30 + " size:" + Static155.anInt4267);
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "(I)V")
	public static void method1129() {
		aClass18_426 = null;
		aClass18_427 = null;
		aClass18_423 = null;
		aClass18_429 = null;
		aClass18_424 = null;
		aClass16_6 = null;
		aClass18_425 = null;
		aClass18_428 = null;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIII)I")
	public static int method1130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg2;
		return (local13 * (arg1 & 0xFF00FF) + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local13 + (arg2 * (arg0 & 0xFF00)) & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(II)I")
	public static int method1132(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(24) int local24 = (local14 & 0x33333333) + (local14 >>> 2 & 0x73333333);
		@Pc(32) int local32 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(44) int local44 = local38 + (local38 >>> 16);
		return local44 & 0xFF;
	}
}
