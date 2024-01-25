import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class169 {

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
	public int anInt4997;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
	public int anInt4998;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
	public int anInt5002;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!jg;)V")
	public void method4483(@OriginalArg(1) Class14_Sub4 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method2548();
			if (local16 == 0) {
				return;
			}
			this.method4487(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILclient!jg;)V")
	private void method4487(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt4997 = arg1.method2498();
			this.anInt4998 = arg1.method2548();
			this.anInt5002 = arg1.method2548();
		}
	}
}
