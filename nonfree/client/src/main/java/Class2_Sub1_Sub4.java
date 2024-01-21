import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
	public int anInt756 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!og;II)V")
	private void method610(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt756 = arg0.method234();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!og;I)V")
	public void method615(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method218();
			if (local5 == 0) {
				return;
			}
			this.method610(arg0, local5);
		}
	}
}
