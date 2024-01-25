import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class23 {

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "[I")
	public int[] anIntArray29;

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
	public int anInt1025 = -1;

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
	public int anInt1027 = -1;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IILclient!ig;)V")
	private void method964(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt1025 = arg1.method8578();
		} else if (arg0 == 2) {
			this.anIntArray29 = new int[arg1.method8525()];
			for (@Pc(45) int local45 = 0; local45 < this.anIntArray29.length; local45++) {
				this.anIntArray29[local45] = arg1.method8578();
			}
		} else if (arg0 == 3) {
			this.anInt1027 = arg1.method8525();
			return;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!ig;)V")
	public void method965(@OriginalArg(1) Class8_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8525();
			if (local5 == 0) {
				return;
			}
			this.method964(local5, arg0);
		}
	}
}
