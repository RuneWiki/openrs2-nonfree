import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!qm", name = "S", descriptor = "I")
	public static int anInt4351;

	@OriginalMember(owner = "client!qm", name = "Z", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!qm", name = "J", descriptor = "Lclient!hi;")
	public static Class61 aClass61_24 = new Class61();

	@OriginalMember(owner = "client!qm", name = "T", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!qm", name = "W", descriptor = "I")
	public static int anInt4354 = -1;

	@OriginalMember(owner = "client!qm", name = "X", descriptor = "[I")
	public static int[] anIntArray387 = new int[500];

	@OriginalMember(owner = "client!qm", name = "Y", descriptor = "I")
	public static volatile int anInt4355 = 0;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(II)Lclient!vm;")
	public static Class1_Sub2_Sub21 method3464(@OriginalArg(0) int arg0) {
		return (Class1_Sub2_Sub21) Static241.aClass70_16.method2075((long) arg0);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)V")
	public static void method3466(@OriginalArg(0) int arg0) {
		if (Static202.anInt4103 == arg0) {
			@Pc(24) Interface1 local24 = Static281.anInterface1Array3[arg0];
			local24.method4017(Static44.anInt1075);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)I")
	public static int method3467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg3 & 0xF;
		@Pc(19) int local19 = local7 >= 8 ? arg0 : arg2;
		@Pc(36) int local36 = local7 < 4 ? arg0 : local7 == 12 || local7 == 14 ? arg2 : arg1;
		return ((local7 & 0x1) == 0 ? local19 : -local19) + ((local7 & 0x2) == 0 ? local36 : -local36);
	}

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V")
	public static void method3468() {
		if (Static256.anInt5006 != -1) {
			Static134.method2277(Static256.anInt5006, -1, -1);
			Static256.anInt5006 = -1;
		}
	}
}
