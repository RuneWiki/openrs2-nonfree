import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class334 {

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	public int anInt8846 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!ji;)V")
	public void method7240(@OriginalArg(1) Class6_Sub21 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method6069();
			if (local12 == 0) {
				return;
			}
			this.method7241(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!ji;B)V")
	private void method7241(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub21 arg1) {
		if (arg0 == 5) {
			this.anInt8846 = arg1.method6003();
		}
	}
}
