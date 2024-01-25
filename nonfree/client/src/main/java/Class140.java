import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class140 {

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "[I")
	public int[] anIntArray346;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public int anInt3954 = -1;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public int anInt3956 = -1;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!gk;B)V")
	public void method3136(@OriginalArg(0) Class7_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3981();
			if (local9 == 0) {
				return;
			}
			this.method3137(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!gk;II)V")
	private void method3137(@OriginalArg(0) Class7_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3954 = arg0.method3943();
		} else if (arg1 == 2) {
			this.anIntArray346 = new int[arg0.method3981()];
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray346.length; local29++) {
				this.anIntArray346[local29] = arg0.method3943();
			}
		} else if (arg1 == 3) {
			this.anInt3956 = arg0.method3981();
		}
	}
}
