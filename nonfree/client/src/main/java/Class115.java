import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class115 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
	public int anInt3314 = 0;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public int anInt3318 = 0;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	public int anInt3316 = 2048;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
	public int anInt3315 = 2048;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!un;I)V")
	private void method2968(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt3314 = arg1.method4905();
		} else if (arg0 == 2) {
			this.anInt3316 = arg1.method4936();
		} else if (arg0 == 3) {
			this.anInt3315 = arg1.method4936();
		} else if (arg0 == 4) {
			this.anInt3318 = arg1.method4946();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!un;)V")
	public void method2972(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4905();
			if (local15 == 0) {
				return;
			}
			this.method2968(local15, arg0);
		}
	}
}
