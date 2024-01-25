import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
	public int anInt44 = 2048;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
	public int anInt46 = 2048;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
	public int anInt51 = 0;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	public int anInt52 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZLclient!wn;)V")
	private void method56(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt52 = arg1.method4614();
		} else if (arg0 == 2) {
			this.anInt46 = arg1.method4560();
		} else if (arg0 == 3) {
			this.anInt44 = arg1.method4560();
		} else if (arg0 == 4) {
			this.anInt51 = arg1.method4586();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!wn;)V")
	public void method59(@OriginalArg(1) Class4_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4614();
			if (local5 == 0) {
				return;
			}
			this.method56(local5, arg0);
		}
	}
}
