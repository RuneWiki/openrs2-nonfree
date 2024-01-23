import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
	public static int anInt916;

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
	public static int anInt917;

	@OriginalMember(owner = "client!dd", name = "X", descriptor = "Lclient!k;")
	public static Class1_Sub16 aClass1_Sub16_1;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "Lclient!ia;")
	public static Class51 aClass51_259 = Static64.method1101("Ablegen");

	@OriginalMember(owner = "client!dd", name = "Q", descriptor = "Lclient!ia;")
	private static Class51 aClass51_261 = Static64.method1101("FULL");

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "Lclient!ia;")
	public static Class51 aClass51_260 = aClass51_261;

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "Lclient!ia;")
	public static Class51 aClass51_262 = Static64.method1101("(U2");

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "[I")
	public static int[] anIntArray54 = new int[1000];

	@OriginalMember(owner = "client!dd", name = "W", descriptor = "[I")
	public static int[] anIntArray55 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!pb;)V")
	public static void method672(@OriginalArg(0) Class83 arg0) {
		for (@Pc(2) int local2 = arg0.anInt3340; local2 <= arg0.anInt3342; local2++) {
			for (@Pc(6) int local6 = arg0.anInt3336; local6 <= arg0.anInt3346; local6++) {
				@Pc(16) Class1_Sub7 local16 = Static22.aClass1_Sub7ArrayArrayArray1[arg0.anInt3345][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt1124; local20++) {
						if (local16.aClass83Array3[local20] == arg0) {
							local16.anInt1124--;
							for (local35 = local20; local35 < local16.anInt1124; local35++) {
								local16.aClass83Array3[local35] = local16.aClass83Array3[local35 + 1];
								local16.anIntArray65[local35] = local16.anIntArray65[local35 + 1];
							}
							local16.aClass83Array3[local16.anInt1124] = null;
							break;
						}
					}
					local16.anInt1122 = 0;
					for (local35 = 0; local35 < local16.anInt1124; local35++) {
						local16.anInt1122 |= local16.anIntArray65[local35];
					}
				}
			}
		}
	}
}
