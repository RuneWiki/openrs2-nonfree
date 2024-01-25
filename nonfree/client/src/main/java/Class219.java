import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class219 {

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
	public int anInt6611 = 2048;

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
	public int anInt6612 = 0;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
	public int anInt6610 = 0;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
	public int anInt6606 = 2048;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ti;IB)V")
	private void method5165(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6612 = arg0.method4548();
		} else if (arg1 == 2) {
			this.anInt6611 = arg0.method4498();
		} else if (arg1 == 3) {
			this.anInt6606 = arg0.method4498();
			return;
		} else if (arg1 == 4) {
			this.anInt6610 = arg0.method4531();
			return;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ti;Z)V")
	public void method5167(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4548();
			if (local5 == 0) {
				return;
			}
			this.method5165(arg0, local5);
		}
	}
}
