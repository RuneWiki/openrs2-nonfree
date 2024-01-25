import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class30 {

	@OriginalMember(owner = "client!br", name = "b", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!br", name = "i", descriptor = "I")
	public int anInt612 = 1;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IILclient!hw;)V")
	private void method580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static408.method1357(arg1.method6120());
		} else if (arg0 == 2) {
			this.anInt612 = 0;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!hw;B)V")
	public void method584(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6138();
			if (local9 == 0) {
				return;
			}
			this.method580(local9, arg0);
		}
	}
}
