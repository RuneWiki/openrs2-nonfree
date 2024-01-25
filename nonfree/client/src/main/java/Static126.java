import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "[Lclient!s;")
	public static Class133[] aClass133Array1;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
	public static int anInt2110;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_16 = new Class85(4);

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "[S")
	public static final short[] aShortArray36 = new short[] { 13, 51, 45, 57, 59, 15, 5, 20 };

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLclient!sj;)V")
	public static void method1855(@OriginalArg(1) Class4_Sub2_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class4_Sub2_Sub1_Sub2_Sub2) {
			@Pc(9) Class4_Sub2_Sub1_Sub2_Sub2 local9 = (Class4_Sub2_Sub1_Sub2_Sub2) arg0;
			if (local9.aClass261_1 != null) {
				Static570.method7905(local9.aByte133 != Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133, local9);
			}
		} else if (arg0 instanceof Class4_Sub2_Sub1_Sub2_Sub1) {
			@Pc(36) Class4_Sub2_Sub1_Sub2_Sub1 local36 = (Class4_Sub2_Sub1_Sub2_Sub1) arg0;
			Static130.method1892(local36, local36.aByte133 != Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133);
		}
	}
}
