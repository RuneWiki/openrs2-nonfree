import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!o", name = "N", descriptor = "I")
	public int anInt2026;

	@OriginalMember(owner = "client!o", name = "U", descriptor = "I")
	public int anInt2031;

	@OriginalMember(owner = "client!o", name = "X", descriptor = "I")
	public int anInt2034;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ob;I)V")
	public void method1412(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method647();
			if (local16 == 0) {
				return;
			}
			this.method1417(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ob;BI)V")
	private void method1417(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2031 = arg0.method602();
			this.anInt2034 = arg0.method647();
			this.anInt2026 = arg0.method647();
		}
	}
}
