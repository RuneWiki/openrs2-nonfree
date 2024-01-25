import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class212 {

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "[I")
	public static final int[] anIntArray489 = new int[99];

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	public int anInt6447 = 0;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
	public int anInt6449 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
	public int anInt6445 = 2048;

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
	public int anInt6450 = 2048;

	static {
		@Pc(135) int local135 = 0;
		for (@Pc(137) int local137 = 0; local137 < 99; local137++) {
			@Pc(142) int local142 = local137 + 1;
			@Pc(155) int local155 = (int) (Math.pow(2.0D, (double) local142 / 7.0D) * 300.0D + (double) local142);
			local135 += local155;
			anIntArray489[local137] = local135 / 4;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!at;II)V")
	public void method5701(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method2132();
			if (local5 == 0) {
				return;
			}
			this.method5702(arg0, arg1, local5);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!at;III)V")
	private void method5702(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt6449 = arg0.method2132();
		} else if (arg2 == 2) {
			this.anInt6445 = arg0.method2161();
		} else if (arg2 == 3) {
			this.anInt6450 = arg0.method2161();
		} else if (arg2 == 4) {
			this.anInt6447 = arg0.method2141();
			return;
		}
	}
}
