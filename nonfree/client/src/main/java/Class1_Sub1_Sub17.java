import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
	public int anInt2881 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!nc;I)V")
	public void method2211(@OriginalArg(0) Class1_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method895();
			if (local9 == 0) {
				return;
			}
			this.method2213(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!nc;Z)V")
	private void method2213(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub9 arg1) {
		if (arg0 == 2) {
			this.anInt2881 = arg1.method946();
		}
	}
}
