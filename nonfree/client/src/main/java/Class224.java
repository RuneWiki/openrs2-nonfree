import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class224 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
	public int anInt6796;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
	public int anInt6798;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
	public int anInt6799;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILclient!ol;)V")
	public void method6091(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5203();
			if (local5 == 0) {
				return;
			}
			this.method6092(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IILclient!ol;)V")
	private void method6092(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt6799 = arg1.method5211();
			this.anInt6798 = arg1.method5203();
			this.anInt6796 = arg1.method5203();
		}
	}
}
