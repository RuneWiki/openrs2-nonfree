import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class240 {

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "I")
	public int anInt6567;

	@OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
	public int anInt6571;

	@OriginalMember(owner = "client!nga", name = "l", descriptor = "I")
	public int anInt6573;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!gga;IB)V")
	private void method5566(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static622.method8571(arg0.method8391());
		} else if (arg1 == 2) {
			this.anInt6567 = arg0.method8363();
			this.anInt6571 = arg0.method8374();
			this.anInt6573 = arg0.method8374();
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!gga;I)V")
	public void method5567(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method8374();
			if (local14 == 0) {
				return;
			}
			this.method5566(arg0, local14);
		}
	}
}
