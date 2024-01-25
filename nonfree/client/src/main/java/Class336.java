import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class336 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public int anInt8984 = 2048;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
	public int anInt8986 = 0;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
	public int anInt8987 = 0;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
	public int anInt8988 = 2048;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!ac;)V")
	public void method7294(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method7974();
			if (local15 == 0) {
				return;
			}
			this.method7295(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILclient!ac;)V")
	private void method7295(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt8986 = arg1.method7974();
		} else if (arg0 == 2) {
			this.anInt8988 = arg1.method7945();
		} else if (arg0 == 3) {
			this.anInt8984 = arg1.method7945();
		} else if (arg0 == 4) {
			this.anInt8987 = arg1.method7975();
		}
	}
}
