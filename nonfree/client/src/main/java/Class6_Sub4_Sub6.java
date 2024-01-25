import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class6_Sub4_Sub6 extends Class6_Sub4 {

	@OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
	public int anInt3128 = 0;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILclient!gga;)V")
	private void method2622(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub23 arg1) {
		if (arg0 == 2) {
			this.anInt3128 = arg1.method8363();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!gga;Z)V")
	public void method2623(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8374();
			if (local5 == 0) {
				return;
			}
			this.method2622(local5, arg0);
		}
	}
}
