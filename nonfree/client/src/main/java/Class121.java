import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class121 {

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
	public int anInt3195 = 2048;

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
	public int anInt3193 = 0;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
	public int anInt3189 = 0;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
	public int anInt3190 = 2048;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!re;ZI)V")
	private void method2583(@OriginalArg(0) Class1_Sub33 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3193 = arg0.method5174();
		} else if (arg1 == 2) {
			this.anInt3195 = arg0.method5177();
		} else if (arg1 == 3) {
			this.anInt3190 = arg0.method5177();
		} else if (arg1 == 4) {
			this.anInt3189 = arg0.method5180();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!re;)V")
	public void method2586(@OriginalArg(1) Class1_Sub33 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5174();
			if (local13 == 0) {
				return;
			}
			this.method2583(arg0, local13);
		}
	}
}
