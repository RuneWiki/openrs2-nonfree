import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class3_Sub2_Sub18 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
	public int anInt3969 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLclient!rd;)V")
	public void method2891(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method191();
			if (local16 == 0) {
				return;
			}
			this.method2895(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!rd;B)V")
	private void method2895(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 2) {
			this.anInt3969 = arg1.method208();
		}
	}
}
