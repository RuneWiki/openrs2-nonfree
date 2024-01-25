import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sha")
public final class Class322 {

	@OriginalMember(owner = "client!sha", name = "d", descriptor = "C")
	public char aChar6;

	@OriginalMember(owner = "client!sha", name = "h", descriptor = "I")
	public int anInt8852 = 1;

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Lclient!rv;I)V")
	public void method7463(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3642();
			if (local11 == 0) {
				return;
			}
			this.method7464(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILclient!rv;Z)V")
	private void method7464(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.aChar6 = Static549.method7576(arg1.method3677());
		} else if (arg0 == 2) {
			this.anInt8852 = 0;
		}
	}
}
