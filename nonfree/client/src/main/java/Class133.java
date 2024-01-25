import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class133 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public int anInt3600;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "I")
	public int anInt3605;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "I")
	public int anInt3608;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "Z")
	public boolean aBoolean273;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "I")
	public int anInt3610;

	@OriginalMember(owner = "client!me", name = "q", descriptor = "I")
	public int anInt3612;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "I")
	public int anInt3603 = 16777215;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	public int anInt3606 = 8;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ec;IIZ)V")
	private void method3556(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt3606 = arg0.method4021();
		} else if (arg2 == 2) {
			this.aBoolean273 = true;
		} else if (arg2 == 3) {
			this.anInt3612 = arg0.method4022();
			this.anInt3600 = arg0.method4022();
			this.anInt3605 = arg0.method4022();
		} else if (arg2 == 4) {
			this.anInt3608 = arg0.method3972();
		} else if (arg2 == 5) {
			this.anInt3610 = arg0.method4021();
		} else if (arg2 == 6) {
			this.anInt3603 = arg0.method3996();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ec;IB)V")
	public void method3557(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method3972();
			if (local5 == 0) {
				return;
			}
			this.method3556(arg0, arg1, local5);
		}
	}
}
