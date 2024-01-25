import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!hs", name = "E", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_73 = new Class322(15, 10);

	@OriginalMember(owner = "client!hs", name = "G", descriptor = "[I")
	public static final int[] anIntArray239 = new int[5];

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "([[FI[[S)[[S")
	public static short[][] method4200(@OriginalArg(0) float[][] arg0, @OriginalArg(2) short[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			for (@Pc(19) int local19 = 0; local19 < arg1[local7].length; local19++) {
				arg1[local7][local19] = (short) (int) (arg0[local7][local19] * 16383.0F);
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)V")
	public static void method4202() {
		for (@Pc(15) Class6_Sub2_Sub13 local15 = (Class6_Sub2_Sub13) Static276.aClass340_37.method8124(); local15 != null; local15 = (Class6_Sub2_Sub13) Static276.aClass340_37.method8134()) {
			@Pc(20) Class60_Sub1_Sub1_Sub2 local20 = local15.aClass60_Sub1_Sub1_Sub2_1;
			local20.method2114(Static2.anInt3);
			if (local20.method2108()) {
				local15.method9051();
				local20.method2111();
			} else if (local20.method2109()) {
				Static610.method8414(local20, true);
			}
		}
	}
}
