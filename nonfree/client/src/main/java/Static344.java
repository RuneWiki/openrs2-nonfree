import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
	public static int anInt6676;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "J")
	public static long aLong167;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Z")
	public static final boolean aBoolean464 = false;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method5472(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static315.anInt9128;
		@Pc(9) int[] local9 = Static533.anIntArray506;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(23) Class15_Sub1_Sub2_Sub2_Sub1 local23 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local9[local13]];
			if (local23 != null && local23 != Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 && local23.aString35 != null && local23.aString35.equalsIgnoreCase(arg0)) {
				@Pc(63) Class8_Sub31 local63;
				if (arg1 == 1) {
					local63 = Static51.method1418(Static394.aClass257_74, Static608.aClass336_1);
					local63.aClass8_Sub8_Sub2_1.method8562(0);
					local63.aClass8_Sub8_Sub2_1.method8548(local9[local13]);
					Static262.method4604(local63);
				} else if (arg1 == 4) {
					local63 = Static51.method1418(Static507.aClass257_95, Static608.aClass336_1);
					local63.aClass8_Sub8_Sub2_1.method8558(0);
					local63.aClass8_Sub8_Sub2_1.method8546(local9[local13]);
					Static262.method4604(local63);
				} else if (arg1 == 5) {
					local63 = Static51.method1418(Static578.aClass257_113, Static608.aClass336_1);
					local63.aClass8_Sub8_Sub2_1.method8562(0);
					local63.aClass8_Sub8_Sub2_1.method8546(local9[local13]);
					Static262.method4604(local63);
				} else if (arg1 == 6) {
					local63 = Static51.method1418(Static278.aClass257_50, Static608.aClass336_1);
					local63.aClass8_Sub8_Sub2_1.method8546(local9[local13]);
					local63.aClass8_Sub8_Sub2_1.method8573(0);
					Static262.method4604(local63);
				} else if (arg1 == 7) {
					local63 = Static51.method1418(Static297.aClass257_57, Static608.aClass336_1);
					local63.aClass8_Sub8_Sub2_1.method8572(local9[local13]);
					local63.aClass8_Sub8_Sub2_1.method8573(0);
					Static262.method4604(local63);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static353.method5583(Static121.aClass84_21.method2710(Static372.anInt7083) + arg0);
		}
	}
}
