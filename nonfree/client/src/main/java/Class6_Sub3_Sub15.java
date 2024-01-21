import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class6_Sub3_Sub15 extends Class6_Sub3 {

	@OriginalMember(owner = "client!tb", name = "ob", descriptor = "I")
	public int anInt2901 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bf;I)V")
	public void method1895(@OriginalArg(0) Class6_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1321();
			if (local5 == 0) {
				return;
			}
			this.method1899(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!bf;)V")
	private void method1899(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub4 arg1) {
		if (arg0 == 5) {
			this.anInt2901 = arg1.method1306();
		}
	}
}
