import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class167 {

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	public int anInt4982 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!wn;I)V")
	public void method4228(@OriginalArg(0) Class4_Sub20 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4614();
			if (local14 == 0) {
				return;
			}
			this.method4229(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILclient!wn;)V")
	private void method4229(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (arg0 == 5) {
			this.anInt4982 = arg1.method4560();
		}
	}
}
