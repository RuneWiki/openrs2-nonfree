import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class14_Sub2_Sub3 extends Class14_Sub2 {

	@OriginalMember(owner = "client!cg", name = "A", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
	public int anInt896 = 1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!jg;I)V")
	private void method902(@OriginalArg(1) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static85.method2093(arg0.method2553());
		} else if (arg1 == 2) {
			this.anInt896 = 0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLclient!jg;)V")
	public void method905(@OriginalArg(1) Class14_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2548();
			if (local9 == 0) {
				return;
			}
			this.method902(arg0, local9);
		}
	}
}
