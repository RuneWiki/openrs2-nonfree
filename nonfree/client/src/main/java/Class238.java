import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class238 {

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
	public int anInt6426 = 0;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
	public int anInt6429 = 0;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
	public int anInt6430 = 2048;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
	public int anInt6433 = 2048;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!lk;)V")
	public void method5545(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4240();
			if (local13 == 0) {
				return;
			}
			this.method5546(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!lk;Z)V")
	private void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt6426 = arg1.method4240();
		} else if (arg0 == 2) {
			this.anInt6430 = arg1.method4245();
		} else if (arg0 == 3) {
			this.anInt6433 = arg1.method4245();
		} else if (arg0 == 4) {
			this.anInt6429 = arg1.method4251();
		}
	}
}
