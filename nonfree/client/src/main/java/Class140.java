import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class140 {

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
	public int anInt4481;

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
	public int anInt4486;

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
	public int anInt4489;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!jj;)V")
	public void method3485(@OriginalArg(1) Class1_Sub18 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3122();
			if (local5 == 0) {
				return;
			}
			this.method3488(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!jj;I)V")
	private void method3488(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		if (arg0 == 1) {
			this.anInt4481 = arg1.method3107();
			this.anInt4486 = arg1.method3122();
			this.anInt4489 = arg1.method3122();
		}
	}
}
