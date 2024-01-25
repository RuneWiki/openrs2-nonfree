import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class75 {

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "[I")
	public int[] anIntArray112;

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
	public int anInt3019 = -1;

	@OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
	public int anInt3020 = -1;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLclient!ji;I)V")
	private void method2552(@OriginalArg(1) Class6_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3019 = arg0.method8220();
		} else if (arg1 == 2) {
			this.anIntArray112 = new int[arg0.method8246()];
			for (@Pc(57) int local57 = 0; local57 < this.anIntArray112.length; local57++) {
				this.anIntArray112[local57] = arg0.method8220();
			}
		} else if (arg1 == 3) {
			this.anInt3020 = arg0.method8246();
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method2553(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method8246();
			if (local11 == 0) {
				return;
			}
			this.method2552(arg0, local11);
		}
	}
}
