import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class155 {

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	public int anInt5594 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!tn;BI)V")
	private void method4771(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt5594 = arg0.method8414();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!tn;B)V")
	public void method4774(@OriginalArg(0) Class3_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8401();
			if (local5 == 0) {
				return;
			}
			this.method4771(arg0, local5);
		}
	}
}
