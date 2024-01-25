import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class194 {

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
	public int anInt6013 = 0;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!bt;II)V")
	private void method4792(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 5) {
			this.anInt6013 = arg0.method6004();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLclient!bt;)V")
	public void method4793(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method6053();
			if (local12 == 0) {
				return;
			}
			this.method4792(arg0, local12);
		}
	}
}
