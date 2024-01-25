import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class14 {

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
	public int anInt279 = 1;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method291(@OriginalArg(0) Class6_Sub40 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8604();
			if (local15 == 0) {
				return;
			}
			this.method292(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!rg;II)V")
	private void method292(@OriginalArg(0) Class6_Sub40 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static494.method7395(arg0.method8602());
		} else if (arg1 == 2) {
			this.anInt279 = 0;
		}
	}
}
