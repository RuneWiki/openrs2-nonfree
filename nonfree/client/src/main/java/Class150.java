import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hia")
public final class Class150 {

	@OriginalMember(owner = "client!hia", name = "d", descriptor = "I")
	public int anInt3545 = 1;

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "I")
	public int anInt3544 = 64;

	@OriginalMember(owner = "client!hia", name = "f", descriptor = "I")
	public int anInt3546 = -1;

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "Z")
	public boolean aBoolean261 = false;

	@OriginalMember(owner = "client!hia", name = "i", descriptor = "I")
	public int anInt3549 = 64;

	@OriginalMember(owner = "client!hia", name = "e", descriptor = "Z")
	public boolean aBoolean262 = false;

	@OriginalMember(owner = "client!hia", name = "h", descriptor = "I")
	public int anInt3548 = 2;

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IILclient!es;I)V")
	private void method3266(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt3546 = arg1.method8859();
			if (this.anInt3546 == 65535) {
				this.anInt3546 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt3544 = arg1.method8859() + 1;
			this.anInt3549 = arg1.method8859() + 1;
		} else if (arg2 == 3) {
			arg1.method8861();
		} else if (arg2 == 4) {
			this.anInt3548 = arg1.method8865();
		} else if (arg2 == 5) {
			this.anInt3545 = arg1.method8865();
		} else if (arg2 == 6) {
			this.aBoolean262 = true;
		} else if (arg2 == 7) {
			this.aBoolean261 = true;
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Lclient!es;II)V")
	public void method3268(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method8865();
			if (local9 == 0) {
				return;
			}
			this.method3266(arg1, arg0, local9);
		}
	}
}
