import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class2_Sub2_Sub24 extends Class2_Sub2 {

	@OriginalMember(owner = "client!v", name = "J", descriptor = "I")
	public int anInt4535 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!ea;B)V")
	private void method3140(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		if (arg0 == 5) {
			this.anInt4535 = arg1.method163();
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLclient!ea;)V")
	public void method3141(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method209();
			if (local14 == 0) {
				return;
			}
			this.method3140(local14, arg0);
		}
	}
}
