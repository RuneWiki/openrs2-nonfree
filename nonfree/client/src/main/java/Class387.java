import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class387 {

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
	public int anInt10616 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLclient!gga;I)V")
	private void method9008(@OriginalArg(1) Class6_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt10616 = arg0.method8363();
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!gga;B)V")
	public void method9010(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8374();
			if (local9 == 0) {
				return;
			}
			this.method9008(arg0, local9);
		}
	}
}
