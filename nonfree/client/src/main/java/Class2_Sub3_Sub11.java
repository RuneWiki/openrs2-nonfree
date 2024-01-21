import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class2_Sub3_Sub11 extends Class2_Sub3 {

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "[I")
	public static int[] anIntArray177 = new int[32];

	@OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
	public int anInt2353 = 0;

	static {
		@Pc(12) int local12 = 2;
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			anIntArray177[local14] = local12 - 1;
			local12 += local12;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!me;B)V")
	public void method1545(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1402();
			if (local13 == 0) {
				return;
			}
			this.method1547(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!me;II)V")
	private void method1547(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt2353 = arg0.method1397();
		}
	}
}
