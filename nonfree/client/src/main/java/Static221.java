import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!le", name = "O", descriptor = "Ljava/lang/Object;")
	public static Object anObject5;

	@OriginalMember(owner = "client!le", name = "U", descriptor = "Lclient!em;")
	public static Class68 aClass68_1;

	@OriginalMember(owner = "client!le", name = "S", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_54 = new Class44(7, 3);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BIIII)V")
	public static void method3413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static331.anInt5894 && arg1 <= Static351.anInt6176) {
			@Pc(19) int local19 = Static440.method5950(arg3, Static175.anInt3399, Static75.anInt1858);
			@Pc(25) int local25 = Static440.method5950(arg0, Static175.anInt3399, Static75.anInt1858);
			Static159.method2513(arg1, arg2, local25, local19);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3415(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static348.anInt6137;
		@Pc(9) int[] local9 = Static348.anIntArray412;
		@Pc(11) boolean local11 = false;
		for (@Pc(18) int local18 = 0; local18 < local7; local18++) {
			@Pc(26) Class4_Sub2_Sub2_Sub1 local26 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local9[local18]];
			if (local26 != null && Static231.aClass4_Sub2_Sub2_Sub1_2 != local26 && local26.aString48 != null && local26.aString48.equalsIgnoreCase(arg0)) {
				local11 = true;
				if (arg1 == 1) {
					Static448.method6059(Static230.aClass44_56);
					Static98.aClass2_Sub20_Sub1_1.method3745(local9[local18]);
					Static98.aClass2_Sub20_Sub1_1.method3738(0);
				} else if (arg1 == 4) {
					Static448.method6059(Static4.aClass44_4);
					Static98.aClass2_Sub20_Sub1_1.method3708(0);
					Static98.aClass2_Sub20_Sub1_1.method3745(local9[local18]);
				} else if (arg1 == 5) {
					Static448.method6059(Static326.aClass44_78);
					Static98.aClass2_Sub20_Sub1_1.method3697(local9[local18]);
					Static98.aClass2_Sub20_Sub1_1.method3738(0);
				} else if (arg1 == 6) {
					Static448.method6059(Static32.aClass44_11);
					Static98.aClass2_Sub20_Sub1_1.method3738(0);
					Static98.aClass2_Sub20_Sub1_1.method3697(local9[local18]);
				} else if (arg1 == 7) {
					Static448.method6059(Static420.aClass44_92);
					Static98.aClass2_Sub20_Sub1_1.method3728(0);
					Static98.aClass2_Sub20_Sub1_1.method3697(local9[local18]);
				}
				break;
			}
		}
		if (!local11) {
			Static165.method4929(Static419.aClass256_155.method5720(Static272.anInt7537) + arg0);
		}
	}
}
