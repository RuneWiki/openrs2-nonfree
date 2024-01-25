import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class251 {

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
	public int anInt6808 = 1;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "Z")
	public boolean aBoolean527 = false;

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
	public int anInt6812 = 64;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	public int anInt6811 = 2;

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
	public int anInt6810 = -1;

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "Z")
	public boolean aBoolean528 = false;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
	public int anInt6814 = 64;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!ib;I)V")
	public void method5816(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub23 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method8529();
			if (local9 == 0) {
				return;
			}
			this.method5817(arg0, arg1, local9);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!ib;IB)V")
	private void method5817(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub23 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt6810 = arg1.method8519();
			if (this.anInt6810 == 65535) {
				this.anInt6810 = -1;
				return;
			}
		} else if (arg2 == 2) {
			this.anInt6814 = arg1.method8519() + 1;
			this.anInt6812 = arg1.method8519() + 1;
			return;
		} else if (arg2 == 3) {
			arg1.method8488();
		} else if (arg2 == 4) {
			this.anInt6811 = arg1.method8529();
			return;
		} else {
			if (arg2 == 5) {
				this.anInt6808 = arg1.method8529();
			} else if (arg2 == 6) {
				this.aBoolean528 = true;
				return;
			} else if (arg2 == 7) {
				this.aBoolean527 = true;
				return;
			}
			return;
		}
	}
}
