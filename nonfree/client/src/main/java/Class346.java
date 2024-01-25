import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class346 {

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "I")
	public int anInt9794 = 1;

	@OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
	public int anInt9795 = -1;

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "Z")
	public boolean aBoolean808 = false;

	@OriginalMember(owner = "client!uw", name = "j", descriptor = "Z")
	public boolean aBoolean809 = false;

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
	public int anInt9796 = 64;

	@OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
	public int anInt9798 = 2;

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
	public int anInt9797 = 64;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIILclient!tn;)V")
	private void method8067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub15 arg2) {
		if (arg0 == 1) {
			this.anInt9795 = arg2.method8414();
			if (this.anInt9795 == 65535) {
				this.anInt9795 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt9796 = arg2.method8414() + 1;
			this.anInt9797 = arg2.method8414() + 1;
		} else if (arg0 == 3) {
			arg2.method8440();
		} else if (arg0 == 4) {
			this.anInt9798 = arg2.method8401();
		} else if (arg0 == 5) {
			this.anInt9794 = arg2.method8401();
		} else if (arg0 == 6) {
			this.aBoolean808 = true;
		} else if (arg0 == 7) {
			this.aBoolean809 = true;
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BILclient!tn;)V")
	public void method8068(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method8401();
			if (local9 == 0) {
				return;
			}
			this.method8067(local9, arg0, arg1);
		}
	}
}
