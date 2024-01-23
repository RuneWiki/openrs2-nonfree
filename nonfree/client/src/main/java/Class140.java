import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class140 {

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
	public int anInt4464 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!wm;IB)V")
	private void method3624(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt4464 = arg0.method4242();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!wm;B)V")
	public void method3626(@OriginalArg(0) Class2_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4261();
			if (local9 == 0) {
				return;
			}
			this.method3624(arg0, local9);
		}
	}
}
