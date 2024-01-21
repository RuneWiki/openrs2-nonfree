import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class6_Sub3_Sub4 extends Class6_Sub3 {

	@OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
	public int anInt682 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!bf;)V")
	public void method525(@OriginalArg(1) Class6_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1321();
			if (local13 == 0) {
				return;
			}
			this.method528(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!bf;I)V")
	private void method528(@OriginalArg(1) Class6_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt682 = arg0.method1306();
		}
	}
}
