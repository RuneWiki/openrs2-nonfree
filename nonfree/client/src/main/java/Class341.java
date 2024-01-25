import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class341 {

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "Lclient!uea;")
	public Class350 aClass350_2;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
	public int anInt9557;

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
	public int anInt9560;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
	private int anInt9561;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!gga;I)V")
	public void method8050(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8374();
			if (local13 == 0) {
				return;
			}
			this.method8052(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)Lclient!fm;")
	public synchronized Class112 method8051() {
		@Pc(20) Class112 local20 = (Class112) this.aClass350_2.aClass10_57.method373((long) this.anInt9561);
		if (local20 != null) {
			return local20;
		}
		local20 = Static681.method2327(this.aClass350_2.aClass8_133, this.anInt9561, 0);
		if (local20 != null) {
			this.aClass350_2.aClass10_57.method366(local20, (long) this.anInt9561);
		}
		return local20;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLclient!gga;I)V")
	private void method8052(@OriginalArg(1) Class6_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9561 = arg0.method8363();
		} else if (arg1 == 2) {
			this.anInt9560 = arg0.method8374();
			this.anInt9557 = arg0.method8374();
		}
	}
}
