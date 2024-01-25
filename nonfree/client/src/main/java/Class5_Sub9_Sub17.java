import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class5_Sub9_Sub17 extends Class5_Sub9 {

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
	public int anInt4737 = 0;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILclient!bk;)V")
	private void method4156(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		if (arg0 == 2) {
			this.anInt4737 = arg1.method1845();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!bk;I)V")
	public void method4157(@OriginalArg(0) Class5_Sub1 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1832();
			if (local9 == 0) {
				return;
			}
			this.method4156(local9, arg0);
		}
	}
}
