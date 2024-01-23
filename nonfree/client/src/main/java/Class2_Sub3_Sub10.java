import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class2_Sub3_Sub10 extends Class2_Sub3 {

	@OriginalMember(owner = "client!in", name = "M", descriptor = "I")
	public int anInt2404 = 0;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!wm;BI)V")
	private void method2066(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt2404 = arg0.method4242();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILclient!wm;)V")
	public void method2070(@OriginalArg(1) Class2_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4261();
			if (local13 == 0) {
				return;
			}
			this.method2066(arg0, local13);
		}
	}
}
