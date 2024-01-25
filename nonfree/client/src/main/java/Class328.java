import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class328 {

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
	public int anInt9294 = 2048;

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "I")
	public int anInt9301 = 0;

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
	public int anInt9302 = 0;

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
	public int anInt9296 = 2048;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLclient!gga;)V")
	public void method7835(@OriginalArg(1) Class6_Sub23 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method8374();
			if (local16 == 0) {
				return;
			}
			this.method7836(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!gga;ZI)V")
	private void method7836(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9301 = arg0.method8374();
		} else if (arg1 == 2) {
			this.anInt9294 = arg0.method8363();
		} else if (arg1 == 3) {
			this.anInt9296 = arg0.method8363();
		} else if (arg1 == 4) {
			this.anInt9302 = arg0.method8395();
		}
	}
}
