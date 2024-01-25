import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class6_Sub2_Sub18 extends Class6_Sub2 {

	@OriginalMember(owner = "client!vr", name = "E", descriptor = "I")
	public int anInt7676 = 0;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!ae;B)V")
	public void method6280(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6433();
			if (local5 == 0) {
				return;
			}
			this.method6281(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!ae;I)V")
	private void method6281(@OriginalArg(1) Class6_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt7676 = arg0.method6485();
		}
	}
}
