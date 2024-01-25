import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
	public static int anInt5825;

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "[I")
	public static int[] anIntArray636;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Lclient!kr;")
	public static final Class138 aClass138_41 = new Class138();

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "[I")
	public static final int[] anIntArray635 = new int[5];

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_87 = new Class57("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "Z")
	public static boolean aBoolean446 = false;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)Lclient!vr;")
	public static Class3_Sub41 method5227() {
		if (Static42.aClass138_5 == null || Static69.aClass130_1 == null) {
			return null;
		}
		Static69.aClass130_1.method2818(Static42.aClass138_5);
		@Pc(23) Class3_Sub41 local23 = (Class3_Sub41) Static69.aClass130_1.method2819();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class196 local33 = Static42.aClass195_2.method4500(local23.anInt6279);
			return local33 != null && local33.aBoolean396 && local33.method4505(Static42.anInterface9_2) ? local23 : Static209.method3227();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
	public static void method5228(@OriginalArg(1) int arg0) {
		Static313.method5210();
		@Pc(11) int local11 = Static131.aClass183_1.method4256(arg0).anInt5562;
		if (local11 == 0) {
			return;
		}
		@Pc(30) int local30 = Static331.aClass115_1.anIntArray301[arg0];
		if (local11 == 5) {
			Static346.anInt5849 = local30;
		}
		if (local11 == 6) {
			Static375.anInt6251 = local30;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
	public static void method5231(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7_Sub8 local8 = Static275.method4307(14, arg0);
		local8.method3217();
	}
}
