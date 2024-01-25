import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
	public static int anInt3053;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!pl;II)Lclient!f;")
	public static Class39 method2474(@OriginalArg(0) Class259 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class39 local10 = (Class39) Static267.aClass313_28.method6989((long) arg1);
		if (local10 == null) {
			if (Static571.aBoolean713) {
				local10 = Static307.aClass100_6.method6256(Static596.method253(arg0, arg1), true);
			} else {
				local10 = Static23.method438(arg0.method5964(arg1));
			}
			Static267.aClass313_28.method6980((long) arg1, local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!ks;B)V")
	public static void method2475(@OriginalArg(0) Class2_Sub15_Sub2 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static572.anInt9306; local12++) {
			@Pc(18) int local18 = Static137.anIntArray168[local12];
			@Pc(22) Class6_Sub1_Sub1_Sub1_Sub2 local22 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local18];
			@Pc(26) int local26 = arg0.method4325();
			if ((local26 & 0x40) != 0) {
				local26 += arg0.method4325() << 8;
			}
			if ((local26 & 0x400) != 0) {
				local26 += arg0.method4325() << 16;
			}
			Static95.method1472(local22, arg0, local26, local18);
		}
	}
}
