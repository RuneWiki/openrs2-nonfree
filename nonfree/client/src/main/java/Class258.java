import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class258 {

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public int anInt7261;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	public int anInt7264;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "I")
	public int anInt7267;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!mc;)V")
	public void method6015(@OriginalArg(1) Class5_Sub41 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method7816();
			if (local7 == 0) {
				return;
			}
			this.method6018(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!mc;II)V")
	private void method6018(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt7267 = arg0.method7860();
			this.anInt7261 = arg0.method7816();
			this.anInt7264 = arg0.method7816();
		}
	}
}
