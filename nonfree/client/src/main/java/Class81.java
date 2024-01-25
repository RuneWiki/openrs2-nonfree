import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class81 {

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
	public int anInt2387 = 0;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
	public int anInt2386 = 2048;

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
	public int anInt2388 = 0;

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
	public int anInt2392 = 2048;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!gk;Z)V")
	private void method1989(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt2388 = arg1.method3981();
		} else if (arg0 == 2) {
			this.anInt2386 = arg1.method3943();
		} else if (arg0 == 3) {
			this.anInt2392 = arg1.method3943();
		} else if (arg0 == 4) {
			this.anInt2387 = arg1.method3961();
			return;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!gk;B)V")
	public void method1992(@OriginalArg(0) Class7_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3981();
			if (local5 == 0) {
				return;
			}
			this.method1989(local5, arg0);
		}
	}
}
