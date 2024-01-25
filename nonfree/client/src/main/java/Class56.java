import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class56 {

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "[I")
	public int[] anIntArray115;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
	public int anInt1064 = -1;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	public int anInt1069 = -1;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!wm;I)V")
	private void method936(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub19 arg1) {
		if (arg0 == 1) {
			this.anInt1064 = arg1.method2896();
		} else if (arg0 == 2) {
			this.anIntArray115 = new int[arg1.method2915()];
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray115.length; local27++) {
				this.anIntArray115[local27] = arg1.method2896();
			}
		} else if (arg0 == 3) {
			this.anInt1069 = arg1.method2915();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!wm;B)V")
	public void method937(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2915();
			if (local9 == 0) {
				return;
			}
			this.method936(local9, arg0);
		}
	}
}
