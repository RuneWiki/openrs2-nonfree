import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class114 {

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "I")
	public int anInt2901;

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
	public int anInt2903;

	@OriginalMember(owner = "client!fga", name = "g", descriptor = "I")
	public int anInt2904;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILclient!es;I)V")
	private void method2709(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt2904 = arg1.method8859();
			this.anInt2903 = arg1.method8865();
			this.anInt2901 = arg1.method8865();
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILclient!es;)V")
	public void method2712(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8865();
			if (local9 == 0) {
				return;
			}
			this.method2709(local9, arg0);
		}
	}
}
