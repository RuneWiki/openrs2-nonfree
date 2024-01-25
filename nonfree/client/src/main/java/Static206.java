import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_80 = new Class136(45, -2);

	@OriginalMember(owner = "client!hea", name = "s", descriptor = "I")
	public static int anInt3613 = 0;

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(Z)V")
	public static void method3187() {
		for (@Pc(10) Class5_Sub25 local10 = (Class5_Sub25) Static587.aClass81_67.method1608(); local10 != null; local10 = (Class5_Sub25) Static587.aClass81_67.method1610()) {
			if (local10.aBoolean369) {
				local10.aBoolean369 = false;
			} else {
				Static44.method753(local10.anInt4568);
			}
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)[Lclient!lu;")
	public static Class219[] method3190() {
		return new Class219[] { Static22.aClass219_1, Static585.aClass219_2, Static625.aClass219_4 };
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)V")
	public static void method3191() {
		for (@Pc(3) int local3 = 0; local3 < Static44.anInt730; local3++) {
			@Pc(14) Class59 local14 = Static113.aClass59Array1[local3];
			if (local14.aByte19 == 3) {
				if (local14.aClass5_Sub16_Sub2_1 == null) {
					local14.anInt1287 = Integer.MIN_VALUE;
				} else {
					Static287.aClass5_Sub16_Sub3_1.method6144(local14.aClass5_Sub16_Sub2_1);
				}
			}
		}
	}
}
