import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class4_Sub1_Sub16 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ro", name = "C", descriptor = "I")
	public int anInt6268 = 0;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!wn;)V")
	public void method5150(@OriginalArg(1) Class4_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4614();
			if (local5 == 0) {
				return;
			}
			this.method5152(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!wn;IZ)V")
	private void method5152(@OriginalArg(0) Class4_Sub20 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt6268 = arg0.method4560();
		}
	}
}
