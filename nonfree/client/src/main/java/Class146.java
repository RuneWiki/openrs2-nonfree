import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class146 {

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
	public int anInt3695 = 2048;

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	public int anInt3693 = 0;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	public int anInt3698 = 0;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
	public int anInt3692 = 2048;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!hw;I)V")
	public void method3045(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6138();
			if (local11 == 0) {
				return;
			}
			this.method3047(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZLclient!hw;)V")
	private void method3047(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt3693 = arg1.method6138();
		} else if (arg0 == 2) {
			this.anInt3695 = arg1.method6148();
		} else if (arg0 == 3) {
			this.anInt3692 = arg1.method6148();
		} else if (arg0 == 4) {
			this.anInt3698 = arg1.method6149();
		}
	}
}
