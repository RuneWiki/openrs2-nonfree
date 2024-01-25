import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class149 {

	@OriginalMember(owner = "client!hea", name = "f", descriptor = "I")
	public int anInt4239 = 0;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(BLclient!jc;)V")
	public void method3743(@OriginalArg(1) Class14_Sub21 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7695(109);
			if (local12 == 0) {
				return;
			}
			this.method3744(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILclient!jc;)V")
	private void method3744(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub21 arg1) {
		if (arg0 == 5) {
			this.anInt4239 = arg1.method7717(-1978450544);
		}
	}
}
