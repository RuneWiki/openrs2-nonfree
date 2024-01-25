import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vha")
public final class Class376 {

	@OriginalMember(owner = "client!vha", name = "h", descriptor = "C")
	public char aChar7;

	@OriginalMember(owner = "client!vha", name = "g", descriptor = "I")
	public int anInt10620 = 1;

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!jc;B)V")
	public void method9072(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method7695(116);
			if (local16 == 0) {
				return;
			}
			this.method9075(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!jc;IB)V")
	private void method9075(@OriginalArg(0) Class14_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar7 = Static223.method3822(arg0.method7720());
		} else if (arg1 == 2) {
			this.anInt10620 = 0;
		}
	}
}
