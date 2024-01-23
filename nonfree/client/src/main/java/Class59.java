import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class59 {

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "[I")
	public int[] anIntArray158;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
	public int anInt1665 = -1;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	public int anInt1667 = -1;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILclient!ug;)V")
	private void method1356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub26 arg2) {
		if (arg0 == 1) {
			this.anInt1665 = arg2.method3948();
		} else if (arg0 == 2) {
			this.anIntArray158 = new int[arg2.method3915()];
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray158.length; local34++) {
				this.anIntArray158[local34] = arg2.method3948();
			}
		} else if (arg0 == 3) {
			this.anInt1667 = arg2.method3915();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILclient!ug;)V")
	public void method1358(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method3915();
			if (local5 == 0) {
				return;
			}
			this.method1356(local5, arg0, arg1);
		}
	}
}
