import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!hd", name = "lb", descriptor = "I")
	public int anInt1052 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ic;B)V")
	public void method748(@OriginalArg(0) Class2_Sub10 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1514();
			if (local14 == 0) {
				return;
			}
			this.method751(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!ic;I)V")
	private void method751(@OriginalArg(1) Class2_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1052 = arg0.method1517();
		}
	}
}
