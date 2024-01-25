import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class319 {

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
	public int anInt9217 = 0;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ib;B)V")
	public void method7911(@OriginalArg(0) Class5_Sub23 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8529();
			if (local13 == 0) {
				return;
			}
			this.method7912(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILclient!ib;)V")
	private void method7912(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 5) {
			this.anInt9217 = arg1.method8519();
		}
	}
}
