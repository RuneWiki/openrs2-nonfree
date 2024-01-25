import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "Lclient!dda;")
	public static Class53 aClass53_134;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!hba;")
	public static final Class111 aClass111_4 = new Class111();

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
	public static void method7000() {
		@Pc(7) int local7 = Static16.anInt362;
		@Pc(9) int[] local9 = Static325.anIntArray473;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class1_Sub1_Sub2_Sub1 local19 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static261.method4057(local19.method4394(), local19);
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIII)V")
	public static void method7001(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static381.aClass2_Sub29_Sub2_2.method5185(arg0);
		Static381.aClass2_Sub29_Sub2_2.method5186(arg2);
		Static381.aClass2_Sub29_Sub2_2.method5228(arg1);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)V")
	public static void method7002(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg0, 2);
		local8.method6974();
	}
}
