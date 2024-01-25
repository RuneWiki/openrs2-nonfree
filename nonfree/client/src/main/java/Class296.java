import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class296 {

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	public int anInt7687 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!vj;I)V")
	private void method6497(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub22 arg1) {
		if (arg0 == 5) {
			this.anInt7687 = arg1.method8546();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLclient!vj;)V")
	public void method6498(@OriginalArg(1) Class2_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8547();
			if (local5 == 0) {
				return;
			}
			this.method6497(local5, arg0);
		}
	}
}
