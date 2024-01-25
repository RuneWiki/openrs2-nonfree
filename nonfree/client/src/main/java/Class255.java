import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class255 {

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "[I")
	public int[] anIntArray559;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
	public int anInt7362 = -1;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	public int anInt7365 = -1;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BILclient!bt;)V")
	private void method5750(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt7362 = arg1.method6004();
		} else if (arg0 == 2) {
			this.anIntArray559 = new int[arg1.method6053()];
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray559.length; local15++) {
				this.anIntArray559[local15] = arg1.method6004();
			}
		} else if (arg0 == 3) {
			this.anInt7365 = arg1.method6053();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!bt;)V")
	public void method5751(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6053();
			if (local3 == 0) {
				return;
			}
			this.method5750(local3, arg0);
		}
	}
}
