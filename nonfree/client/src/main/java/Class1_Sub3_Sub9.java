import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class1_Sub3_Sub9 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ia", name = "S", descriptor = "[I")
	public static int[] anIntArray213 = new int[99];

	@OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
	public int anInt1299 = 0;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray213[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(ILclient!rd;)V")
	public void method940(@OriginalArg(1) Class1_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2053();
			if (local5 == 0) {
				return;
			}
			this.method942(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!rd;II)V")
	private void method942(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt1299 = arg0.method2087();
		}
	}
}
