import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class14_Sub2_Sub18 extends Class14_Sub2 {

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
	public int anInt9313 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!jc;Z)V")
	public void method8036(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7695(99);
			if (local12 == 0) {
				return;
			}
			this.method8039(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!jc;IB)V")
	private void method8039(@OriginalArg(0) Class14_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt9313 = arg0.method7717(-1978450544);
		}
	}
}
