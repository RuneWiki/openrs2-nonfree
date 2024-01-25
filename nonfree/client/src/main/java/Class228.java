import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class228 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
	public int anInt6700 = 0;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
	public int anInt6707 = 0;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
	public int anInt6702 = 2048;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
	public int anInt6705 = 2048;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!ae;)V")
	public void method5587(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method6433();
			if (local16 == 0) {
				return;
			}
			this.method5588(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!ae;I)V")
	private void method5588(@OriginalArg(1) Class6_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6700 = arg0.method6433();
		} else if (arg1 == 2) {
			this.anInt6705 = arg0.method6485();
			return;
		} else if (arg1 == 3) {
			this.anInt6702 = arg0.method6485();
			return;
		} else if (arg1 == 4) {
			this.anInt6707 = arg0.method6428();
			return;
		}
	}
}
