import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static126 {

	@OriginalMember(owner = "client!g", name = "C", descriptor = "I")
	public static int anInt3501;

	@OriginalMember(owner = "client!g", name = "H", descriptor = "I")
	public static int anInt3503;

	@OriginalMember(owner = "client!g", name = "y", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_113 = new Class175("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!g", name = "E", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_119 = new Class184(26, -1);

	@OriginalMember(owner = "client!g", name = "F", descriptor = "I")
	public static int anInt3502 = 0;

	@OriginalMember(owner = "client!g", name = "G", descriptor = "Z")
	public static boolean aBoolean275 = false;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBIIII)V")
	public static void method2878(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static123.aClass21_Sub1_1.anInt868 != 0 && arg4 != 0 && Static205.anInt4113 < 50 && arg0 != -1) {
			Static192.aClass83Array1[Static205.anInt4113++] = new Class83((byte) 1, arg0, arg4, arg2, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIBI)V")
	public static void method2880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static142.anInt3212 <= arg2 && Static450.anInt7594 >= arg3 && Static161.anInt3448 <= arg1 && Static163.anInt3488 >= arg0) {
			Static192.method3184(arg4, arg0, arg3, arg1, arg2);
		} else {
			Static237.method3709(arg4, arg1, arg2, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIZIII)V")
	public static void method2881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= Static142.anInt3212 && arg5 <= Static450.anInt7594 && Static161.anInt3448 <= arg3 && arg2 <= Static163.anInt3488) {
			if (arg1 == 1) {
				Static348.method5832(arg5, arg3, arg4, arg2, arg0);
			} else {
				Static331.method4561(arg5, arg4, arg0, arg3, arg2, arg1);
			}
		} else if (arg1 == 1) {
			Static352.method4304(arg2, arg4, arg3, arg5, arg0);
		} else {
			Static313.method4574(arg3, arg0, arg5, arg2, arg1, arg4);
		}
	}
}
