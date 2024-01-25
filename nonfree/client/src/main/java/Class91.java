import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eka")
public final class Class91 {

	@OriginalMember(owner = "client!eka", name = "k", descriptor = "I")
	public int anInt2781 = 0;

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(BLclient!jp;)V")
	public void method2535(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method8632();
			if (local14 == 0) {
				return;
			}
			this.method2536(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IILclient!jp;)V")
	private void method2536(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		if (arg0 == 5) {
			this.anInt2781 = arg1.method8593();
		}
	}
}
