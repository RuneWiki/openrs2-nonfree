import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class192 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public int anInt5856;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Z")
	public boolean aBoolean515;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
	public int anInt5859;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	public int anInt5860;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
	public int anInt5861;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
	public int anInt5866;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
	public int anInt5857 = 16777215;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
	public int anInt5862 = 8;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLclient!mc;)V")
	public void method4865(@OriginalArg(1) Class5_Sub41 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method7816();
			if (local11 == 0) {
				return;
			}
			this.method4866(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!mc;IB)V")
	private void method4866(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5862 = arg0.method7860();
		} else if (arg1 == 2) {
			this.aBoolean515 = true;
		} else if (arg1 == 3) {
			this.anInt5856 = arg0.method7849();
			this.anInt5866 = arg0.method7849();
			this.anInt5860 = arg0.method7849();
		} else if (arg1 == 4) {
			this.anInt5861 = arg0.method7816();
		} else if (arg1 == 5) {
			this.anInt5859 = arg0.method7860();
		} else if (arg1 == 6) {
			this.anInt5857 = arg0.method7807();
			return;
		}
	}
}
