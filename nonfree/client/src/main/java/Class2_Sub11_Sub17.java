import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class2_Sub11_Sub17 extends Class2_Sub11 {

	@OriginalMember(owner = "client!ro", name = "K", descriptor = "I")
	public int anInt5615 = 0;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!dg;)V")
	public void method5014(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method4421();
			if (local10 == 0) {
				return;
			}
			this.method5016(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!dg;II)V")
	private void method5016(@OriginalArg(0) Class2_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt5615 = arg0.method4464();
		}
	}
}
