import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class24 {

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
	public int anInt341 = 0;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!mc;I)V")
	private void method308(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub41 arg1) {
		if (arg0 == 5) {
			this.anInt341 = arg1.method7860();
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!mc;B)V")
	public void method311(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method7816();
			if (local7 == 0) {
				return;
			}
			this.method308(local7, arg0);
		}
	}
}
