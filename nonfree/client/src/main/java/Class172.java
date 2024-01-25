import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class172 {

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	public int anInt4873 = -1;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
	public int anInt4868 = -1;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLclient!ae;)V")
	public void method4093(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6433();
			if (local9 == 0) {
				return;
			}
			this.method4095(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!ae;II)V")
	private void method4095(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4873 = arg0.method6485();
		} else if (arg1 == 2) {
			this.anIntArray326 = new int[arg0.method6433()];
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray326.length; local15++) {
				this.anIntArray326[local15] = arg0.method6485();
			}
		} else if (arg1 == 3) {
			this.anInt4868 = arg0.method6433();
		}
	}
}
