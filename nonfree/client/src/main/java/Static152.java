import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static152 {

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "[Lclient!du;")
	public static Class40_Sub2_Sub1_Sub1[] aClass40_Sub2_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!os;")
	public static final Class182 aClass182_109 = new Class182("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "Lclient!wm;")
	public static final Class267 aClass267_27 = new Class267(4);

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	public static int anInt3123 = 0;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "[I")
	public static final int[] anIntArray297 = new int[1000];

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
	public static int anInt3124 = 0;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public static void method2604() {
		Static56.aClass50_1.Q(Static446.anInt7495, Static361.aClass85_Sub1_1.aBoolean168 ? Static137.anInt2872 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Z")
	public static boolean method2605(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static90.method1690(arg0, arg1) | (arg0 & 0x2000) != 0 | Static389.method5181(arg1, arg0)) & Static119.method2055(arg1, arg0);
	}
}
