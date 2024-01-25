import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class390 {

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
	public int anInt10261 = 0;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILclient!jc;)V")
	public void method8851(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3030();
			if (local13 == 0) {
				return;
			}
			this.method8854(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!jc;II)V")
	private void method8854(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt10261 = arg0.method3018();
		}
	}
}
