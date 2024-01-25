import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class207 {

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
	public int anInt5794 = 2;

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "Z")
	public boolean aBoolean662 = false;

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "Z")
	public boolean aBoolean661 = false;

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
	public int anInt5792 = -1;

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
	public int anInt5791 = 1;

	@OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
	public int anInt5795 = 64;

	@OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
	public int anInt5799 = 64;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIBLclient!ug;)V")
	private void method4544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub28 arg2) {
		if (arg1 == 1) {
			this.anInt5792 = arg2.method5335();
			if (this.anInt5792 == 65535) {
				this.anInt5792 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt5799 = arg2.method5335() + 1;
			this.anInt5795 = arg2.method5335() + 1;
		} else if (arg1 == 3) {
			arg2.method5367();
		} else if (arg1 == 4) {
			this.anInt5794 = arg2.method5337();
		} else if (arg1 == 5) {
			this.anInt5791 = arg2.method5337();
		} else if (arg1 == 6) {
			this.aBoolean661 = true;
			return;
		} else if (arg1 == 7) {
			this.aBoolean662 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!ug;II)V")
	public void method4545(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method5337();
			if (local9 == 0) {
				return;
			}
			this.method4544(arg1, local9, arg0);
		}
	}
}
