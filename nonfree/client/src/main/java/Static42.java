import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "[I")
	public static final int[] anIntArray117 = new int[4096];

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)Lclient!ab;")
	public static Class1_Sub1_Sub2 method1000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class1_Sub1_Sub2 local20 = (Class1_Sub1_Sub2) Static130.aClass26_17.method870((long) arg1 | (long) arg0 << 32);
		if (local20 == null) {
			local20 = new Class1_Sub1_Sub2(arg0, arg1);
			Static130.aClass26_17.method877(local20.aLong215, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "(B)V")
	public static void method1002() {
		if (Static100.anInt2086 == -1) {
			return;
		}
		@Pc(10) int local10 = Static179.anInt3693;
		@Pc(12) int local12 = Static295.anInt5742;
		if (Static269.anInt5189 != 0) {
			local12 = Static178.anInt3687;
			local10 = Static179.anInt3690;
		}
		Static224.method4106(local12, Static320.anInt6140, Static100.anInt2086, 0, 0, Static11.anInt5389, local10, 0, 0);
		if (Static346.aClass177_25 != null) {
			Static271.method4459(local10, local12);
		}
	}
}
