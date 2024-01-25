import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class52 {

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
	public int anInt1882 = 0;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!ae;I)V")
	public void method1461(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6433();
			if (local9 == 0) {
				return;
			}
			this.method1462(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!ae;BI)V")
	private void method1462(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1882 = arg0.method6485();
		}
	}
}
