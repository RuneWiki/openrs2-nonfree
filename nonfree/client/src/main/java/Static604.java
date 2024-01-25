import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
	public static int anInt10572;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "[[Lclient!uf;")
	public static Class357[][] aClass357ArrayArray2;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "[Lclient!mha;")
	public static Class234_Sub1[] aClass234_Sub1Array2 = new Class234_Sub1[0];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Z")
	public static boolean method9048() {
		return Static311.anInt5615 == 0 ? Static300.aClass2_Sub26_Sub3_8.method7003() : true;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public static void method9050() {
		for (@Pc(3) int local3 = 0; local3 < Static356.anInt6821; local3++) {
			@Pc(9) Class150 local9 = Static307.aClass150Array1[local3];
			if (local9.aByte74 == 3) {
				if (local9.aClass2_Sub26_Sub5_3 == null) {
					local9.anInt4618 = Integer.MIN_VALUE;
				} else {
					Static270.aClass2_Sub26_Sub4_2.method7390(local9.aClass2_Sub26_Sub5_3);
				}
			}
		}
	}
}
