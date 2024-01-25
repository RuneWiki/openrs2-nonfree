import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class151 {

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "[I")
	public int[] anIntArray383;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
	public int anInt4248 = -1;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
	public int anInt4254 = -1;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!jg;IBI)V")
	private void method3831(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4254 = arg0.method2498();
		} else if (arg2 == 2) {
			this.anIntArray383 = new int[arg0.method2548()];
			for (@Pc(32) int local32 = 0; local32 < this.anIntArray383.length; local32++) {
				this.anIntArray383[local32] = arg0.method2498();
			}
		} else if (arg2 == 3) {
			this.anInt4248 = arg0.method2548();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!jg;I)V")
	public void method3832(@OriginalArg(1) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method2548();
			if (local17 == 0) {
				return;
			}
			this.method3831(arg0, arg1, local17);
		}
	}
}
