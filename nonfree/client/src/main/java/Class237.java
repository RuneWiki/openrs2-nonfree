import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class237 {

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
	public int anInt6254 = 1;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!gk;II)V")
	private void method4973(@OriginalArg(0) Class7_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static395.method5018(arg0.method3930());
		} else if (arg1 == 2) {
			this.anInt6254 = 0;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!gk;B)V")
	public void method4974(@OriginalArg(0) Class7_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3981();
			if (local9 == 0) {
				return;
			}
			this.method4973(arg0, local9);
		}
	}
}
