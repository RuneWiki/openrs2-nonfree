import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!bu", name = "v", descriptor = "I")
	public int anInt1104 = 0;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZLclient!tn;)V")
	public void method1163(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method8401();
			if (local10 == 0) {
				return;
			}
			this.method1167(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!tn;B)V")
	private void method1167(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		if (arg0 == 2) {
			this.anInt1104 = arg1.method8414();
		}
	}
}
