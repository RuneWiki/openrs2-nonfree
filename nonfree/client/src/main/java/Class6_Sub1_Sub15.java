import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class6_Sub1_Sub15 extends Class6_Sub1 {

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
	public int anInt7619 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILclient!dga;)V")
	private void method6310(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 2) {
			this.anInt7619 = arg1.method6006();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!dga;)V")
	public void method6312(@OriginalArg(1) Class6_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6041();
			if (local9 == 0) {
				return;
			}
			this.method6310(local9, arg0);
		}
	}
}
