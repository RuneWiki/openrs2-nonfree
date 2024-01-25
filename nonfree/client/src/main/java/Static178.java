import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!in", name = "O", descriptor = "Lclient!oi;")
	public static Class185 aClass185_49;

	@OriginalMember(owner = "client!in", name = "N", descriptor = "[I")
	public static final int[] anIntArray238 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
	public static int anInt3199 = 0;

	@OriginalMember(owner = "client!in", name = "U", descriptor = "[I")
	public static final int[] anIntArray239 = new int[3];

	@OriginalMember(owner = "client!in", name = "W", descriptor = "[I")
	public static final int[] anIntArray240 = new int[1];

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V")
	public static void method2586() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static269.aBooleanArray106[local7] = false;
		}
		Static294.anInt4900 = Static375.anInt6055;
		Static163.anInt5784 = Static129.anInt1972;
		Static57.anInt915 = 0;
		Static404.anInt6473 = Static386.anInt7155;
		Static366.anInt5957 = -1;
		Static342.anInt5550 = Static80.anInt1106;
		Static157.anInt2566 = Static98.anInt1304;
		Static320.anInt5279 = -1;
		Static139.anInt2147 = 5;
		Static379.anInt124 = Static398.anInt6386;
		Static319.anInt5270 = 0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZIBIZ)Lclient!oi;")
	public static Class185 method2587(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class271 local10 = null;
		if (Static225.aClass115_2 != null) {
			local10 = new Class271(arg1, Static225.aClass115_2, Static88.aClass115Array1[arg1], 1000000);
		}
		Static109.aClass82_Sub1Array1[arg1] = Static76.aClass157_1.method3603(Static152.aClass271_2, arg1, local10);
		if (arg0) {
			Static109.aClass82_Sub1Array1[arg1].method2268();
		}
		return new Class185(Static109.aClass82_Sub1Array1[arg1], arg2, 1);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!tn;I)V")
	public static void method2589(@OriginalArg(0) Class242 arg0) {
		Static426.aClass1_Sub19_Sub2_2.method2949(arg0.method5144());
	}
}
