import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class297 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "I")
	public int anInt8655;

	@OriginalMember(owner = "client!um", name = "g", descriptor = "I")
	public int anInt8659;

	@OriginalMember(owner = "client!um", name = "i", descriptor = "I")
	public int anInt8661;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!os;I)V")
	public void method7578(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4487();
			if (local5 == 0) {
				return;
			}
			this.method7579(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IILclient!os;)V")
	private void method7579(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt8655 = arg1.method4494();
			this.anInt8659 = arg1.method4487();
			this.anInt8661 = arg1.method4487();
		}
	}
}
