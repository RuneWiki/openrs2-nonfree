import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class10 {

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
	public int anInt230 = 0;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!k;II)V")
	private void method166(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt230 = arg0.method3805();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLclient!k;)V")
	public void method168(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3793();
			if (local14 == 0) {
				return;
			}
			this.method166(arg0, local14);
		}
	}
}
