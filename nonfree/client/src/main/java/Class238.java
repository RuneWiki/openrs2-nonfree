import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class238 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "[I")
	public int[] anIntArray524;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
	public int anInt7116 = -1;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
	public int anInt7115 = -1;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLclient!ti;)V")
	public void method5474(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method4548();
			if (local10 == 0) {
				return;
			}
			this.method5475(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!ti;I)V")
	private void method5475(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7115 = arg0.method4498();
		} else if (arg1 == 2) {
			this.anIntArray524 = new int[arg0.method4548()];
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray524.length; local26++) {
				this.anIntArray524[local26] = arg0.method4498();
			}
			return;
		} else if (arg1 == 3) {
			this.anInt7116 = arg0.method4548();
			return;
		}
	}
}
