import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ila", name = "S", descriptor = "Lclient!pga;")
	public static Class289 aClass289_8;

	@OriginalMember(owner = "client!ila", name = "Q", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!ila", name = "T", descriptor = "J")
	public static long aLong144;

	@OriginalMember(owner = "client!ila", name = "R", descriptor = "I")
	public static int anInt4340 = 503;

	@OriginalMember(owner = "client!ila", name = "O", descriptor = "[I")
	public static int[] anIntArray315 = new int[1];

	@OriginalMember(owner = "client!ila", name = "P", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_68 = new Class349(15, -1);

	@OriginalMember(owner = "client!ila", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3933(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static143.anInt2455 >= 200 && !Static566.aBoolean755 || Static143.anInt2455 >= 200) {
			Static79.method1194(Static289.aClass191_11.method4067(Static414.anInt9485));
			return;
		}
		@Pc(40) String local40 = Static15.method237(arg0);
		if (local40 == null) {
			return;
		}
		@Pc(90) String local90;
		for (@Pc(46) int local46 = 0; local46 < Static143.anInt2455; local46++) {
			@Pc(56) String local56 = Static15.method237(Static80.aStringArray8[local46]);
			if (local56 != null && local56.equals(local40)) {
				Static79.method1194(arg0 + Static289.aClass191_37.method4067(Static414.anInt9485));
				return;
			}
			if (Static180.aStringArray23[local46] != null) {
				local90 = Static15.method237(Static180.aStringArray23[local46]);
				if (local90 != null && local90.equals(local40)) {
					Static79.method1194(arg0 + Static289.aClass191_37.method4067(Static414.anInt9485));
					return;
				}
			}
		}
		for (@Pc(128) int local128 = 0; local128 < Static194.anInt3157; local128++) {
			local90 = Static15.method237(Static12.aStringArray2[local128]);
			if (local90 != null && local90.equals(local40)) {
				Static79.method1194(Static289.aClass191_42.method4067(Static414.anInt9485) + arg0 + Static289.aClass191_43.method4067(Static414.anInt9485));
				return;
			}
			if (Static514.aStringArray37[local128] != null) {
				@Pc(179) String local179 = Static15.method237(Static514.aStringArray37[local128]);
				if (local179 != null && local179.equals(local40)) {
					Static79.method1194(Static289.aClass191_42.method4067(Static414.anInt9485) + arg0 + Static289.aClass191_43.method4067(Static414.anInt9485));
					return;
				}
			}
		}
		if (Static15.method237(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aString4).equals(local40)) {
			Static79.method1194(Static289.aClass191_40.method4067(Static414.anInt9485));
			return;
		}
		@Pc(241) Class221 local241 = Static87.method1292();
		@Pc(247) Class2_Sub33 local247 = Static592.method8154(Static414.aClass349_140, local241.aClass48_1);
		local247.aClass2_Sub20_Sub2_1.method8584(Static125.method1890(arg0));
		local247.aClass2_Sub20_Sub2_1.method8541(arg0);
		local241.method5173(local247);
	}
}
