import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class123 {

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "[I")
	public int[] anIntArray339;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
	public int anInt3942 = -1;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
	public int anInt3944 = -1;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!tq;II)V")
	public void method3341(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(11) int local11 = arg0.method2380();
			if (local11 == 0) {
				return;
			}
			this.method3342(arg0, local11, arg1);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!tq;III)V")
	private void method3342(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt3944 = arg0.method2404();
		} else if (arg1 == 2) {
			this.anIntArray339 = new int[arg0.method2380()];
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray339.length; local25++) {
				this.anIntArray339[local25] = arg0.method2404();
			}
		} else if (arg1 == 3) {
			this.anInt3942 = arg0.method2380();
		}
	}
}
