import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class17 {

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	public int anInt467;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
	public int anInt470;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!wm;II)V")
	private void method414(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub26 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt471 = arg1.method4242();
		} else if (arg2 == 2) {
			this.anInt467 = arg1.method4261();
			this.anInt470 = arg1.method4261();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Lclient!af;")
	public Class2_Sub3_Sub1_Sub1 method415() {
		@Pc(11) Class2_Sub3_Sub1_Sub1 local11 = (Class2_Sub3_Sub1_Sub1) Static144.aClass46_23.method1074((long) this.anInt471);
		if (local11 != null) {
			return local11;
		}
		local11 = Static250.method4003(this.anInt471, Static262.aClass84_135);
		if (local11 != null) {
			Static144.aClass46_23.method1071(local11, (long) this.anInt471);
		}
		return local11;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBLclient!wm;)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub26 arg1) {
		while (true) {
			@Pc(10) int local10 = arg1.method4261();
			if (local10 == 0) {
				return;
			}
			this.method414(arg0, arg1, local10);
		}
	}
}
