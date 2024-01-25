import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
	public static int anInt2431;

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_31 = new Class341(21, 8);

	@OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
	public static int anInt2434 = 0;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILclient!ol;B)V")
	public static void method2252(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub8 arg1) {
		if (Static274.aClass141_3 == null) {
			return;
		}
		try {
			Static274.aClass141_3.method4074(0L);
			Static274.aClass141_3.method4075(24, arg0, arg1.lb);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BI)V")
	public static void method2253(@OriginalArg(1) int arg0) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(3, (long) arg0);
		local9.method2489();
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILclient!gga;)V")
	public static void method2254(@OriginalArg(1) Class124 arg0) {
		Static145.anInt2717 = 0;
		Static597.anInt10382 = 0;
		Static559.aClass60_8 = new Class60();
		Static458.aClass15_Sub2_Sub1_Sub1Array2 = new Class15_Sub2_Sub1_Sub1[1024];
		Static190.aClass15_Sub5Array1 = new Class15_Sub5[Static235.anIntArray218[Static169.anInt3597] + 1];
		Static91.anInt1670 = 0;
		anInt2434 = 0;
		Static415.method2397(arg0);
		Static271.method4639(arg0);
	}
}
