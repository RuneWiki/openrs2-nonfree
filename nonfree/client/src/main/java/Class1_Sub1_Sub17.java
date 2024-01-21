import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vc", name = "fb", descriptor = "[I")
	public static int[] anIntArray492 = new int[99];

	@OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
	public int anInt2854;

	@OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
	public int anInt2856;

	@OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
	public int anInt2857;

	static {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < 99; local16++) {
			@Pc(21) int local21 = local16 + 1;
			@Pc(34) int local34 = (int) ((double) local21 + Math.pow(2.0D, (double) local21 / 7.0D) * 300.0D);
			local14 += local34;
			anIntArray492[local16] = local14 / 4;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLclient!mc;)V")
	public void method2008(@OriginalArg(1) Class1_Sub12 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1190();
			if (local14 == 0) {
				return;
			}
			this.method2011(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!mc;II)V")
	private void method2011(@OriginalArg(0) Class1_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2857 = arg0.method1176();
			this.anInt2856 = arg0.method1190();
			this.anInt2854 = arg0.method1190();
		}
	}
}
