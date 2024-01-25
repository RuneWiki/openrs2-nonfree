import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class128 {

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	public int anInt3586 = 1;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!tl;)V")
	public void method2748(@OriginalArg(1) Class4_Sub30 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4864();
			if (local9 == 0) {
				return;
			}
			this.method2749(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!tl;ZI)V")
	private void method2749(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static414.method5433(arg0.method4865());
		} else if (arg1 == 2) {
			this.anInt3586 = 0;
		}
	}
}
