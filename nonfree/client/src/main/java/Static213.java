import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!nq", name = "z", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30;

	@OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
	public static int anInt4221;

	@OriginalMember(owner = "client!nq", name = "W", descriptor = "Lclient!am;")
	public static Class10 aClass10_4;

	@OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
	public static int anInt4226 = 0;

	@OriginalMember(owner = "client!nq", name = "U", descriptor = "Z")
	public static boolean aBoolean309 = false;

	@OriginalMember(owner = "client!nq", name = "db", descriptor = "Z")
	public static boolean aBoolean311 = false;

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Lclient!en;I)V")
	public static void method3766(@OriginalArg(0) Class59 arg0) {
		if (Static27.anInt5324 < 2 && Static100.anInt2199 == 0 && !Static20.aBoolean40) {
			return;
		}
		@Pc(50) String local50;
		if (Static100.anInt2199 == 1 && Static27.anInt5324 < 2) {
			local50 = Static121.aString166 + Static216.aString250 + Static332.aString362 + " ->";
		} else if (Static20.aBoolean40 && Static27.anInt5324 < 2) {
			local50 = Static221.aString254 + Static216.aString250 + Static111.aString151 + " ->";
		} else if (Static7.aBoolean6 && Static233.aBooleanArray19[81] && Static27.anInt5324 > 2) {
			local50 = Static55.method1184((Class5_Sub4) Static60.aClass211_4.aClass5_235.aClass5_248.aClass5_248);
		} else {
			@Pc(44) Class5_Sub4 local44 = (Class5_Sub4) Static60.aClass211_4.aClass5_235.aClass5_248;
			local50 = Static55.method1184(local44);
			@Pc(52) int[] local52 = null;
			if (Static327.method5513(local44.anInt785)) {
				local52 = Static88.method1382((int) local44.aLong24).anIntArray382;
			} else if (Static93.method1989(local44.anInt785)) {
				@Pc(78) Class25_Sub1_Sub1_Sub2 local78 = Static188.aClass25_Sub1_Sub1_Sub2Array1[(int) local44.aLong24];
				if (local78 != null) {
					local52 = local78.aClass216_1.anIntArray560;
				}
			} else if (Static199.method3530(local44.anInt785)) {
				if (local44.anInt785 == 1002) {
					local52 = Static228.method3923((int) local44.aLong24).anIntArray298;
				} else {
					local52 = Static228.method3923((int) (local44.aLong24 >>> 32 & 0x7FFFFFFFL)).anIntArray298;
				}
			}
			if (local52 != null) {
				local50 = local50 + Static346.method5697(local52);
			}
		}
		if (Static27.anInt5324 > 2) {
			local50 = local50 + "<col=ffffff> / " + (Static27.anInt5324 - 2) + Static260.aString370;
		}
		if (Static206.aClass96_11 != null) {
			@Pc(201) Class91 local201 = Static206.aClass96_11.method2694(arg0);
			if (local201 == null) {
				local201 = Static190.aClass91_8;
			}
			local201.method5299(Static311.anIntArray557, Static206.aClass96_11.anInt2948, Static206.aClass96_11.anInt2916, Static206.aClass96_11.anInt2910, Static206.aClass96_11.anInt2943, Static206.aClass96_11.anInt2923, Static232.anInt4546, local50, Static49.aClass54Array4, Static1.anInt12, Static111.anInt2404, Static139.anIntArray528, Static206.aClass96_11.anInt2911, Static170.aRandom1);
			Static316.method5375(Static139.anIntArray528[1], Static139.anIntArray528[0], Static139.anIntArray528[3], Static139.anIntArray528[2]);
		} else if (Static231.aClass96_14 != null && Static298.anInt5725 == 0) {
			@Pc(268) int local268 = Static190.aClass91_8.method5302(Static170.aRandom1, Static49.aClass54Array4, local50, Static200.anInt5713 + 16, Static311.anIntArray557, Static1.anInt12, Static30.anInt820 + 4);
			Static316.method5375(Static200.anInt5713, Static30.anInt820 + 4, 16, Static337.aClass138_10.method3725(local50) + local268);
		}
	}
}
