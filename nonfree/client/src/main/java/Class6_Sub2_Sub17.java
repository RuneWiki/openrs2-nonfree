import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class6_Sub2_Sub17 extends Class6_Sub2 {

	@OriginalMember(owner = "client!sw", name = "y", descriptor = "I")
	public int anInt8305 = 0;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IILclient!ji;)V")
	private void method6738(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 2) {
			this.anInt8305 = arg1.method6003();
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(BLclient!ji;)V")
	public void method6741(@OriginalArg(1) Class6_Sub21 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6069();
			if (local9 == 0) {
				return;
			}
			this.method6738(local9, arg0);
		}
	}
}
