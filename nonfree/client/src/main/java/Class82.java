import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class82 {

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
	public int anInt2424 = 0;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
	public int anInt2423 = 0;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
	public int anInt2425 = 2048;

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
	public int anInt2429 = 2048;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!rba;I)V")
	public void method2158(@OriginalArg(0) Class3_Sub28 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5322(-21);
			if (local15 == 0) {
				return;
			}
			this.method2161(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!rba;B)V")
	private void method2161(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt2423 = arg1.method5322(-20);
		} else if (arg0 == 2) {
			this.anInt2425 = arg1.method5272();
		} else if (arg0 == 3) {
			this.anInt2429 = arg1.method5272();
		} else if (arg0 == 4) {
			this.anInt2424 = arg1.method5281();
		}
	}
}
