import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class245 {

	@OriginalMember(owner = "client!un", name = "g", descriptor = "I")
	public int anInt7197 = 0;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BLclient!ti;)V")
	public void method5546(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method4548();
			if (local12 == 0) {
				return;
			}
			this.method5547(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IILclient!ti;)V")
	private void method5547(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 5) {
			this.anInt7197 = arg1.method4498();
		}
	}
}
