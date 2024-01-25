import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
	public static int anInt5090;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_78 = new Class32("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_113 = new Class205(11, -1);

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "[I")
	public static int[] anIntArray1008 = new int[2];

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!wt;)V")
	public static void method4435(@OriginalArg(0) Class1_Sub5 arg0) {
		for (@Pc(2) int local2 = arg0.aShort96; local2 <= arg0.aShort94; local2++) {
			for (@Pc(6) int local6 = arg0.aShort97; local6 <= arg0.aShort95; local6++) {
				@Pc(16) Class251 local16 = Static64.aClass251ArrayArrayArray1[arg0.aByte69][local2][local6];
				if (local16 != null) {
					@Pc(21) Class46 local21 = local16.aClass46_3;
					@Pc(23) Class46 local23 = null;
					while (local21 != null) {
						if (local21.aClass1_Sub5_1 == arg0) {
							if (local23 == null) {
								local16.aClass46_3 = local21.aClass46_1;
							} else {
								local23.aClass46_1 = local21.aClass46_1;
							}
							local21.method925();
							break;
						}
						local23 = local21;
						local21 = local21.aClass46_1;
					}
					local16.aByte76 = 0;
					for (@Pc(56) Class46 local56 = local16.aClass46_3; local56 != null; local56 = local56.aClass46_1) {
						local16.aByte76 = (byte) (local16.aByte76 | local56.anInt1089);
					}
				}
			}
		}
	}
}
