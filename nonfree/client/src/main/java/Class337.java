import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class337 {

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "[I")
	public int[] anIntArray657;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	public int anInt9952 = -1;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
	public int anInt9954 = -1;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILclient!fd;)V")
	private void method8081(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt9952 = arg1.method6535();
		} else if (arg0 == 2) {
			this.anIntArray657 = new int[arg1.method6538()];
			for (@Pc(32) int local32 = 0; local32 < this.anIntArray657.length; local32++) {
				this.anIntArray657[local32] = arg1.method6535();
			}
		} else if (arg0 == 3) {
			this.anInt9954 = arg1.method6538();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method8082(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6538();
			if (local7 == 0) {
				return;
			}
			this.method8081(local7, arg0);
		}
	}
}
