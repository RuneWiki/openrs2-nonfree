import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class197 {

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
	public int anInt6185 = 1;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!bt;IB)V")
	private void method4874(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static26.method717(arg0.method6011());
		} else if (arg1 == 2) {
			this.anInt6185 = 0;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!bt;B)V")
	public void method4875(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6053();
			if (local13 == 0) {
				return;
			}
			this.method4874(arg0, local13);
		}
	}
}
