import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class159 {

	@OriginalMember(owner = "client!iea", name = "i", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
	public int anInt4670 = 1;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!dc;II)V")
	private void method4001(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static408.method6346(arg0.method5619());
		} else if (arg1 == 2) {
			this.anInt4670 = 0;
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(BLclient!dc;)V")
	public void method4003(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5633();
			if (local5 == 0) {
				return;
			}
			this.method4001(arg0, local5);
		}
	}
}
