import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class129 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
	public int anInt3435 = 2048;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
	public int anInt3436 = 0;

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
	public int anInt3437 = 0;

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
	public int anInt3438 = 2048;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILclient!ec;I)V")
	private void method3470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub10 arg2) {
		if (arg0 == 1) {
			this.anInt3436 = arg2.method3972();
		} else if (arg0 == 2) {
			this.anInt3435 = arg2.method4021();
		} else if (arg0 == 3) {
			this.anInt3438 = arg2.method4021();
		} else if (arg0 == 4) {
			this.anInt3437 = arg2.method4022();
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLclient!ec;I)V")
	public void method3471(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(18) int local18 = arg0.method3972();
			if (local18 == 0) {
				return;
			}
			this.method3470(local18, arg1, arg0);
		}
	}
}
