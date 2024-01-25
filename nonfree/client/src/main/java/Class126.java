import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class126 {

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	public int anInt4077;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "I")
	public int anInt4078;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "I")
	public int anInt4080;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!iaa;I)V")
	private void method3596(@OriginalArg(1) Class6_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4078 = arg0.method4999();
			this.anInt4080 = arg0.method4966();
			this.anInt4077 = arg0.method4966();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!iaa;B)V")
	public void method3597(@OriginalArg(0) Class6_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4966();
			if (local9 == 0) {
				return;
			}
			this.method3596(arg0, local9);
		}
	}
}
