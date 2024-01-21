import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class5_Sub2_Sub14 extends Class5_Sub2 {

	@OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
	public int anInt2832 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!hb;B)V")
	public void method1947(@OriginalArg(0) Class5_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1408();
			if (local9 == 0) {
				return;
			}
			this.method1949(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!hb;IB)V")
	private void method1949(@OriginalArg(0) Class5_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt2832 = arg0.method1418();
		}
	}
}
