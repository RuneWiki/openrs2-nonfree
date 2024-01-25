import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!so", name = "e", descriptor = "I")
	public static int anInt9674;

	@OriginalMember(owner = "client!so", name = "n", descriptor = "I")
	public static int anInt9679;

	@OriginalMember(owner = "client!so", name = "p", descriptor = "[I")
	public static int[] anIntArray490;

	@OriginalMember(owner = "client!so", name = "g", descriptor = "Lclient!hl;")
	public static final Class148 aClass148_19 = new Class148(1, 2);

	@OriginalMember(owner = "client!so", name = "q", descriptor = "S")
	public static short aShort105 = 1;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
	public static void method8468() {
		Static424.aClass266_4.method7117();
		Static81.aClass359_2.method9049();
		Static42.aClass96_2.method2463();
		Static251.aClass328_1.method8256();
		Static522.aClass272_2.method7197();
		Static372.aClass343_1.method8555();
		Static354.aClass40_2.method1122();
		Static391.aClass319_1.method8038();
		Static395.aClass140_1.method4034();
		Static288.aClass187_1.method4892();
		Static87.aClass184_1.method4779();
		Static665.aClass267_2.method7157();
		Static350.aClass5_3.method97();
		Static157.aClass353_1.method8898();
		Static142.aClass367_1.method9244();
		Static274.aClass392_1.method9735();
		Static462.aClass299_1.method7743();
		Static6.aClass176_1.method4650();
		Static294.aClass378_1.method9482();
		Static372.aClass165_2.method4441();
		Static300.aClass197_5.method5097();
		Static226.aClass102_1.method3167();
		Static519.method8036();
		Static1.method6529();
		Static267.method9824();
		Static197.method3782();
		Static422.method6938();
		Static603.aClass22_63.method468(5);
		Static433.aClass22_38.method468(5);
		Static317.aClass22_35.method468(5);
		Static388.aClass22_34.method468(5);
		Static518.aClass22_45.method468(5);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method8472(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(24) int local24 = arg0 ? 32768 : 0;
		@Pc(34) int local34 = local24 + (arg0 ? Static644.aClass186_2.anInt5371 : Static644.aClass186_2.anInt5362);
		for (@Pc(36) int local36 = local24; local36 < local34; local36++) {
			@Pc(43) Class2_Sub1_Sub8 local43 = Static644.aClass186_2.method4870(local36);
			if (local43.aBoolean370 && local43.method4326().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static369.anInt11000 = -1;
					Static280.aShortArray71 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(78) short[] local78 = new short[local11.length * 2];
					for (@Pc(80) int local80 = 0; local80 < local13; local80++) {
						local78[local80] = local11[local80];
					}
					local11 = local78;
				}
				local11[local13++] = (short) local36;
			}
		}
		Static280.aShortArray71 = local11;
		Static632.anInt10928 = 0;
		Static369.anInt11000 = local13;
		@Pc(117) String[] local117 = new String[Static369.anInt11000];
		for (@Pc(119) int local119 = 0; local119 < Static369.anInt11000; local119++) {
			local117[local119] = Static644.aClass186_2.method4870(local11[local119]).method4326();
		}
		Static389.method6558(local117, Static280.aShortArray71);
	}
}
