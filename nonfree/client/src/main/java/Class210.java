import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class210 {

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
	public int anInt5428 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILclient!re;)V")
	private void method4700(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 5) {
			this.anInt5428 = arg1.method5177();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!re;I)V")
	public void method4701(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5174();
			if (local13 == 0) {
				return;
			}
			this.method4700(local13, arg0);
		}
	}
}
