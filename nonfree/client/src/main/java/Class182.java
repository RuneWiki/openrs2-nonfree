import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class182 {

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "Z")
	public boolean aBoolean331 = false;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
	public int anInt4851 = 64;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
	public int anInt4852 = 64;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	public int anInt4854 = -1;

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
	public int anInt4853 = 2;

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "Z")
	public boolean aBoolean332 = false;

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
	public int anInt4857 = 1;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILclient!so;I)V")
	private void method4056(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub29 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4854 = arg1.method5900();
			if (this.anInt4854 == 65535) {
				this.anInt4854 = -1;
				return;
			}
		} else if (arg2 == 2) {
			this.anInt4852 = arg1.method5900() + 1;
			this.anInt4851 = arg1.method5900() + 1;
		} else if (arg2 == 3) {
			arg1.method5845();
			return;
		} else if (arg2 == 4) {
			this.anInt4853 = arg1.method5866();
			return;
		} else if (arg2 == 5) {
			this.anInt4857 = arg1.method5866();
			return;
		} else {
			if (arg2 == 6) {
				this.aBoolean332 = true;
			} else if (arg2 == 7) {
				this.aBoolean331 = true;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BLclient!so;I)V")
	public void method4059(@OriginalArg(1) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method5866();
			if (local9 == 0) {
				return;
			}
			this.method4056(arg1, arg0, local9);
		}
	}
}
