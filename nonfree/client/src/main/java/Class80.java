import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class80 {

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "[I")
	public int[] anIntArray268;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
	public int anInt1962 = -1;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	public int anInt1966 = -1;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!dga;I)V")
	private void method1693(@OriginalArg(1) Class6_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1966 = arg0.method6006();
		} else if (arg1 == 2) {
			this.anIntArray268 = new int[arg0.method6041()];
			for (@Pc(31) int local31 = 0; local31 < this.anIntArray268.length; local31++) {
				this.anIntArray268[local31] = arg0.method6006();
			}
		} else if (arg1 == 3) {
			this.anInt1962 = arg0.method6041();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!dga;I)V")
	public void method1695(@OriginalArg(0) Class6_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6041();
			if (local9 == 0) {
				return;
			}
			this.method1693(arg0, local9);
		}
	}
}
