import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
	public static int anInt1390;

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_15;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
	public static int anInt1391;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_540 = Static120.method1824("Welcome to RuneScape");

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "Lclient!qf;")
	public static Class77 aClass77_2 = null;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "Lclient!b;")
	public static final Class3_Sub3 aClass3_Sub3_1 = new Class3_Sub3(0, 0);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "Lclient!rd;")
	public static Class80 aClass80_541 = aClass80_540;

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_542 = Static120.method1824("leuchten1:");

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "[I")
	public static final int[] anIntArray180 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_543 = Static120.method1824("<img=1>");

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!cg;")
	public static final Class16 aClass16_1 = new Class16();

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_544 = Static120.method1824("sl_stars");

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ad;)V")
	public static void method922(@OriginalArg(0) Class4 arg0) {
		for (@Pc(2) int local2 = arg0.anInt185; local2 <= arg0.anInt178; local2++) {
			for (@Pc(6) int local6 = arg0.anInt188; local6 <= arg0.anInt172; local6++) {
				@Pc(16) Class3_Sub15 local16 = Static185.aClass3_Sub15ArrayArrayArray1[arg0.anInt180][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt2014; local20++) {
						if (local16.aClass4Array3[local20] == arg0) {
							local16.anInt2014--;
							for (local35 = local20; local35 < local16.anInt2014; local35++) {
								local16.aClass4Array3[local35] = local16.aClass4Array3[local35 + 1];
								local16.anIntArray278[local35] = local16.anIntArray278[local35 + 1];
							}
							local16.aClass4Array3[local16.anInt2014] = null;
							break;
						}
					}
					local16.anInt2000 = 0;
					for (local35 = 0; local35 < local16.anInt2014; local35++) {
						local16.anInt2000 |= local16.anIntArray278[local35];
					}
				}
			}
		}
	}
}
