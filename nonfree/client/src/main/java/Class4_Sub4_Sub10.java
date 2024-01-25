import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class4_Sub4_Sub10 extends Class4_Sub4 {

	@OriginalMember(owner = "client!me", name = "F", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "I")
	public int anInt4055 = 1;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLclient!lf;)V")
	public void method3663(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(21) int local21 = arg0.method3440();
			if (local21 == 0) {
				return;
			}
			this.method3664(local21, arg0);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IBLclient!lf;)V")
	private void method3664(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static36.method745(arg1.method3426());
		} else if (arg0 == 2) {
			this.anInt4055 = 0;
			return;
		}
	}
}
