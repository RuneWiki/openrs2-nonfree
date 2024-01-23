import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class93 {

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
	public int anInt3539 = 2048;

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
	public int anInt3546 = 0;

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
	public int anInt3547 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
	public int anInt3538 = 2048;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BILclient!im;)V")
	public void method2857(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method2655();
			if (local9 == 0) {
				return;
			}
			this.method2860(arg0, arg1, local9);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!im;II)V")
	private void method2860(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt3546 = arg1.method2655();
		} else if (arg2 == 2) {
			this.anInt3538 = arg1.method2652();
		} else if (arg2 == 3) {
			this.anInt3539 = arg1.method2652();
		} else if (arg2 == 4) {
			this.anInt3547 = arg1.method2645();
		}
	}
}
