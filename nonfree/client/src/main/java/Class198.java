import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class198 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
	public int anInt4818 = 0;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BLclient!ee;)V")
	public void method4405(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8645();
			if (local5 == 0) {
				return;
			}
			this.method4406(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILclient!ee;)V")
	private void method4406(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 5) {
			this.anInt4818 = arg1.method8631();
		}
	}
}
