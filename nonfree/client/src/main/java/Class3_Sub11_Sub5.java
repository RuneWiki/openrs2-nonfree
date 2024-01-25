import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class3_Sub11_Sub5 extends Class3_Sub11 {

	@OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
	public int anInt2885 = 0;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!jp;)V")
	public void method2621(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8632();
			if (local5 == 0) {
				return;
			}
			this.method2626(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!jp;II)V")
	private void method2626(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt2885 = arg0.method8593();
		}
	}
}
