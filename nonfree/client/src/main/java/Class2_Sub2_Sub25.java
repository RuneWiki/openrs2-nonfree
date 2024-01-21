import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class2_Sub2_Sub25 extends Class2_Sub2 {

	@OriginalMember(owner = "client!va", name = "A", descriptor = "I")
	public int anInt3950 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!ra;)V")
	private void method3015(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 2) {
			this.anInt3950 = arg1.method269();
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!ra;)V")
	public void method3017(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method260();
			if (local14 == 0) {
				return;
			}
			this.method3015(local14, arg0);
		}
	}
}
