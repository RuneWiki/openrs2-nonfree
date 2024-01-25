import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class142 {

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
	public int anInt4040 = 2048;

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
	public int anInt4039 = 2048;

	@OriginalMember(owner = "client!haa", name = "h", descriptor = "I")
	public int anInt4044 = 0;

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
	public int anInt4045 = 0;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!mc;Z)V")
	public void method3439(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7816();
			if (local3 == 0) {
				return;
			}
			this.method3441(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BILclient!mc;)V")
	private void method3441(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub41 arg1) {
		if (arg0 == 1) {
			this.anInt4044 = arg1.method7816();
		} else if (arg0 == 2) {
			this.anInt4040 = arg1.method7860();
		} else if (arg0 == 3) {
			this.anInt4039 = arg1.method7860();
		} else if (arg0 == 4) {
			this.anInt4045 = arg1.method7849();
		}
	}
}
