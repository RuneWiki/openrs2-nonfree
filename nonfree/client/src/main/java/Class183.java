import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class183 {

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
	public int anInt4771;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
	public int anInt4772;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
	public int anInt4774;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ti;I)V")
	public void method3911(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4548();
			if (local9 == 0) {
				return;
			}
			this.method3913(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILclient!ti;)V")
	private void method3913(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt4772 = arg1.method4498();
			this.anInt4774 = arg1.method4548();
			this.anInt4771 = arg1.method4548();
		}
	}
}
