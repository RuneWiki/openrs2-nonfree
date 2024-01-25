import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class174 {

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	public int anInt4280 = 0;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "I")
	public int anInt4282 = 2048;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public int anInt4283 = 2048;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "I")
	public int anInt4285 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!kk;)V")
	public void method3872(@OriginalArg(1) Class2_Sub16 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method5350();
			if (local10 == 0) {
				return;
			}
			this.method3875(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IBLclient!kk;)V")
	private void method3875(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt4280 = arg1.method5350();
		} else if (arg0 == 2) {
			this.anInt4282 = arg1.method5312();
		} else if (arg0 == 3) {
			this.anInt4283 = arg1.method5312();
		} else if (arg0 == 4) {
			this.anInt4285 = arg1.method5341();
		}
	}
}
