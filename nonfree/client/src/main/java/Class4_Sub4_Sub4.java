import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class4_Sub4_Sub4 extends Class4_Sub4 {

	@OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
	public int anInt716 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!ne;I)V")
	public void method446(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method599();
			if (local13 == 0) {
				return;
			}
			this.method449(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BILclient!ne;)V")
	private void method449(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		if (arg0 == 5) {
			this.anInt716 = arg1.method604();
		}
	}
}
