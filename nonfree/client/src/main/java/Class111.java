import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class111 {

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
	public int anInt3365 = 0;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!iv;Z)V")
	public void method2810(@OriginalArg(0) Class4_Sub12 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2490();
			if (local13 == 0) {
				return;
			}
			this.method2811(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!iv;II)V")
	private void method2811(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt3365 = arg0.method2536();
		}
	}
}
