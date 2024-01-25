import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class73 {

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
	public int anInt2304;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	public int anInt2305;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public int anInt2307;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!co;II)V")
	private void method2128(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2307 = arg0.method4227();
			this.anInt2305 = arg0.method4220();
			this.anInt2304 = arg0.method4220();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!co;)V")
	public void method2129(@OriginalArg(1) Class5_Sub3 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4220();
			if (local13 == 0) {
				return;
			}
			this.method2128(arg0, local13);
		}
	}
}
