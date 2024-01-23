import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class1_Sub3_Sub10 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
	public int anInt2758 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!qm;I)V")
	public void method2070(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2199();
			if (local5 == 0) {
				return;
			}
			this.method2072(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!qm;B)V")
	private void method2072(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 2) {
			this.anInt2758 = arg1.method2244();
		}
	}
}
