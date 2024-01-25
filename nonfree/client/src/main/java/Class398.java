import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class398 {

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "C")
	public char aChar7;

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
	public int anInt10446 = 1;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BILclient!jc;)V")
	private void method8972(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.aChar7 = Static383.method5912(arg1.method3027());
		} else if (arg0 == 2) {
			this.anInt10446 = 0;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BLclient!jc;)V")
	public void method8974(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3030();
			if (local5 == 0) {
				return;
			}
			this.method8972(local5, arg0);
		}
	}
}
