import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class337 {

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
	public int anInt9697 = 0;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
	public int anInt9698 = 2048;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
	public int anInt9696 = 0;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
	public int anInt9700 = 2048;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!tn;I)V")
	private void method8007(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt9696 = arg1.method8401();
		} else if (arg0 == 2) {
			this.anInt9698 = arg1.method8414();
		} else if (arg0 == 3) {
			this.anInt9700 = arg1.method8414();
		} else if (arg0 == 4) {
			this.anInt9697 = arg1.method8444();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!tn;)V")
	public void method8008(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method8401();
			if (local8 == 0) {
				return;
			}
			this.method8007(local8, arg0);
		}
	}
}
