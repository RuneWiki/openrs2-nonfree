import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class14 {

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
	public int[] anIntArray38;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	public int anInt374 = -1;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	public int anInt376 = -1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!p;B)V")
	public void method324(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub17 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method1874();
			if (local17 == 0) {
				return;
			}
			this.method327(local17, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIBLclient!p;)V")
	private void method327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub17 arg2) {
		if (arg0 == 1) {
			this.anInt374 = arg2.method1837();
		} else if (arg0 == 2) {
			this.anIntArray38 = new int[arg2.method1874()];
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray38.length; local20++) {
				this.anIntArray38[local20] = arg2.method1837();
			}
		} else if (arg0 == 3) {
			this.anInt376 = arg2.method1874();
		}
	}
}
