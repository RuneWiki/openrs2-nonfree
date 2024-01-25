import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class5_Sub1_Sub16 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
	public int anInt5235 = 1;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!rg;II)V")
	private void method4680(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static224.method4079(arg0.method5098());
		} else if (arg1 == 2) {
			this.anInt5235 = 0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLclient!rg;)V")
	public void method4682(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method5115();
			if (local7 == 0) {
				return;
			}
			this.method4680(arg0, local7);
		}
	}
}
