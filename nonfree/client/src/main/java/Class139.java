import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class139 {

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "[I")
	public int[] anIntArray337;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
	public int anInt4217 = -1;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
	public int anInt4218 = -1;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILclient!sb;)V")
	public void method3389(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method2595();
			if (local14 == 0) {
				return;
			}
			this.method3391(arg0, arg1, local14);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILclient!sb;I)V")
	private void method3391(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4218 = arg1.method2593();
		} else if (arg2 == 2) {
			this.anIntArray337 = new int[arg1.method2595()];
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray337.length; local29++) {
				this.anIntArray337[local29] = arg1.method2593();
			}
		} else if (arg2 == 3) {
			this.anInt4217 = arg1.method2595();
		}
	}
}
