import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class11 {

	@OriginalMember(owner = "client!am", name = "f", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	public int anInt184 = 1;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!lk;I)V")
	private void method245(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static223.method3757(arg1.method4217());
		} else if (arg0 == 2) {
			this.anInt184 = 0;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!lk;Z)V")
	public void method247(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4240();
			if (local9 == 0) {
				return;
			}
			this.method245(local9, arg0);
		}
	}
}
