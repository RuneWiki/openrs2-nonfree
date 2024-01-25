import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class365 {

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "I")
	public int anInt10573 = 0;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BLclient!so;)V")
	public void method8815(@OriginalArg(1) Class14_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5866();
			if (local5 == 0) {
				return;
			}
			this.method8816(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IILclient!so;)V")
	private void method8816(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub29 arg1) {
		if (arg0 == 5) {
			this.anInt10573 = arg1.method5900();
		}
	}
}
