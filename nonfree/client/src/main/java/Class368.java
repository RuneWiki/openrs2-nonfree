import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class368 {

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "C")
	public char aChar7;

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
	public int anInt9948 = 1;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!wq;II)V")
	private void method8457(@OriginalArg(0) Class5_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar7 = Static92.method8227(arg0.method7318());
		} else if (arg1 == 2) {
			this.anInt9948 = 0;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!wq;)V")
	public void method8459(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method7291();
			if (local17 == 0) {
				return;
			}
			this.method8457(arg0, local17);
		}
	}
}
