import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class292 {

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "I")
	public int anInt8348 = 0;

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "I")
	public int anInt8349 = 2048;

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
	public int anInt8344 = 2048;

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
	public int anInt8352 = 0;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!dc;B)V")
	public void method7206(@OriginalArg(0) Class3_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5633();
			if (local9 == 0) {
				return;
			}
			this.method7208(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!dc;II)V")
	private void method7208(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8352 = arg0.method5633();
		} else if (arg1 == 2) {
			this.anInt8349 = arg0.method5610();
		} else if (arg1 == 3) {
			this.anInt8344 = arg0.method5610();
			return;
		} else if (arg1 == 4) {
			this.anInt8348 = arg0.method5624();
			return;
		}
	}
}
