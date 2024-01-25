import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rm", name = "B", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
	public int anInt5481 = 1;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!nj;)V")
	public void method4804(@OriginalArg(1) Class1_Sub21 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5720();
			if (local17 == 0) {
				return;
			}
			this.method4805(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!nj;II)V")
	private void method4805(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static287.method5025(arg0.method5721());
		} else if (arg1 == 2) {
			this.anInt5481 = 0;
		}
	}
}
