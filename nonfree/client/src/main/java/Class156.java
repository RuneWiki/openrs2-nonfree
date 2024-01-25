import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class156 {

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	public int anInt4632 = 1;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!ia;)V")
	public void method3564(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1171();
			if (local9 == 0) {
				return;
			}
			this.method3565(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBLclient!ia;)V")
	private void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static231.method3516(arg1.method1212());
		} else if (arg0 == 2) {
			this.anInt4632 = 0;
		}
	}
}
