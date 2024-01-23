import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class107 {

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
	public int anInt4175 = -1;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
	public int anInt4179 = -1;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ql;IIB)V")
	private void method3136(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt4175 = arg0.method1764();
		} else if (arg2 == 2) {
			this.anIntArray312 = new int[arg0.method1772()];
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray312.length; local26++) {
				this.anIntArray312[local26] = arg0.method1764();
			}
		} else if (arg2 == 3) {
			this.anInt4179 = arg0.method1772();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILclient!ql;)V")
	public void method3137(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method1772();
			if (local9 == 0) {
				return;
			}
			this.method3136(arg1, arg0, local9);
		}
	}
}
