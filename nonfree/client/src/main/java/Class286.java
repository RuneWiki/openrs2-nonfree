import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class286 {

	@OriginalMember(owner = "client!to", name = "b", descriptor = "I")
	public int anInt8682 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!daa;IB)V")
	private void method7143(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt8682 = arg0.method5199();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!daa;Z)V")
	public void method7146(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5216();
			if (local5 == 0) {
				return;
			}
			this.method7143(arg0, local5);
		}
	}
}
