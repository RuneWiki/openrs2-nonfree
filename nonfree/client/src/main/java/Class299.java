import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class299 {

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "C")
	public char aChar6;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	public int anInt8657;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public int anInt8659;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt8662;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!rba;I)V")
	private void method7259(@OriginalArg(1) Class3_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar6 = Static265.method4094(arg0.method5288());
		} else if (arg1 == 3) {
			this.anInt8659 = arg0.method5272();
			this.anInt8662 = arg0.method5322(-96);
			this.anInt8657 = arg0.method5322(-11);
			return;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!rba;I)V")
	public void method7260(@OriginalArg(0) Class3_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5322(-123);
			if (local5 == 0) {
				return;
			}
			this.method7259(arg0, local5);
		}
	}
}
