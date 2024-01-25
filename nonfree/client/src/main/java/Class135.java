import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class135 {

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "[I")
	public int[] anIntArray322;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	public int anInt3899 = -1;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	public int anInt3901 = -1;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!tl;I)V")
	public void method2940(@OriginalArg(0) Class4_Sub30 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4864();
			if (local5 == 0) {
				return;
			}
			this.method2942(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!tl;II)V")
	private void method2942(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3901 = arg0.method4877();
		} else if (arg1 == 2) {
			this.anIntArray322 = new int[arg0.method4864()];
			for (@Pc(39) int local39 = 0; local39 < this.anIntArray322.length; local39++) {
				this.anIntArray322[local39] = arg0.method4877();
			}
		} else if (arg1 == 3) {
			this.anInt3899 = arg0.method4864();
			return;
		}
	}
}
