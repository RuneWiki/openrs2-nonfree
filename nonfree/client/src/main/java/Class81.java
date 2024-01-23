import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class81 {

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	public int anInt2314 = -1;

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
	public int anInt2319 = -1;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!aj;I)V")
	private void method1839(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt2319 = arg1.method2375();
		} else if (arg0 == 2) {
			this.anIntArray187 = new int[arg1.method2334()];
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray187.length; local23++) {
				this.anIntArray187[local23] = arg1.method2375();
			}
		} else if (arg0 == 3) {
			this.anInt2314 = arg1.method2334();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!aj;II)V")
	public void method1840(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method2334();
			if (local9 == 0) {
				return;
			}
			this.method1839(local9, arg0, arg1);
		}
	}
}
