import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!no", name = "Fb", descriptor = "I")
	public static int anInt3840 = 0;

	@OriginalMember(owner = "client!no", name = "Mb", descriptor = "Ljava/lang/String;")
	public static String aString131 = "Choose Option";

	@OriginalMember(owner = "client!no", name = "Rb", descriptor = "I")
	public static int anInt3850 = 0;

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(IIB)V")
	public static void method3124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static230.anInt4619 = Static158.anInt3242 + Static133.anInt2663 - arg0 - 1;
		Static165.anInt3317 = arg1 - Static175.anInt3552;
	}

	@OriginalMember(owner = "client!no", name = "n", descriptor = "(II)Lclient!da;")
	public static Class29 method3128(@OriginalArg(1) int arg0) {
		@Pc(6) Class29 local6 = (Class29) Static15.aClass172_4.method4347((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static191.aClass22_66.method665(Static181.method4699(arg0), Static171.method2718(arg0));
		local6 = new Class29();
		local6.anInt996 = arg0;
		if (local25 != null) {
			local6.method922(new Class4_Sub24(local25));
		}
		local6.method921();
		if (local6.anInt994 != -1) {
			local6.method918(method3128(local6.anInt1030), method3128(local6.anInt994));
		}
		if (local6.anInt1009 != -1) {
			local6.method913(method3128(local6.anInt1009), method3128(local6.anInt1041));
		}
		if (!Static178.aBoolean233 && local6.aBoolean62) {
			local6.aStringArray3 = Static91.aStringArray10;
			local6.aBoolean63 = false;
			local6.anInt1027 = 0;
			local6.aStringArray4 = Static177.aStringArray23;
			local6.aString35 = Static139.aString96;
		}
		Static15.aClass172_4.method4345(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!no", name = "x", descriptor = "(I)V")
	public static void method3134() {
		Static117.method1986((long) Static50.anInt1118);
		if (Static56.anInt1264 != -1) {
			Static214.method4432(Static56.anInt1264);
		}
		for (@Pc(17) int local17 = 0; local17 < Static65.anInt5697; local17++) {
			if (Static48.aBooleanArray14[local17]) {
				Static22.aBooleanArray8[local17] = true;
			}
			Static7.aBooleanArray1[local17] = Static48.aBooleanArray14[local17];
			Static48.aBooleanArray14[local17] = false;
		}
		Static278.anInt5387 = -1;
		Static80.anInt1674 = Static50.anInt1118;
		Static171.anInt3430 = -1;
		Static52.aClass97_8 = null;
		if (Static251.aBoolean330) {
			Static125.aBoolean161 = true;
		}
		if (Static56.anInt1264 != -1) {
			Static65.anInt5697 = 0;
			Static10.method202();
		}
		if (Static251.aBoolean330) {
			Static87.method1462();
		} else {
			Static258.method4012();
		}
		Static309.anInt1336 = 0;
	}
}
