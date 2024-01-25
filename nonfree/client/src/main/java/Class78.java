import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class78 {

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	public int anInt2628;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
	public int anInt2630;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
	public int anInt2631;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ie;BI)V")
	private void method2203(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2630 = arg0.method6811();
			this.anInt2628 = arg0.method6814();
			this.anInt2631 = arg0.method6814();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!ie;)V")
	public void method2204(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6814();
			if (local9 == 0) {
				return;
			}
			this.method2203(arg0, local9);
		}
	}
}
