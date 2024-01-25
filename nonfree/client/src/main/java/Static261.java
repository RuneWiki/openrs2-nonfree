import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!ag;")
	public static Class8 aClass8_4;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "[S")
	public static short[] aShortArray78 = new short[256];

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_71 = new Class21("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
	public static int anInt4996 = 0;

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
	public static int anInt4998 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)V")
	public static void method4240(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(9, arg0);
		local8.method521();
		local8.anInt614 = arg2;
		local8.anInt621 = arg1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method4241(@OriginalArg(0) Class30 arg0) {
		if (Static352.anInt6233 < 2 && !Static449.aBoolean564 || Static65.aClass240_4 != null) {
			return;
		}
		@Pc(47) String local47;
		if (Static449.aBoolean564 && Static352.anInt6233 < 2) {
			local47 = Static198.aString26 + Static287.aClass21_88.method362(Static168.anInt3290) + Static168.aString24 + " ->";
		} else if (Static341.aBoolean452 && Static115.aClass173_1.method4895(81) && Static352.anInt6233 > 2) {
			local47 = Static311.method4739((Class4_Sub14) Static289.aClass91_31.aClass4_103.aClass4_270.aClass4_270);
		} else {
			@Pc(43) Class4_Sub14 local43 = (Class4_Sub14) Static289.aClass91_31.aClass4_103.aClass4_270;
			local47 = Static311.method4739(local43);
			@Pc(49) int[] local49 = null;
			if (Static383.method5405(local43.anInt2132)) {
				local49 = Static139.aClass193_1.method4650((int) local43.aLong69).anIntArray625;
			} else if (local43.anInt2130 != -1) {
				local49 = Static139.aClass193_1.method4650(local43.anInt2130).anIntArray625;
			} else if (Static258.method3303(local43.anInt2132)) {
				@Pc(74) Class4_Sub44 local74 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local43.aLong69);
				if (local74 != null) {
					@Pc(79) Class11_Sub5_Sub2_Sub2 local79 = local74.aClass11_Sub5_Sub2_Sub2_2;
					@Pc(82) Class241 local82 = local79.aClass241_1;
					if (local82.anIntArray565 != null) {
						local82 = local82.method5593(Static67.aClass224_1);
					}
					if (local82 != null) {
						local49 = local82.anIntArray562;
					}
				}
			} else if (Static463.method6261(local43.anInt2132)) {
				@Pc(120) Class139 local120;
				if (local43.anInt2132 == 1007) {
					local120 = Static146.aClass228_1.method5203((int) local43.aLong69);
				} else {
					local120 = Static146.aClass228_1.method5203((int) (local43.aLong69 >>> 32 & 0x7FFFFFFFL));
				}
				if (local120.anIntArray344 != null) {
					local120 = local120.method3751(Static67.aClass224_1);
				}
				if (local120 != null) {
					local49 = local120.anIntArray343;
				}
			}
			if (local49 != null) {
				local47 = local47 + Static418.method2688(local49);
			}
		}
		if (Static352.anInt6233 > 2) {
			local47 = local47 + "<col=ffffff> / " + (Static352.anInt6233 - 2) + Static308.aClass21_92.method362(Static168.anInt3290);
		}
		if (Static92.aClass240_8 != null) {
			@Pc(269) Class18 local269 = Static92.aClass240_8.method5542(arg0);
			if (local269 == null) {
				local269 = Static247.aClass18_2;
			}
			local269.method5762(Static92.aClass240_8.anInt6853, Static92.aClass240_8.anInt6915, Static92.aClass240_8.anInt6894, Static92.aClass240_8.anInt6904, Static303.anInt5630, Static289.anInt5362, Static104.anIntArray195, Static181.aRandom1, Static3.anIntArray84, local47, Static171.aClass2Array26, Static188.anInt3795, Static92.aClass240_8.anInt6883, Static92.aClass240_8.anInt6877);
			Static227.method3863(Static3.anIntArray84[0], Static3.anIntArray84[2], Static3.anIntArray84[3], Static3.anIntArray84[1]);
		} else if (Static179.aClass240_9 != null && Static50.aClass235_4 == Static332.aClass235_6) {
			@Pc(250) int local250 = Static247.aClass18_2.method5770(local47, Static6.anInt67 + 4, Static303.anInt5630, Static171.aClass2Array26, Static125.anInt2599 + 16, Static181.aRandom1, Static104.anIntArray195);
			Static227.method3863(Static6.anInt67 + 4, Static296.aClass84_10.method2381(local47) + local250, 16, Static125.anInt2599);
			return;
		}
	}
}
