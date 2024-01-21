import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
	public int anInt2613;

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
	public int anInt2615;

	@OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
	public int anInt2620;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!mb;I)V")
	private void method1806(@OriginalArg(1) Class3_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2615 = arg0.method2111();
			this.anInt2613 = arg0.method2107();
			this.anInt2620 = arg0.method2107();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!mb;I)V")
	public void method1807(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2107();
			if (local9 == 0) {
				return;
			}
			this.method1806(arg0, local9);
		}
	}
}
