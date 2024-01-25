import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class143 {

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	public int anInt3667;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	public int anInt3668;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	public int anInt3669;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZLclient!wq;)V")
	private void method3365(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		if (arg0 == 1) {
			this.anInt3669 = arg1.method7333();
			this.anInt3668 = arg1.method7291();
			this.anInt3667 = arg1.method7291();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!wq;I)V")
	public void method3368(@OriginalArg(0) Class5_Sub36 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method7291();
			if (local15 == 0) {
				return;
			}
			this.method3365(local15, arg0);
		}
	}
}
