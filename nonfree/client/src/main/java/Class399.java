import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class399 {

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "Z")
	public boolean aBoolean778 = false;

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
	public int anInt10492 = -1;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "Z")
	public boolean aBoolean779 = false;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
	public int anInt10495 = 64;

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
	public int anInt10494 = 1;

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
	public int anInt10493 = 64;

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
	public int anInt10496 = 2;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIZLclient!jc;)V")
	private void method9016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub15 arg2) {
		if (arg1 == 1) {
			this.anInt10492 = arg2.method3018();
			if (this.anInt10492 == 65535) {
				this.anInt10492 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt10493 = arg2.method3018() + 1;
			this.anInt10495 = arg2.method3018() + 1;
		} else if (arg1 == 3) {
			arg2.method3027();
		} else if (arg1 == 4) {
			this.anInt10496 = arg2.method3030();
		} else if (arg1 == 5) {
			this.anInt10494 = arg2.method3030();
		} else if (arg1 == 6) {
			this.aBoolean778 = true;
		} else if (arg1 == 7) {
			this.aBoolean779 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!jc;BI)V")
	public void method9017(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method3030();
			if (local13 == 0) {
				return;
			}
			this.method9016(arg1, local13, arg0);
		}
	}
}
