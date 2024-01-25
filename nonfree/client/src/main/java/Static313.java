import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!lr", name = "Gb", descriptor = "[I")
	public static int[] anIntArray359;

	@OriginalMember(owner = "client!lr", name = "Hb", descriptor = "Lclient!q;")
	public static Class25 aClass25_5;

	@OriginalMember(owner = "client!lr", name = "Bb", descriptor = "I")
	public static int anInt5212 = 2;

	@OriginalMember(owner = "client!lr", name = "Jb", descriptor = "J")
	public static volatile long aLong142 = 0L;

	@OriginalMember(owner = "client!lr", name = "Tb", descriptor = "F")
	public static float aFloat157 = 0.0F;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method4531(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Static84.anInt9548;
		@Pc(16) int[] local16 = Static520.anIntArray555;
		@Pc(18) boolean local18 = false;
		for (@Pc(20) int local20 = 0; local20 < local14; local20++) {
			@Pc(28) Class12_Sub2_Sub1_Sub4_Sub1 local28 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local16[local20]];
			if (local28 != null && Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 != local28 && local28.aString75 != null && local28.aString75.equalsIgnoreCase(arg0)) {
				local18 = true;
				@Pc(57) Class2_Sub34 local57;
				if (arg1 == 1) {
					local57 = Static555.method7264(Static178.aClass154_33, Static551.aClass64_2);
					local57.aClass2_Sub7_Sub2_2.method4512(local16[local20]);
					local57.aClass2_Sub7_Sub2_2.method4472(0);
					Static100.method1508(local57);
				} else if (arg1 == 4) {
					local57 = Static555.method7264(Static342.aClass154_73, Static551.aClass64_2);
					local57.aClass2_Sub7_Sub2_2.method4511(local16[local20]);
					local57.aClass2_Sub7_Sub2_2.method4459(0);
					Static100.method1508(local57);
				} else if (arg1 == 5) {
					local57 = Static555.method7264(Static212.aClass154_43, Static551.aClass64_2);
					local57.aClass2_Sub7_Sub2_2.method4472(0);
					local57.aClass2_Sub7_Sub2_2.method4512(local16[local20]);
					Static100.method1508(local57);
				} else if (arg1 == 6) {
					local57 = Static555.method7264(Static181.aClass154_34, Static551.aClass64_2);
					local57.aClass2_Sub7_Sub2_2.method4513(local16[local20]);
					local57.aClass2_Sub7_Sub2_2.method4472(0);
					Static100.method1508(local57);
				} else if (arg1 == 7) {
					local57 = Static555.method7264(Static530.aClass154_121, Static551.aClass64_2);
					local57.aClass2_Sub7_Sub2_2.method4512(local16[local20]);
					local57.aClass2_Sub7_Sub2_2.method4459(0);
					Static100.method1508(local57);
				}
				break;
			}
		}
		if (!local18) {
			Static581.method7527(Static229.aClass159_23.method2776(Static261.anInt4297) + arg0);
		}
	}
}
