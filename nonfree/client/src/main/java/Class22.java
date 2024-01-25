import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class22 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	public int anInt435;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	public int anInt440;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
	public int anInt444;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method403(@OriginalArg(0) Class1_Sub21 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5720();
			if (local17 == 0) {
				return;
			}
			this.method405(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!nj;BI)V")
	private void method405(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt444 = arg0.method5715();
			this.anInt435 = arg0.method5720();
			this.anInt440 = arg0.method5720();
		}
	}
}
