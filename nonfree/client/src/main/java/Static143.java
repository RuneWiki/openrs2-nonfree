import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ew", name = "x", descriptor = "Lclient!bt;")
	public static Class34 aClass34_31;

	@OriginalMember(owner = "client!ew", name = "z", descriptor = "I")
	public static int anInt2618;

	@OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
	public static int anInt2612 = 0;

	@OriginalMember(owner = "client!ew", name = "y", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_63 = new Class151(71, 0);

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IB)I")
	public static int method2493(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(31) int local31 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V")
	public static void method2494() {
		Static44.aClass352_3.method7656();
		Static499.aClass352_55.method7656();
		Class3_Sub1_Sub2_Sub4.lb.method7656();
		Static356.aClass352_46.method7656();
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)V")
	public static void method2495(@OriginalArg(0) int arg0) {
		if (Static141.anIntArray185 == null || arg0 > Static141.anIntArray185.length) {
			Static141.anIntArray185 = new int[arg0];
		}
	}
}
