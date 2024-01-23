import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class2_Sub2_Sub22 extends Class2_Sub2 {

	@OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
	public int anInt4485;

	@OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
	public int anInt4486;

	@OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
	public int anInt4489;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ea;I)V")
	public void method3114(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method209();
			if (local9 == 0) {
				return;
			}
			this.method3116(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILclient!ea;)V")
	private void method3116(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt4485 = arg1.method163();
			this.anInt4486 = arg1.method209();
			this.anInt4489 = arg1.method209();
		}
	}
}
