import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class153 {

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "[I")
	public int[] anIntArray503;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
	public int anInt4110 = -1;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
	public int anInt4107 = -1;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILclient!lk;B)V")
	private void method3739(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt4110 = arg1.method4245();
		} else if (arg0 == 2) {
			this.anIntArray503 = new int[arg1.method4240()];
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray503.length; local27++) {
				this.anIntArray503[local27] = arg1.method4245();
			}
		} else if (arg0 == 3) {
			this.anInt4107 = arg1.method4240();
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLclient!lk;)V")
	public void method3741(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4240();
			if (local17 == 0) {
				return;
			}
			this.method3739(local17, arg0);
		}
	}
}
