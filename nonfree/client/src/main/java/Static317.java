import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "[I")
	public static int[] anIntArray764;

	@OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
	public static int anInt6091;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString245 = null;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
	public static int anInt6087 = 2;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "Lclient!vn;")
	public static final Class212 aClass212_1 = new Class212();

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "Lclient!rg;")
	public static Class177 aClass177_22 = null;

	@OriginalMember(owner = "client!uk", name = "J", descriptor = "Z")
	public static boolean aBoolean539 = false;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)V")
	public static void method5332(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static342.aClass1_Sub1_Sub12_2 != null) {
			Static254.anInt4896 = Static342.aClass1_Sub1_Sub12_2.anInt2833;
		} else {
			Static254.anInt4896 = -1;
		}
		Static342.aClass1_Sub1_Sub12_2 = null;
		Static346.aClass177_25 = null;
		Static185.aClass195_5 = null;
		Static24.anInt671 = 0;
		Static342.method1965();
		Static342.aClass195_17.method5032();
		Static215.anInt4248 = -1;
		Static85.aClass16_7 = null;
		Static215.aClass16_16 = null;
		Static202.anInt4094 = -1;
		Static177.aClass16_15 = null;
		Static281.aClass16_22 = null;
		Static251.aClass16_27 = null;
		Static97.aClass90_9 = null;
		Static311.aClass16_24 = null;
		Static342.aClass6_3 = null;
		Static253.aClass16_18 = null;
		Static258.aClass16_20 = null;
		Static61.method1287();
		Static187.method3638(128, 64);
		Static178.method3484(64, 64);
		Static25.method754(64);
		Static309.method5205(64);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "([Lclient!rg;II)V")
	public static void method5333(@OriginalArg(0) Class177[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class177 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt5208 == 0) {
					if (local13.aClass177Array2 != null) {
						method5333(local13.aClass177Array2, arg1);
					}
					@Pc(34) Class1_Sub9 local34 = (Class1_Sub9) Static348.aClass26_20.method870((long) local13.anInt5219);
					if (local34 != null) {
						Static152.method2897(arg1, local34.anInt1104);
					}
				}
				@Pc(52) Class1_Sub19 local52;
				if (arg1 == 0 && local13.anObjectArray21 != null) {
					local52 = new Class1_Sub19();
					local52.anObjectArray3 = local13.anObjectArray21;
					local52.aClass177_9 = local13;
					Static98.method1797(local52);
				}
				if (arg1 == 1 && local13.anObjectArray29 != null) {
					if (local13.anInt5239 >= 0) {
						@Pc(78) Class177 local78 = Static140.method2694(local13.anInt5219);
						if (local78 == null || local78.aClass177Array2 == null || local13.anInt5239 >= local78.aClass177Array2.length || local78.aClass177Array2[local13.anInt5239] != local13) {
							continue;
						}
					}
					local52 = new Class1_Sub19();
					local52.aClass177_9 = local13;
					local52.anObjectArray3 = local13.anObjectArray29;
					Static98.method1797(local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIILclient!aa;)V")
	public static void method5334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2) {
		Static176.aClass2_9 = arg2;
		Static152.aClass186ArrayArray1 = new Class186[arg1][arg0];
		if (Static268.anIntArray652 != null) {
			Static99.aClass113_2 = Static199.method3742(Static268.anIntArray652[5], Static268.anIntArray652[1], Static268.anIntArray652[0], Static268.anIntArray652[2], Static268.anIntArray652[4], Static268.anIntArray652[3]);
		}
		Static95.aClass186_1 = new Class186();
		Static309.method5208();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!qj;)V")
	public static void method5335(@OriginalArg(1) Class165 arg0) {
		Static269.aClass165_80 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)I")
	public static int method5336(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(24) Class1_Sub38 local24 = (Class1_Sub38) Static338.aClass26_33.method870((long) arg0);
		if (local24 == null) {
			return Static37.method944(arg0).anInt4596;
		}
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 0; local35 < local24.anIntArray763.length; local35++) {
			if (local24.anIntArray763[local35] == -1) {
				local33++;
			}
		}
		return local33 + Static37.method944(arg0).anInt4596 - local24.anIntArray763.length;
	}
}
