import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class4_Sub3_Sub5 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
	public int anInt936 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!tf;)V")
	private void method492(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 5) {
			this.anInt936 = arg1.method816();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!tf;I)V")
	public void method494(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method773();
			if (local16 == 0) {
				return;
			}
			this.method492(local16, arg0);
		}
	}
}
