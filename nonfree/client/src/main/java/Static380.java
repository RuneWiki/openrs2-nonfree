import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!td", name = "s", descriptor = "Lclient!ga;")
	public static Interface5 anInterface5_6;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "I")
	public static int anInt6187;

	@OriginalMember(owner = "client!td", name = "x", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_114 = new Class15("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!td", name = "y", descriptor = "I")
	public static int anInt6188 = 0;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "[I")
	public static final int[] anIntArray496 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILclient!qd;Lclient!qd;)V")
	public static void method4987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub2 arg3, @OriginalArg(4) Class8_Sub2 arg4) {
		@Pc(4) Class75 local4 = Static371.method4772(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass8_Sub2_1 = arg3;
			local4.aClass8_Sub2_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIZ)V")
	public static void method4989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static413.aClass49_Sub1_1.anInt3199 != 0 && arg1 != 0 && Static418.anInt7061 < 50 && arg0 != -1) {
			Static246.aClass46Array1[Static418.anInt7061++] = new Class46((byte) 2, arg0, arg1, arg2, arg3, 0);
		}
	}
}
