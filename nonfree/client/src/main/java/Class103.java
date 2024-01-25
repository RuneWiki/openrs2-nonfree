import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class103 {

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
	public int anInt3484 = 2;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
	public int anInt3485 = 64;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "Z")
	public boolean aBoolean213 = false;

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "Z")
	public boolean aBoolean212 = false;

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
	public int anInt3488 = -1;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
	public int anInt3483 = 64;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
	public int anInt3481 = 1;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!gw;IB)V")
	private void method3131(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub13 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt3488 = arg1.method3056();
			if (this.anInt3488 == 65535) {
				this.anInt3488 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt3483 = arg1.method3056() + 1;
			this.anInt3485 = arg1.method3056() + 1;
		} else if (arg0 == 3) {
			arg1.method3073();
		} else if (arg0 == 4) {
			this.anInt3484 = arg1.method3043();
		} else if (arg0 == 5) {
			this.anInt3481 = arg1.method3043();
		} else if (arg0 == 6) {
			this.aBoolean213 = true;
		} else if (arg0 == 7) {
			this.aBoolean212 = true;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILclient!gw;)V")
	public void method3132(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method3043();
			if (local14 == 0) {
				return;
			}
			this.method3131(local14, arg1, arg0);
		}
	}
}
