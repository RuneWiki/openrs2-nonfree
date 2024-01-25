import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nq", name = "E", descriptor = "I")
	public int anInt4593 = 0;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ti;II)V")
	private void method3775(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt4593 = arg0.method4498();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!ti;)V")
	public void method3777(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4548();
			if (local13 == 0) {
				return;
			}
			this.method3775(arg0, local13);
		}
	}
}
