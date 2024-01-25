import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class365 {

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "[I")
	public int[] anIntArray671;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
	public int anInt10173 = -1;

	@OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
	public int anInt10178 = -1;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!gga;I)V")
	public void method8611(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8374();
			if (local13 == 0) {
				return;
			}
			this.method8612(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IBLclient!gga;)V")
	private void method8612(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt10173 = arg1.method8363();
		} else if (arg0 == 2) {
			this.anIntArray671 = new int[arg1.method8374()];
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray671.length; local34++) {
				this.anIntArray671[local34] = arg1.method8363();
			}
		} else if (arg0 == 3) {
			this.anInt10178 = arg1.method8374();
		}
	}
}
