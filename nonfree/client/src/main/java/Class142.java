import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class142 {

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
	public int anInt4473;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
	public int anInt4478;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
	public int anInt4479;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILclient!wm;)V")
	private void method3630(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt4473 = arg1.method4242();
			this.anInt4478 = arg1.method4261();
			this.anInt4479 = arg1.method4261();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method3635(@OriginalArg(0) Class2_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4261();
			if (local5 == 0) {
				return;
			}
			this.method3630(local5, arg0);
		}
	}
}
