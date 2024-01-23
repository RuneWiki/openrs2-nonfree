import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class48 {

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	public int anInt1568 = -1;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
	public int anInt1569 = -1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!lf;III)V")
	private void method1480(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1568 = arg0.method1386();
		} else if (arg1 == 2) {
			this.anIntArray130 = new int[arg0.method1378()];
			for (@Pc(41) int local41 = 0; local41 < this.anIntArray130.length; local41++) {
				this.anIntArray130[local41] = arg0.method1386();
			}
		} else if (arg1 == 3) {
			this.anInt1569 = arg0.method1378();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!lf;II)V")
	public void method1482(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method1378();
			if (local5 == 0) {
				return;
			}
			this.method1480(arg0, local5, arg1);
		}
	}
}
