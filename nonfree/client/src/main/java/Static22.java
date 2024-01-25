import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "[Lclient!hu;")
	public static Class44[] aClass44Array3;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "Lclient!lu;")
	public static final Class219 aClass219_1 = new Class219(0);

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	public static int anInt464 = -1;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public static void method484() {
		Static407.aClass293_46.method6927();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!wd;)V")
	public static void method486(@OriginalArg(1) Class5_Sub12_Sub2 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static385.anInt6764; local12++) {
			@Pc(18) int local18 = Static417.anIntArray574[local12];
			@Pc(22) Class14_Sub1_Sub1_Sub3_Sub1 local22 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local18];
			@Pc(26) int local26 = arg0.method8645();
			if ((local26 & 0x4) != 0) {
				local26 += arg0.method8645() << 8;
			}
			if ((local26 & 0x200) != 0) {
				local26 += arg0.method8645() << 16;
			}
			Static115.method1658(local22, arg0, local26, local18);
		}
	}
}
