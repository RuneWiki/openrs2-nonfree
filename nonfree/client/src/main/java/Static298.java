import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "Lclient!vl;")
	public static Class186 aClass186_26 = new Class186(16);

	@OriginalMember(owner = "client!vj", name = "B", descriptor = "[I")
	public static int[] anIntArray531 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
	public static void method4558() {
		for (@Pc(11) int local11 = 0; local11 < Static242.anInt5012; local11++) {
			@Pc(18) int local18 = Static100.anIntArray223[local11];
			@Pc(22) Class2_Sub4_Sub2 local22 = Static155.aClass2_Sub4_Sub2Array1[local18];
			@Pc(26) int local26 = Static140.aClass1_Sub14_Sub1_2.method2199();
			if ((local26 & 0x20) != 0) {
				local26 += Static140.aClass1_Sub14_Sub1_2.method2199() << 8;
			}
			Static70.method1180(local26, local18, local22);
		}
	}
}
