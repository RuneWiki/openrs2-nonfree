import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class302 {

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
	public int anInt8505 = 0;

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
	public int anInt8504 = 0;

	@OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
	public int anInt8512 = 2048;

	@OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
	public int anInt8507 = 2048;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!rv;)V")
	public void method7239(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3642();
			if (local9 == 0) {
				return;
			}
			this.method7240(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IBLclient!rv;)V")
	private void method7240(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt8505 = arg1.method3642();
		} else if (arg0 == 2) {
			this.anInt8507 = arg1.method3698();
		} else if (arg0 == 3) {
			this.anInt8512 = arg1.method3698();
		} else if (arg0 == 4) {
			this.anInt8504 = arg1.method3638();
		}
	}
}
