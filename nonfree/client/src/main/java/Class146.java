import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class146 {

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "[I")
	public int[] anIntArray340;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
	public int anInt4492 = -1;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	public int anInt4499 = -1;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!kh;I)V")
	public void method3949(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub25 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method5185();
			if (local5 == 0) {
				return;
			}
			this.method3953(arg0, arg1, local5);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!kh;I)V")
	private void method3953(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub25 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4499 = arg1.method5187();
		} else if (arg2 == 2) {
			this.anIntArray340 = new int[arg1.method5185()];
			for (@Pc(46) int local46 = 0; local46 < this.anIntArray340.length; local46++) {
				this.anIntArray340[local46] = arg1.method5187();
			}
		} else if (arg2 == 3) {
			this.anInt4492 = arg1.method5185();
			return;
		}
	}
}
