import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class113 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	private int anInt3371;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	public int anInt3375;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public int anInt3376;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BILclient!bg;)V")
	public void method3082(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method4532();
			if (local9 == 0) {
				return;
			}
			this.method3083(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!bg;III)V")
	private void method3083(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt3371 = arg0.method4556();
		} else if (arg1 == 2) {
			this.anInt3376 = arg0.method4532();
			this.anInt3375 = arg0.method4532();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Lclient!iq;")
	public Class99 method3084() {
		@Pc(16) Class99 local16 = (Class99) Static318.aClass87_56.method2482((long) this.anInt3371);
		if (local16 != null) {
			return local16;
		}
		local16 = Static366.method2655(Static72.aClass216_25, this.anInt3371, 0);
		if (local16 != null) {
			Static318.aClass87_56.method2481(local16, (long) this.anInt3371);
		}
		return local16;
	}
}
