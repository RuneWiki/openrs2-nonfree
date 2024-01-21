import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_28;

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
	public static int anInt4617;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!pe;")
	public static Class13 aClass13_39;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
	public static int anInt4613 = 3;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	public static int anInt4614 = 0;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1313 = Static158.method3034("; Expires=");

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	public static int anInt4620 = 0;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1314 = Static158.method3034("Standort");

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
	public static final int anInt4622 = 2301979;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZB)V")
	public static void method3539(@OriginalArg(0) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static174.anInt4255; local3++) {
			@Pc(22) long local22 = (long) Static180.anIntArray370[local3] << 32 | 0x20000000L;
			@Pc(28) Class2_Sub1_Sub1_Sub3_Sub2 local28 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[Static180.anIntArray370[local3]];
			if (local28 != null && local28.method2554() && arg0 == local28.aClass2_Sub1_Sub2_1.aBoolean5 && local28.aClass2_Sub1_Sub2_1.method277()) {
				@Pc(53) int local53 = local28.anInt3302 >> 7;
				@Pc(58) int local58 = local28.anInt3273 >> 7;
				if (local53 >= 0 && local53 < 104 && local58 >= 0 && local58 < 104) {
					if (local28.anInt3286 == 1 && (local28.anInt3302 & 0x7F) == 64 && (local28.anInt3273 & 0x7F) == 64) {
						if (Static46.anInt1431 == Static191.anIntArrayArray33[local53][local58]) {
							continue;
						}
						Static191.anIntArrayArray33[local53][local58] = Static46.anInt1431;
					}
					if (!local28.aClass2_Sub1_Sub2_1.aBoolean4) {
						local22 |= Long.MIN_VALUE;
					}
					local28.anInt3283 = Static182.method3393(Static62.anInt1923, local28.anInt3286 * 64 + local28.anInt3302 - 64, local28.anInt3273 + -64 + local28.anInt3286 * 64);
					Static98.method2268(Static62.anInt1923, local28.anInt3302, local28.anInt3273, local28.anInt3283, local28.anInt3286 * 64 + 60 - 64, local28, local28.anInt3265, local22, local28.aBoolean121);
				}
			}
		}
	}
}
