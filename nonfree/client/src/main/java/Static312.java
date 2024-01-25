import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!ov", name = "x", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!ov", name = "z", descriptor = "[I")
	public static final int[] anIntArray364 = new int[64];

	@OriginalMember(owner = "client!ov", name = "A", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_133 = new Class129(52, 8);

	@OriginalMember(owner = "client!ov", name = "D", descriptor = "[Lclient!go;")
	public static final Class5_Sub2_Sub6[] aClass5_Sub2_Sub6Array4 = new Class5_Sub2_Sub6[14];

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIII)V")
	public static void method3838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg2 * Static216.aClass1_Sub1_1.anInt4509 >> 8;
		if (arg1 == -1 && !Static180.aBoolean201) {
			Static434.method5734();
		} else if (arg1 != -1 && (Static172.anInt3753 != arg1 || !Static94.method1327()) && local6 != 0 && !Static180.aBoolean201) {
			Static137.method1961(local6, arg1, Static451.aClass243_252, arg0);
		}
		Static172.anInt3753 = arg1;
	}
}
