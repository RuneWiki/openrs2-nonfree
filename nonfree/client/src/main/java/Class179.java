import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class179 {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
	public int anInt4809 = 0;

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
	public int anInt4815 = 2048;

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	public int anInt4813 = 0;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
	public int anInt4819 = 2048;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!fca;I)V")
	private void method4047(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt4809 = arg1.method4888();
		} else if (arg0 == 2) {
			this.anInt4819 = arg1.method4858();
		} else if (arg0 == 3) {
			this.anInt4815 = arg1.method4858();
		} else if (arg0 == 4) {
			this.anInt4813 = arg1.method4869();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!fca;)V")
	public void method4051(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method4888();
			if (local8 == 0) {
				return;
			}
			this.method4047(local8, arg0);
		}
	}
}
