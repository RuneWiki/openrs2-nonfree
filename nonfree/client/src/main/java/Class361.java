import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class361 {

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "[I")
	public int[] anIntArray704;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
	public int anInt9968 = -1;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public int anInt9966 = -1;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLclient!sl;)V")
	public void method8469(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2859();
			if (local5 == 0) {
				return;
			}
			this.method8472(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!sl;BI)V")
	private void method8472(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9966 = arg0.method2825();
		} else if (arg1 == 2) {
			this.anIntArray704 = new int[arg0.method2859()];
			for (@Pc(33) int local33 = 0; local33 < this.anIntArray704.length; local33++) {
				this.anIntArray704[local33] = arg0.method2825();
			}
		} else if (arg1 == 3) {
			this.anInt9968 = arg0.method2859();
		}
	}
}
