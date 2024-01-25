import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public final class Class139 {

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
	public int anInt3622;

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
	public int anInt3623;

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "I")
	public int anInt3624;

	@OriginalMember(owner = "client!hfa", name = "g", descriptor = "Z")
	public boolean aBoolean215;

	@OriginalMember(owner = "client!hfa", name = "j", descriptor = "I")
	public int anInt3629;

	@OriginalMember(owner = "client!hfa", name = "k", descriptor = "I")
	public int anInt3630;

	@OriginalMember(owner = "client!hfa", name = "e", descriptor = "I")
	public int anInt3625 = 16777215;

	@OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
	public int anInt3626 = 8;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZLclient!gga;)V")
	public void method3103(@OriginalArg(1) Class6_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8374();
			if (local9 == 0) {
				return;
			}
			this.method3104(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!gga;IB)V")
	private void method3104(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3626 = arg0.method8363();
		} else if (arg1 == 2) {
			this.aBoolean215 = true;
		} else if (arg1 == 3) {
			this.anInt3622 = arg0.method8395();
			this.anInt3623 = arg0.method8395();
			this.anInt3624 = arg0.method8395();
		} else if (arg1 == 4) {
			this.anInt3630 = arg0.method8374();
		} else if (arg1 == 5) {
			this.anInt3629 = arg0.method8363();
		} else if (arg1 == 6) {
			this.anInt3625 = arg0.method8344();
			return;
		}
	}
}
