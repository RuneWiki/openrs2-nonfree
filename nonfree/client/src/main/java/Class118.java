import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class118 {

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
	private int anInt3627;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
	public int anInt3630;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
	public int anInt3632;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)Lclient!ok;")
	public Class149 method2869() {
		@Pc(11) Class149 local11 = (Class149) Static164.aClass198_58.method5242((long) this.anInt3627);
		if (local11 != null) {
			return local11;
		}
		local11 = Static366.method3895(Static283.aClass100_90, this.anInt3627, 0);
		if (local11 != null) {
			Static164.aClass198_58.method5231((long) this.anInt3627, local11);
		}
		return local11;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!fb;IB)V")
	private void method2870(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt3627 = arg1.method3649();
		} else if (arg2 == 2) {
			this.anInt3632 = arg1.method3643();
			this.anInt3630 = arg1.method3643();
			return;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!fb;II)V")
	public void method2873(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method3643();
			if (local5 == 0) {
				return;
			}
			this.method2870(arg1, arg0, local5);
		}
	}
}
