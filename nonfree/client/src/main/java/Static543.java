import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "Lclient!wb;")
	public static Class364 aClass364_1;

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "Lclient!oh;")
	public static Class237 aClass237_131;

	@OriginalMember(owner = "client!tga", name = "d", descriptor = "Lclient!fh;")
	public static Class8_Sub5_Sub7 aClass8_Sub5_Sub7_4;

	@OriginalMember(owner = "client!tga", name = "e", descriptor = "[I")
	public static final int[] anIntArray510 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)V")
	public static void method7660() {
		for (@Pc(10) Class8_Sub44 local10 = (Class8_Sub44) Static41.aClass43_12.method1422(); local10 != null; local10 = (Class8_Sub44) Static41.aClass43_12.method1426()) {
			if (local10.anInt9151 == -1) {
				local10.anInt9143 = 0;
				if (local10.anInt9146 >= 0 && local10.anInt9150 >= 0 && local10.anInt9146 < Static372.anInt7082 && Static218.anInt5023 > local10.anInt9150) {
					Static132.method2907(local10);
				}
			} else {
				local10.method8640();
			}
		}
	}
}
