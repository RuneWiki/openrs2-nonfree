import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class3_Sub7_Sub16 extends Class3_Sub7 {

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
	public int anInt3882 = 0;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILclient!fb;)V")
	private void method3245(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 2) {
			this.anInt3882 = arg1.method3649();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!fb;)V")
	public void method3249(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3643();
			if (local13 == 0) {
				return;
			}
			this.method3245(local13, arg0);
		}
	}
}
