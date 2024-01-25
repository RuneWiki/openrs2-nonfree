import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class231 {

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
	public int anInt6446 = 2048;

	@OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
	public int anInt6451 = 2048;

	@OriginalMember(owner = "client!pda", name = "f", descriptor = "I")
	public int anInt6448 = 0;

	@OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
	public int anInt6450 = 0;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZILclient!ge;)V")
	private void method5422(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt6450 = arg1.method3922();
		} else if (arg0 == 2) {
			this.anInt6451 = arg1.method3967();
		} else if (arg0 == 3) {
			this.anInt6446 = arg1.method3967();
		} else if (arg0 == 4) {
			this.anInt6448 = arg1.method3964();
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!ge;)V")
	public void method5425(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3922();
			if (local14 == 0) {
				return;
			}
			this.method5422(local14, arg0);
		}
	}
}
