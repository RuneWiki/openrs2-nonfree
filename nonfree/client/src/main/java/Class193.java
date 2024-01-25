import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class193 {

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
	public int anInt5221 = 1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!gga;I)V")
	public void method4404(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method8374();
			if (local12 == 0) {
				return;
			}
			this.method4406(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILclient!gga;)V")
	private void method4406(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub23 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static622.method8571(arg1.method8391());
		} else if (arg0 == 2) {
			this.anInt5221 = 0;
			return;
		}
	}
}
