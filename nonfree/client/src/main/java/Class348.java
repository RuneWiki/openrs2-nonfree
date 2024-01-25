import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class348 {

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "I")
	public int anInt9658;

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
	public int anInt9660;

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
	public int anInt9661;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLclient!gga;I)V")
	private void method8151(@OriginalArg(1) Class6_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9658 = arg0.method8363();
			this.anInt9661 = arg0.method8374();
			this.anInt9660 = arg0.method8374();
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLclient!gga;)V")
	public void method8152(@OriginalArg(1) Class6_Sub23 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8374();
			if (local13 == 0) {
				return;
			}
			this.method8151(arg0, local13);
		}
	}
}
