import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class5_Sub2_Sub14 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
	public int anInt5830 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!co;I)V")
	public void method4826(@OriginalArg(0) Class5_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4220();
			if (local5 == 0) {
				return;
			}
			this.method4829(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILclient!co;)V")
	private void method4829(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 2) {
			this.anInt5830 = arg1.method4227();
		}
	}
}
