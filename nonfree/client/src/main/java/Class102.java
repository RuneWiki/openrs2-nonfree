import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class102 {

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
	public int anInt2710 = 2;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Z")
	public boolean aBoolean196 = false;

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
	public int anInt2714 = 64;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
	public int anInt2709 = -1;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	public int anInt2708 = 64;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
	public int anInt2715 = 1;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "Z")
	public boolean aBoolean195 = false;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!tl;BI)V")
	private void method2101(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub30 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2709 = arg1.method4877();
			if (this.anInt2709 == 65535) {
				this.anInt2709 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt2708 = arg1.method4877() + 1;
			this.anInt2714 = arg1.method4877() + 1;
		} else if (arg2 == 3) {
			arg1.method4865();
		} else if (arg2 == 4) {
			this.anInt2710 = arg1.method4864();
		} else if (arg2 == 5) {
			this.anInt2715 = arg1.method4864();
		} else if (arg2 == 6) {
			this.aBoolean195 = true;
		} else if (arg2 == 7) {
			this.aBoolean196 = true;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tl;II)V")
	public void method2105(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method4864();
			if (local9 == 0) {
				return;
			}
			this.method2101(arg1, arg0, local9);
		}
	}
}
