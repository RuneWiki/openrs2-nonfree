import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!go", name = "C", descriptor = "I")
	public int anInt3123 = 0;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IILclient!os;)V")
	private void method2899(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 2) {
			this.anInt3123 = arg1.method4494();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!os;I)V")
	public void method2901(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4487();
			if (local9 == 0) {
				return;
			}
			this.method2899(local9, arg0);
		}
	}
}
